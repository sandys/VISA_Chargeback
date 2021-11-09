package com.incomm.esb.util;

import java.io.File;
import java.io.FileInputStream;
import java.security.KeyStore;
import java.security.SecureRandom;

import javax.net.ssl.KeyManager;
import javax.net.ssl.KeyManagerFactory;
import javax.net.ssl.SSLContext;
import javax.net.ssl.TrustManager;
import javax.net.ssl.TrustManagerFactory;

import org.apache.log4j.Logger;

import com.incomm.esb.chargeback.ProcessChargeback;
import com.incomm.esb.fraudreporting.ProcessFraudReporting;

/**
 * SSLUtil provides utility methods for setting up TLSV1.2 connection and loading   
 * 
 * Used during creation of Client in {@link ProcessChargeback} and {@link ProcessFraudReporting}
 *  
 * @author hahuja
 *
 */
public class SSLUtil {
	
	private final static Logger logger = Logger.getLogger(SSLUtil.class);
	
	public static SSLContext createSSLContext() throws Exception {
		SSLContext sslContext = SSLContext.getInstance("TLSv1.2");
	    TrustManager[] trustManagers = getTrustManagers();
	    //	Key managers are only required for two-way SSL, or client certificate authentication.
	    KeyManager[] keyManagers = getKeyManagers(); 
	    sslContext.init(keyManagers, trustManagers, new SecureRandom()); 
	    return sslContext;
	}
	
	private static KeyStore loadTrustStore() throws Exception {
	    KeyStore trustStore = KeyStore.getInstance("jks");
	    logger.debug("KEYSTORE_PATH=" + Constants.KEYSTORE_PATH);
	    trustStore.load(new FileInputStream(new File(Constants.KEYSTORE_PATH)), Constants.KEYSTORE_PASSWORD.trim().toCharArray());
	    return trustStore;
	}

	private static TrustManager[] getTrustManagers() throws Exception {
	    KeyStore trustStore = loadTrustStore();
	    TrustManagerFactory tmf = TrustManagerFactory.getInstance(TrustManagerFactory.getDefaultAlgorithm());
	    tmf.init(trustStore);
	    return tmf.getTrustManagers();
	}

	// Key managers are only required for two-way SSL, or client certificate authentication.
	private static KeyStore loadKeyStore() throws Exception {
	    KeyStore keyStore = KeyStore.getInstance("jks");
	    logger.debug("KEYSTORE_PATH=" + Constants.KEYSTORE_PATH);
	    keyStore.load(new FileInputStream(new File(Constants.KEYSTORE_PATH)), Constants.KEYSTORE_PASSWORD.trim().toCharArray());
	    return keyStore;
	}

	// Key managers are only required for two-way SSL, or client certificate authentication.
	private static KeyManager[] getKeyManagers() throws Exception {
	    KeyStore keyStore = loadKeyStore();
	    KeyManagerFactory kmf = KeyManagerFactory.getInstance(KeyManagerFactory.getDefaultAlgorithm());
	    kmf.init(keyStore, Constants.KEYSTORE_PASSWORD.trim().toCharArray());
	    return kmf.getKeyManagers();
	}

}
