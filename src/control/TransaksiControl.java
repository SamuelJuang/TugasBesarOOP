/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package control;

import model.Transaksi;
import java.util.List;
import dao.TransaksiDAO;
import table.TransaksiTable;

public class TransaksiControl {
    private TransaksiDAO pd = new TransaksiDAO();
    
    public void insertDataTransaksi(Transaksi t){
        pd.insertTransaksi(t);
    }
    
    public TransaksiTable showDataTransaksi(String query){
        List<Transaksi> dataTransaksi = pd.showTransaksi(query);
        TransaksiTable tabel = new TransaksiTable(dataTransaksi);
        
        return tabel;
    }
    
//    public void updateDataTransaksi(Transaksi t){
//        pd.updateTransaksi(t);
//    }
}
