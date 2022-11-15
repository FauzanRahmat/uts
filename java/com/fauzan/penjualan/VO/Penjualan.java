/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.fauzan.penjualan.VO;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 *
 * @author LENOVO
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Penjualan {
    private Long pelangganId;
    private Long namaBarangId;
    private String harga;
    private String jumlah;
    private String diskonPersen;
    private String PPNPersen;
    private String total;
}
