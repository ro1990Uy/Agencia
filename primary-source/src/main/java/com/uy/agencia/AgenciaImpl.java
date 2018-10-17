package com.uy.agencia;

import com.uy.agenciaWsClient.AltaTiket;
import com.uy.agenciaWsClient.TicketsEst;
import com.uy.agenciaWsClient.WebServiceImm;
import com.uy.agenciaWsClient.WebServiceImm_Service;

import javax.naming.InitialContext;
import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.PreparedStatement;

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
                PreparedStatement ps = connection.prepareStatement();
                ps.execute();


            }else {throw new AgenciaImplException("NO SE PUDEO VENDER EL TICKET ");}
        }catch (Exception e){

        }
        return tiket;
    }
}
