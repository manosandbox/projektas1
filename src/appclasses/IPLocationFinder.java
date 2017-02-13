package appclasses;

import java.rmi.RemoteException;

import javax.xml.rpc.ServiceException;

import org.apache.axis.AxisFault;

import net.webservicex.www.GeoIP;
import net.webservicex.www.GeoIPService;
import net.webservicex.www.GeoIPServiceLocator;
import net.webservicex.www.GeoIPServiceSoap;
import net.webservicex.www.GeoIPServiceSoapStub;

public class IPLocationFinder {
//jhgfkjhgfkjhgfkgfkjhgfkjhgf
	public static void main(String[] args) {
		if (args.length != 1) {
			System.out.println("You need to pass in one IP adress");
		}
		else {
			String ipAddress = args[0];
			try {
				GeoIPServiceLocator service = new GeoIPServiceLocator();
				   
				 GeoIPServiceSoap port = service.getGeoIPServiceSoap();
				   
				 GeoIP geoIp = port.getGeoIP(ipAddress);
				 //System.out.println(geoIp.getCountryName());﻿
			} catch (AxisFault e) {
				e.printStackTrace();
			} catch (RemoteException e) {
				e.printStackTrace();
			} catch (ServiceException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}
