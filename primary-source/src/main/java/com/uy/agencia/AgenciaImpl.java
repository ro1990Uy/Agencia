package com.uy.agencia;

import com.uy.agenciaWsClient.AltaTiket;
import com.uy.agenciaWsClient.TicketsEst;
import com.uy.agenciaWsClient.WebServiceImm;
import com.uy.agenciaWsClient.WebServiceImm_Service;

import javax.naming.InitialContext;
import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class AgenciaImpl {
    private static AgenciaImpl ourInstance = new AgenciaImpl();

    public static AgenciaImpl getInstance() {
        return ourInstance;
    }

    private AgenciaImpl() {
    }
    public TicketsEst ventaTk(String agencia,String matricula,String fechaaVenta,String inicioEst,int minutos){

        TicketsEst tiket = new TicketsEst();
        try {
            WebServiceImm_Service ws = new WebServiceImm_Service();
            WebServiceImm webServiceImm = ws.getWebServiceImmPort();
            tiket = webServiceImm.altaTiket(agencia, matricula, fechaaVenta, inicioEst, minutos);
            if (tiket.getNumeroTicket()!=0){
                InitialContext initialContext = new InitialContext();
                DataSource ds= (DataSource) initialContext.lookup("Java/AgenciaDS");
                Connection connection = ds.getConnection();
                PreparedStatement ps = connection.prepareStatement("INSERT INTO `agencia`.`tickets_estacionamiento` (`idtickets_estacionamiento`,`fecha_venta`,`Hora_inicio`,`matricula`,`importe`,`minutos`) VALUES ('"+tiket.getNumeroTicket()+"','"+fechaaVenta+ "','"+inicioEst+"','"+matricula+"'," +tiket.getImporte()+","+tiket.getMinutos()+");");
                ps.execute();
            }else {throw new AgenciaImplException("NO SE PUDEO VENDER EL TICKET ");}
        }catch (Exception e){

        }
        return tiket;
    }
    public String anulaTicket(int id){
        String rsp=null;
        try {
        InitialContext initialContext=new InitialContext();
        DataSource ds= (DataSource) initialContext.lookup("Java/AgenciaDS");
        Connection connection = ds.getConnection();
        PreparedStatement preparedStatement=connection.prepareStatement("SELECT  * FROM `agencia`.`tickets_estacionamiento` WHERE `idtickets_estacionamiento`="+id+";");
        ResultSet resultSet = preparedStatement.executeQuery();
        if(resultSet.next()){
            preparedStatement=connection.prepareStatement("DELETE  FROM  WHERE `idtickets_estacionamiento`="+id+";");
            preparedStatement.execute();
            WebServiceImm_Service ws = new WebServiceImm_Service();
            WebServiceImm webServiceImm=ws.getWebServiceImmPort();
            rsp= webServiceImm.bajaTiket(id,"abitab");
        }else {
            throw new TicketExeption("no se encoontro el tiket en la agencia");
        }
        } catch (Exception e) {
            e.getMessage();
        }
        return rsp;
    }
}
