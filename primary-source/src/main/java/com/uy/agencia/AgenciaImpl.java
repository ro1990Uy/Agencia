package com.uy.agencia;

import com.uy.agenciaWsClient.TicketsEst;
import com.uy.agenciaWsClient.WebServiceImm;
import com.uy.agenciaWsClient.WebServiceImm_Service;

import javax.xml.ws.WebServiceClient;

@WebServiceClient()
public class AgenciaImpl {

    WebServiceImm_Service ws = new WebServiceImm_Service();
    WebServiceImm ws2 = ws.getWebServiceImmPort();
    TicketsEst tk = ws2.altaTiket();

    String rr=ws2.bajaTiket()







}
