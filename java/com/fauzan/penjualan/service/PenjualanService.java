/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.fauzan.penjualan.service;

import com.fauzan.penjualan.VO.Penjualan;
import com.fauzan.penjualan.VO.ResponseTemplateVO;
import com.fauzan.penjualan.repository.PenjualanRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

/**
 *
 * @author LENOVO
 */
@Service
public class PenjualanService {
    @Autowired
    private PenjualanRepository penjualanRepository;
    
    @Autowired
    private RestTemplate restTemplate;
    
    public Penjualan savePenjualan(Penjualan penjualan){
        return penjualanRepository.save(penjualan);
    }
    
    public ResponseTemplateVO getPenjualan(Long penjualanId){
        ResponseTemplateVO vo = new ResponseTemplateVO();
        Penjualan penjualan = penjualanRepository.findByPenjualanId(penjualanId);
        Peminjaman peminjaman = restTemplate.getForObject("http://localhost:9045/penjualan/"
                +penjualan.getPenjualanId(), Penjualan.class);
        vo.setPenjualan(penjualan);
        vo.setPelanggan(pelanggan);
        return vo;
    }
}
