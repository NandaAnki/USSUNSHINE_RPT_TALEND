
package uscomm_sunshine_rpt_qa.beacon_extract_snowflake_0_1;

import routines.DataOperation;
import routines.TalendDataGenerator;
import routines.DataQuality;
import routines.Relational;
import routines.DataQualityDependencies;
import routines.Mathematical;
import routines.SQLike;
import routines.Numeric;
import routines.TalendStringUtil;
import routines.TalendString;
import routines.DQTechnical;
import routines.StringHandling;
import routines.DataMasking;
import routines.TalendDate;
import routines.DqStringHandling;
import routines.system.*;
import routines.system.api.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.math.BigDecimal;
import java.io.ByteArrayOutputStream;
import java.io.ByteArrayInputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.ObjectOutputStream;
import java.io.ObjectInputStream;
import java.io.IOException;
import java.util.Comparator;
 





@SuppressWarnings("unused")

/**
 * Job: BEACON_EXTRACT_SNOWFLAKE Purpose: <br>
 * Description:  <br>
 * @author Reddi Anki, Nanda Kishore
 * @version 8.0.1.20220218_1542-patch
 * @status 
 */
public class BEACON_EXTRACT_SNOWFLAKE implements TalendJob {
	static {System.setProperty("TalendJob.log", "BEACON_EXTRACT_SNOWFLAKE.log");}

	

	
	private static org.apache.logging.log4j.Logger log = org.apache.logging.log4j.LogManager.getLogger(BEACON_EXTRACT_SNOWFLAKE.class);
	

protected static void logIgnoredError(String message, Throwable cause) {
       log.error(message, cause);

}


	public final Object obj = new Object();

	// for transmiting parameters purpose
	private Object valueObject = null;

	public Object getValueObject() {
		return this.valueObject;
	}

	public void setValueObject(Object valueObject) {
		this.valueObject = valueObject;
	}
	
	private final static String defaultCharset = java.nio.charset.Charset.defaultCharset().name();

	
	private final static String utf8Charset = "UTF-8";
	//contains type for every context property
	public class PropertiesWithType extends java.util.Properties {
		private static final long serialVersionUID = 1L;
		private java.util.Map<String,String> propertyTypes = new java.util.HashMap<>();
		
		public PropertiesWithType(java.util.Properties properties){
			super(properties);
		}
		public PropertiesWithType(){
			super();
		}
		
		public void setContextType(String key, String type) {
			propertyTypes.put(key,type);
		}
	
		public String getContextType(String key) {
			return propertyTypes.get(key);
		}
	}
	
	// create and load default properties
	private java.util.Properties defaultProps = new java.util.Properties();
	// create application properties with default
	public class ContextProperties extends PropertiesWithType {

		private static final long serialVersionUID = 1L;

		public ContextProperties(java.util.Properties properties){
			super(properties);
		}
		public ContextProperties(){
			super();
		}

		public void synchronizeContext(){
			
			if(USSUNSHINE_RPT_DEV_CONN_oauthProperties_oauthPassword != null){
				
					this.setProperty("USSUNSHINE_RPT_DEV_CONN_oauthProperties_oauthPassword", USSUNSHINE_RPT_DEV_CONN_oauthProperties_oauthPassword.toString());
				
			}
			
			if(USSUNSHINE_RPT_DEV_CONN_jdbcParameters != null){
				
					this.setProperty("USSUNSHINE_RPT_DEV_CONN_jdbcParameters", USSUNSHINE_RPT_DEV_CONN_jdbcParameters.toString());
				
			}
			
			if(USSUNSHINE_RPT_DEV_CONN_regionID != null){
				
					this.setProperty("USSUNSHINE_RPT_DEV_CONN_regionID", USSUNSHINE_RPT_DEV_CONN_regionID.toString());
				
			}
			
			if(USSUNSHINE_RPT_DEV_CONN_warehouse != null){
				
					this.setProperty("USSUNSHINE_RPT_DEV_CONN_warehouse", USSUNSHINE_RPT_DEV_CONN_warehouse.toString());
				
			}
			
			if(USSUNSHINE_RPT_DEV_CONN_account != null){
				
					this.setProperty("USSUNSHINE_RPT_DEV_CONN_account", USSUNSHINE_RPT_DEV_CONN_account.toString());
				
			}
			
			if(USSUNSHINE_RPT_DEV_CONN_userPassword_password != null){
				
					this.setProperty("USSUNSHINE_RPT_DEV_CONN_userPassword_password", USSUNSHINE_RPT_DEV_CONN_userPassword_password.toString());
				
			}
			
			if(USSUNSHINE_RPT_DEV_CONN_db != null){
				
					this.setProperty("USSUNSHINE_RPT_DEV_CONN_db", USSUNSHINE_RPT_DEV_CONN_db.toString());
				
			}
			
			if(USSUNSHINE_RPT_DEV_CONN_loginTimeout != null){
				
					this.setProperty("USSUNSHINE_RPT_DEV_CONN_loginTimeout", USSUNSHINE_RPT_DEV_CONN_loginTimeout.toString());
				
			}
			
			if(USSUNSHINE_RPT_DEV_CONN_oauthProperties_scope != null){
				
					this.setProperty("USSUNSHINE_RPT_DEV_CONN_oauthProperties_scope", USSUNSHINE_RPT_DEV_CONN_oauthProperties_scope.toString());
				
			}
			
			if(USSUNSHINE_RPT_DEV_CONN_oauthProperties_oauthUserName != null){
				
					this.setProperty("USSUNSHINE_RPT_DEV_CONN_oauthProperties_oauthUserName", USSUNSHINE_RPT_DEV_CONN_oauthProperties_oauthUserName.toString());
				
			}
			
			if(USSUNSHINE_RPT_DEV_CONN_userPassword_userId != null){
				
					this.setProperty("USSUNSHINE_RPT_DEV_CONN_userPassword_userId", USSUNSHINE_RPT_DEV_CONN_userPassword_userId.toString());
				
			}
			
			if(USSUNSHINE_RPT_DEV_CONN_role != null){
				
					this.setProperty("USSUNSHINE_RPT_DEV_CONN_role", USSUNSHINE_RPT_DEV_CONN_role.toString());
				
			}
			
			if(USSUNSHINE_RPT_DEV_CONN_schemaName != null){
				
					this.setProperty("USSUNSHINE_RPT_DEV_CONN_schemaName", USSUNSHINE_RPT_DEV_CONN_schemaName.toString());
				
			}
			
			if(USSUNSHINE_RPT_DEV_CONN_oauthProperties_clientSecret != null){
				
					this.setProperty("USSUNSHINE_RPT_DEV_CONN_oauthProperties_clientSecret", USSUNSHINE_RPT_DEV_CONN_oauthProperties_clientSecret.toString());
				
			}
			
			if(USSUNSHINE_RPT_DEV_CONN_oauthProperties_clientId != null){
				
					this.setProperty("USSUNSHINE_RPT_DEV_CONN_oauthProperties_clientId", USSUNSHINE_RPT_DEV_CONN_oauthProperties_clientId.toString());
				
			}
			
			if(USSUNSHINE_RPT_DEV_CONN_keyAlias != null){
				
					this.setProperty("USSUNSHINE_RPT_DEV_CONN_keyAlias", USSUNSHINE_RPT_DEV_CONN_keyAlias.toString());
				
			}
			
			if(USSUNSHINE_RPT_DEV_CONN_oauthProperties_oauthTokenEndpoint != null){
				
					this.setProperty("USSUNSHINE_RPT_DEV_CONN_oauthProperties_oauthTokenEndpoint", USSUNSHINE_RPT_DEV_CONN_oauthProperties_oauthTokenEndpoint.toString());
				
			}
			
		}
		
		//if the stored or passed value is "<TALEND_NULL>" string, it mean null
		public String getStringValue(String key) {
			String origin_value = this.getProperty(key);
			if(NULL_VALUE_EXPRESSION_IN_COMMAND_STRING_FOR_CHILD_JOB_ONLY.equals(origin_value)) {
				return null;
			}
			return origin_value;
		}

public java.lang.String USSUNSHINE_RPT_DEV_CONN_oauthProperties_oauthPassword;
public java.lang.String getUSSUNSHINE_RPT_DEV_CONN_oauthProperties_oauthPassword(){
	return this.USSUNSHINE_RPT_DEV_CONN_oauthProperties_oauthPassword;
}
public String USSUNSHINE_RPT_DEV_CONN_jdbcParameters;
public String getUSSUNSHINE_RPT_DEV_CONN_jdbcParameters(){
	return this.USSUNSHINE_RPT_DEV_CONN_jdbcParameters;
}
public String USSUNSHINE_RPT_DEV_CONN_regionID;
public String getUSSUNSHINE_RPT_DEV_CONN_regionID(){
	return this.USSUNSHINE_RPT_DEV_CONN_regionID;
}
public String USSUNSHINE_RPT_DEV_CONN_warehouse;
public String getUSSUNSHINE_RPT_DEV_CONN_warehouse(){
	return this.USSUNSHINE_RPT_DEV_CONN_warehouse;
}
public String USSUNSHINE_RPT_DEV_CONN_account;
public String getUSSUNSHINE_RPT_DEV_CONN_account(){
	return this.USSUNSHINE_RPT_DEV_CONN_account;
}
public java.lang.String USSUNSHINE_RPT_DEV_CONN_userPassword_password;
public java.lang.String getUSSUNSHINE_RPT_DEV_CONN_userPassword_password(){
	return this.USSUNSHINE_RPT_DEV_CONN_userPassword_password;
}
public String USSUNSHINE_RPT_DEV_CONN_db;
public String getUSSUNSHINE_RPT_DEV_CONN_db(){
	return this.USSUNSHINE_RPT_DEV_CONN_db;
}
public Integer USSUNSHINE_RPT_DEV_CONN_loginTimeout;
public Integer getUSSUNSHINE_RPT_DEV_CONN_loginTimeout(){
	return this.USSUNSHINE_RPT_DEV_CONN_loginTimeout;
}
public String USSUNSHINE_RPT_DEV_CONN_oauthProperties_scope;
public String getUSSUNSHINE_RPT_DEV_CONN_oauthProperties_scope(){
	return this.USSUNSHINE_RPT_DEV_CONN_oauthProperties_scope;
}
public String USSUNSHINE_RPT_DEV_CONN_oauthProperties_oauthUserName;
public String getUSSUNSHINE_RPT_DEV_CONN_oauthProperties_oauthUserName(){
	return this.USSUNSHINE_RPT_DEV_CONN_oauthProperties_oauthUserName;
}
public String USSUNSHINE_RPT_DEV_CONN_userPassword_userId;
public String getUSSUNSHINE_RPT_DEV_CONN_userPassword_userId(){
	return this.USSUNSHINE_RPT_DEV_CONN_userPassword_userId;
}
public String USSUNSHINE_RPT_DEV_CONN_role;
public String getUSSUNSHINE_RPT_DEV_CONN_role(){
	return this.USSUNSHINE_RPT_DEV_CONN_role;
}
public String USSUNSHINE_RPT_DEV_CONN_schemaName;
public String getUSSUNSHINE_RPT_DEV_CONN_schemaName(){
	return this.USSUNSHINE_RPT_DEV_CONN_schemaName;
}
public java.lang.String USSUNSHINE_RPT_DEV_CONN_oauthProperties_clientSecret;
public java.lang.String getUSSUNSHINE_RPT_DEV_CONN_oauthProperties_clientSecret(){
	return this.USSUNSHINE_RPT_DEV_CONN_oauthProperties_clientSecret;
}
public String USSUNSHINE_RPT_DEV_CONN_oauthProperties_clientId;
public String getUSSUNSHINE_RPT_DEV_CONN_oauthProperties_clientId(){
	return this.USSUNSHINE_RPT_DEV_CONN_oauthProperties_clientId;
}
public String USSUNSHINE_RPT_DEV_CONN_keyAlias;
public String getUSSUNSHINE_RPT_DEV_CONN_keyAlias(){
	return this.USSUNSHINE_RPT_DEV_CONN_keyAlias;
}
public String USSUNSHINE_RPT_DEV_CONN_oauthProperties_oauthTokenEndpoint;
public String getUSSUNSHINE_RPT_DEV_CONN_oauthProperties_oauthTokenEndpoint(){
	return this.USSUNSHINE_RPT_DEV_CONN_oauthProperties_oauthTokenEndpoint;
}
	}
	protected ContextProperties context = new ContextProperties(); // will be instanciated by MS.
	public ContextProperties getContext() {
		return this.context;
	}
	private final String jobVersion = "0.1";
	private final String jobName = "BEACON_EXTRACT_SNOWFLAKE";
	private final String projectName = "USCOMM_SUNSHINE_RPT_QA";
	public Integer errorCode = null;
	private String currentComponent = "";
	
		private final java.util.Map<String, Object> globalMap = new java.util.HashMap<String, Object>();
        private final static java.util.Map<String, Object> junitGlobalMap = new java.util.HashMap<String, Object>();
	
		private final java.util.Map<String, Long> start_Hash = new java.util.HashMap<String, Long>();
		private final java.util.Map<String, Long> end_Hash = new java.util.HashMap<String, Long>();
		private final java.util.Map<String, Boolean> ok_Hash = new java.util.HashMap<String, Boolean>();
		public  final java.util.List<String[]> globalBuffer = new java.util.ArrayList<String[]>();
	

private final JobStructureCatcherUtils talendJobLog = new JobStructureCatcherUtils(jobName, "_5pi6UKBBEeyX4rrA6tY87A", "0.1");
private org.talend.job.audit.JobAuditLogger auditLogger_talendJobLog = null;

private RunStat runStat = new RunStat(talendJobLog, System.getProperty("audit.interval"));

	// OSGi DataSource
	private final static String KEY_DB_DATASOURCES = "KEY_DB_DATASOURCES";
	
	private final static String KEY_DB_DATASOURCES_RAW = "KEY_DB_DATASOURCES_RAW";

	public void setDataSources(java.util.Map<String, javax.sql.DataSource> dataSources) {
		java.util.Map<String, routines.system.TalendDataSource> talendDataSources = new java.util.HashMap<String, routines.system.TalendDataSource>();
		for (java.util.Map.Entry<String, javax.sql.DataSource> dataSourceEntry : dataSources.entrySet()) {
			talendDataSources.put(dataSourceEntry.getKey(), new routines.system.TalendDataSource(dataSourceEntry.getValue()));
		}
		globalMap.put(KEY_DB_DATASOURCES, talendDataSources);
		globalMap.put(KEY_DB_DATASOURCES_RAW, new java.util.HashMap<String, javax.sql.DataSource>(dataSources));
	}
	
	public void setDataSourceReferences(List serviceReferences) throws Exception{
		
		java.util.Map<String, routines.system.TalendDataSource> talendDataSources = new java.util.HashMap<String, routines.system.TalendDataSource>();
		java.util.Map<String, javax.sql.DataSource> dataSources = new java.util.HashMap<String, javax.sql.DataSource>();
		
		for (java.util.Map.Entry<String, javax.sql.DataSource> entry : BundleUtils.getServices(serviceReferences,  javax.sql.DataSource.class).entrySet()) {
                    dataSources.put(entry.getKey(), entry.getValue());
                    talendDataSources.put(entry.getKey(), new routines.system.TalendDataSource(entry.getValue()));
		}

		globalMap.put(KEY_DB_DATASOURCES, talendDataSources);
		globalMap.put(KEY_DB_DATASOURCES_RAW, new java.util.HashMap<String, javax.sql.DataSource>(dataSources));
	}


private final java.io.ByteArrayOutputStream baos = new java.io.ByteArrayOutputStream();
private final java.io.PrintStream errorMessagePS = new java.io.PrintStream(new java.io.BufferedOutputStream(baos));

public String getExceptionStackTrace() {
	if ("failure".equals(this.getStatus())) {
		errorMessagePS.flush();
		return baos.toString();
	}
	return null;
}

private Exception exception;

public Exception getException() {
	if ("failure".equals(this.getStatus())) {
		return this.exception;
	}
	return null;
}

private class TalendException extends Exception {

	private static final long serialVersionUID = 1L;

	private java.util.Map<String, Object> globalMap = null;
	private Exception e = null;
	private String currentComponent = null;
	private String virtualComponentName = null;
	
	public void setVirtualComponentName (String virtualComponentName){
		this.virtualComponentName = virtualComponentName;
	}

	private TalendException(Exception e, String errorComponent, final java.util.Map<String, Object> globalMap) {
		this.currentComponent= errorComponent;
		this.globalMap = globalMap;
		this.e = e;
	}

	public Exception getException() {
		return this.e;
	}

	public String getCurrentComponent() {
		return this.currentComponent;
	}

	
    public String getExceptionCauseMessage(Exception e){
        Throwable cause = e;
        String message = null;
        int i = 10;
        while (null != cause && 0 < i--) {
            message = cause.getMessage();
            if (null == message) {
                cause = cause.getCause();
            } else {
                break;          
            }
        }
        if (null == message) {
            message = e.getClass().getName();
        }   
        return message;
    }

	@Override
	public void printStackTrace() {
		if (!(e instanceof TalendException || e instanceof TDieException)) {
			if(virtualComponentName!=null && currentComponent.indexOf(virtualComponentName+"_")==0){
				globalMap.put(virtualComponentName+"_ERROR_MESSAGE",getExceptionCauseMessage(e));
			}
			globalMap.put(currentComponent+"_ERROR_MESSAGE",getExceptionCauseMessage(e));
			System.err.println("Exception in component " + currentComponent + " (" + jobName + ")");
		}
		if (!(e instanceof TDieException)) {
			if(e instanceof TalendException){
				e.printStackTrace();
			} else {
				e.printStackTrace();
				e.printStackTrace(errorMessagePS);
				BEACON_EXTRACT_SNOWFLAKE.this.exception = e;
			}
		}
		if (!(e instanceof TalendException)) {
		try {
			for (java.lang.reflect.Method m : this.getClass().getEnclosingClass().getMethods()) {
				if (m.getName().compareTo(currentComponent + "_error") == 0) {
					m.invoke(BEACON_EXTRACT_SNOWFLAKE.this, new Object[] { e , currentComponent, globalMap});
					break;
				}
			}

			if(!(e instanceof TDieException)){
			}
		} catch (Exception e) {
			this.e.printStackTrace();
		}
		}
	}
}

			public void tPrejob_1_error(Exception exception, String errorComponent, final java.util.Map<String, Object> globalMap) throws TalendException {
				
				end_Hash.put(errorComponent, System.currentTimeMillis());
				
				status = "failure";
				
					tPrejob_1_onSubJobError(exception, errorComponent, globalMap);
			}
			
			public void tDBConnection_1_error(Exception exception, String errorComponent, final java.util.Map<String, Object> globalMap) throws TalendException {
				
				end_Hash.put(errorComponent, System.currentTimeMillis());
				
						try {
							
								if(this.execStat){
									runStat.updateStatOnConnection("OnComponentError1", 0, "error");
								}
							
							
								errorCode = null;
								tDie_1Process(globalMap);
								if (!"failure".equals(status)) {
									status = "end";
								}
								

						} catch (Exception e) {
							e.printStackTrace();
						}
						
					tDBConnection_1_onSubJobError(exception, errorComponent, globalMap);
			}
			
			public void tDie_1_error(Exception exception, String errorComponent, final java.util.Map<String, Object> globalMap) throws TalendException {
				
				end_Hash.put(errorComponent, System.currentTimeMillis());
				
				status = "failure";
				
					tDie_1_onSubJobError(exception, errorComponent, globalMap);
			}
			
			public void tDBInput_1_error(Exception exception, String errorComponent, final java.util.Map<String, Object> globalMap) throws TalendException {
				
				end_Hash.put(errorComponent, System.currentTimeMillis());
				
					tDBInput_1_onSubJobError(exception, errorComponent, globalMap);
			}
			
			public void tMap_1_error(Exception exception, String errorComponent, final java.util.Map<String, Object> globalMap) throws TalendException {
				
				end_Hash.put(errorComponent, System.currentTimeMillis());
				
					tDBInput_1_onSubJobError(exception, errorComponent, globalMap);
			}
			
			public void tDBOutput_1_error(Exception exception, String errorComponent, final java.util.Map<String, Object> globalMap) throws TalendException {
				
				end_Hash.put(errorComponent, System.currentTimeMillis());
				
					tDBInput_1_onSubJobError(exception, errorComponent, globalMap);
			}
			
			public void tDBCommit_1_error(Exception exception, String errorComponent, final java.util.Map<String, Object> globalMap) throws TalendException {
				
				end_Hash.put(errorComponent, System.currentTimeMillis());
				
				status = "failure";
				
					tDBCommit_1_onSubJobError(exception, errorComponent, globalMap);
			}
			
			public void tDBRollback_1_error(Exception exception, String errorComponent, final java.util.Map<String, Object> globalMap) throws TalendException {
				
				end_Hash.put(errorComponent, System.currentTimeMillis());
				
				status = "failure";
				
					tDBRollback_1_onSubJobError(exception, errorComponent, globalMap);
			}
			
			public void tDBInput_2_error(Exception exception, String errorComponent, final java.util.Map<String, Object> globalMap) throws TalendException {
				
				end_Hash.put(errorComponent, System.currentTimeMillis());
				
					tDBInput_1_onSubJobError(exception, errorComponent, globalMap);
			}
			
			public void tDBInput_4_error(Exception exception, String errorComponent, final java.util.Map<String, Object> globalMap) throws TalendException {
				
				end_Hash.put(errorComponent, System.currentTimeMillis());
				
					tDBInput_1_onSubJobError(exception, errorComponent, globalMap);
			}
			
			public void tDBInput_3_error(Exception exception, String errorComponent, final java.util.Map<String, Object> globalMap) throws TalendException {
				
				end_Hash.put(errorComponent, System.currentTimeMillis());
				
					tDBInput_1_onSubJobError(exception, errorComponent, globalMap);
			}
			
			public void tDBInput_5_error(Exception exception, String errorComponent, final java.util.Map<String, Object> globalMap) throws TalendException {
				
				end_Hash.put(errorComponent, System.currentTimeMillis());
				
					tDBInput_1_onSubJobError(exception, errorComponent, globalMap);
			}
			
			public void tDBInput_6_error(Exception exception, String errorComponent, final java.util.Map<String, Object> globalMap) throws TalendException {
				
				end_Hash.put(errorComponent, System.currentTimeMillis());
				
					tDBInput_1_onSubJobError(exception, errorComponent, globalMap);
			}
			
			public void tDBInput_7_error(Exception exception, String errorComponent, final java.util.Map<String, Object> globalMap) throws TalendException {
				
				end_Hash.put(errorComponent, System.currentTimeMillis());
				
					tDBInput_1_onSubJobError(exception, errorComponent, globalMap);
			}
			
			public void tDBInput_8_error(Exception exception, String errorComponent, final java.util.Map<String, Object> globalMap) throws TalendException {
				
				end_Hash.put(errorComponent, System.currentTimeMillis());
				
					tDBInput_1_onSubJobError(exception, errorComponent, globalMap);
			}
			
			public void tPostjob_1_error(Exception exception, String errorComponent, final java.util.Map<String, Object> globalMap) throws TalendException {
				
				end_Hash.put(errorComponent, System.currentTimeMillis());
				
				status = "failure";
				
					tPostjob_1_onSubJobError(exception, errorComponent, globalMap);
			}
			
			public void tDBClose_1_error(Exception exception, String errorComponent, final java.util.Map<String, Object> globalMap) throws TalendException {
				
				end_Hash.put(errorComponent, System.currentTimeMillis());
				
						try {
							
								if(this.execStat){
									runStat.updateStatOnConnection("OnComponentError2", 0, "error");
								}
							
							
								errorCode = null;
								tWarn_1Process(globalMap);
								if (!"failure".equals(status)) {
									status = "end";
								}
								

						} catch (Exception e) {
							e.printStackTrace();
						}
						
					tDBClose_1_onSubJobError(exception, errorComponent, globalMap);
			}
			
			public void tWarn_1_error(Exception exception, String errorComponent, final java.util.Map<String, Object> globalMap) throws TalendException {
				
				end_Hash.put(errorComponent, System.currentTimeMillis());
				
				status = "failure";
				
					tWarn_1_onSubJobError(exception, errorComponent, globalMap);
			}
			
			public void tDBConnection_2_error(Exception exception, String errorComponent, final java.util.Map<String, Object> globalMap) throws TalendException {
				
				end_Hash.put(errorComponent, System.currentTimeMillis());
				
				status = "failure";
				
					tDBConnection_2_onSubJobError(exception, errorComponent, globalMap);
			}
			
			public void tAdvancedHash_HCPTOINTERACTIONCOM_error(Exception exception, String errorComponent, final java.util.Map<String, Object> globalMap) throws TalendException {
				
				end_Hash.put(errorComponent, System.currentTimeMillis());
				
					tDBInput_1_onSubJobError(exception, errorComponent, globalMap);
			}
			
			public void tAdvancedHash_INTERACTIONSCOM_error(Exception exception, String errorComponent, final java.util.Map<String, Object> globalMap) throws TalendException {
				
				end_Hash.put(errorComponent, System.currentTimeMillis());
				
					tDBInput_1_onSubJobError(exception, errorComponent, globalMap);
			}
			
			public void tAdvancedHash_HCPADDRESSES_error(Exception exception, String errorComponent, final java.util.Map<String, Object> globalMap) throws TalendException {
				
				end_Hash.put(errorComponent, System.currentTimeMillis());
				
					tDBInput_1_onSubJobError(exception, errorComponent, globalMap);
			}
			
			public void tAdvancedHash_PRODUCT_error(Exception exception, String errorComponent, final java.util.Map<String, Object> globalMap) throws TalendException {
				
				end_Hash.put(errorComponent, System.currentTimeMillis());
				
					tDBInput_1_onSubJobError(exception, errorComponent, globalMap);
			}
			
			public void tAdvancedHash_RECIPIENT_STATE_error(Exception exception, String errorComponent, final java.util.Map<String, Object> globalMap) throws TalendException {
				
				end_Hash.put(errorComponent, System.currentTimeMillis());
				
					tDBInput_1_onSubJobError(exception, errorComponent, globalMap);
			}
			
			public void tAdvancedHash_RECIPIENT_COUNTRY_error(Exception exception, String errorComponent, final java.util.Map<String, Object> globalMap) throws TalendException {
				
				end_Hash.put(errorComponent, System.currentTimeMillis());
				
					tDBInput_1_onSubJobError(exception, errorComponent, globalMap);
			}
			
			public void tAdvancedHash_RECIPIENT_TYPE_error(Exception exception, String errorComponent, final java.util.Map<String, Object> globalMap) throws TalendException {
				
				end_Hash.put(errorComponent, System.currentTimeMillis());
				
					tDBInput_1_onSubJobError(exception, errorComponent, globalMap);
			}
			
			public void talendJobLog_error(Exception exception, String errorComponent, final java.util.Map<String, Object> globalMap) throws TalendException {
				
				end_Hash.put(errorComponent, System.currentTimeMillis());
				
				status = "failure";
				
					talendJobLog_onSubJobError(exception, errorComponent, globalMap);
			}
			
			public void tPrejob_1_onSubJobError(Exception exception, String errorComponent, final java.util.Map<String, Object> globalMap) throws TalendException {

resumeUtil.addLog("SYSTEM_LOG", "NODE:"+ errorComponent, "", Thread.currentThread().getId()+ "", "FATAL", "", exception.getMessage(), ResumeUtil.getExceptionStackTrace(exception),"");

			}
			public void tDBConnection_1_onSubJobError(Exception exception, String errorComponent, final java.util.Map<String, Object> globalMap) throws TalendException {

resumeUtil.addLog("SYSTEM_LOG", "NODE:"+ errorComponent, "", Thread.currentThread().getId()+ "", "FATAL", "", exception.getMessage(), ResumeUtil.getExceptionStackTrace(exception),"");

			}
			public void tDie_1_onSubJobError(Exception exception, String errorComponent, final java.util.Map<String, Object> globalMap) throws TalendException {

resumeUtil.addLog("SYSTEM_LOG", "NODE:"+ errorComponent, "", Thread.currentThread().getId()+ "", "FATAL", "", exception.getMessage(), ResumeUtil.getExceptionStackTrace(exception),"");

			}
			public void tDBInput_1_onSubJobError(Exception exception, String errorComponent, final java.util.Map<String, Object> globalMap) throws TalendException {

resumeUtil.addLog("SYSTEM_LOG", "NODE:"+ errorComponent, "", Thread.currentThread().getId()+ "", "ERROR", "", exception.getMessage(), ResumeUtil.getExceptionStackTrace(exception),"");

				try {
					
						if(this.execStat){
							runStat.updateStatOnConnection("OnSubjobError1", 0, "error");
						}
					
					errorCode = null;
					tDBRollback_1Process(globalMap);
					if (!"failure".equals(status)) {
						status = "end";
					}
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
			public void tDBCommit_1_onSubJobError(Exception exception, String errorComponent, final java.util.Map<String, Object> globalMap) throws TalendException {

resumeUtil.addLog("SYSTEM_LOG", "NODE:"+ errorComponent, "", Thread.currentThread().getId()+ "", "FATAL", "", exception.getMessage(), ResumeUtil.getExceptionStackTrace(exception),"");

			}
			public void tDBRollback_1_onSubJobError(Exception exception, String errorComponent, final java.util.Map<String, Object> globalMap) throws TalendException {

resumeUtil.addLog("SYSTEM_LOG", "NODE:"+ errorComponent, "", Thread.currentThread().getId()+ "", "FATAL", "", exception.getMessage(), ResumeUtil.getExceptionStackTrace(exception),"");

			}
			public void tPostjob_1_onSubJobError(Exception exception, String errorComponent, final java.util.Map<String, Object> globalMap) throws TalendException {

resumeUtil.addLog("SYSTEM_LOG", "NODE:"+ errorComponent, "", Thread.currentThread().getId()+ "", "FATAL", "", exception.getMessage(), ResumeUtil.getExceptionStackTrace(exception),"");

			}
			public void tDBClose_1_onSubJobError(Exception exception, String errorComponent, final java.util.Map<String, Object> globalMap) throws TalendException {

resumeUtil.addLog("SYSTEM_LOG", "NODE:"+ errorComponent, "", Thread.currentThread().getId()+ "", "FATAL", "", exception.getMessage(), ResumeUtil.getExceptionStackTrace(exception),"");

			}
			public void tWarn_1_onSubJobError(Exception exception, String errorComponent, final java.util.Map<String, Object> globalMap) throws TalendException {

resumeUtil.addLog("SYSTEM_LOG", "NODE:"+ errorComponent, "", Thread.currentThread().getId()+ "", "FATAL", "", exception.getMessage(), ResumeUtil.getExceptionStackTrace(exception),"");

			}
			public void tDBConnection_2_onSubJobError(Exception exception, String errorComponent, final java.util.Map<String, Object> globalMap) throws TalendException {

resumeUtil.addLog("SYSTEM_LOG", "NODE:"+ errorComponent, "", Thread.currentThread().getId()+ "", "FATAL", "", exception.getMessage(), ResumeUtil.getExceptionStackTrace(exception),"");

			}
			public void talendJobLog_onSubJobError(Exception exception, String errorComponent, final java.util.Map<String, Object> globalMap) throws TalendException {

resumeUtil.addLog("SYSTEM_LOG", "NODE:"+ errorComponent, "", Thread.currentThread().getId()+ "", "FATAL", "", exception.getMessage(), ResumeUtil.getExceptionStackTrace(exception),"");

			}
	







public void tPrejob_1Process(final java.util.Map<String, Object> globalMap) throws TalendException {
	globalMap.put("tPrejob_1_SUBPROCESS_STATE", 0);

 final boolean execStat = this.execStat;
	
		String iterateId = "";
	
	
	String currentComponent = "";
	java.util.Map<String, Object> resourceMap = new java.util.HashMap<String, Object>();

	try {
			// TDI-39566 avoid throwing an useless Exception
			boolean resumeIt = true;
			if (globalResumeTicket == false && resumeEntryMethodName != null) {
				String currentMethodName = new java.lang.Exception().getStackTrace()[0].getMethodName();
				resumeIt = resumeEntryMethodName.equals(currentMethodName);
			}
			if (resumeIt || globalResumeTicket) { //start the resume
				globalResumeTicket = true;



		


	
	/**
	 * [tPrejob_1 begin ] start
	 */

	

	
		
		ok_Hash.put("tPrejob_1", false);
		start_Hash.put("tPrejob_1", System.currentTimeMillis());
		
	
	currentComponent="tPrejob_1";

	
		int tos_count_tPrejob_1 = 0;
		
			if(enableLogStash) {
				talendJobLog.addCM("tPrejob_1", "tPrejob_1", "tPrejob");
				talendJobLogProcess(globalMap);
			}
			

 



/**
 * [tPrejob_1 begin ] stop
 */
	
	/**
	 * [tPrejob_1 main ] start
	 */

	

	
	
	currentComponent="tPrejob_1";

	

 


	tos_count_tPrejob_1++;

/**
 * [tPrejob_1 main ] stop
 */
	
	/**
	 * [tPrejob_1 process_data_begin ] start
	 */

	

	
	
	currentComponent="tPrejob_1";

	

 



/**
 * [tPrejob_1 process_data_begin ] stop
 */
	
	/**
	 * [tPrejob_1 process_data_end ] start
	 */

	

	
	
	currentComponent="tPrejob_1";

	

 



/**
 * [tPrejob_1 process_data_end ] stop
 */
	
	/**
	 * [tPrejob_1 end ] start
	 */

	

	
	
	currentComponent="tPrejob_1";

	

 

ok_Hash.put("tPrejob_1", true);
end_Hash.put("tPrejob_1", System.currentTimeMillis());

				if(execStat){   
   	 				runStat.updateStatOnConnection("OnComponentOk1", 0, "ok");
				}
				tDBConnection_1Process(globalMap);



/**
 * [tPrejob_1 end ] stop
 */
				}//end the resume

				



	
			}catch(java.lang.Exception e){	
				
				    if(!(e instanceof TalendException)){
					   log.fatal(currentComponent + " " + e.getMessage(),e);
					}
				
				TalendException te = new TalendException(e, currentComponent, globalMap);
				
				throw te;
			}catch(java.lang.Error error){	
				
					runStat.stopThreadStat();
				
				throw error;
			}finally{
				
				try{
					
	
	/**
	 * [tPrejob_1 finally ] start
	 */

	

	
	
	currentComponent="tPrejob_1";

	

 



/**
 * [tPrejob_1 finally ] stop
 */
				}catch(java.lang.Exception e){	
					//ignore
				}catch(java.lang.Error error){
					//ignore
				}
				resourceMap = null;
			}
		

		globalMap.put("tPrejob_1_SUBPROCESS_STATE", 1);
	}
	

public void tDBConnection_1Process(final java.util.Map<String, Object> globalMap) throws TalendException {
	globalMap.put("tDBConnection_1_SUBPROCESS_STATE", 0);

 final boolean execStat = this.execStat;
	
		String iterateId = "";
	
	
	String currentComponent = "";
	java.util.Map<String, Object> resourceMap = new java.util.HashMap<String, Object>();

	try {
			// TDI-39566 avoid throwing an useless Exception
			boolean resumeIt = true;
			if (globalResumeTicket == false && resumeEntryMethodName != null) {
				String currentMethodName = new java.lang.Exception().getStackTrace()[0].getMethodName();
				resumeIt = resumeEntryMethodName.equals(currentMethodName);
			}
			if (resumeIt || globalResumeTicket) { //start the resume
				globalResumeTicket = true;



		


	
	/**
	 * [tDBConnection_1 begin ] start
	 */

	

	
		
		ok_Hash.put("tDBConnection_1", false);
		start_Hash.put("tDBConnection_1", System.currentTimeMillis());
		
	
	currentComponent="tDBConnection_1";

	
		int tos_count_tDBConnection_1 = 0;
		
			if(enableLogStash) {
				talendJobLog.addCM("tDBConnection_1", "tDBConnection_1", "tSnowflakeConnection");
				talendJobLogProcess(globalMap);
			}
			

boolean doesNodeBelongToRequest_tDBConnection_1 = 0 == 0;
@SuppressWarnings("unchecked")
java.util.Map<String, Object> restRequest_tDBConnection_1 = (java.util.Map<String, Object>)globalMap.get("restRequest");
String currentTRestRequestOperation_tDBConnection_1 = (String)(restRequest_tDBConnection_1 != null ? restRequest_tDBConnection_1.get("OPERATION") : null);

org.talend.components.api.component.ComponentDefinition def_tDBConnection_1 =
        new org.talend.components.snowflake.tsnowflakeconnection.TSnowflakeConnectionDefinition();

org.talend.components.api.component.runtime.Writer writer_tDBConnection_1 = null;
org.talend.components.api.component.runtime.Reader reader_tDBConnection_1 = null;


org.talend.components.snowflake.SnowflakeConnectionProperties props_tDBConnection_1 =
        (org.talend.components.snowflake.SnowflakeConnectionProperties) def_tDBConnection_1.createRuntimeProperties();
 		                    props_tDBConnection_1.setValue("loginTimeout",
 		                    15);
 		                    
 		                    props_tDBConnection_1.setValue("account",
 		                    "LEGENDBIOTECH.east-us-2.azure");
 		                    
 		                    props_tDBConnection_1.setValue("regionID",
 		                    "");
 		                    
 		                    props_tDBConnection_1.setValue("useCustomRegion",
 		                    false);
 		                    
 		                    props_tDBConnection_1.setValue("authenticationType",
 		                        org.talend.components.snowflake.tsnowflakeconnection.AuthenticationType.BASIC);
 		                    
 		                    props_tDBConnection_1.setValue("warehouse",
 		                    "USCOMM_DW");
 		                    
 		                    props_tDBConnection_1.setValue("db",
 		                    "USCOMM");
 		                    
 		                    props_tDBConnection_1.setValue("schemaName",
 		                    "BEACONCRM");
 		                    
 		                    props_tDBConnection_1.setValue("role",
 		                    "");
 		                    
 		                    props_tDBConnection_1.setValue("jdbcParameters",
 		                    "");
 		                    
 		                    props_tDBConnection_1.setValue("autoCommit",
 		                    true);
 		                    
 		                    props_tDBConnection_1.userPassword.setValue("useAuth",
 		                    false);
 		                    
 		                    props_tDBConnection_1.userPassword.setValue("userId",
 		                    "SUNSHINE_RPT");
 		                    
 		                        props_tDBConnection_1.userPassword.setValue("password",
 		                        routines.system.PasswordEncryptUtil.decryptPassword("enc:routine.encryption.key.v1:X7xxrgsA4cF0KNBlS1IzkbAA+Rei2qnTJZIa1FP0oQQ8cMaBog=="));
 		                        
 		                    props_tDBConnection_1.referencedComponent.setValue("referenceDefinitionName",
 		                    "tSnowflakeConnection");
 		                    
    if (org.talend.components.api.properties.ComponentReferenceProperties.ReferenceType.COMPONENT_INSTANCE == props_tDBConnection_1.referencedComponent.referenceType.getValue()) {
        final String referencedComponentInstanceId_tDBConnection_1 = props_tDBConnection_1.referencedComponent.componentInstanceId.getStringValue();
        if (referencedComponentInstanceId_tDBConnection_1 != null) {
            org.talend.daikon.properties.Properties referencedComponentProperties_tDBConnection_1 = (org.talend.daikon.properties.Properties) globalMap.get(
                referencedComponentInstanceId_tDBConnection_1 + "_COMPONENT_RUNTIME_PROPERTIES");
            props_tDBConnection_1.referencedComponent.setReference(referencedComponentProperties_tDBConnection_1);
        }
    }
globalMap.put("tDBConnection_1_COMPONENT_RUNTIME_PROPERTIES", props_tDBConnection_1);
globalMap.putIfAbsent("TALEND_PRODUCT_VERSION", "8.0");
globalMap.put("TALEND_COMPONENTS_VERSION", "0.37.4");
java.net.URL mappings_url_tDBConnection_1= this.getClass().getResource("/xmlMappings");
globalMap.put("tDBConnection_1_MAPPINGS_URL", mappings_url_tDBConnection_1);

org.talend.components.api.container.RuntimeContainer container_tDBConnection_1 = new org.talend.components.api.container.RuntimeContainer() {
    public Object getComponentData(String componentId, String key) {
        return globalMap.get(componentId + "_" + key);
    }

    public void setComponentData(String componentId, String key, Object data) {
        globalMap.put(componentId + "_" + key, data);
    }

    public String getCurrentComponentId() {
        return "tDBConnection_1";
    }

    public Object getGlobalData(String key) {
    	return globalMap.get(key);
    }
};

int nb_line_tDBConnection_1 = 0;

org.talend.components.api.component.ConnectorTopology topology_tDBConnection_1 = null;
topology_tDBConnection_1 = org.talend.components.api.component.ConnectorTopology.NONE;

org.talend.daikon.runtime.RuntimeInfo runtime_info_tDBConnection_1 = def_tDBConnection_1.getRuntimeInfo(
    org.talend.components.api.component.runtime.ExecutionEngine.DI, props_tDBConnection_1, topology_tDBConnection_1);
java.util.Set<org.talend.components.api.component.ConnectorTopology> supported_connector_topologies_tDBConnection_1 = def_tDBConnection_1.getSupportedConnectorTopologies();

org.talend.components.api.component.runtime.RuntimableRuntime componentRuntime_tDBConnection_1 = (org.talend.components.api.component.runtime.RuntimableRuntime)(Class.forName(runtime_info_tDBConnection_1.getRuntimeClassName()).newInstance());
org.talend.daikon.properties.ValidationResult initVr_tDBConnection_1 = componentRuntime_tDBConnection_1.initialize(container_tDBConnection_1, props_tDBConnection_1);

if (initVr_tDBConnection_1.getStatus() == org.talend.daikon.properties.ValidationResult.Result.ERROR ) {
    throw new RuntimeException(initVr_tDBConnection_1.getMessage());
}

if(componentRuntime_tDBConnection_1 instanceof org.talend.components.api.component.runtime.ComponentDriverInitialization) {
	org.talend.components.api.component.runtime.ComponentDriverInitialization compDriverInitialization_tDBConnection_1 = (org.talend.components.api.component.runtime.ComponentDriverInitialization)componentRuntime_tDBConnection_1;
	compDriverInitialization_tDBConnection_1.runAtDriver(container_tDBConnection_1);
}

org.talend.components.api.component.runtime.SourceOrSink sourceOrSink_tDBConnection_1 = null;
if(componentRuntime_tDBConnection_1 instanceof org.talend.components.api.component.runtime.SourceOrSink) {
	sourceOrSink_tDBConnection_1 = (org.talend.components.api.component.runtime.SourceOrSink)componentRuntime_tDBConnection_1;
	if (doesNodeBelongToRequest_tDBConnection_1) {
        org.talend.daikon.properties.ValidationResult vr_tDBConnection_1 = sourceOrSink_tDBConnection_1.validate(container_tDBConnection_1);
        if (vr_tDBConnection_1.getStatus() == org.talend.daikon.properties.ValidationResult.Result.ERROR ) {
            throw new RuntimeException(vr_tDBConnection_1.getMessage());
        }
	}
}

 



/**
 * [tDBConnection_1 begin ] stop
 */
	
	/**
	 * [tDBConnection_1 main ] start
	 */

	

	
	
	currentComponent="tDBConnection_1";

	


 


	tos_count_tDBConnection_1++;

/**
 * [tDBConnection_1 main ] stop
 */
	
	/**
	 * [tDBConnection_1 process_data_begin ] start
	 */

	

	
	
	currentComponent="tDBConnection_1";

	


 



/**
 * [tDBConnection_1 process_data_begin ] stop
 */
	
	/**
	 * [tDBConnection_1 process_data_end ] start
	 */

	

	
	
	currentComponent="tDBConnection_1";

	


 



/**
 * [tDBConnection_1 process_data_end ] stop
 */
	
	/**
	 * [tDBConnection_1 end ] start
	 */

	

	
	
	currentComponent="tDBConnection_1";

	
// end of generic

 

ok_Hash.put("tDBConnection_1", true);
end_Hash.put("tDBConnection_1", System.currentTimeMillis());




/**
 * [tDBConnection_1 end ] stop
 */
				}//end the resume

				



	
			}catch(java.lang.Exception e){	
				
				    if(!(e instanceof TalendException)){
					   log.fatal(currentComponent + " " + e.getMessage(),e);
					}
				
				TalendException te = new TalendException(e, currentComponent, globalMap);
				
				throw te;
			}catch(java.lang.Error error){	
				
					runStat.stopThreadStat();
				
				throw error;
			}finally{
				
				try{
					
	
	/**
	 * [tDBConnection_1 finally ] start
	 */

	

	
	
	currentComponent="tDBConnection_1";

	
// finally of generic

 



/**
 * [tDBConnection_1 finally ] stop
 */
				}catch(java.lang.Exception e){	
					//ignore
				}catch(java.lang.Error error){
					//ignore
				}
				resourceMap = null;
			}
		

		globalMap.put("tDBConnection_1_SUBPROCESS_STATE", 1);
	}
	

public void tDie_1Process(final java.util.Map<String, Object> globalMap) throws TalendException {
	globalMap.put("tDie_1_SUBPROCESS_STATE", 0);

 final boolean execStat = this.execStat;
	
		String iterateId = "";
	
	
	String currentComponent = "";
	java.util.Map<String, Object> resourceMap = new java.util.HashMap<String, Object>();

	try {
			// TDI-39566 avoid throwing an useless Exception
			boolean resumeIt = true;
			if (globalResumeTicket == false && resumeEntryMethodName != null) {
				String currentMethodName = new java.lang.Exception().getStackTrace()[0].getMethodName();
				resumeIt = resumeEntryMethodName.equals(currentMethodName);
			}
			if (resumeIt || globalResumeTicket) { //start the resume
				globalResumeTicket = true;





	
	/**
	 * [tDie_1 begin ] start
	 */

	

	
		
		ok_Hash.put("tDie_1", false);
		start_Hash.put("tDie_1", System.currentTimeMillis());
		
	
	currentComponent="tDie_1";

	
		int tos_count_tDie_1 = 0;
		
                if(log.isDebugEnabled())
            log.debug("tDie_1 - "  + ("Start to work.") );
            if (log.isDebugEnabled()) {
                class BytesLimit65535_tDie_1{
                    public void limitLog4jByte() throws Exception{
                    StringBuilder log4jParamters_tDie_1 = new StringBuilder();
                    log4jParamters_tDie_1.append("Parameters:");
                            log4jParamters_tDie_1.append("MESSAGE" + " = " + "\"SNOWFLAKE CONNECTION ERROR\"");
                        log4jParamters_tDie_1.append(" | ");
                            log4jParamters_tDie_1.append("CODE" + " = " + "4");
                        log4jParamters_tDie_1.append(" | ");
                            log4jParamters_tDie_1.append("PRIORITY" + " = " + "5");
                        log4jParamters_tDie_1.append(" | ");
                            log4jParamters_tDie_1.append("EXIT_JVM" + " = " + "false");
                        log4jParamters_tDie_1.append(" | ");
                if(log.isDebugEnabled())
            log.debug("tDie_1 - "  + (log4jParamters_tDie_1) );
                    } 
                } 
            new BytesLimit65535_tDie_1().limitLog4jByte();
            }
			if(enableLogStash) {
				talendJobLog.addCM("tDie_1", "tDie_1", "tDie");
				talendJobLogProcess(globalMap);
			}
			

 



/**
 * [tDie_1 begin ] stop
 */
	
	/**
	 * [tDie_1 main ] start
	 */

	

	
	
	currentComponent="tDie_1";

	

	try {
	globalMap.put("tDie_1_DIE_PRIORITY", 5);
	System.err.println("SNOWFLAKE CONNECTION ERROR");
	
		log.error("tDie_1 - The die message: "+"SNOWFLAKE CONNECTION ERROR");
	
	globalMap.put("tDie_1_DIE_MESSAGE", "SNOWFLAKE CONNECTION ERROR");
	globalMap.put("tDie_1_DIE_MESSAGES", "SNOWFLAKE CONNECTION ERROR");
	
	} catch (Exception | Error e_tDie_1) {
	    globalMap.put("tDie_1_ERROR_MESSAGE",e_tDie_1.getMessage());
		logIgnoredError(String.format("tDie_1 - tDie failed to log message due to internal error: %s", e_tDie_1), e_tDie_1);
	}
	
	currentComponent = "tDie_1";
	status = "failure";
        errorCode = new Integer(4);
        globalMap.put("tDie_1_DIE_CODE", errorCode);        
    
	if(true){	
	    throw new TDieException();
	}

 


	tos_count_tDie_1++;

/**
 * [tDie_1 main ] stop
 */
	
	/**
	 * [tDie_1 process_data_begin ] start
	 */

	

	
	
	currentComponent="tDie_1";

	

 



/**
 * [tDie_1 process_data_begin ] stop
 */
	
	/**
	 * [tDie_1 process_data_end ] start
	 */

	

	
	
	currentComponent="tDie_1";

	

 



/**
 * [tDie_1 process_data_end ] stop
 */
	
	/**
	 * [tDie_1 end ] start
	 */

	

	
	
	currentComponent="tDie_1";

	

 
                if(log.isDebugEnabled())
            log.debug("tDie_1 - "  + ("Done.") );

ok_Hash.put("tDie_1", true);
end_Hash.put("tDie_1", System.currentTimeMillis());




/**
 * [tDie_1 end ] stop
 */
				}//end the resume

				



	
			}catch(java.lang.Exception e){	
				
				    if(!(e instanceof TalendException)){
					   log.fatal(currentComponent + " " + e.getMessage(),e);
					}
				
				TalendException te = new TalendException(e, currentComponent, globalMap);
				
				throw te;
			}catch(java.lang.Error error){	
				
					runStat.stopThreadStat();
				
				throw error;
			}finally{
				
				try{
					
	
	/**
	 * [tDie_1 finally ] start
	 */

	

	
	
	currentComponent="tDie_1";

	

 



/**
 * [tDie_1 finally ] stop
 */
				}catch(java.lang.Exception e){	
					//ignore
				}catch(java.lang.Error error){
					//ignore
				}
				resourceMap = null;
			}
		

		globalMap.put("tDie_1_SUBPROCESS_STATE", 1);
	}
	


public static class OUTPUTStruct implements routines.system.IPersistableRow<OUTPUTStruct> {
    final static byte[] commonByteArrayLock_USCOMM_SUNSHINE_RPT_QA_BEACON_EXTRACT_SNOWFLAKE = new byte[0];
    static byte[] commonByteArray_USCOMM_SUNSHINE_RPT_QA_BEACON_EXTRACT_SNOWFLAKE = new byte[0];
	protected static final int DEFAULT_HASHCODE = 1;
    protected static final int PRIME = 31;
    protected int hashCode = DEFAULT_HASHCODE;
    public boolean hashCodeDirty = true;

    public String loopKey;



	
			    public String VENDOR_NAME;

				public String getVENDOR_NAME () {
					return this.VENDOR_NAME;
				}

				public Boolean VENDOR_NAMEIsNullable(){
				    return true;
				}
				public Boolean VENDOR_NAMEIsKey(){
				    return false;
				}
				public Integer VENDOR_NAMELength(){
				    return 500;
				}
				public Integer VENDOR_NAMEPrecision(){
				    return null;
				}
				public String VENDOR_NAMEDefault(){
				
					return null;
				
				}
				public String VENDOR_NAMEComment(){
				
				    return "";
				
				}
				public String VENDOR_NAMEPattern(){
				
					return "";
				
				}
				public String VENDOR_NAMEOriginalDbColumnName(){
				
					return "VENDOR_NAME";
				
				}

				
			    public String ACTIVITY_ID;

				public String getACTIVITY_ID () {
					return this.ACTIVITY_ID;
				}

				public Boolean ACTIVITY_IDIsNullable(){
				    return false;
				}
				public Boolean ACTIVITY_IDIsKey(){
				    return true;
				}
				public Integer ACTIVITY_IDLength(){
				    return 500;
				}
				public Integer ACTIVITY_IDPrecision(){
				    return null;
				}
				public String ACTIVITY_IDDefault(){
				
					return null;
				
				}
				public String ACTIVITY_IDComment(){
				
				    return "";
				
				}
				public String ACTIVITY_IDPattern(){
				
					return "";
				
				}
				public String ACTIVITY_IDOriginalDbColumnName(){
				
					return "ACTIVITY_ID";
				
				}

				
			    public String ACTIVITY_TYPE;

				public String getACTIVITY_TYPE () {
					return this.ACTIVITY_TYPE;
				}

				public Boolean ACTIVITY_TYPEIsNullable(){
				    return true;
				}
				public Boolean ACTIVITY_TYPEIsKey(){
				    return false;
				}
				public Integer ACTIVITY_TYPELength(){
				    return 500;
				}
				public Integer ACTIVITY_TYPEPrecision(){
				    return null;
				}
				public String ACTIVITY_TYPEDefault(){
				
					return null;
				
				}
				public String ACTIVITY_TYPEComment(){
				
				    return "";
				
				}
				public String ACTIVITY_TYPEPattern(){
				
					return "";
				
				}
				public String ACTIVITY_TYPEOriginalDbColumnName(){
				
					return "ACTIVITY_TYPE";
				
				}

				
			    public String EMPLOYEE_NAME;

				public String getEMPLOYEE_NAME () {
					return this.EMPLOYEE_NAME;
				}

				public Boolean EMPLOYEE_NAMEIsNullable(){
				    return true;
				}
				public Boolean EMPLOYEE_NAMEIsKey(){
				    return false;
				}
				public Integer EMPLOYEE_NAMELength(){
				    return 500;
				}
				public Integer EMPLOYEE_NAMEPrecision(){
				    return null;
				}
				public String EMPLOYEE_NAMEDefault(){
				
					return null;
				
				}
				public String EMPLOYEE_NAMEComment(){
				
				    return "";
				
				}
				public String EMPLOYEE_NAMEPattern(){
				
					return "";
				
				}
				public String EMPLOYEE_NAMEOriginalDbColumnName(){
				
					return "EMPLOYEE_NAME";
				
				}

				
			    public String BUSINESS_FUNCTIONAL_AREA;

				public String getBUSINESS_FUNCTIONAL_AREA () {
					return this.BUSINESS_FUNCTIONAL_AREA;
				}

				public Boolean BUSINESS_FUNCTIONAL_AREAIsNullable(){
				    return true;
				}
				public Boolean BUSINESS_FUNCTIONAL_AREAIsKey(){
				    return false;
				}
				public Integer BUSINESS_FUNCTIONAL_AREALength(){
				    return 500;
				}
				public Integer BUSINESS_FUNCTIONAL_AREAPrecision(){
				    return null;
				}
				public String BUSINESS_FUNCTIONAL_AREADefault(){
				
					return null;
				
				}
				public String BUSINESS_FUNCTIONAL_AREAComment(){
				
				    return "";
				
				}
				public String BUSINESS_FUNCTIONAL_AREAPattern(){
				
					return "";
				
				}
				public String BUSINESS_FUNCTIONAL_AREAOriginalDbColumnName(){
				
					return "BUSINESS_FUNCTIONAL_AREA";
				
				}

				
			    public String ACTIVITY_NAME;

				public String getACTIVITY_NAME () {
					return this.ACTIVITY_NAME;
				}

				public Boolean ACTIVITY_NAMEIsNullable(){
				    return true;
				}
				public Boolean ACTIVITY_NAMEIsKey(){
				    return false;
				}
				public Integer ACTIVITY_NAMELength(){
				    return 500;
				}
				public Integer ACTIVITY_NAMEPrecision(){
				    return null;
				}
				public String ACTIVITY_NAMEDefault(){
				
					return null;
				
				}
				public String ACTIVITY_NAMEComment(){
				
				    return "";
				
				}
				public String ACTIVITY_NAMEPattern(){
				
					return "";
				
				}
				public String ACTIVITY_NAMEOriginalDbColumnName(){
				
					return "ACTIVITY_NAME";
				
				}

				
			    public String PRODUCT;

				public String getPRODUCT () {
					return this.PRODUCT;
				}

				public Boolean PRODUCTIsNullable(){
				    return true;
				}
				public Boolean PRODUCTIsKey(){
				    return false;
				}
				public Integer PRODUCTLength(){
				    return 500;
				}
				public Integer PRODUCTPrecision(){
				    return null;
				}
				public String PRODUCTDefault(){
				
					return null;
				
				}
				public String PRODUCTComment(){
				
				    return "";
				
				}
				public String PRODUCTPattern(){
				
					return "";
				
				}
				public String PRODUCTOriginalDbColumnName(){
				
					return "PRODUCT";
				
				}

				
			    public String EXPENSE_ID;

				public String getEXPENSE_ID () {
					return this.EXPENSE_ID;
				}

				public Boolean EXPENSE_IDIsNullable(){
				    return false;
				}
				public Boolean EXPENSE_IDIsKey(){
				    return true;
				}
				public Integer EXPENSE_IDLength(){
				    return 500;
				}
				public Integer EXPENSE_IDPrecision(){
				    return null;
				}
				public String EXPENSE_IDDefault(){
				
					return null;
				
				}
				public String EXPENSE_IDComment(){
				
				    return "";
				
				}
				public String EXPENSE_IDPattern(){
				
					return "";
				
				}
				public String EXPENSE_IDOriginalDbColumnName(){
				
					return "EXPENSE_ID";
				
				}

				
			    public String NATURE_OF_EXPENSE;

				public String getNATURE_OF_EXPENSE () {
					return this.NATURE_OF_EXPENSE;
				}

				public Boolean NATURE_OF_EXPENSEIsNullable(){
				    return true;
				}
				public Boolean NATURE_OF_EXPENSEIsKey(){
				    return false;
				}
				public Integer NATURE_OF_EXPENSELength(){
				    return 500;
				}
				public Integer NATURE_OF_EXPENSEPrecision(){
				    return null;
				}
				public String NATURE_OF_EXPENSEDefault(){
				
					return null;
				
				}
				public String NATURE_OF_EXPENSEComment(){
				
				    return "";
				
				}
				public String NATURE_OF_EXPENSEPattern(){
				
					return "";
				
				}
				public String NATURE_OF_EXPENSEOriginalDbColumnName(){
				
					return "NATURE_OF_EXPENSE";
				
				}

				
			    public String EXPENSE_TYPE;

				public String getEXPENSE_TYPE () {
					return this.EXPENSE_TYPE;
				}

				public Boolean EXPENSE_TYPEIsNullable(){
				    return true;
				}
				public Boolean EXPENSE_TYPEIsKey(){
				    return false;
				}
				public Integer EXPENSE_TYPELength(){
				    return 500;
				}
				public Integer EXPENSE_TYPEPrecision(){
				    return null;
				}
				public String EXPENSE_TYPEDefault(){
				
					return null;
				
				}
				public String EXPENSE_TYPEComment(){
				
				    return "";
				
				}
				public String EXPENSE_TYPEPattern(){
				
					return "";
				
				}
				public String EXPENSE_TYPEOriginalDbColumnName(){
				
					return "EXPENSE_TYPE";
				
				}

				
			    public java.util.Date DATE_OF_PAYMENT;

				public java.util.Date getDATE_OF_PAYMENT () {
					return this.DATE_OF_PAYMENT;
				}

				public Boolean DATE_OF_PAYMENTIsNullable(){
				    return true;
				}
				public Boolean DATE_OF_PAYMENTIsKey(){
				    return false;
				}
				public Integer DATE_OF_PAYMENTLength(){
				    return null;
				}
				public Integer DATE_OF_PAYMENTPrecision(){
				    return null;
				}
				public String DATE_OF_PAYMENTDefault(){
				
					return null;
				
				}
				public String DATE_OF_PAYMENTComment(){
				
				    return "";
				
				}
				public String DATE_OF_PAYMENTPattern(){
				
					return "MM/dd/yyyy";
				
				}
				public String DATE_OF_PAYMENTOriginalDbColumnName(){
				
					return "DATE_OF_PAYMENT";
				
				}

				
			    public String INDIVIDUAL_RECIPIENT_FIRST_NAME;

				public String getINDIVIDUAL_RECIPIENT_FIRST_NAME () {
					return this.INDIVIDUAL_RECIPIENT_FIRST_NAME;
				}

				public Boolean INDIVIDUAL_RECIPIENT_FIRST_NAMEIsNullable(){
				    return true;
				}
				public Boolean INDIVIDUAL_RECIPIENT_FIRST_NAMEIsKey(){
				    return false;
				}
				public Integer INDIVIDUAL_RECIPIENT_FIRST_NAMELength(){
				    return 500;
				}
				public Integer INDIVIDUAL_RECIPIENT_FIRST_NAMEPrecision(){
				    return null;
				}
				public String INDIVIDUAL_RECIPIENT_FIRST_NAMEDefault(){
				
					return null;
				
				}
				public String INDIVIDUAL_RECIPIENT_FIRST_NAMEComment(){
				
				    return "";
				
				}
				public String INDIVIDUAL_RECIPIENT_FIRST_NAMEPattern(){
				
					return "";
				
				}
				public String INDIVIDUAL_RECIPIENT_FIRST_NAMEOriginalDbColumnName(){
				
					return "INDIVIDUAL_RECIPIENT_FIRST_NAME";
				
				}

				
			    public String INDIVIDUAL_RECIPIENT_MIDDLE_NAME;

				public String getINDIVIDUAL_RECIPIENT_MIDDLE_NAME () {
					return this.INDIVIDUAL_RECIPIENT_MIDDLE_NAME;
				}

				public Boolean INDIVIDUAL_RECIPIENT_MIDDLE_NAMEIsNullable(){
				    return true;
				}
				public Boolean INDIVIDUAL_RECIPIENT_MIDDLE_NAMEIsKey(){
				    return false;
				}
				public Integer INDIVIDUAL_RECIPIENT_MIDDLE_NAMELength(){
				    return 500;
				}
				public Integer INDIVIDUAL_RECIPIENT_MIDDLE_NAMEPrecision(){
				    return null;
				}
				public String INDIVIDUAL_RECIPIENT_MIDDLE_NAMEDefault(){
				
					return null;
				
				}
				public String INDIVIDUAL_RECIPIENT_MIDDLE_NAMEComment(){
				
				    return "";
				
				}
				public String INDIVIDUAL_RECIPIENT_MIDDLE_NAMEPattern(){
				
					return "";
				
				}
				public String INDIVIDUAL_RECIPIENT_MIDDLE_NAMEOriginalDbColumnName(){
				
					return "INDIVIDUAL_RECIPIENT_MIDDLE_NAME";
				
				}

				
			    public String INDIVIDUAL_RECIPIENT_LAST_NAME_ORGANIZATION_NAME;

				public String getINDIVIDUAL_RECIPIENT_LAST_NAME_ORGANIZATION_NAME () {
					return this.INDIVIDUAL_RECIPIENT_LAST_NAME_ORGANIZATION_NAME;
				}

				public Boolean INDIVIDUAL_RECIPIENT_LAST_NAME_ORGANIZATION_NAMEIsNullable(){
				    return true;
				}
				public Boolean INDIVIDUAL_RECIPIENT_LAST_NAME_ORGANIZATION_NAMEIsKey(){
				    return false;
				}
				public Integer INDIVIDUAL_RECIPIENT_LAST_NAME_ORGANIZATION_NAMELength(){
				    return 500;
				}
				public Integer INDIVIDUAL_RECIPIENT_LAST_NAME_ORGANIZATION_NAMEPrecision(){
				    return null;
				}
				public String INDIVIDUAL_RECIPIENT_LAST_NAME_ORGANIZATION_NAMEDefault(){
				
					return null;
				
				}
				public String INDIVIDUAL_RECIPIENT_LAST_NAME_ORGANIZATION_NAMEComment(){
				
				    return "";
				
				}
				public String INDIVIDUAL_RECIPIENT_LAST_NAME_ORGANIZATION_NAMEPattern(){
				
					return "";
				
				}
				public String INDIVIDUAL_RECIPIENT_LAST_NAME_ORGANIZATION_NAMEOriginalDbColumnName(){
				
					return "INDIVIDUAL_RECIPIENT_LAST_NAME_ORGANIZATION_NAME";
				
				}

				
			    public String LEGEND_ID;

				public String getLEGEND_ID () {
					return this.LEGEND_ID;
				}

				public Boolean LEGEND_IDIsNullable(){
				    return false;
				}
				public Boolean LEGEND_IDIsKey(){
				    return true;
				}
				public Integer LEGEND_IDLength(){
				    return 500;
				}
				public Integer LEGEND_IDPrecision(){
				    return null;
				}
				public String LEGEND_IDDefault(){
				
					return null;
				
				}
				public String LEGEND_IDComment(){
				
				    return "";
				
				}
				public String LEGEND_IDPattern(){
				
					return "";
				
				}
				public String LEGEND_IDOriginalDbColumnName(){
				
					return "LEGEND_ID";
				
				}

				
			    public String INDIVIDUAL_RECIPIENT_SUFFIX;

				public String getINDIVIDUAL_RECIPIENT_SUFFIX () {
					return this.INDIVIDUAL_RECIPIENT_SUFFIX;
				}

				public Boolean INDIVIDUAL_RECIPIENT_SUFFIXIsNullable(){
				    return true;
				}
				public Boolean INDIVIDUAL_RECIPIENT_SUFFIXIsKey(){
				    return false;
				}
				public Integer INDIVIDUAL_RECIPIENT_SUFFIXLength(){
				    return 500;
				}
				public Integer INDIVIDUAL_RECIPIENT_SUFFIXPrecision(){
				    return null;
				}
				public String INDIVIDUAL_RECIPIENT_SUFFIXDefault(){
				
					return null;
				
				}
				public String INDIVIDUAL_RECIPIENT_SUFFIXComment(){
				
				    return "";
				
				}
				public String INDIVIDUAL_RECIPIENT_SUFFIXPattern(){
				
					return "";
				
				}
				public String INDIVIDUAL_RECIPIENT_SUFFIXOriginalDbColumnName(){
				
					return "INDIVIDUAL_RECIPIENT_SUFFIX";
				
				}

				
			    public String RECIPIENT_BUSINESS_STREET_ADDRESS_LINE_1;

				public String getRECIPIENT_BUSINESS_STREET_ADDRESS_LINE_1 () {
					return this.RECIPIENT_BUSINESS_STREET_ADDRESS_LINE_1;
				}

				public Boolean RECIPIENT_BUSINESS_STREET_ADDRESS_LINE_1IsNullable(){
				    return true;
				}
				public Boolean RECIPIENT_BUSINESS_STREET_ADDRESS_LINE_1IsKey(){
				    return false;
				}
				public Integer RECIPIENT_BUSINESS_STREET_ADDRESS_LINE_1Length(){
				    return 500;
				}
				public Integer RECIPIENT_BUSINESS_STREET_ADDRESS_LINE_1Precision(){
				    return null;
				}
				public String RECIPIENT_BUSINESS_STREET_ADDRESS_LINE_1Default(){
				
					return null;
				
				}
				public String RECIPIENT_BUSINESS_STREET_ADDRESS_LINE_1Comment(){
				
				    return "";
				
				}
				public String RECIPIENT_BUSINESS_STREET_ADDRESS_LINE_1Pattern(){
				
					return "";
				
				}
				public String RECIPIENT_BUSINESS_STREET_ADDRESS_LINE_1OriginalDbColumnName(){
				
					return "RECIPIENT_BUSINESS_STREET_ADDRESS_LINE_1";
				
				}

				
			    public String RECIPIENT_BUSINESS_STREET_ADDRESS_LINE_2;

				public String getRECIPIENT_BUSINESS_STREET_ADDRESS_LINE_2 () {
					return this.RECIPIENT_BUSINESS_STREET_ADDRESS_LINE_2;
				}

				public Boolean RECIPIENT_BUSINESS_STREET_ADDRESS_LINE_2IsNullable(){
				    return true;
				}
				public Boolean RECIPIENT_BUSINESS_STREET_ADDRESS_LINE_2IsKey(){
				    return false;
				}
				public Integer RECIPIENT_BUSINESS_STREET_ADDRESS_LINE_2Length(){
				    return 500;
				}
				public Integer RECIPIENT_BUSINESS_STREET_ADDRESS_LINE_2Precision(){
				    return null;
				}
				public String RECIPIENT_BUSINESS_STREET_ADDRESS_LINE_2Default(){
				
					return null;
				
				}
				public String RECIPIENT_BUSINESS_STREET_ADDRESS_LINE_2Comment(){
				
				    return "";
				
				}
				public String RECIPIENT_BUSINESS_STREET_ADDRESS_LINE_2Pattern(){
				
					return "";
				
				}
				public String RECIPIENT_BUSINESS_STREET_ADDRESS_LINE_2OriginalDbColumnName(){
				
					return "RECIPIENT_BUSINESS_STREET_ADDRESS_LINE_2";
				
				}

				
			    public String RECIPIENT_CITY;

				public String getRECIPIENT_CITY () {
					return this.RECIPIENT_CITY;
				}

				public Boolean RECIPIENT_CITYIsNullable(){
				    return true;
				}
				public Boolean RECIPIENT_CITYIsKey(){
				    return false;
				}
				public Integer RECIPIENT_CITYLength(){
				    return 500;
				}
				public Integer RECIPIENT_CITYPrecision(){
				    return null;
				}
				public String RECIPIENT_CITYDefault(){
				
					return null;
				
				}
				public String RECIPIENT_CITYComment(){
				
				    return "";
				
				}
				public String RECIPIENT_CITYPattern(){
				
					return "";
				
				}
				public String RECIPIENT_CITYOriginalDbColumnName(){
				
					return "RECIPIENT_CITY";
				
				}

				
			    public String RECIPIENT_STATE;

				public String getRECIPIENT_STATE () {
					return this.RECIPIENT_STATE;
				}

				public Boolean RECIPIENT_STATEIsNullable(){
				    return true;
				}
				public Boolean RECIPIENT_STATEIsKey(){
				    return false;
				}
				public Integer RECIPIENT_STATELength(){
				    return 500;
				}
				public Integer RECIPIENT_STATEPrecision(){
				    return null;
				}
				public String RECIPIENT_STATEDefault(){
				
					return null;
				
				}
				public String RECIPIENT_STATEComment(){
				
				    return "";
				
				}
				public String RECIPIENT_STATEPattern(){
				
					return "";
				
				}
				public String RECIPIENT_STATEOriginalDbColumnName(){
				
					return "RECIPIENT_STATE";
				
				}

				
			    public String RECIPIENT_ZIP_CODE_POSTAL_CODE;

				public String getRECIPIENT_ZIP_CODE_POSTAL_CODE () {
					return this.RECIPIENT_ZIP_CODE_POSTAL_CODE;
				}

				public Boolean RECIPIENT_ZIP_CODE_POSTAL_CODEIsNullable(){
				    return true;
				}
				public Boolean RECIPIENT_ZIP_CODE_POSTAL_CODEIsKey(){
				    return false;
				}
				public Integer RECIPIENT_ZIP_CODE_POSTAL_CODELength(){
				    return 500;
				}
				public Integer RECIPIENT_ZIP_CODE_POSTAL_CODEPrecision(){
				    return null;
				}
				public String RECIPIENT_ZIP_CODE_POSTAL_CODEDefault(){
				
					return null;
				
				}
				public String RECIPIENT_ZIP_CODE_POSTAL_CODEComment(){
				
				    return "";
				
				}
				public String RECIPIENT_ZIP_CODE_POSTAL_CODEPattern(){
				
					return "";
				
				}
				public String RECIPIENT_ZIP_CODE_POSTAL_CODEOriginalDbColumnName(){
				
					return "RECIPIENT_ZIP_CODE_POSTAL_CODE";
				
				}

				
			    public String RECIPIENT_COUNTRY;

				public String getRECIPIENT_COUNTRY () {
					return this.RECIPIENT_COUNTRY;
				}

				public Boolean RECIPIENT_COUNTRYIsNullable(){
				    return true;
				}
				public Boolean RECIPIENT_COUNTRYIsKey(){
				    return false;
				}
				public Integer RECIPIENT_COUNTRYLength(){
				    return 500;
				}
				public Integer RECIPIENT_COUNTRYPrecision(){
				    return null;
				}
				public String RECIPIENT_COUNTRYDefault(){
				
					return null;
				
				}
				public String RECIPIENT_COUNTRYComment(){
				
				    return "";
				
				}
				public String RECIPIENT_COUNTRYPattern(){
				
					return "";
				
				}
				public String RECIPIENT_COUNTRYOriginalDbColumnName(){
				
					return "RECIPIENT_COUNTRY";
				
				}

				
			    public String RECIPIENT_TYPE_PROFESSIONAL_DESIGNATION_CREDENTIAL;

				public String getRECIPIENT_TYPE_PROFESSIONAL_DESIGNATION_CREDENTIAL () {
					return this.RECIPIENT_TYPE_PROFESSIONAL_DESIGNATION_CREDENTIAL;
				}

				public Boolean RECIPIENT_TYPE_PROFESSIONAL_DESIGNATION_CREDENTIALIsNullable(){
				    return true;
				}
				public Boolean RECIPIENT_TYPE_PROFESSIONAL_DESIGNATION_CREDENTIALIsKey(){
				    return false;
				}
				public Integer RECIPIENT_TYPE_PROFESSIONAL_DESIGNATION_CREDENTIALLength(){
				    return 500;
				}
				public Integer RECIPIENT_TYPE_PROFESSIONAL_DESIGNATION_CREDENTIALPrecision(){
				    return null;
				}
				public String RECIPIENT_TYPE_PROFESSIONAL_DESIGNATION_CREDENTIALDefault(){
				
					return null;
				
				}
				public String RECIPIENT_TYPE_PROFESSIONAL_DESIGNATION_CREDENTIALComment(){
				
				    return "";
				
				}
				public String RECIPIENT_TYPE_PROFESSIONAL_DESIGNATION_CREDENTIALPattern(){
				
					return "";
				
				}
				public String RECIPIENT_TYPE_PROFESSIONAL_DESIGNATION_CREDENTIALOriginalDbColumnName(){
				
					return "RECIPIENT_TYPE_PROFESSIONAL_DESIGNATION_CREDENTIAL";
				
				}

				
			    public String RECIPIENT_NPI;

				public String getRECIPIENT_NPI () {
					return this.RECIPIENT_NPI;
				}

				public Boolean RECIPIENT_NPIIsNullable(){
				    return true;
				}
				public Boolean RECIPIENT_NPIIsKey(){
				    return false;
				}
				public Integer RECIPIENT_NPILength(){
				    return 500;
				}
				public Integer RECIPIENT_NPIPrecision(){
				    return null;
				}
				public String RECIPIENT_NPIDefault(){
				
					return null;
				
				}
				public String RECIPIENT_NPIComment(){
				
				    return "";
				
				}
				public String RECIPIENT_NPIPattern(){
				
					return "";
				
				}
				public String RECIPIENT_NPIOriginalDbColumnName(){
				
					return "RECIPIENT_NPI";
				
				}

				


	@Override
	public int hashCode() {
		if (this.hashCodeDirty) {
			final int prime = PRIME;
			int result = DEFAULT_HASHCODE;
	
						result = prime * result + ((this.ACTIVITY_ID == null) ? 0 : this.ACTIVITY_ID.hashCode());
					
						result = prime * result + ((this.EXPENSE_ID == null) ? 0 : this.EXPENSE_ID.hashCode());
					
						result = prime * result + ((this.LEGEND_ID == null) ? 0 : this.LEGEND_ID.hashCode());
					
    		this.hashCode = result;
    		this.hashCodeDirty = false;
		}
		return this.hashCode;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) return true;
		if (obj == null) return false;
		if (getClass() != obj.getClass()) return false;
		final OUTPUTStruct other = (OUTPUTStruct) obj;
		
						if (this.ACTIVITY_ID == null) {
							if (other.ACTIVITY_ID != null)
								return false;
						
						} else if (!this.ACTIVITY_ID.equals(other.ACTIVITY_ID))
						
							return false;
					
						if (this.EXPENSE_ID == null) {
							if (other.EXPENSE_ID != null)
								return false;
						
						} else if (!this.EXPENSE_ID.equals(other.EXPENSE_ID))
						
							return false;
					
						if (this.LEGEND_ID == null) {
							if (other.LEGEND_ID != null)
								return false;
						
						} else if (!this.LEGEND_ID.equals(other.LEGEND_ID))
						
							return false;
					

		return true;
    }

	public void copyDataTo(OUTPUTStruct other) {

		other.VENDOR_NAME = this.VENDOR_NAME;
	            other.ACTIVITY_ID = this.ACTIVITY_ID;
	            other.ACTIVITY_TYPE = this.ACTIVITY_TYPE;
	            other.EMPLOYEE_NAME = this.EMPLOYEE_NAME;
	            other.BUSINESS_FUNCTIONAL_AREA = this.BUSINESS_FUNCTIONAL_AREA;
	            other.ACTIVITY_NAME = this.ACTIVITY_NAME;
	            other.PRODUCT = this.PRODUCT;
	            other.EXPENSE_ID = this.EXPENSE_ID;
	            other.NATURE_OF_EXPENSE = this.NATURE_OF_EXPENSE;
	            other.EXPENSE_TYPE = this.EXPENSE_TYPE;
	            other.DATE_OF_PAYMENT = this.DATE_OF_PAYMENT;
	            other.INDIVIDUAL_RECIPIENT_FIRST_NAME = this.INDIVIDUAL_RECIPIENT_FIRST_NAME;
	            other.INDIVIDUAL_RECIPIENT_MIDDLE_NAME = this.INDIVIDUAL_RECIPIENT_MIDDLE_NAME;
	            other.INDIVIDUAL_RECIPIENT_LAST_NAME_ORGANIZATION_NAME = this.INDIVIDUAL_RECIPIENT_LAST_NAME_ORGANIZATION_NAME;
	            other.LEGEND_ID = this.LEGEND_ID;
	            other.INDIVIDUAL_RECIPIENT_SUFFIX = this.INDIVIDUAL_RECIPIENT_SUFFIX;
	            other.RECIPIENT_BUSINESS_STREET_ADDRESS_LINE_1 = this.RECIPIENT_BUSINESS_STREET_ADDRESS_LINE_1;
	            other.RECIPIENT_BUSINESS_STREET_ADDRESS_LINE_2 = this.RECIPIENT_BUSINESS_STREET_ADDRESS_LINE_2;
	            other.RECIPIENT_CITY = this.RECIPIENT_CITY;
	            other.RECIPIENT_STATE = this.RECIPIENT_STATE;
	            other.RECIPIENT_ZIP_CODE_POSTAL_CODE = this.RECIPIENT_ZIP_CODE_POSTAL_CODE;
	            other.RECIPIENT_COUNTRY = this.RECIPIENT_COUNTRY;
	            other.RECIPIENT_TYPE_PROFESSIONAL_DESIGNATION_CREDENTIAL = this.RECIPIENT_TYPE_PROFESSIONAL_DESIGNATION_CREDENTIAL;
	            other.RECIPIENT_NPI = this.RECIPIENT_NPI;
	            
	}

	public void copyKeysDataTo(OUTPUTStruct other) {

		other.ACTIVITY_ID = this.ACTIVITY_ID;
	            	other.EXPENSE_ID = this.EXPENSE_ID;
	            	other.LEGEND_ID = this.LEGEND_ID;
	            	
	}




	private String readString(ObjectInputStream dis) throws IOException{
		String strReturn = null;
		int length = 0;
        length = dis.readInt();
		if (length == -1) {
			strReturn = null;
		} else {
			if(length > commonByteArray_USCOMM_SUNSHINE_RPT_QA_BEACON_EXTRACT_SNOWFLAKE.length) {
				if(length < 1024 && commonByteArray_USCOMM_SUNSHINE_RPT_QA_BEACON_EXTRACT_SNOWFLAKE.length == 0) {
   					commonByteArray_USCOMM_SUNSHINE_RPT_QA_BEACON_EXTRACT_SNOWFLAKE = new byte[1024];
				} else {
   					commonByteArray_USCOMM_SUNSHINE_RPT_QA_BEACON_EXTRACT_SNOWFLAKE = new byte[2 * length];
   				}
			}
			dis.readFully(commonByteArray_USCOMM_SUNSHINE_RPT_QA_BEACON_EXTRACT_SNOWFLAKE, 0, length);
			strReturn = new String(commonByteArray_USCOMM_SUNSHINE_RPT_QA_BEACON_EXTRACT_SNOWFLAKE, 0, length, utf8Charset);
		}
		return strReturn;
	}
	
	private String readString(org.jboss.marshalling.Unmarshaller unmarshaller) throws IOException{
		String strReturn = null;
		int length = 0;
        length = unmarshaller.readInt();
		if (length == -1) {
			strReturn = null;
		} else {
			if(length > commonByteArray_USCOMM_SUNSHINE_RPT_QA_BEACON_EXTRACT_SNOWFLAKE.length) {
				if(length < 1024 && commonByteArray_USCOMM_SUNSHINE_RPT_QA_BEACON_EXTRACT_SNOWFLAKE.length == 0) {
   					commonByteArray_USCOMM_SUNSHINE_RPT_QA_BEACON_EXTRACT_SNOWFLAKE = new byte[1024];
				} else {
   					commonByteArray_USCOMM_SUNSHINE_RPT_QA_BEACON_EXTRACT_SNOWFLAKE = new byte[2 * length];
   				}
			}
			unmarshaller.readFully(commonByteArray_USCOMM_SUNSHINE_RPT_QA_BEACON_EXTRACT_SNOWFLAKE, 0, length);
			strReturn = new String(commonByteArray_USCOMM_SUNSHINE_RPT_QA_BEACON_EXTRACT_SNOWFLAKE, 0, length, utf8Charset);
		}
		return strReturn;
	}

    private void writeString(String str, ObjectOutputStream dos) throws IOException{
		if(str == null) {
            dos.writeInt(-1);
		} else {
            byte[] byteArray = str.getBytes(utf8Charset);
	    	dos.writeInt(byteArray.length);
			dos.write(byteArray);
    	}
    }
    
    private void writeString(String str, org.jboss.marshalling.Marshaller marshaller) throws IOException{
		if(str == null) {
			marshaller.writeInt(-1);
		} else {
            byte[] byteArray = str.getBytes(utf8Charset);
            marshaller.writeInt(byteArray.length);
            marshaller.write(byteArray);
    	}
    }

	private java.util.Date readDate(ObjectInputStream dis) throws IOException{
		java.util.Date dateReturn = null;
        int length = 0;
        length = dis.readByte();
		if (length == -1) {
			dateReturn = null;
		} else {
	    	dateReturn = new Date(dis.readLong());
		}
		return dateReturn;
	}
	
	private java.util.Date readDate(org.jboss.marshalling.Unmarshaller unmarshaller) throws IOException{
		java.util.Date dateReturn = null;
        int length = 0;
        length = unmarshaller.readByte();
		if (length == -1) {
			dateReturn = null;
		} else {
	    	dateReturn = new Date(unmarshaller.readLong());
		}
		return dateReturn;
	}

    private void writeDate(java.util.Date date1, ObjectOutputStream dos) throws IOException{
		if(date1 == null) {
            dos.writeByte(-1);
		} else {
			dos.writeByte(0);
	    	dos.writeLong(date1.getTime());
    	}
    }
    
    private void writeDate(java.util.Date date1, org.jboss.marshalling.Marshaller marshaller) throws IOException{
		if(date1 == null) {
			marshaller.writeByte(-1);
		} else {
			marshaller.writeByte(0);
			marshaller.writeLong(date1.getTime());
    	}
    }

    public void readData(ObjectInputStream dis) {

		synchronized(commonByteArrayLock_USCOMM_SUNSHINE_RPT_QA_BEACON_EXTRACT_SNOWFLAKE) {

        	try {

        		int length = 0;
		
					this.VENDOR_NAME = readString(dis);
					
					this.ACTIVITY_ID = readString(dis);
					
					this.ACTIVITY_TYPE = readString(dis);
					
					this.EMPLOYEE_NAME = readString(dis);
					
					this.BUSINESS_FUNCTIONAL_AREA = readString(dis);
					
					this.ACTIVITY_NAME = readString(dis);
					
					this.PRODUCT = readString(dis);
					
					this.EXPENSE_ID = readString(dis);
					
					this.NATURE_OF_EXPENSE = readString(dis);
					
					this.EXPENSE_TYPE = readString(dis);
					
					this.DATE_OF_PAYMENT = readDate(dis);
					
					this.INDIVIDUAL_RECIPIENT_FIRST_NAME = readString(dis);
					
					this.INDIVIDUAL_RECIPIENT_MIDDLE_NAME = readString(dis);
					
					this.INDIVIDUAL_RECIPIENT_LAST_NAME_ORGANIZATION_NAME = readString(dis);
					
					this.LEGEND_ID = readString(dis);
					
					this.INDIVIDUAL_RECIPIENT_SUFFIX = readString(dis);
					
					this.RECIPIENT_BUSINESS_STREET_ADDRESS_LINE_1 = readString(dis);
					
					this.RECIPIENT_BUSINESS_STREET_ADDRESS_LINE_2 = readString(dis);
					
					this.RECIPIENT_CITY = readString(dis);
					
					this.RECIPIENT_STATE = readString(dis);
					
					this.RECIPIENT_ZIP_CODE_POSTAL_CODE = readString(dis);
					
					this.RECIPIENT_COUNTRY = readString(dis);
					
					this.RECIPIENT_TYPE_PROFESSIONAL_DESIGNATION_CREDENTIAL = readString(dis);
					
					this.RECIPIENT_NPI = readString(dis);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);

		

        }

		

      }


    }
    
    public void readData(org.jboss.marshalling.Unmarshaller dis) {

		synchronized(commonByteArrayLock_USCOMM_SUNSHINE_RPT_QA_BEACON_EXTRACT_SNOWFLAKE) {

        	try {

        		int length = 0;
		
					this.VENDOR_NAME = readString(dis);
					
					this.ACTIVITY_ID = readString(dis);
					
					this.ACTIVITY_TYPE = readString(dis);
					
					this.EMPLOYEE_NAME = readString(dis);
					
					this.BUSINESS_FUNCTIONAL_AREA = readString(dis);
					
					this.ACTIVITY_NAME = readString(dis);
					
					this.PRODUCT = readString(dis);
					
					this.EXPENSE_ID = readString(dis);
					
					this.NATURE_OF_EXPENSE = readString(dis);
					
					this.EXPENSE_TYPE = readString(dis);
					
					this.DATE_OF_PAYMENT = readDate(dis);
					
					this.INDIVIDUAL_RECIPIENT_FIRST_NAME = readString(dis);
					
					this.INDIVIDUAL_RECIPIENT_MIDDLE_NAME = readString(dis);
					
					this.INDIVIDUAL_RECIPIENT_LAST_NAME_ORGANIZATION_NAME = readString(dis);
					
					this.LEGEND_ID = readString(dis);
					
					this.INDIVIDUAL_RECIPIENT_SUFFIX = readString(dis);
					
					this.RECIPIENT_BUSINESS_STREET_ADDRESS_LINE_1 = readString(dis);
					
					this.RECIPIENT_BUSINESS_STREET_ADDRESS_LINE_2 = readString(dis);
					
					this.RECIPIENT_CITY = readString(dis);
					
					this.RECIPIENT_STATE = readString(dis);
					
					this.RECIPIENT_ZIP_CODE_POSTAL_CODE = readString(dis);
					
					this.RECIPIENT_COUNTRY = readString(dis);
					
					this.RECIPIENT_TYPE_PROFESSIONAL_DESIGNATION_CREDENTIAL = readString(dis);
					
					this.RECIPIENT_NPI = readString(dis);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);

		

        }

		

      }


    }

    public void writeData(ObjectOutputStream dos) {
        try {

		
					// String
				
						writeString(this.VENDOR_NAME,dos);
					
					// String
				
						writeString(this.ACTIVITY_ID,dos);
					
					// String
				
						writeString(this.ACTIVITY_TYPE,dos);
					
					// String
				
						writeString(this.EMPLOYEE_NAME,dos);
					
					// String
				
						writeString(this.BUSINESS_FUNCTIONAL_AREA,dos);
					
					// String
				
						writeString(this.ACTIVITY_NAME,dos);
					
					// String
				
						writeString(this.PRODUCT,dos);
					
					// String
				
						writeString(this.EXPENSE_ID,dos);
					
					// String
				
						writeString(this.NATURE_OF_EXPENSE,dos);
					
					// String
				
						writeString(this.EXPENSE_TYPE,dos);
					
					// java.util.Date
				
						writeDate(this.DATE_OF_PAYMENT,dos);
					
					// String
				
						writeString(this.INDIVIDUAL_RECIPIENT_FIRST_NAME,dos);
					
					// String
				
						writeString(this.INDIVIDUAL_RECIPIENT_MIDDLE_NAME,dos);
					
					// String
				
						writeString(this.INDIVIDUAL_RECIPIENT_LAST_NAME_ORGANIZATION_NAME,dos);
					
					// String
				
						writeString(this.LEGEND_ID,dos);
					
					// String
				
						writeString(this.INDIVIDUAL_RECIPIENT_SUFFIX,dos);
					
					// String
				
						writeString(this.RECIPIENT_BUSINESS_STREET_ADDRESS_LINE_1,dos);
					
					// String
				
						writeString(this.RECIPIENT_BUSINESS_STREET_ADDRESS_LINE_2,dos);
					
					// String
				
						writeString(this.RECIPIENT_CITY,dos);
					
					// String
				
						writeString(this.RECIPIENT_STATE,dos);
					
					// String
				
						writeString(this.RECIPIENT_ZIP_CODE_POSTAL_CODE,dos);
					
					// String
				
						writeString(this.RECIPIENT_COUNTRY,dos);
					
					// String
				
						writeString(this.RECIPIENT_TYPE_PROFESSIONAL_DESIGNATION_CREDENTIAL,dos);
					
					// String
				
						writeString(this.RECIPIENT_NPI,dos);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);
        }


    }
    
    public void writeData(org.jboss.marshalling.Marshaller dos) {
        try {

		
					// String
				
						writeString(this.VENDOR_NAME,dos);
					
					// String
				
						writeString(this.ACTIVITY_ID,dos);
					
					// String
				
						writeString(this.ACTIVITY_TYPE,dos);
					
					// String
				
						writeString(this.EMPLOYEE_NAME,dos);
					
					// String
				
						writeString(this.BUSINESS_FUNCTIONAL_AREA,dos);
					
					// String
				
						writeString(this.ACTIVITY_NAME,dos);
					
					// String
				
						writeString(this.PRODUCT,dos);
					
					// String
				
						writeString(this.EXPENSE_ID,dos);
					
					// String
				
						writeString(this.NATURE_OF_EXPENSE,dos);
					
					// String
				
						writeString(this.EXPENSE_TYPE,dos);
					
					// java.util.Date
				
						writeDate(this.DATE_OF_PAYMENT,dos);
					
					// String
				
						writeString(this.INDIVIDUAL_RECIPIENT_FIRST_NAME,dos);
					
					// String
				
						writeString(this.INDIVIDUAL_RECIPIENT_MIDDLE_NAME,dos);
					
					// String
				
						writeString(this.INDIVIDUAL_RECIPIENT_LAST_NAME_ORGANIZATION_NAME,dos);
					
					// String
				
						writeString(this.LEGEND_ID,dos);
					
					// String
				
						writeString(this.INDIVIDUAL_RECIPIENT_SUFFIX,dos);
					
					// String
				
						writeString(this.RECIPIENT_BUSINESS_STREET_ADDRESS_LINE_1,dos);
					
					// String
				
						writeString(this.RECIPIENT_BUSINESS_STREET_ADDRESS_LINE_2,dos);
					
					// String
				
						writeString(this.RECIPIENT_CITY,dos);
					
					// String
				
						writeString(this.RECIPIENT_STATE,dos);
					
					// String
				
						writeString(this.RECIPIENT_ZIP_CODE_POSTAL_CODE,dos);
					
					// String
				
						writeString(this.RECIPIENT_COUNTRY,dos);
					
					// String
				
						writeString(this.RECIPIENT_TYPE_PROFESSIONAL_DESIGNATION_CREDENTIAL,dos);
					
					// String
				
						writeString(this.RECIPIENT_NPI,dos);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);
        }


    }


    public String toString() {

		StringBuilder sb = new StringBuilder();
		sb.append(super.toString());
		sb.append("[");
		sb.append("VENDOR_NAME="+VENDOR_NAME);
		sb.append(",ACTIVITY_ID="+ACTIVITY_ID);
		sb.append(",ACTIVITY_TYPE="+ACTIVITY_TYPE);
		sb.append(",EMPLOYEE_NAME="+EMPLOYEE_NAME);
		sb.append(",BUSINESS_FUNCTIONAL_AREA="+BUSINESS_FUNCTIONAL_AREA);
		sb.append(",ACTIVITY_NAME="+ACTIVITY_NAME);
		sb.append(",PRODUCT="+PRODUCT);
		sb.append(",EXPENSE_ID="+EXPENSE_ID);
		sb.append(",NATURE_OF_EXPENSE="+NATURE_OF_EXPENSE);
		sb.append(",EXPENSE_TYPE="+EXPENSE_TYPE);
		sb.append(",DATE_OF_PAYMENT="+String.valueOf(DATE_OF_PAYMENT));
		sb.append(",INDIVIDUAL_RECIPIENT_FIRST_NAME="+INDIVIDUAL_RECIPIENT_FIRST_NAME);
		sb.append(",INDIVIDUAL_RECIPIENT_MIDDLE_NAME="+INDIVIDUAL_RECIPIENT_MIDDLE_NAME);
		sb.append(",INDIVIDUAL_RECIPIENT_LAST_NAME_ORGANIZATION_NAME="+INDIVIDUAL_RECIPIENT_LAST_NAME_ORGANIZATION_NAME);
		sb.append(",LEGEND_ID="+LEGEND_ID);
		sb.append(",INDIVIDUAL_RECIPIENT_SUFFIX="+INDIVIDUAL_RECIPIENT_SUFFIX);
		sb.append(",RECIPIENT_BUSINESS_STREET_ADDRESS_LINE_1="+RECIPIENT_BUSINESS_STREET_ADDRESS_LINE_1);
		sb.append(",RECIPIENT_BUSINESS_STREET_ADDRESS_LINE_2="+RECIPIENT_BUSINESS_STREET_ADDRESS_LINE_2);
		sb.append(",RECIPIENT_CITY="+RECIPIENT_CITY);
		sb.append(",RECIPIENT_STATE="+RECIPIENT_STATE);
		sb.append(",RECIPIENT_ZIP_CODE_POSTAL_CODE="+RECIPIENT_ZIP_CODE_POSTAL_CODE);
		sb.append(",RECIPIENT_COUNTRY="+RECIPIENT_COUNTRY);
		sb.append(",RECIPIENT_TYPE_PROFESSIONAL_DESIGNATION_CREDENTIAL="+RECIPIENT_TYPE_PROFESSIONAL_DESIGNATION_CREDENTIAL);
		sb.append(",RECIPIENT_NPI="+RECIPIENT_NPI);
	    sb.append("]");

	    return sb.toString();
    }
        public String toLogString(){
        	StringBuilder sb = new StringBuilder();
        	
        				if(VENDOR_NAME == null){
        					sb.append("<null>");
        				}else{
            				sb.append(VENDOR_NAME);
            			}
            		
        			sb.append("|");
        		
        				if(ACTIVITY_ID == null){
        					sb.append("<null>");
        				}else{
            				sb.append(ACTIVITY_ID);
            			}
            		
        			sb.append("|");
        		
        				if(ACTIVITY_TYPE == null){
        					sb.append("<null>");
        				}else{
            				sb.append(ACTIVITY_TYPE);
            			}
            		
        			sb.append("|");
        		
        				if(EMPLOYEE_NAME == null){
        					sb.append("<null>");
        				}else{
            				sb.append(EMPLOYEE_NAME);
            			}
            		
        			sb.append("|");
        		
        				if(BUSINESS_FUNCTIONAL_AREA == null){
        					sb.append("<null>");
        				}else{
            				sb.append(BUSINESS_FUNCTIONAL_AREA);
            			}
            		
        			sb.append("|");
        		
        				if(ACTIVITY_NAME == null){
        					sb.append("<null>");
        				}else{
            				sb.append(ACTIVITY_NAME);
            			}
            		
        			sb.append("|");
        		
        				if(PRODUCT == null){
        					sb.append("<null>");
        				}else{
            				sb.append(PRODUCT);
            			}
            		
        			sb.append("|");
        		
        				if(EXPENSE_ID == null){
        					sb.append("<null>");
        				}else{
            				sb.append(EXPENSE_ID);
            			}
            		
        			sb.append("|");
        		
        				if(NATURE_OF_EXPENSE == null){
        					sb.append("<null>");
        				}else{
            				sb.append(NATURE_OF_EXPENSE);
            			}
            		
        			sb.append("|");
        		
        				if(EXPENSE_TYPE == null){
        					sb.append("<null>");
        				}else{
            				sb.append(EXPENSE_TYPE);
            			}
            		
        			sb.append("|");
        		
        				if(DATE_OF_PAYMENT == null){
        					sb.append("<null>");
        				}else{
            				sb.append(DATE_OF_PAYMENT);
            			}
            		
        			sb.append("|");
        		
        				if(INDIVIDUAL_RECIPIENT_FIRST_NAME == null){
        					sb.append("<null>");
        				}else{
            				sb.append(INDIVIDUAL_RECIPIENT_FIRST_NAME);
            			}
            		
        			sb.append("|");
        		
        				if(INDIVIDUAL_RECIPIENT_MIDDLE_NAME == null){
        					sb.append("<null>");
        				}else{
            				sb.append(INDIVIDUAL_RECIPIENT_MIDDLE_NAME);
            			}
            		
        			sb.append("|");
        		
        				if(INDIVIDUAL_RECIPIENT_LAST_NAME_ORGANIZATION_NAME == null){
        					sb.append("<null>");
        				}else{
            				sb.append(INDIVIDUAL_RECIPIENT_LAST_NAME_ORGANIZATION_NAME);
            			}
            		
        			sb.append("|");
        		
        				if(LEGEND_ID == null){
        					sb.append("<null>");
        				}else{
            				sb.append(LEGEND_ID);
            			}
            		
        			sb.append("|");
        		
        				if(INDIVIDUAL_RECIPIENT_SUFFIX == null){
        					sb.append("<null>");
        				}else{
            				sb.append(INDIVIDUAL_RECIPIENT_SUFFIX);
            			}
            		
        			sb.append("|");
        		
        				if(RECIPIENT_BUSINESS_STREET_ADDRESS_LINE_1 == null){
        					sb.append("<null>");
        				}else{
            				sb.append(RECIPIENT_BUSINESS_STREET_ADDRESS_LINE_1);
            			}
            		
        			sb.append("|");
        		
        				if(RECIPIENT_BUSINESS_STREET_ADDRESS_LINE_2 == null){
        					sb.append("<null>");
        				}else{
            				sb.append(RECIPIENT_BUSINESS_STREET_ADDRESS_LINE_2);
            			}
            		
        			sb.append("|");
        		
        				if(RECIPIENT_CITY == null){
        					sb.append("<null>");
        				}else{
            				sb.append(RECIPIENT_CITY);
            			}
            		
        			sb.append("|");
        		
        				if(RECIPIENT_STATE == null){
        					sb.append("<null>");
        				}else{
            				sb.append(RECIPIENT_STATE);
            			}
            		
        			sb.append("|");
        		
        				if(RECIPIENT_ZIP_CODE_POSTAL_CODE == null){
        					sb.append("<null>");
        				}else{
            				sb.append(RECIPIENT_ZIP_CODE_POSTAL_CODE);
            			}
            		
        			sb.append("|");
        		
        				if(RECIPIENT_COUNTRY == null){
        					sb.append("<null>");
        				}else{
            				sb.append(RECIPIENT_COUNTRY);
            			}
            		
        			sb.append("|");
        		
        				if(RECIPIENT_TYPE_PROFESSIONAL_DESIGNATION_CREDENTIAL == null){
        					sb.append("<null>");
        				}else{
            				sb.append(RECIPIENT_TYPE_PROFESSIONAL_DESIGNATION_CREDENTIAL);
            			}
            		
        			sb.append("|");
        		
        				if(RECIPIENT_NPI == null){
        					sb.append("<null>");
        				}else{
            				sb.append(RECIPIENT_NPI);
            			}
            		
        			sb.append("|");
        		
        	return sb.toString();
        }

    /**
     * Compare keys
     */
    public int compareTo(OUTPUTStruct other) {

		int returnValue = -1;
		
						returnValue = checkNullsAndCompare(this.ACTIVITY_ID, other.ACTIVITY_ID);
						if(returnValue != 0) {
							return returnValue;
						}

					
						returnValue = checkNullsAndCompare(this.EXPENSE_ID, other.EXPENSE_ID);
						if(returnValue != 0) {
							return returnValue;
						}

					
						returnValue = checkNullsAndCompare(this.LEGEND_ID, other.LEGEND_ID);
						if(returnValue != 0) {
							return returnValue;
						}

					
	    return returnValue;
    }


    private int checkNullsAndCompare(Object object1, Object object2) {
        int returnValue = 0;
		if (object1 instanceof Comparable && object2 instanceof Comparable) {
            returnValue = ((Comparable) object1).compareTo(object2);
        } else if (object1 != null && object2 != null) {
            returnValue = compareStrings(object1.toString(), object2.toString());
        } else if (object1 == null && object2 != null) {
            returnValue = 1;
        } else if (object1 != null && object2 == null) {
            returnValue = -1;
        } else {
            returnValue = 0;
        }

        return returnValue;
    }

    private int compareStrings(String string1, String string2) {
        return string1.compareTo(string2);
    }


}

public static class HCPSStruct implements routines.system.IPersistableRow<HCPSStruct> {
    final static byte[] commonByteArrayLock_USCOMM_SUNSHINE_RPT_QA_BEACON_EXTRACT_SNOWFLAKE = new byte[0];
    static byte[] commonByteArray_USCOMM_SUNSHINE_RPT_QA_BEACON_EXTRACT_SNOWFLAKE = new byte[0];

	
			    public String HCP_LEGEND_ID;

				public String getHCP_LEGEND_ID () {
					return this.HCP_LEGEND_ID;
				}

				public Boolean HCP_LEGEND_IDIsNullable(){
				    return false;
				}
				public Boolean HCP_LEGEND_IDIsKey(){
				    return true;
				}
				public Integer HCP_LEGEND_IDLength(){
				    return 10;
				}
				public Integer HCP_LEGEND_IDPrecision(){
				    return null;
				}
				public String HCP_LEGEND_IDDefault(){
				
					return null;
				
				}
				public String HCP_LEGEND_IDComment(){
				
				    return "";
				
				}
				public String HCP_LEGEND_IDPattern(){
				
					return "";
				
				}
				public String HCP_LEGEND_IDOriginalDbColumnName(){
				
					return "HCP_LEGEND_ID";
				
				}

				
			    public String HCP_STATUS;

				public String getHCP_STATUS () {
					return this.HCP_STATUS;
				}

				public Boolean HCP_STATUSIsNullable(){
				    return false;
				}
				public Boolean HCP_STATUSIsKey(){
				    return true;
				}
				public Integer HCP_STATUSLength(){
				    return 20;
				}
				public Integer HCP_STATUSPrecision(){
				    return null;
				}
				public String HCP_STATUSDefault(){
				
					return null;
				
				}
				public String HCP_STATUSComment(){
				
				    return "";
				
				}
				public String HCP_STATUSPattern(){
				
					return "";
				
				}
				public String HCP_STATUSOriginalDbColumnName(){
				
					return "HCP_STATUS";
				
				}

				
			    public java.util.Date HCP_CREATED_DT;

				public java.util.Date getHCP_CREATED_DT () {
					return this.HCP_CREATED_DT;
				}

				public Boolean HCP_CREATED_DTIsNullable(){
				    return false;
				}
				public Boolean HCP_CREATED_DTIsKey(){
				    return true;
				}
				public Integer HCP_CREATED_DTLength(){
				    return null;
				}
				public Integer HCP_CREATED_DTPrecision(){
				    return null;
				}
				public String HCP_CREATED_DTDefault(){
				
					return null;
				
				}
				public String HCP_CREATED_DTComment(){
				
				    return "";
				
				}
				public String HCP_CREATED_DTPattern(){
				
					return "yyyy-MM-dd";
				
				}
				public String HCP_CREATED_DTOriginalDbColumnName(){
				
					return "HCP_CREATED_DT";
				
				}

				
			    public java.util.Date HCP_INACTIVE_DT;

				public java.util.Date getHCP_INACTIVE_DT () {
					return this.HCP_INACTIVE_DT;
				}

				public Boolean HCP_INACTIVE_DTIsNullable(){
				    return true;
				}
				public Boolean HCP_INACTIVE_DTIsKey(){
				    return false;
				}
				public Integer HCP_INACTIVE_DTLength(){
				    return null;
				}
				public Integer HCP_INACTIVE_DTPrecision(){
				    return null;
				}
				public String HCP_INACTIVE_DTDefault(){
				
					return null;
				
				}
				public String HCP_INACTIVE_DTComment(){
				
				    return "";
				
				}
				public String HCP_INACTIVE_DTPattern(){
				
					return "yyyy-MM-dd";
				
				}
				public String HCP_INACTIVE_DTOriginalDbColumnName(){
				
					return "HCP_INACTIVE_DT";
				
				}

				
			    public String LAST_NAME;

				public String getLAST_NAME () {
					return this.LAST_NAME;
				}

				public Boolean LAST_NAMEIsNullable(){
				    return true;
				}
				public Boolean LAST_NAMEIsKey(){
				    return false;
				}
				public Integer LAST_NAMELength(){
				    return 50;
				}
				public Integer LAST_NAMEPrecision(){
				    return null;
				}
				public String LAST_NAMEDefault(){
				
					return null;
				
				}
				public String LAST_NAMEComment(){
				
				    return "";
				
				}
				public String LAST_NAMEPattern(){
				
					return "";
				
				}
				public String LAST_NAMEOriginalDbColumnName(){
				
					return "LAST_NAME";
				
				}

				
			    public String FIRST_NAME;

				public String getFIRST_NAME () {
					return this.FIRST_NAME;
				}

				public Boolean FIRST_NAMEIsNullable(){
				    return true;
				}
				public Boolean FIRST_NAMEIsKey(){
				    return false;
				}
				public Integer FIRST_NAMELength(){
				    return 50;
				}
				public Integer FIRST_NAMEPrecision(){
				    return null;
				}
				public String FIRST_NAMEDefault(){
				
					return null;
				
				}
				public String FIRST_NAMEComment(){
				
				    return "";
				
				}
				public String FIRST_NAMEPattern(){
				
					return "";
				
				}
				public String FIRST_NAMEOriginalDbColumnName(){
				
					return "FIRST_NAME";
				
				}

				
			    public String MIDDLE_NAME;

				public String getMIDDLE_NAME () {
					return this.MIDDLE_NAME;
				}

				public Boolean MIDDLE_NAMEIsNullable(){
				    return true;
				}
				public Boolean MIDDLE_NAMEIsKey(){
				    return false;
				}
				public Integer MIDDLE_NAMELength(){
				    return 50;
				}
				public Integer MIDDLE_NAMEPrecision(){
				    return null;
				}
				public String MIDDLE_NAMEDefault(){
				
					return null;
				
				}
				public String MIDDLE_NAMEComment(){
				
				    return "";
				
				}
				public String MIDDLE_NAMEPattern(){
				
					return "";
				
				}
				public String MIDDLE_NAMEOriginalDbColumnName(){
				
					return "MIDDLE_NAME";
				
				}

				
			    public String SUFFIX;

				public String getSUFFIX () {
					return this.SUFFIX;
				}

				public Boolean SUFFIXIsNullable(){
				    return true;
				}
				public Boolean SUFFIXIsKey(){
				    return false;
				}
				public Integer SUFFIXLength(){
				    return 50;
				}
				public Integer SUFFIXPrecision(){
				    return null;
				}
				public String SUFFIXDefault(){
				
					return null;
				
				}
				public String SUFFIXComment(){
				
				    return "";
				
				}
				public String SUFFIXPattern(){
				
					return "";
				
				}
				public String SUFFIXOriginalDbColumnName(){
				
					return "SUFFIX";
				
				}

				
			    public String NPI;

				public String getNPI () {
					return this.NPI;
				}

				public Boolean NPIIsNullable(){
				    return true;
				}
				public Boolean NPIIsKey(){
				    return false;
				}
				public Integer NPILength(){
				    return 10;
				}
				public Integer NPIPrecision(){
				    return null;
				}
				public String NPIDefault(){
				
					return null;
				
				}
				public String NPIComment(){
				
				    return "";
				
				}
				public String NPIPattern(){
				
					return "";
				
				}
				public String NPIOriginalDbColumnName(){
				
					return "NPI";
				
				}

				
			    public String CREDENTIALS;

				public String getCREDENTIALS () {
					return this.CREDENTIALS;
				}

				public Boolean CREDENTIALSIsNullable(){
				    return true;
				}
				public Boolean CREDENTIALSIsKey(){
				    return false;
				}
				public Integer CREDENTIALSLength(){
				    return 10;
				}
				public Integer CREDENTIALSPrecision(){
				    return null;
				}
				public String CREDENTIALSDefault(){
				
					return null;
				
				}
				public String CREDENTIALSComment(){
				
				    return "";
				
				}
				public String CREDENTIALSPattern(){
				
					return "";
				
				}
				public String CREDENTIALSOriginalDbColumnName(){
				
					return "CREDENTIALS";
				
				}

				
			    public String STND_CREDENTIALS;

				public String getSTND_CREDENTIALS () {
					return this.STND_CREDENTIALS;
				}

				public Boolean STND_CREDENTIALSIsNullable(){
				    return true;
				}
				public Boolean STND_CREDENTIALSIsKey(){
				    return false;
				}
				public Integer STND_CREDENTIALSLength(){
				    return 10;
				}
				public Integer STND_CREDENTIALSPrecision(){
				    return null;
				}
				public String STND_CREDENTIALSDefault(){
				
					return null;
				
				}
				public String STND_CREDENTIALSComment(){
				
				    return "";
				
				}
				public String STND_CREDENTIALSPattern(){
				
					return "";
				
				}
				public String STND_CREDENTIALSOriginalDbColumnName(){
				
					return "STND_CREDENTIALS";
				
				}

				
			    public String HCP_PHONE;

				public String getHCP_PHONE () {
					return this.HCP_PHONE;
				}

				public Boolean HCP_PHONEIsNullable(){
				    return true;
				}
				public Boolean HCP_PHONEIsKey(){
				    return false;
				}
				public Integer HCP_PHONELength(){
				    return 20;
				}
				public Integer HCP_PHONEPrecision(){
				    return null;
				}
				public String HCP_PHONEDefault(){
				
					return null;
				
				}
				public String HCP_PHONEComment(){
				
				    return "";
				
				}
				public String HCP_PHONEPattern(){
				
					return "";
				
				}
				public String HCP_PHONEOriginalDbColumnName(){
				
					return "HCP_PHONE";
				
				}

				
			    public String EMAIL;

				public String getEMAIL () {
					return this.EMAIL;
				}

				public Boolean EMAILIsNullable(){
				    return true;
				}
				public Boolean EMAILIsKey(){
				    return false;
				}
				public Integer EMAILLength(){
				    return 100;
				}
				public Integer EMAILPrecision(){
				    return null;
				}
				public String EMAILDefault(){
				
					return null;
				
				}
				public String EMAILComment(){
				
				    return "";
				
				}
				public String EMAILPattern(){
				
					return "";
				
				}
				public String EMAILOriginalDbColumnName(){
				
					return "EMAIL";
				
				}

				
			    public Double EMAIL_OPT_OUT;

				public Double getEMAIL_OPT_OUT () {
					return this.EMAIL_OPT_OUT;
				}

				public Boolean EMAIL_OPT_OUTIsNullable(){
				    return true;
				}
				public Boolean EMAIL_OPT_OUTIsKey(){
				    return false;
				}
				public Integer EMAIL_OPT_OUTLength(){
				    return null;
				}
				public Integer EMAIL_OPT_OUTPrecision(){
				    return null;
				}
				public String EMAIL_OPT_OUTDefault(){
				
					return null;
				
				}
				public String EMAIL_OPT_OUTComment(){
				
				    return "";
				
				}
				public String EMAIL_OPT_OUTPattern(){
				
					return "";
				
				}
				public String EMAIL_OPT_OUTOriginalDbColumnName(){
				
					return "EMAIL_OPT_OUT";
				
				}

				
			    public String OFFICE_HOURS;

				public String getOFFICE_HOURS () {
					return this.OFFICE_HOURS;
				}

				public Boolean OFFICE_HOURSIsNullable(){
				    return true;
				}
				public Boolean OFFICE_HOURSIsKey(){
				    return false;
				}
				public Integer OFFICE_HOURSLength(){
				    return 25;
				}
				public Integer OFFICE_HOURSPrecision(){
				    return null;
				}
				public String OFFICE_HOURSDefault(){
				
					return null;
				
				}
				public String OFFICE_HOURSComment(){
				
				    return "";
				
				}
				public String OFFICE_HOURSPattern(){
				
					return "";
				
				}
				public String OFFICE_HOURSOriginalDbColumnName(){
				
					return "OFFICE_HOURS";
				
				}

				
			    public String HCP_TYPE;

				public String getHCP_TYPE () {
					return this.HCP_TYPE;
				}

				public Boolean HCP_TYPEIsNullable(){
				    return true;
				}
				public Boolean HCP_TYPEIsKey(){
				    return false;
				}
				public Integer HCP_TYPELength(){
				    return 50;
				}
				public Integer HCP_TYPEPrecision(){
				    return null;
				}
				public String HCP_TYPEDefault(){
				
					return null;
				
				}
				public String HCP_TYPEComment(){
				
				    return "";
				
				}
				public String HCP_TYPEPattern(){
				
					return "";
				
				}
				public String HCP_TYPEOriginalDbColumnName(){
				
					return "HCP_TYPE";
				
				}

				
			    public String HCP_ROLE;

				public String getHCP_ROLE () {
					return this.HCP_ROLE;
				}

				public Boolean HCP_ROLEIsNullable(){
				    return true;
				}
				public Boolean HCP_ROLEIsKey(){
				    return false;
				}
				public Integer HCP_ROLELength(){
				    return 50;
				}
				public Integer HCP_ROLEPrecision(){
				    return null;
				}
				public String HCP_ROLEDefault(){
				
					return null;
				
				}
				public String HCP_ROLEComment(){
				
				    return "";
				
				}
				public String HCP_ROLEPattern(){
				
					return "";
				
				}
				public String HCP_ROLEOriginalDbColumnName(){
				
					return "HCP_ROLE";
				
				}

				
			    public String CART_AREA;

				public String getCART_AREA () {
					return this.CART_AREA;
				}

				public Boolean CART_AREAIsNullable(){
				    return true;
				}
				public Boolean CART_AREAIsKey(){
				    return false;
				}
				public Integer CART_AREALength(){
				    return 50;
				}
				public Integer CART_AREAPrecision(){
				    return null;
				}
				public String CART_AREADefault(){
				
					return null;
				
				}
				public String CART_AREAComment(){
				
				    return "";
				
				}
				public String CART_AREAPattern(){
				
					return "";
				
				}
				public String CART_AREAOriginalDbColumnName(){
				
					return "CART_AREA";
				
				}

				
			    public Boolean KOL_IND;

				public Boolean getKOL_IND () {
					return this.KOL_IND;
				}

				public Boolean KOL_INDIsNullable(){
				    return true;
				}
				public Boolean KOL_INDIsKey(){
				    return false;
				}
				public Integer KOL_INDLength(){
				    return null;
				}
				public Integer KOL_INDPrecision(){
				    return null;
				}
				public String KOL_INDDefault(){
				
					return null;
				
				}
				public String KOL_INDComment(){
				
				    return "";
				
				}
				public String KOL_INDPattern(){
				
					return "";
				
				}
				public String KOL_INDOriginalDbColumnName(){
				
					return "KOL_IND";
				
				}

				
			    public Boolean MM_TREATER_IND;

				public Boolean getMM_TREATER_IND () {
					return this.MM_TREATER_IND;
				}

				public Boolean MM_TREATER_INDIsNullable(){
				    return true;
				}
				public Boolean MM_TREATER_INDIsKey(){
				    return false;
				}
				public Integer MM_TREATER_INDLength(){
				    return null;
				}
				public Integer MM_TREATER_INDPrecision(){
				    return null;
				}
				public String MM_TREATER_INDDefault(){
				
					return null;
				
				}
				public String MM_TREATER_INDComment(){
				
				    return "";
				
				}
				public String MM_TREATER_INDPattern(){
				
					return "";
				
				}
				public String MM_TREATER_INDOriginalDbColumnName(){
				
					return "MM_TREATER_IND";
				
				}

				
			    public Boolean BMT_IND;

				public Boolean getBMT_IND () {
					return this.BMT_IND;
				}

				public Boolean BMT_INDIsNullable(){
				    return true;
				}
				public Boolean BMT_INDIsKey(){
				    return false;
				}
				public Integer BMT_INDLength(){
				    return null;
				}
				public Integer BMT_INDPrecision(){
				    return null;
				}
				public String BMT_INDDefault(){
				
					return null;
				
				}
				public String BMT_INDComment(){
				
				    return "";
				
				}
				public String BMT_INDPattern(){
				
					return "";
				
				}
				public String BMT_INDOriginalDbColumnName(){
				
					return "BMT_IND";
				
				}

				
			    public String CLINICAL_TRIAL_ROLE;

				public String getCLINICAL_TRIAL_ROLE () {
					return this.CLINICAL_TRIAL_ROLE;
				}

				public Boolean CLINICAL_TRIAL_ROLEIsNullable(){
				    return true;
				}
				public Boolean CLINICAL_TRIAL_ROLEIsKey(){
				    return false;
				}
				public Integer CLINICAL_TRIAL_ROLELength(){
				    return 100;
				}
				public Integer CLINICAL_TRIAL_ROLEPrecision(){
				    return null;
				}
				public String CLINICAL_TRIAL_ROLEDefault(){
				
					return null;
				
				}
				public String CLINICAL_TRIAL_ROLEComment(){
				
				    return "";
				
				}
				public String CLINICAL_TRIAL_ROLEPattern(){
				
					return "";
				
				}
				public String CLINICAL_TRIAL_ROLEOriginalDbColumnName(){
				
					return "CLINICAL_TRIAL_ROLE";
				
				}

				
			    public String PRIM_DISEASE_STATE;

				public String getPRIM_DISEASE_STATE () {
					return this.PRIM_DISEASE_STATE;
				}

				public Boolean PRIM_DISEASE_STATEIsNullable(){
				    return true;
				}
				public Boolean PRIM_DISEASE_STATEIsKey(){
				    return false;
				}
				public Integer PRIM_DISEASE_STATELength(){
				    return 50;
				}
				public Integer PRIM_DISEASE_STATEPrecision(){
				    return null;
				}
				public String PRIM_DISEASE_STATEDefault(){
				
					return null;
				
				}
				public String PRIM_DISEASE_STATEComment(){
				
				    return "";
				
				}
				public String PRIM_DISEASE_STATEPattern(){
				
					return "";
				
				}
				public String PRIM_DISEASE_STATEOriginalDbColumnName(){
				
					return "PRIM_DISEASE_STATE";
				
				}

				
			    public String SEC_DISEASE_STATE;

				public String getSEC_DISEASE_STATE () {
					return this.SEC_DISEASE_STATE;
				}

				public Boolean SEC_DISEASE_STATEIsNullable(){
				    return true;
				}
				public Boolean SEC_DISEASE_STATEIsKey(){
				    return false;
				}
				public Integer SEC_DISEASE_STATELength(){
				    return 50;
				}
				public Integer SEC_DISEASE_STATEPrecision(){
				    return null;
				}
				public String SEC_DISEASE_STATEDefault(){
				
					return null;
				
				}
				public String SEC_DISEASE_STATEComment(){
				
				    return "";
				
				}
				public String SEC_DISEASE_STATEPattern(){
				
					return "";
				
				}
				public String SEC_DISEASE_STATEOriginalDbColumnName(){
				
					return "SEC_DISEASE_STATE";
				
				}

				
			    public String TER_DISEASE_STATE;

				public String getTER_DISEASE_STATE () {
					return this.TER_DISEASE_STATE;
				}

				public Boolean TER_DISEASE_STATEIsNullable(){
				    return true;
				}
				public Boolean TER_DISEASE_STATEIsKey(){
				    return false;
				}
				public Integer TER_DISEASE_STATELength(){
				    return 50;
				}
				public Integer TER_DISEASE_STATEPrecision(){
				    return null;
				}
				public String TER_DISEASE_STATEDefault(){
				
					return null;
				
				}
				public String TER_DISEASE_STATEComment(){
				
				    return "";
				
				}
				public String TER_DISEASE_STATEPattern(){
				
					return "";
				
				}
				public String TER_DISEASE_STATEOriginalDbColumnName(){
				
					return "TER_DISEASE_STATE";
				
				}

				
			    public String SPHERE_OF_INFLUENCE;

				public String getSPHERE_OF_INFLUENCE () {
					return this.SPHERE_OF_INFLUENCE;
				}

				public Boolean SPHERE_OF_INFLUENCEIsNullable(){
				    return true;
				}
				public Boolean SPHERE_OF_INFLUENCEIsKey(){
				    return false;
				}
				public Integer SPHERE_OF_INFLUENCELength(){
				    return 200;
				}
				public Integer SPHERE_OF_INFLUENCEPrecision(){
				    return null;
				}
				public String SPHERE_OF_INFLUENCEDefault(){
				
					return null;
				
				}
				public String SPHERE_OF_INFLUENCEComment(){
				
				    return "";
				
				}
				public String SPHERE_OF_INFLUENCEPattern(){
				
					return "";
				
				}
				public String SPHERE_OF_INFLUENCEOriginalDbColumnName(){
				
					return "SPHERE_OF_INFLUENCE";
				
				}

				
			    public String INDICATORS;

				public String getINDICATORS () {
					return this.INDICATORS;
				}

				public Boolean INDICATORSIsNullable(){
				    return true;
				}
				public Boolean INDICATORSIsKey(){
				    return false;
				}
				public Integer INDICATORSLength(){
				    return 25;
				}
				public Integer INDICATORSPrecision(){
				    return null;
				}
				public String INDICATORSDefault(){
				
					return null;
				
				}
				public String INDICATORSComment(){
				
				    return "";
				
				}
				public String INDICATORSPattern(){
				
					return "";
				
				}
				public String INDICATORSOriginalDbColumnName(){
				
					return "INDICATORS";
				
				}

				
			    public Double AWARENESS;

				public Double getAWARENESS () {
					return this.AWARENESS;
				}

				public Boolean AWARENESSIsNullable(){
				    return true;
				}
				public Boolean AWARENESSIsKey(){
				    return false;
				}
				public Integer AWARENESSLength(){
				    return null;
				}
				public Integer AWARENESSPrecision(){
				    return null;
				}
				public String AWARENESSDefault(){
				
					return null;
				
				}
				public String AWARENESSComment(){
				
				    return "";
				
				}
				public String AWARENESSPattern(){
				
					return "";
				
				}
				public String AWARENESSOriginalDbColumnName(){
				
					return "AWARENESS";
				
				}

				
			    public Double ACCESS;

				public Double getACCESS () {
					return this.ACCESS;
				}

				public Boolean ACCESSIsNullable(){
				    return true;
				}
				public Boolean ACCESSIsKey(){
				    return false;
				}
				public Integer ACCESSLength(){
				    return null;
				}
				public Integer ACCESSPrecision(){
				    return null;
				}
				public String ACCESSDefault(){
				
					return null;
				
				}
				public String ACCESSComment(){
				
				    return "";
				
				}
				public String ACCESSPattern(){
				
					return "";
				
				}
				public String ACCESSOriginalDbColumnName(){
				
					return "ACCESS";
				
				}

				
			    public Double UNDERSTAND_UNMET_NEED;

				public Double getUNDERSTAND_UNMET_NEED () {
					return this.UNDERSTAND_UNMET_NEED;
				}

				public Boolean UNDERSTAND_UNMET_NEEDIsNullable(){
				    return true;
				}
				public Boolean UNDERSTAND_UNMET_NEEDIsKey(){
				    return false;
				}
				public Integer UNDERSTAND_UNMET_NEEDLength(){
				    return null;
				}
				public Integer UNDERSTAND_UNMET_NEEDPrecision(){
				    return null;
				}
				public String UNDERSTAND_UNMET_NEEDDefault(){
				
					return null;
				
				}
				public String UNDERSTAND_UNMET_NEEDComment(){
				
				    return "";
				
				}
				public String UNDERSTAND_UNMET_NEEDPattern(){
				
					return "";
				
				}
				public String UNDERSTAND_UNMET_NEEDOriginalDbColumnName(){
				
					return "UNDERSTAND_UNMET_NEED";
				
				}

				
			    public Double TC_KNOWLEDGE;

				public Double getTC_KNOWLEDGE () {
					return this.TC_KNOWLEDGE;
				}

				public Boolean TC_KNOWLEDGEIsNullable(){
				    return true;
				}
				public Boolean TC_KNOWLEDGEIsKey(){
				    return false;
				}
				public Integer TC_KNOWLEDGELength(){
				    return null;
				}
				public Integer TC_KNOWLEDGEPrecision(){
				    return null;
				}
				public String TC_KNOWLEDGEDefault(){
				
					return null;
				
				}
				public String TC_KNOWLEDGEComment(){
				
				    return "";
				
				}
				public String TC_KNOWLEDGEPattern(){
				
					return "";
				
				}
				public String TC_KNOWLEDGEOriginalDbColumnName(){
				
					return "TC_KNOWLEDGE";
				
				}

				
			    public String HCP_CREATED_BY;

				public String getHCP_CREATED_BY () {
					return this.HCP_CREATED_BY;
				}

				public Boolean HCP_CREATED_BYIsNullable(){
				    return true;
				}
				public Boolean HCP_CREATED_BYIsKey(){
				    return false;
				}
				public Integer HCP_CREATED_BYLength(){
				    return 100;
				}
				public Integer HCP_CREATED_BYPrecision(){
				    return null;
				}
				public String HCP_CREATED_BYDefault(){
				
					return null;
				
				}
				public String HCP_CREATED_BYComment(){
				
				    return "";
				
				}
				public String HCP_CREATED_BYPattern(){
				
					return "";
				
				}
				public String HCP_CREATED_BYOriginalDbColumnName(){
				
					return "HCP_CREATED_BY";
				
				}

				
			    public java.util.Date DATA_THROUGH_DATE;

				public java.util.Date getDATA_THROUGH_DATE () {
					return this.DATA_THROUGH_DATE;
				}

				public Boolean DATA_THROUGH_DATEIsNullable(){
				    return true;
				}
				public Boolean DATA_THROUGH_DATEIsKey(){
				    return false;
				}
				public Integer DATA_THROUGH_DATELength(){
				    return null;
				}
				public Integer DATA_THROUGH_DATEPrecision(){
				    return null;
				}
				public String DATA_THROUGH_DATEDefault(){
				
					return null;
				
				}
				public String DATA_THROUGH_DATEComment(){
				
				    return "";
				
				}
				public String DATA_THROUGH_DATEPattern(){
				
					return "yyyy-MM-dd";
				
				}
				public String DATA_THROUGH_DATEOriginalDbColumnName(){
				
					return "DATA_THROUGH_DATE";
				
				}

				



	private String readString(ObjectInputStream dis) throws IOException{
		String strReturn = null;
		int length = 0;
        length = dis.readInt();
		if (length == -1) {
			strReturn = null;
		} else {
			if(length > commonByteArray_USCOMM_SUNSHINE_RPT_QA_BEACON_EXTRACT_SNOWFLAKE.length) {
				if(length < 1024 && commonByteArray_USCOMM_SUNSHINE_RPT_QA_BEACON_EXTRACT_SNOWFLAKE.length == 0) {
   					commonByteArray_USCOMM_SUNSHINE_RPT_QA_BEACON_EXTRACT_SNOWFLAKE = new byte[1024];
				} else {
   					commonByteArray_USCOMM_SUNSHINE_RPT_QA_BEACON_EXTRACT_SNOWFLAKE = new byte[2 * length];
   				}
			}
			dis.readFully(commonByteArray_USCOMM_SUNSHINE_RPT_QA_BEACON_EXTRACT_SNOWFLAKE, 0, length);
			strReturn = new String(commonByteArray_USCOMM_SUNSHINE_RPT_QA_BEACON_EXTRACT_SNOWFLAKE, 0, length, utf8Charset);
		}
		return strReturn;
	}
	
	private String readString(org.jboss.marshalling.Unmarshaller unmarshaller) throws IOException{
		String strReturn = null;
		int length = 0;
        length = unmarshaller.readInt();
		if (length == -1) {
			strReturn = null;
		} else {
			if(length > commonByteArray_USCOMM_SUNSHINE_RPT_QA_BEACON_EXTRACT_SNOWFLAKE.length) {
				if(length < 1024 && commonByteArray_USCOMM_SUNSHINE_RPT_QA_BEACON_EXTRACT_SNOWFLAKE.length == 0) {
   					commonByteArray_USCOMM_SUNSHINE_RPT_QA_BEACON_EXTRACT_SNOWFLAKE = new byte[1024];
				} else {
   					commonByteArray_USCOMM_SUNSHINE_RPT_QA_BEACON_EXTRACT_SNOWFLAKE = new byte[2 * length];
   				}
			}
			unmarshaller.readFully(commonByteArray_USCOMM_SUNSHINE_RPT_QA_BEACON_EXTRACT_SNOWFLAKE, 0, length);
			strReturn = new String(commonByteArray_USCOMM_SUNSHINE_RPT_QA_BEACON_EXTRACT_SNOWFLAKE, 0, length, utf8Charset);
		}
		return strReturn;
	}

    private void writeString(String str, ObjectOutputStream dos) throws IOException{
		if(str == null) {
            dos.writeInt(-1);
		} else {
            byte[] byteArray = str.getBytes(utf8Charset);
	    	dos.writeInt(byteArray.length);
			dos.write(byteArray);
    	}
    }
    
    private void writeString(String str, org.jboss.marshalling.Marshaller marshaller) throws IOException{
		if(str == null) {
			marshaller.writeInt(-1);
		} else {
            byte[] byteArray = str.getBytes(utf8Charset);
            marshaller.writeInt(byteArray.length);
            marshaller.write(byteArray);
    	}
    }

	private java.util.Date readDate(ObjectInputStream dis) throws IOException{
		java.util.Date dateReturn = null;
        int length = 0;
        length = dis.readByte();
		if (length == -1) {
			dateReturn = null;
		} else {
	    	dateReturn = new Date(dis.readLong());
		}
		return dateReturn;
	}
	
	private java.util.Date readDate(org.jboss.marshalling.Unmarshaller unmarshaller) throws IOException{
		java.util.Date dateReturn = null;
        int length = 0;
        length = unmarshaller.readByte();
		if (length == -1) {
			dateReturn = null;
		} else {
	    	dateReturn = new Date(unmarshaller.readLong());
		}
		return dateReturn;
	}

    private void writeDate(java.util.Date date1, ObjectOutputStream dos) throws IOException{
		if(date1 == null) {
            dos.writeByte(-1);
		} else {
			dos.writeByte(0);
	    	dos.writeLong(date1.getTime());
    	}
    }
    
    private void writeDate(java.util.Date date1, org.jboss.marshalling.Marshaller marshaller) throws IOException{
		if(date1 == null) {
			marshaller.writeByte(-1);
		} else {
			marshaller.writeByte(0);
			marshaller.writeLong(date1.getTime());
    	}
    }

    public void readData(ObjectInputStream dis) {

		synchronized(commonByteArrayLock_USCOMM_SUNSHINE_RPT_QA_BEACON_EXTRACT_SNOWFLAKE) {

        	try {

        		int length = 0;
		
					this.HCP_LEGEND_ID = readString(dis);
					
					this.HCP_STATUS = readString(dis);
					
					this.HCP_CREATED_DT = readDate(dis);
					
					this.HCP_INACTIVE_DT = readDate(dis);
					
					this.LAST_NAME = readString(dis);
					
					this.FIRST_NAME = readString(dis);
					
					this.MIDDLE_NAME = readString(dis);
					
					this.SUFFIX = readString(dis);
					
					this.NPI = readString(dis);
					
					this.CREDENTIALS = readString(dis);
					
					this.STND_CREDENTIALS = readString(dis);
					
					this.HCP_PHONE = readString(dis);
					
					this.EMAIL = readString(dis);
					
			            length = dis.readByte();
           				if (length == -1) {
           	    			this.EMAIL_OPT_OUT = null;
           				} else {
           			    	this.EMAIL_OPT_OUT = dis.readDouble();
           				}
					
					this.OFFICE_HOURS = readString(dis);
					
					this.HCP_TYPE = readString(dis);
					
					this.HCP_ROLE = readString(dis);
					
					this.CART_AREA = readString(dis);
					
			            length = dis.readByte();
           				if (length == -1) {
           	    			this.KOL_IND = null;
           				} else {
           			    	this.KOL_IND = dis.readBoolean();
           				}
					
			            length = dis.readByte();
           				if (length == -1) {
           	    			this.MM_TREATER_IND = null;
           				} else {
           			    	this.MM_TREATER_IND = dis.readBoolean();
           				}
					
			            length = dis.readByte();
           				if (length == -1) {
           	    			this.BMT_IND = null;
           				} else {
           			    	this.BMT_IND = dis.readBoolean();
           				}
					
					this.CLINICAL_TRIAL_ROLE = readString(dis);
					
					this.PRIM_DISEASE_STATE = readString(dis);
					
					this.SEC_DISEASE_STATE = readString(dis);
					
					this.TER_DISEASE_STATE = readString(dis);
					
					this.SPHERE_OF_INFLUENCE = readString(dis);
					
					this.INDICATORS = readString(dis);
					
			            length = dis.readByte();
           				if (length == -1) {
           	    			this.AWARENESS = null;
           				} else {
           			    	this.AWARENESS = dis.readDouble();
           				}
					
			            length = dis.readByte();
           				if (length == -1) {
           	    			this.ACCESS = null;
           				} else {
           			    	this.ACCESS = dis.readDouble();
           				}
					
			            length = dis.readByte();
           				if (length == -1) {
           	    			this.UNDERSTAND_UNMET_NEED = null;
           				} else {
           			    	this.UNDERSTAND_UNMET_NEED = dis.readDouble();
           				}
					
			            length = dis.readByte();
           				if (length == -1) {
           	    			this.TC_KNOWLEDGE = null;
           				} else {
           			    	this.TC_KNOWLEDGE = dis.readDouble();
           				}
					
					this.HCP_CREATED_BY = readString(dis);
					
					this.DATA_THROUGH_DATE = readDate(dis);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);

		

        }

		

      }


    }
    
    public void readData(org.jboss.marshalling.Unmarshaller dis) {

		synchronized(commonByteArrayLock_USCOMM_SUNSHINE_RPT_QA_BEACON_EXTRACT_SNOWFLAKE) {

        	try {

        		int length = 0;
		
					this.HCP_LEGEND_ID = readString(dis);
					
					this.HCP_STATUS = readString(dis);
					
					this.HCP_CREATED_DT = readDate(dis);
					
					this.HCP_INACTIVE_DT = readDate(dis);
					
					this.LAST_NAME = readString(dis);
					
					this.FIRST_NAME = readString(dis);
					
					this.MIDDLE_NAME = readString(dis);
					
					this.SUFFIX = readString(dis);
					
					this.NPI = readString(dis);
					
					this.CREDENTIALS = readString(dis);
					
					this.STND_CREDENTIALS = readString(dis);
					
					this.HCP_PHONE = readString(dis);
					
					this.EMAIL = readString(dis);
					
			            length = dis.readByte();
           				if (length == -1) {
           	    			this.EMAIL_OPT_OUT = null;
           				} else {
           			    	this.EMAIL_OPT_OUT = dis.readDouble();
           				}
					
					this.OFFICE_HOURS = readString(dis);
					
					this.HCP_TYPE = readString(dis);
					
					this.HCP_ROLE = readString(dis);
					
					this.CART_AREA = readString(dis);
					
			            length = dis.readByte();
           				if (length == -1) {
           	    			this.KOL_IND = null;
           				} else {
           			    	this.KOL_IND = dis.readBoolean();
           				}
					
			            length = dis.readByte();
           				if (length == -1) {
           	    			this.MM_TREATER_IND = null;
           				} else {
           			    	this.MM_TREATER_IND = dis.readBoolean();
           				}
					
			            length = dis.readByte();
           				if (length == -1) {
           	    			this.BMT_IND = null;
           				} else {
           			    	this.BMT_IND = dis.readBoolean();
           				}
					
					this.CLINICAL_TRIAL_ROLE = readString(dis);
					
					this.PRIM_DISEASE_STATE = readString(dis);
					
					this.SEC_DISEASE_STATE = readString(dis);
					
					this.TER_DISEASE_STATE = readString(dis);
					
					this.SPHERE_OF_INFLUENCE = readString(dis);
					
					this.INDICATORS = readString(dis);
					
			            length = dis.readByte();
           				if (length == -1) {
           	    			this.AWARENESS = null;
           				} else {
           			    	this.AWARENESS = dis.readDouble();
           				}
					
			            length = dis.readByte();
           				if (length == -1) {
           	    			this.ACCESS = null;
           				} else {
           			    	this.ACCESS = dis.readDouble();
           				}
					
			            length = dis.readByte();
           				if (length == -1) {
           	    			this.UNDERSTAND_UNMET_NEED = null;
           				} else {
           			    	this.UNDERSTAND_UNMET_NEED = dis.readDouble();
           				}
					
			            length = dis.readByte();
           				if (length == -1) {
           	    			this.TC_KNOWLEDGE = null;
           				} else {
           			    	this.TC_KNOWLEDGE = dis.readDouble();
           				}
					
					this.HCP_CREATED_BY = readString(dis);
					
					this.DATA_THROUGH_DATE = readDate(dis);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);

		

        }

		

      }


    }

    public void writeData(ObjectOutputStream dos) {
        try {

		
					// String
				
						writeString(this.HCP_LEGEND_ID,dos);
					
					// String
				
						writeString(this.HCP_STATUS,dos);
					
					// java.util.Date
				
						writeDate(this.HCP_CREATED_DT,dos);
					
					// java.util.Date
				
						writeDate(this.HCP_INACTIVE_DT,dos);
					
					// String
				
						writeString(this.LAST_NAME,dos);
					
					// String
				
						writeString(this.FIRST_NAME,dos);
					
					// String
				
						writeString(this.MIDDLE_NAME,dos);
					
					// String
				
						writeString(this.SUFFIX,dos);
					
					// String
				
						writeString(this.NPI,dos);
					
					// String
				
						writeString(this.CREDENTIALS,dos);
					
					// String
				
						writeString(this.STND_CREDENTIALS,dos);
					
					// String
				
						writeString(this.HCP_PHONE,dos);
					
					// String
				
						writeString(this.EMAIL,dos);
					
					// Double
				
						if(this.EMAIL_OPT_OUT == null) {
			                dos.writeByte(-1);
						} else {
               				dos.writeByte(0);
           			    	dos.writeDouble(this.EMAIL_OPT_OUT);
		            	}
					
					// String
				
						writeString(this.OFFICE_HOURS,dos);
					
					// String
				
						writeString(this.HCP_TYPE,dos);
					
					// String
				
						writeString(this.HCP_ROLE,dos);
					
					// String
				
						writeString(this.CART_AREA,dos);
					
					// Boolean
				
						if(this.KOL_IND == null) {
			                dos.writeByte(-1);
						} else {
               				dos.writeByte(0);
           			    	dos.writeBoolean(this.KOL_IND);
		            	}
					
					// Boolean
				
						if(this.MM_TREATER_IND == null) {
			                dos.writeByte(-1);
						} else {
               				dos.writeByte(0);
           			    	dos.writeBoolean(this.MM_TREATER_IND);
		            	}
					
					// Boolean
				
						if(this.BMT_IND == null) {
			                dos.writeByte(-1);
						} else {
               				dos.writeByte(0);
           			    	dos.writeBoolean(this.BMT_IND);
		            	}
					
					// String
				
						writeString(this.CLINICAL_TRIAL_ROLE,dos);
					
					// String
				
						writeString(this.PRIM_DISEASE_STATE,dos);
					
					// String
				
						writeString(this.SEC_DISEASE_STATE,dos);
					
					// String
				
						writeString(this.TER_DISEASE_STATE,dos);
					
					// String
				
						writeString(this.SPHERE_OF_INFLUENCE,dos);
					
					// String
				
						writeString(this.INDICATORS,dos);
					
					// Double
				
						if(this.AWARENESS == null) {
			                dos.writeByte(-1);
						} else {
               				dos.writeByte(0);
           			    	dos.writeDouble(this.AWARENESS);
		            	}
					
					// Double
				
						if(this.ACCESS == null) {
			                dos.writeByte(-1);
						} else {
               				dos.writeByte(0);
           			    	dos.writeDouble(this.ACCESS);
		            	}
					
					// Double
				
						if(this.UNDERSTAND_UNMET_NEED == null) {
			                dos.writeByte(-1);
						} else {
               				dos.writeByte(0);
           			    	dos.writeDouble(this.UNDERSTAND_UNMET_NEED);
		            	}
					
					// Double
				
						if(this.TC_KNOWLEDGE == null) {
			                dos.writeByte(-1);
						} else {
               				dos.writeByte(0);
           			    	dos.writeDouble(this.TC_KNOWLEDGE);
		            	}
					
					// String
				
						writeString(this.HCP_CREATED_BY,dos);
					
					// java.util.Date
				
						writeDate(this.DATA_THROUGH_DATE,dos);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);
        }


    }
    
    public void writeData(org.jboss.marshalling.Marshaller dos) {
        try {

		
					// String
				
						writeString(this.HCP_LEGEND_ID,dos);
					
					// String
				
						writeString(this.HCP_STATUS,dos);
					
					// java.util.Date
				
						writeDate(this.HCP_CREATED_DT,dos);
					
					// java.util.Date
				
						writeDate(this.HCP_INACTIVE_DT,dos);
					
					// String
				
						writeString(this.LAST_NAME,dos);
					
					// String
				
						writeString(this.FIRST_NAME,dos);
					
					// String
				
						writeString(this.MIDDLE_NAME,dos);
					
					// String
				
						writeString(this.SUFFIX,dos);
					
					// String
				
						writeString(this.NPI,dos);
					
					// String
				
						writeString(this.CREDENTIALS,dos);
					
					// String
				
						writeString(this.STND_CREDENTIALS,dos);
					
					// String
				
						writeString(this.HCP_PHONE,dos);
					
					// String
				
						writeString(this.EMAIL,dos);
					
					// Double
				
						if(this.EMAIL_OPT_OUT == null) {
			                dos.writeByte(-1);
						} else {
               				dos.writeByte(0);
           			    	dos.writeDouble(this.EMAIL_OPT_OUT);
		            	}
					
					// String
				
						writeString(this.OFFICE_HOURS,dos);
					
					// String
				
						writeString(this.HCP_TYPE,dos);
					
					// String
				
						writeString(this.HCP_ROLE,dos);
					
					// String
				
						writeString(this.CART_AREA,dos);
					
					// Boolean
				
						if(this.KOL_IND == null) {
			                dos.writeByte(-1);
						} else {
               				dos.writeByte(0);
           			    	dos.writeBoolean(this.KOL_IND);
		            	}
					
					// Boolean
				
						if(this.MM_TREATER_IND == null) {
			                dos.writeByte(-1);
						} else {
               				dos.writeByte(0);
           			    	dos.writeBoolean(this.MM_TREATER_IND);
		            	}
					
					// Boolean
				
						if(this.BMT_IND == null) {
			                dos.writeByte(-1);
						} else {
               				dos.writeByte(0);
           			    	dos.writeBoolean(this.BMT_IND);
		            	}
					
					// String
				
						writeString(this.CLINICAL_TRIAL_ROLE,dos);
					
					// String
				
						writeString(this.PRIM_DISEASE_STATE,dos);
					
					// String
				
						writeString(this.SEC_DISEASE_STATE,dos);
					
					// String
				
						writeString(this.TER_DISEASE_STATE,dos);
					
					// String
				
						writeString(this.SPHERE_OF_INFLUENCE,dos);
					
					// String
				
						writeString(this.INDICATORS,dos);
					
					// Double
				
						if(this.AWARENESS == null) {
			                dos.writeByte(-1);
						} else {
               				dos.writeByte(0);
           			    	dos.writeDouble(this.AWARENESS);
		            	}
					
					// Double
				
						if(this.ACCESS == null) {
			                dos.writeByte(-1);
						} else {
               				dos.writeByte(0);
           			    	dos.writeDouble(this.ACCESS);
		            	}
					
					// Double
				
						if(this.UNDERSTAND_UNMET_NEED == null) {
			                dos.writeByte(-1);
						} else {
               				dos.writeByte(0);
           			    	dos.writeDouble(this.UNDERSTAND_UNMET_NEED);
		            	}
					
					// Double
				
						if(this.TC_KNOWLEDGE == null) {
			                dos.writeByte(-1);
						} else {
               				dos.writeByte(0);
           			    	dos.writeDouble(this.TC_KNOWLEDGE);
		            	}
					
					// String
				
						writeString(this.HCP_CREATED_BY,dos);
					
					// java.util.Date
				
						writeDate(this.DATA_THROUGH_DATE,dos);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);
        }


    }


    public String toString() {

		StringBuilder sb = new StringBuilder();
		sb.append(super.toString());
		sb.append("[");
		sb.append("HCP_LEGEND_ID="+HCP_LEGEND_ID);
		sb.append(",HCP_STATUS="+HCP_STATUS);
		sb.append(",HCP_CREATED_DT="+String.valueOf(HCP_CREATED_DT));
		sb.append(",HCP_INACTIVE_DT="+String.valueOf(HCP_INACTIVE_DT));
		sb.append(",LAST_NAME="+LAST_NAME);
		sb.append(",FIRST_NAME="+FIRST_NAME);
		sb.append(",MIDDLE_NAME="+MIDDLE_NAME);
		sb.append(",SUFFIX="+SUFFIX);
		sb.append(",NPI="+NPI);
		sb.append(",CREDENTIALS="+CREDENTIALS);
		sb.append(",STND_CREDENTIALS="+STND_CREDENTIALS);
		sb.append(",HCP_PHONE="+HCP_PHONE);
		sb.append(",EMAIL="+EMAIL);
		sb.append(",EMAIL_OPT_OUT="+String.valueOf(EMAIL_OPT_OUT));
		sb.append(",OFFICE_HOURS="+OFFICE_HOURS);
		sb.append(",HCP_TYPE="+HCP_TYPE);
		sb.append(",HCP_ROLE="+HCP_ROLE);
		sb.append(",CART_AREA="+CART_AREA);
		sb.append(",KOL_IND="+String.valueOf(KOL_IND));
		sb.append(",MM_TREATER_IND="+String.valueOf(MM_TREATER_IND));
		sb.append(",BMT_IND="+String.valueOf(BMT_IND));
		sb.append(",CLINICAL_TRIAL_ROLE="+CLINICAL_TRIAL_ROLE);
		sb.append(",PRIM_DISEASE_STATE="+PRIM_DISEASE_STATE);
		sb.append(",SEC_DISEASE_STATE="+SEC_DISEASE_STATE);
		sb.append(",TER_DISEASE_STATE="+TER_DISEASE_STATE);
		sb.append(",SPHERE_OF_INFLUENCE="+SPHERE_OF_INFLUENCE);
		sb.append(",INDICATORS="+INDICATORS);
		sb.append(",AWARENESS="+String.valueOf(AWARENESS));
		sb.append(",ACCESS="+String.valueOf(ACCESS));
		sb.append(",UNDERSTAND_UNMET_NEED="+String.valueOf(UNDERSTAND_UNMET_NEED));
		sb.append(",TC_KNOWLEDGE="+String.valueOf(TC_KNOWLEDGE));
		sb.append(",HCP_CREATED_BY="+HCP_CREATED_BY);
		sb.append(",DATA_THROUGH_DATE="+String.valueOf(DATA_THROUGH_DATE));
	    sb.append("]");

	    return sb.toString();
    }
        public String toLogString(){
        	StringBuilder sb = new StringBuilder();
        	
        				if(HCP_LEGEND_ID == null){
        					sb.append("<null>");
        				}else{
            				sb.append(HCP_LEGEND_ID);
            			}
            		
        			sb.append("|");
        		
        				if(HCP_STATUS == null){
        					sb.append("<null>");
        				}else{
            				sb.append(HCP_STATUS);
            			}
            		
        			sb.append("|");
        		
        				if(HCP_CREATED_DT == null){
        					sb.append("<null>");
        				}else{
            				sb.append(HCP_CREATED_DT);
            			}
            		
        			sb.append("|");
        		
        				if(HCP_INACTIVE_DT == null){
        					sb.append("<null>");
        				}else{
            				sb.append(HCP_INACTIVE_DT);
            			}
            		
        			sb.append("|");
        		
        				if(LAST_NAME == null){
        					sb.append("<null>");
        				}else{
            				sb.append(LAST_NAME);
            			}
            		
        			sb.append("|");
        		
        				if(FIRST_NAME == null){
        					sb.append("<null>");
        				}else{
            				sb.append(FIRST_NAME);
            			}
            		
        			sb.append("|");
        		
        				if(MIDDLE_NAME == null){
        					sb.append("<null>");
        				}else{
            				sb.append(MIDDLE_NAME);
            			}
            		
        			sb.append("|");
        		
        				if(SUFFIX == null){
        					sb.append("<null>");
        				}else{
            				sb.append(SUFFIX);
            			}
            		
        			sb.append("|");
        		
        				if(NPI == null){
        					sb.append("<null>");
        				}else{
            				sb.append(NPI);
            			}
            		
        			sb.append("|");
        		
        				if(CREDENTIALS == null){
        					sb.append("<null>");
        				}else{
            				sb.append(CREDENTIALS);
            			}
            		
        			sb.append("|");
        		
        				if(STND_CREDENTIALS == null){
        					sb.append("<null>");
        				}else{
            				sb.append(STND_CREDENTIALS);
            			}
            		
        			sb.append("|");
        		
        				if(HCP_PHONE == null){
        					sb.append("<null>");
        				}else{
            				sb.append(HCP_PHONE);
            			}
            		
        			sb.append("|");
        		
        				if(EMAIL == null){
        					sb.append("<null>");
        				}else{
            				sb.append(EMAIL);
            			}
            		
        			sb.append("|");
        		
        				if(EMAIL_OPT_OUT == null){
        					sb.append("<null>");
        				}else{
            				sb.append(EMAIL_OPT_OUT);
            			}
            		
        			sb.append("|");
        		
        				if(OFFICE_HOURS == null){
        					sb.append("<null>");
        				}else{
            				sb.append(OFFICE_HOURS);
            			}
            		
        			sb.append("|");
        		
        				if(HCP_TYPE == null){
        					sb.append("<null>");
        				}else{
            				sb.append(HCP_TYPE);
            			}
            		
        			sb.append("|");
        		
        				if(HCP_ROLE == null){
        					sb.append("<null>");
        				}else{
            				sb.append(HCP_ROLE);
            			}
            		
        			sb.append("|");
        		
        				if(CART_AREA == null){
        					sb.append("<null>");
        				}else{
            				sb.append(CART_AREA);
            			}
            		
        			sb.append("|");
        		
        				if(KOL_IND == null){
        					sb.append("<null>");
        				}else{
            				sb.append(KOL_IND);
            			}
            		
        			sb.append("|");
        		
        				if(MM_TREATER_IND == null){
        					sb.append("<null>");
        				}else{
            				sb.append(MM_TREATER_IND);
            			}
            		
        			sb.append("|");
        		
        				if(BMT_IND == null){
        					sb.append("<null>");
        				}else{
            				sb.append(BMT_IND);
            			}
            		
        			sb.append("|");
        		
        				if(CLINICAL_TRIAL_ROLE == null){
        					sb.append("<null>");
        				}else{
            				sb.append(CLINICAL_TRIAL_ROLE);
            			}
            		
        			sb.append("|");
        		
        				if(PRIM_DISEASE_STATE == null){
        					sb.append("<null>");
        				}else{
            				sb.append(PRIM_DISEASE_STATE);
            			}
            		
        			sb.append("|");
        		
        				if(SEC_DISEASE_STATE == null){
        					sb.append("<null>");
        				}else{
            				sb.append(SEC_DISEASE_STATE);
            			}
            		
        			sb.append("|");
        		
        				if(TER_DISEASE_STATE == null){
        					sb.append("<null>");
        				}else{
            				sb.append(TER_DISEASE_STATE);
            			}
            		
        			sb.append("|");
        		
        				if(SPHERE_OF_INFLUENCE == null){
        					sb.append("<null>");
        				}else{
            				sb.append(SPHERE_OF_INFLUENCE);
            			}
            		
        			sb.append("|");
        		
        				if(INDICATORS == null){
        					sb.append("<null>");
        				}else{
            				sb.append(INDICATORS);
            			}
            		
        			sb.append("|");
        		
        				if(AWARENESS == null){
        					sb.append("<null>");
        				}else{
            				sb.append(AWARENESS);
            			}
            		
        			sb.append("|");
        		
        				if(ACCESS == null){
        					sb.append("<null>");
        				}else{
            				sb.append(ACCESS);
            			}
            		
        			sb.append("|");
        		
        				if(UNDERSTAND_UNMET_NEED == null){
        					sb.append("<null>");
        				}else{
            				sb.append(UNDERSTAND_UNMET_NEED);
            			}
            		
        			sb.append("|");
        		
        				if(TC_KNOWLEDGE == null){
        					sb.append("<null>");
        				}else{
            				sb.append(TC_KNOWLEDGE);
            			}
            		
        			sb.append("|");
        		
        				if(HCP_CREATED_BY == null){
        					sb.append("<null>");
        				}else{
            				sb.append(HCP_CREATED_BY);
            			}
            		
        			sb.append("|");
        		
        				if(DATA_THROUGH_DATE == null){
        					sb.append("<null>");
        				}else{
            				sb.append(DATA_THROUGH_DATE);
            			}
            		
        			sb.append("|");
        		
        	return sb.toString();
        }

    /**
     * Compare keys
     */
    public int compareTo(HCPSStruct other) {

		int returnValue = -1;
		
	    return returnValue;
    }


    private int checkNullsAndCompare(Object object1, Object object2) {
        int returnValue = 0;
		if (object1 instanceof Comparable && object2 instanceof Comparable) {
            returnValue = ((Comparable) object1).compareTo(object2);
        } else if (object1 != null && object2 != null) {
            returnValue = compareStrings(object1.toString(), object2.toString());
        } else if (object1 == null && object2 != null) {
            returnValue = 1;
        } else if (object1 != null && object2 == null) {
            returnValue = -1;
        } else {
            returnValue = 0;
        }

        return returnValue;
    }

    private int compareStrings(String string1, String string2) {
        return string1.compareTo(string2);
    }


}

public static class after_tDBInput_1Struct implements routines.system.IPersistableRow<after_tDBInput_1Struct> {
    final static byte[] commonByteArrayLock_USCOMM_SUNSHINE_RPT_QA_BEACON_EXTRACT_SNOWFLAKE = new byte[0];
    static byte[] commonByteArray_USCOMM_SUNSHINE_RPT_QA_BEACON_EXTRACT_SNOWFLAKE = new byte[0];
	protected static final int DEFAULT_HASHCODE = 1;
    protected static final int PRIME = 31;
    protected int hashCode = DEFAULT_HASHCODE;
    public boolean hashCodeDirty = true;

    public String loopKey;



	
			    public String HCP_LEGEND_ID;

				public String getHCP_LEGEND_ID () {
					return this.HCP_LEGEND_ID;
				}

				public Boolean HCP_LEGEND_IDIsNullable(){
				    return false;
				}
				public Boolean HCP_LEGEND_IDIsKey(){
				    return true;
				}
				public Integer HCP_LEGEND_IDLength(){
				    return 10;
				}
				public Integer HCP_LEGEND_IDPrecision(){
				    return null;
				}
				public String HCP_LEGEND_IDDefault(){
				
					return null;
				
				}
				public String HCP_LEGEND_IDComment(){
				
				    return "";
				
				}
				public String HCP_LEGEND_IDPattern(){
				
					return "";
				
				}
				public String HCP_LEGEND_IDOriginalDbColumnName(){
				
					return "HCP_LEGEND_ID";
				
				}

				
			    public String HCP_STATUS;

				public String getHCP_STATUS () {
					return this.HCP_STATUS;
				}

				public Boolean HCP_STATUSIsNullable(){
				    return false;
				}
				public Boolean HCP_STATUSIsKey(){
				    return true;
				}
				public Integer HCP_STATUSLength(){
				    return 20;
				}
				public Integer HCP_STATUSPrecision(){
				    return null;
				}
				public String HCP_STATUSDefault(){
				
					return null;
				
				}
				public String HCP_STATUSComment(){
				
				    return "";
				
				}
				public String HCP_STATUSPattern(){
				
					return "";
				
				}
				public String HCP_STATUSOriginalDbColumnName(){
				
					return "HCP_STATUS";
				
				}

				
			    public java.util.Date HCP_CREATED_DT;

				public java.util.Date getHCP_CREATED_DT () {
					return this.HCP_CREATED_DT;
				}

				public Boolean HCP_CREATED_DTIsNullable(){
				    return false;
				}
				public Boolean HCP_CREATED_DTIsKey(){
				    return true;
				}
				public Integer HCP_CREATED_DTLength(){
				    return null;
				}
				public Integer HCP_CREATED_DTPrecision(){
				    return null;
				}
				public String HCP_CREATED_DTDefault(){
				
					return null;
				
				}
				public String HCP_CREATED_DTComment(){
				
				    return "";
				
				}
				public String HCP_CREATED_DTPattern(){
				
					return "yyyy-MM-dd";
				
				}
				public String HCP_CREATED_DTOriginalDbColumnName(){
				
					return "HCP_CREATED_DT";
				
				}

				
			    public java.util.Date HCP_INACTIVE_DT;

				public java.util.Date getHCP_INACTIVE_DT () {
					return this.HCP_INACTIVE_DT;
				}

				public Boolean HCP_INACTIVE_DTIsNullable(){
				    return true;
				}
				public Boolean HCP_INACTIVE_DTIsKey(){
				    return false;
				}
				public Integer HCP_INACTIVE_DTLength(){
				    return null;
				}
				public Integer HCP_INACTIVE_DTPrecision(){
				    return null;
				}
				public String HCP_INACTIVE_DTDefault(){
				
					return null;
				
				}
				public String HCP_INACTIVE_DTComment(){
				
				    return "";
				
				}
				public String HCP_INACTIVE_DTPattern(){
				
					return "yyyy-MM-dd";
				
				}
				public String HCP_INACTIVE_DTOriginalDbColumnName(){
				
					return "HCP_INACTIVE_DT";
				
				}

				
			    public String LAST_NAME;

				public String getLAST_NAME () {
					return this.LAST_NAME;
				}

				public Boolean LAST_NAMEIsNullable(){
				    return true;
				}
				public Boolean LAST_NAMEIsKey(){
				    return false;
				}
				public Integer LAST_NAMELength(){
				    return 50;
				}
				public Integer LAST_NAMEPrecision(){
				    return null;
				}
				public String LAST_NAMEDefault(){
				
					return null;
				
				}
				public String LAST_NAMEComment(){
				
				    return "";
				
				}
				public String LAST_NAMEPattern(){
				
					return "";
				
				}
				public String LAST_NAMEOriginalDbColumnName(){
				
					return "LAST_NAME";
				
				}

				
			    public String FIRST_NAME;

				public String getFIRST_NAME () {
					return this.FIRST_NAME;
				}

				public Boolean FIRST_NAMEIsNullable(){
				    return true;
				}
				public Boolean FIRST_NAMEIsKey(){
				    return false;
				}
				public Integer FIRST_NAMELength(){
				    return 50;
				}
				public Integer FIRST_NAMEPrecision(){
				    return null;
				}
				public String FIRST_NAMEDefault(){
				
					return null;
				
				}
				public String FIRST_NAMEComment(){
				
				    return "";
				
				}
				public String FIRST_NAMEPattern(){
				
					return "";
				
				}
				public String FIRST_NAMEOriginalDbColumnName(){
				
					return "FIRST_NAME";
				
				}

				
			    public String MIDDLE_NAME;

				public String getMIDDLE_NAME () {
					return this.MIDDLE_NAME;
				}

				public Boolean MIDDLE_NAMEIsNullable(){
				    return true;
				}
				public Boolean MIDDLE_NAMEIsKey(){
				    return false;
				}
				public Integer MIDDLE_NAMELength(){
				    return 50;
				}
				public Integer MIDDLE_NAMEPrecision(){
				    return null;
				}
				public String MIDDLE_NAMEDefault(){
				
					return null;
				
				}
				public String MIDDLE_NAMEComment(){
				
				    return "";
				
				}
				public String MIDDLE_NAMEPattern(){
				
					return "";
				
				}
				public String MIDDLE_NAMEOriginalDbColumnName(){
				
					return "MIDDLE_NAME";
				
				}

				
			    public String SUFFIX;

				public String getSUFFIX () {
					return this.SUFFIX;
				}

				public Boolean SUFFIXIsNullable(){
				    return true;
				}
				public Boolean SUFFIXIsKey(){
				    return false;
				}
				public Integer SUFFIXLength(){
				    return 50;
				}
				public Integer SUFFIXPrecision(){
				    return null;
				}
				public String SUFFIXDefault(){
				
					return null;
				
				}
				public String SUFFIXComment(){
				
				    return "";
				
				}
				public String SUFFIXPattern(){
				
					return "";
				
				}
				public String SUFFIXOriginalDbColumnName(){
				
					return "SUFFIX";
				
				}

				
			    public String NPI;

				public String getNPI () {
					return this.NPI;
				}

				public Boolean NPIIsNullable(){
				    return true;
				}
				public Boolean NPIIsKey(){
				    return false;
				}
				public Integer NPILength(){
				    return 10;
				}
				public Integer NPIPrecision(){
				    return null;
				}
				public String NPIDefault(){
				
					return null;
				
				}
				public String NPIComment(){
				
				    return "";
				
				}
				public String NPIPattern(){
				
					return "";
				
				}
				public String NPIOriginalDbColumnName(){
				
					return "NPI";
				
				}

				
			    public String CREDENTIALS;

				public String getCREDENTIALS () {
					return this.CREDENTIALS;
				}

				public Boolean CREDENTIALSIsNullable(){
				    return true;
				}
				public Boolean CREDENTIALSIsKey(){
				    return false;
				}
				public Integer CREDENTIALSLength(){
				    return 10;
				}
				public Integer CREDENTIALSPrecision(){
				    return null;
				}
				public String CREDENTIALSDefault(){
				
					return null;
				
				}
				public String CREDENTIALSComment(){
				
				    return "";
				
				}
				public String CREDENTIALSPattern(){
				
					return "";
				
				}
				public String CREDENTIALSOriginalDbColumnName(){
				
					return "CREDENTIALS";
				
				}

				
			    public String STND_CREDENTIALS;

				public String getSTND_CREDENTIALS () {
					return this.STND_CREDENTIALS;
				}

				public Boolean STND_CREDENTIALSIsNullable(){
				    return true;
				}
				public Boolean STND_CREDENTIALSIsKey(){
				    return false;
				}
				public Integer STND_CREDENTIALSLength(){
				    return 10;
				}
				public Integer STND_CREDENTIALSPrecision(){
				    return null;
				}
				public String STND_CREDENTIALSDefault(){
				
					return null;
				
				}
				public String STND_CREDENTIALSComment(){
				
				    return "";
				
				}
				public String STND_CREDENTIALSPattern(){
				
					return "";
				
				}
				public String STND_CREDENTIALSOriginalDbColumnName(){
				
					return "STND_CREDENTIALS";
				
				}

				
			    public String HCP_PHONE;

				public String getHCP_PHONE () {
					return this.HCP_PHONE;
				}

				public Boolean HCP_PHONEIsNullable(){
				    return true;
				}
				public Boolean HCP_PHONEIsKey(){
				    return false;
				}
				public Integer HCP_PHONELength(){
				    return 20;
				}
				public Integer HCP_PHONEPrecision(){
				    return null;
				}
				public String HCP_PHONEDefault(){
				
					return null;
				
				}
				public String HCP_PHONEComment(){
				
				    return "";
				
				}
				public String HCP_PHONEPattern(){
				
					return "";
				
				}
				public String HCP_PHONEOriginalDbColumnName(){
				
					return "HCP_PHONE";
				
				}

				
			    public String EMAIL;

				public String getEMAIL () {
					return this.EMAIL;
				}

				public Boolean EMAILIsNullable(){
				    return true;
				}
				public Boolean EMAILIsKey(){
				    return false;
				}
				public Integer EMAILLength(){
				    return 100;
				}
				public Integer EMAILPrecision(){
				    return null;
				}
				public String EMAILDefault(){
				
					return null;
				
				}
				public String EMAILComment(){
				
				    return "";
				
				}
				public String EMAILPattern(){
				
					return "";
				
				}
				public String EMAILOriginalDbColumnName(){
				
					return "EMAIL";
				
				}

				
			    public Double EMAIL_OPT_OUT;

				public Double getEMAIL_OPT_OUT () {
					return this.EMAIL_OPT_OUT;
				}

				public Boolean EMAIL_OPT_OUTIsNullable(){
				    return true;
				}
				public Boolean EMAIL_OPT_OUTIsKey(){
				    return false;
				}
				public Integer EMAIL_OPT_OUTLength(){
				    return null;
				}
				public Integer EMAIL_OPT_OUTPrecision(){
				    return null;
				}
				public String EMAIL_OPT_OUTDefault(){
				
					return null;
				
				}
				public String EMAIL_OPT_OUTComment(){
				
				    return "";
				
				}
				public String EMAIL_OPT_OUTPattern(){
				
					return "";
				
				}
				public String EMAIL_OPT_OUTOriginalDbColumnName(){
				
					return "EMAIL_OPT_OUT";
				
				}

				
			    public String OFFICE_HOURS;

				public String getOFFICE_HOURS () {
					return this.OFFICE_HOURS;
				}

				public Boolean OFFICE_HOURSIsNullable(){
				    return true;
				}
				public Boolean OFFICE_HOURSIsKey(){
				    return false;
				}
				public Integer OFFICE_HOURSLength(){
				    return 25;
				}
				public Integer OFFICE_HOURSPrecision(){
				    return null;
				}
				public String OFFICE_HOURSDefault(){
				
					return null;
				
				}
				public String OFFICE_HOURSComment(){
				
				    return "";
				
				}
				public String OFFICE_HOURSPattern(){
				
					return "";
				
				}
				public String OFFICE_HOURSOriginalDbColumnName(){
				
					return "OFFICE_HOURS";
				
				}

				
			    public String HCP_TYPE;

				public String getHCP_TYPE () {
					return this.HCP_TYPE;
				}

				public Boolean HCP_TYPEIsNullable(){
				    return true;
				}
				public Boolean HCP_TYPEIsKey(){
				    return false;
				}
				public Integer HCP_TYPELength(){
				    return 50;
				}
				public Integer HCP_TYPEPrecision(){
				    return null;
				}
				public String HCP_TYPEDefault(){
				
					return null;
				
				}
				public String HCP_TYPEComment(){
				
				    return "";
				
				}
				public String HCP_TYPEPattern(){
				
					return "";
				
				}
				public String HCP_TYPEOriginalDbColumnName(){
				
					return "HCP_TYPE";
				
				}

				
			    public String HCP_ROLE;

				public String getHCP_ROLE () {
					return this.HCP_ROLE;
				}

				public Boolean HCP_ROLEIsNullable(){
				    return true;
				}
				public Boolean HCP_ROLEIsKey(){
				    return false;
				}
				public Integer HCP_ROLELength(){
				    return 50;
				}
				public Integer HCP_ROLEPrecision(){
				    return null;
				}
				public String HCP_ROLEDefault(){
				
					return null;
				
				}
				public String HCP_ROLEComment(){
				
				    return "";
				
				}
				public String HCP_ROLEPattern(){
				
					return "";
				
				}
				public String HCP_ROLEOriginalDbColumnName(){
				
					return "HCP_ROLE";
				
				}

				
			    public String CART_AREA;

				public String getCART_AREA () {
					return this.CART_AREA;
				}

				public Boolean CART_AREAIsNullable(){
				    return true;
				}
				public Boolean CART_AREAIsKey(){
				    return false;
				}
				public Integer CART_AREALength(){
				    return 50;
				}
				public Integer CART_AREAPrecision(){
				    return null;
				}
				public String CART_AREADefault(){
				
					return null;
				
				}
				public String CART_AREAComment(){
				
				    return "";
				
				}
				public String CART_AREAPattern(){
				
					return "";
				
				}
				public String CART_AREAOriginalDbColumnName(){
				
					return "CART_AREA";
				
				}

				
			    public Boolean KOL_IND;

				public Boolean getKOL_IND () {
					return this.KOL_IND;
				}

				public Boolean KOL_INDIsNullable(){
				    return true;
				}
				public Boolean KOL_INDIsKey(){
				    return false;
				}
				public Integer KOL_INDLength(){
				    return null;
				}
				public Integer KOL_INDPrecision(){
				    return null;
				}
				public String KOL_INDDefault(){
				
					return null;
				
				}
				public String KOL_INDComment(){
				
				    return "";
				
				}
				public String KOL_INDPattern(){
				
					return "";
				
				}
				public String KOL_INDOriginalDbColumnName(){
				
					return "KOL_IND";
				
				}

				
			    public Boolean MM_TREATER_IND;

				public Boolean getMM_TREATER_IND () {
					return this.MM_TREATER_IND;
				}

				public Boolean MM_TREATER_INDIsNullable(){
				    return true;
				}
				public Boolean MM_TREATER_INDIsKey(){
				    return false;
				}
				public Integer MM_TREATER_INDLength(){
				    return null;
				}
				public Integer MM_TREATER_INDPrecision(){
				    return null;
				}
				public String MM_TREATER_INDDefault(){
				
					return null;
				
				}
				public String MM_TREATER_INDComment(){
				
				    return "";
				
				}
				public String MM_TREATER_INDPattern(){
				
					return "";
				
				}
				public String MM_TREATER_INDOriginalDbColumnName(){
				
					return "MM_TREATER_IND";
				
				}

				
			    public Boolean BMT_IND;

				public Boolean getBMT_IND () {
					return this.BMT_IND;
				}

				public Boolean BMT_INDIsNullable(){
				    return true;
				}
				public Boolean BMT_INDIsKey(){
				    return false;
				}
				public Integer BMT_INDLength(){
				    return null;
				}
				public Integer BMT_INDPrecision(){
				    return null;
				}
				public String BMT_INDDefault(){
				
					return null;
				
				}
				public String BMT_INDComment(){
				
				    return "";
				
				}
				public String BMT_INDPattern(){
				
					return "";
				
				}
				public String BMT_INDOriginalDbColumnName(){
				
					return "BMT_IND";
				
				}

				
			    public String CLINICAL_TRIAL_ROLE;

				public String getCLINICAL_TRIAL_ROLE () {
					return this.CLINICAL_TRIAL_ROLE;
				}

				public Boolean CLINICAL_TRIAL_ROLEIsNullable(){
				    return true;
				}
				public Boolean CLINICAL_TRIAL_ROLEIsKey(){
				    return false;
				}
				public Integer CLINICAL_TRIAL_ROLELength(){
				    return 100;
				}
				public Integer CLINICAL_TRIAL_ROLEPrecision(){
				    return null;
				}
				public String CLINICAL_TRIAL_ROLEDefault(){
				
					return null;
				
				}
				public String CLINICAL_TRIAL_ROLEComment(){
				
				    return "";
				
				}
				public String CLINICAL_TRIAL_ROLEPattern(){
				
					return "";
				
				}
				public String CLINICAL_TRIAL_ROLEOriginalDbColumnName(){
				
					return "CLINICAL_TRIAL_ROLE";
				
				}

				
			    public String PRIM_DISEASE_STATE;

				public String getPRIM_DISEASE_STATE () {
					return this.PRIM_DISEASE_STATE;
				}

				public Boolean PRIM_DISEASE_STATEIsNullable(){
				    return true;
				}
				public Boolean PRIM_DISEASE_STATEIsKey(){
				    return false;
				}
				public Integer PRIM_DISEASE_STATELength(){
				    return 50;
				}
				public Integer PRIM_DISEASE_STATEPrecision(){
				    return null;
				}
				public String PRIM_DISEASE_STATEDefault(){
				
					return null;
				
				}
				public String PRIM_DISEASE_STATEComment(){
				
				    return "";
				
				}
				public String PRIM_DISEASE_STATEPattern(){
				
					return "";
				
				}
				public String PRIM_DISEASE_STATEOriginalDbColumnName(){
				
					return "PRIM_DISEASE_STATE";
				
				}

				
			    public String SEC_DISEASE_STATE;

				public String getSEC_DISEASE_STATE () {
					return this.SEC_DISEASE_STATE;
				}

				public Boolean SEC_DISEASE_STATEIsNullable(){
				    return true;
				}
				public Boolean SEC_DISEASE_STATEIsKey(){
				    return false;
				}
				public Integer SEC_DISEASE_STATELength(){
				    return 50;
				}
				public Integer SEC_DISEASE_STATEPrecision(){
				    return null;
				}
				public String SEC_DISEASE_STATEDefault(){
				
					return null;
				
				}
				public String SEC_DISEASE_STATEComment(){
				
				    return "";
				
				}
				public String SEC_DISEASE_STATEPattern(){
				
					return "";
				
				}
				public String SEC_DISEASE_STATEOriginalDbColumnName(){
				
					return "SEC_DISEASE_STATE";
				
				}

				
			    public String TER_DISEASE_STATE;

				public String getTER_DISEASE_STATE () {
					return this.TER_DISEASE_STATE;
				}

				public Boolean TER_DISEASE_STATEIsNullable(){
				    return true;
				}
				public Boolean TER_DISEASE_STATEIsKey(){
				    return false;
				}
				public Integer TER_DISEASE_STATELength(){
				    return 50;
				}
				public Integer TER_DISEASE_STATEPrecision(){
				    return null;
				}
				public String TER_DISEASE_STATEDefault(){
				
					return null;
				
				}
				public String TER_DISEASE_STATEComment(){
				
				    return "";
				
				}
				public String TER_DISEASE_STATEPattern(){
				
					return "";
				
				}
				public String TER_DISEASE_STATEOriginalDbColumnName(){
				
					return "TER_DISEASE_STATE";
				
				}

				
			    public String SPHERE_OF_INFLUENCE;

				public String getSPHERE_OF_INFLUENCE () {
					return this.SPHERE_OF_INFLUENCE;
				}

				public Boolean SPHERE_OF_INFLUENCEIsNullable(){
				    return true;
				}
				public Boolean SPHERE_OF_INFLUENCEIsKey(){
				    return false;
				}
				public Integer SPHERE_OF_INFLUENCELength(){
				    return 200;
				}
				public Integer SPHERE_OF_INFLUENCEPrecision(){
				    return null;
				}
				public String SPHERE_OF_INFLUENCEDefault(){
				
					return null;
				
				}
				public String SPHERE_OF_INFLUENCEComment(){
				
				    return "";
				
				}
				public String SPHERE_OF_INFLUENCEPattern(){
				
					return "";
				
				}
				public String SPHERE_OF_INFLUENCEOriginalDbColumnName(){
				
					return "SPHERE_OF_INFLUENCE";
				
				}

				
			    public String INDICATORS;

				public String getINDICATORS () {
					return this.INDICATORS;
				}

				public Boolean INDICATORSIsNullable(){
				    return true;
				}
				public Boolean INDICATORSIsKey(){
				    return false;
				}
				public Integer INDICATORSLength(){
				    return 25;
				}
				public Integer INDICATORSPrecision(){
				    return null;
				}
				public String INDICATORSDefault(){
				
					return null;
				
				}
				public String INDICATORSComment(){
				
				    return "";
				
				}
				public String INDICATORSPattern(){
				
					return "";
				
				}
				public String INDICATORSOriginalDbColumnName(){
				
					return "INDICATORS";
				
				}

				
			    public Double AWARENESS;

				public Double getAWARENESS () {
					return this.AWARENESS;
				}

				public Boolean AWARENESSIsNullable(){
				    return true;
				}
				public Boolean AWARENESSIsKey(){
				    return false;
				}
				public Integer AWARENESSLength(){
				    return null;
				}
				public Integer AWARENESSPrecision(){
				    return null;
				}
				public String AWARENESSDefault(){
				
					return null;
				
				}
				public String AWARENESSComment(){
				
				    return "";
				
				}
				public String AWARENESSPattern(){
				
					return "";
				
				}
				public String AWARENESSOriginalDbColumnName(){
				
					return "AWARENESS";
				
				}

				
			    public Double ACCESS;

				public Double getACCESS () {
					return this.ACCESS;
				}

				public Boolean ACCESSIsNullable(){
				    return true;
				}
				public Boolean ACCESSIsKey(){
				    return false;
				}
				public Integer ACCESSLength(){
				    return null;
				}
				public Integer ACCESSPrecision(){
				    return null;
				}
				public String ACCESSDefault(){
				
					return null;
				
				}
				public String ACCESSComment(){
				
				    return "";
				
				}
				public String ACCESSPattern(){
				
					return "";
				
				}
				public String ACCESSOriginalDbColumnName(){
				
					return "ACCESS";
				
				}

				
			    public Double UNDERSTAND_UNMET_NEED;

				public Double getUNDERSTAND_UNMET_NEED () {
					return this.UNDERSTAND_UNMET_NEED;
				}

				public Boolean UNDERSTAND_UNMET_NEEDIsNullable(){
				    return true;
				}
				public Boolean UNDERSTAND_UNMET_NEEDIsKey(){
				    return false;
				}
				public Integer UNDERSTAND_UNMET_NEEDLength(){
				    return null;
				}
				public Integer UNDERSTAND_UNMET_NEEDPrecision(){
				    return null;
				}
				public String UNDERSTAND_UNMET_NEEDDefault(){
				
					return null;
				
				}
				public String UNDERSTAND_UNMET_NEEDComment(){
				
				    return "";
				
				}
				public String UNDERSTAND_UNMET_NEEDPattern(){
				
					return "";
				
				}
				public String UNDERSTAND_UNMET_NEEDOriginalDbColumnName(){
				
					return "UNDERSTAND_UNMET_NEED";
				
				}

				
			    public Double TC_KNOWLEDGE;

				public Double getTC_KNOWLEDGE () {
					return this.TC_KNOWLEDGE;
				}

				public Boolean TC_KNOWLEDGEIsNullable(){
				    return true;
				}
				public Boolean TC_KNOWLEDGEIsKey(){
				    return false;
				}
				public Integer TC_KNOWLEDGELength(){
				    return null;
				}
				public Integer TC_KNOWLEDGEPrecision(){
				    return null;
				}
				public String TC_KNOWLEDGEDefault(){
				
					return null;
				
				}
				public String TC_KNOWLEDGEComment(){
				
				    return "";
				
				}
				public String TC_KNOWLEDGEPattern(){
				
					return "";
				
				}
				public String TC_KNOWLEDGEOriginalDbColumnName(){
				
					return "TC_KNOWLEDGE";
				
				}

				
			    public String HCP_CREATED_BY;

				public String getHCP_CREATED_BY () {
					return this.HCP_CREATED_BY;
				}

				public Boolean HCP_CREATED_BYIsNullable(){
				    return true;
				}
				public Boolean HCP_CREATED_BYIsKey(){
				    return false;
				}
				public Integer HCP_CREATED_BYLength(){
				    return 100;
				}
				public Integer HCP_CREATED_BYPrecision(){
				    return null;
				}
				public String HCP_CREATED_BYDefault(){
				
					return null;
				
				}
				public String HCP_CREATED_BYComment(){
				
				    return "";
				
				}
				public String HCP_CREATED_BYPattern(){
				
					return "";
				
				}
				public String HCP_CREATED_BYOriginalDbColumnName(){
				
					return "HCP_CREATED_BY";
				
				}

				
			    public java.util.Date DATA_THROUGH_DATE;

				public java.util.Date getDATA_THROUGH_DATE () {
					return this.DATA_THROUGH_DATE;
				}

				public Boolean DATA_THROUGH_DATEIsNullable(){
				    return true;
				}
				public Boolean DATA_THROUGH_DATEIsKey(){
				    return false;
				}
				public Integer DATA_THROUGH_DATELength(){
				    return null;
				}
				public Integer DATA_THROUGH_DATEPrecision(){
				    return null;
				}
				public String DATA_THROUGH_DATEDefault(){
				
					return null;
				
				}
				public String DATA_THROUGH_DATEComment(){
				
				    return "";
				
				}
				public String DATA_THROUGH_DATEPattern(){
				
					return "yyyy-MM-dd";
				
				}
				public String DATA_THROUGH_DATEOriginalDbColumnName(){
				
					return "DATA_THROUGH_DATE";
				
				}

				


	@Override
	public int hashCode() {
		if (this.hashCodeDirty) {
			final int prime = PRIME;
			int result = DEFAULT_HASHCODE;
	
						result = prime * result + ((this.HCP_LEGEND_ID == null) ? 0 : this.HCP_LEGEND_ID.hashCode());
					
						result = prime * result + ((this.HCP_STATUS == null) ? 0 : this.HCP_STATUS.hashCode());
					
						result = prime * result + ((this.HCP_CREATED_DT == null) ? 0 : this.HCP_CREATED_DT.hashCode());
					
    		this.hashCode = result;
    		this.hashCodeDirty = false;
		}
		return this.hashCode;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) return true;
		if (obj == null) return false;
		if (getClass() != obj.getClass()) return false;
		final after_tDBInput_1Struct other = (after_tDBInput_1Struct) obj;
		
						if (this.HCP_LEGEND_ID == null) {
							if (other.HCP_LEGEND_ID != null)
								return false;
						
						} else if (!this.HCP_LEGEND_ID.equals(other.HCP_LEGEND_ID))
						
							return false;
					
						if (this.HCP_STATUS == null) {
							if (other.HCP_STATUS != null)
								return false;
						
						} else if (!this.HCP_STATUS.equals(other.HCP_STATUS))
						
							return false;
					
						if (this.HCP_CREATED_DT == null) {
							if (other.HCP_CREATED_DT != null)
								return false;
						
						} else if (!this.HCP_CREATED_DT.equals(other.HCP_CREATED_DT))
						
							return false;
					

		return true;
    }

	public void copyDataTo(after_tDBInput_1Struct other) {

		other.HCP_LEGEND_ID = this.HCP_LEGEND_ID;
	            other.HCP_STATUS = this.HCP_STATUS;
	            other.HCP_CREATED_DT = this.HCP_CREATED_DT;
	            other.HCP_INACTIVE_DT = this.HCP_INACTIVE_DT;
	            other.LAST_NAME = this.LAST_NAME;
	            other.FIRST_NAME = this.FIRST_NAME;
	            other.MIDDLE_NAME = this.MIDDLE_NAME;
	            other.SUFFIX = this.SUFFIX;
	            other.NPI = this.NPI;
	            other.CREDENTIALS = this.CREDENTIALS;
	            other.STND_CREDENTIALS = this.STND_CREDENTIALS;
	            other.HCP_PHONE = this.HCP_PHONE;
	            other.EMAIL = this.EMAIL;
	            other.EMAIL_OPT_OUT = this.EMAIL_OPT_OUT;
	            other.OFFICE_HOURS = this.OFFICE_HOURS;
	            other.HCP_TYPE = this.HCP_TYPE;
	            other.HCP_ROLE = this.HCP_ROLE;
	            other.CART_AREA = this.CART_AREA;
	            other.KOL_IND = this.KOL_IND;
	            other.MM_TREATER_IND = this.MM_TREATER_IND;
	            other.BMT_IND = this.BMT_IND;
	            other.CLINICAL_TRIAL_ROLE = this.CLINICAL_TRIAL_ROLE;
	            other.PRIM_DISEASE_STATE = this.PRIM_DISEASE_STATE;
	            other.SEC_DISEASE_STATE = this.SEC_DISEASE_STATE;
	            other.TER_DISEASE_STATE = this.TER_DISEASE_STATE;
	            other.SPHERE_OF_INFLUENCE = this.SPHERE_OF_INFLUENCE;
	            other.INDICATORS = this.INDICATORS;
	            other.AWARENESS = this.AWARENESS;
	            other.ACCESS = this.ACCESS;
	            other.UNDERSTAND_UNMET_NEED = this.UNDERSTAND_UNMET_NEED;
	            other.TC_KNOWLEDGE = this.TC_KNOWLEDGE;
	            other.HCP_CREATED_BY = this.HCP_CREATED_BY;
	            other.DATA_THROUGH_DATE = this.DATA_THROUGH_DATE;
	            
	}

	public void copyKeysDataTo(after_tDBInput_1Struct other) {

		other.HCP_LEGEND_ID = this.HCP_LEGEND_ID;
	            	other.HCP_STATUS = this.HCP_STATUS;
	            	other.HCP_CREATED_DT = this.HCP_CREATED_DT;
	            	
	}




	private String readString(ObjectInputStream dis) throws IOException{
		String strReturn = null;
		int length = 0;
        length = dis.readInt();
		if (length == -1) {
			strReturn = null;
		} else {
			if(length > commonByteArray_USCOMM_SUNSHINE_RPT_QA_BEACON_EXTRACT_SNOWFLAKE.length) {
				if(length < 1024 && commonByteArray_USCOMM_SUNSHINE_RPT_QA_BEACON_EXTRACT_SNOWFLAKE.length == 0) {
   					commonByteArray_USCOMM_SUNSHINE_RPT_QA_BEACON_EXTRACT_SNOWFLAKE = new byte[1024];
				} else {
   					commonByteArray_USCOMM_SUNSHINE_RPT_QA_BEACON_EXTRACT_SNOWFLAKE = new byte[2 * length];
   				}
			}
			dis.readFully(commonByteArray_USCOMM_SUNSHINE_RPT_QA_BEACON_EXTRACT_SNOWFLAKE, 0, length);
			strReturn = new String(commonByteArray_USCOMM_SUNSHINE_RPT_QA_BEACON_EXTRACT_SNOWFLAKE, 0, length, utf8Charset);
		}
		return strReturn;
	}
	
	private String readString(org.jboss.marshalling.Unmarshaller unmarshaller) throws IOException{
		String strReturn = null;
		int length = 0;
        length = unmarshaller.readInt();
		if (length == -1) {
			strReturn = null;
		} else {
			if(length > commonByteArray_USCOMM_SUNSHINE_RPT_QA_BEACON_EXTRACT_SNOWFLAKE.length) {
				if(length < 1024 && commonByteArray_USCOMM_SUNSHINE_RPT_QA_BEACON_EXTRACT_SNOWFLAKE.length == 0) {
   					commonByteArray_USCOMM_SUNSHINE_RPT_QA_BEACON_EXTRACT_SNOWFLAKE = new byte[1024];
				} else {
   					commonByteArray_USCOMM_SUNSHINE_RPT_QA_BEACON_EXTRACT_SNOWFLAKE = new byte[2 * length];
   				}
			}
			unmarshaller.readFully(commonByteArray_USCOMM_SUNSHINE_RPT_QA_BEACON_EXTRACT_SNOWFLAKE, 0, length);
			strReturn = new String(commonByteArray_USCOMM_SUNSHINE_RPT_QA_BEACON_EXTRACT_SNOWFLAKE, 0, length, utf8Charset);
		}
		return strReturn;
	}

    private void writeString(String str, ObjectOutputStream dos) throws IOException{
		if(str == null) {
            dos.writeInt(-1);
		} else {
            byte[] byteArray = str.getBytes(utf8Charset);
	    	dos.writeInt(byteArray.length);
			dos.write(byteArray);
    	}
    }
    
    private void writeString(String str, org.jboss.marshalling.Marshaller marshaller) throws IOException{
		if(str == null) {
			marshaller.writeInt(-1);
		} else {
            byte[] byteArray = str.getBytes(utf8Charset);
            marshaller.writeInt(byteArray.length);
            marshaller.write(byteArray);
    	}
    }

	private java.util.Date readDate(ObjectInputStream dis) throws IOException{
		java.util.Date dateReturn = null;
        int length = 0;
        length = dis.readByte();
		if (length == -1) {
			dateReturn = null;
		} else {
	    	dateReturn = new Date(dis.readLong());
		}
		return dateReturn;
	}
	
	private java.util.Date readDate(org.jboss.marshalling.Unmarshaller unmarshaller) throws IOException{
		java.util.Date dateReturn = null;
        int length = 0;
        length = unmarshaller.readByte();
		if (length == -1) {
			dateReturn = null;
		} else {
	    	dateReturn = new Date(unmarshaller.readLong());
		}
		return dateReturn;
	}

    private void writeDate(java.util.Date date1, ObjectOutputStream dos) throws IOException{
		if(date1 == null) {
            dos.writeByte(-1);
		} else {
			dos.writeByte(0);
	    	dos.writeLong(date1.getTime());
    	}
    }
    
    private void writeDate(java.util.Date date1, org.jboss.marshalling.Marshaller marshaller) throws IOException{
		if(date1 == null) {
			marshaller.writeByte(-1);
		} else {
			marshaller.writeByte(0);
			marshaller.writeLong(date1.getTime());
    	}
    }

    public void readData(ObjectInputStream dis) {

		synchronized(commonByteArrayLock_USCOMM_SUNSHINE_RPT_QA_BEACON_EXTRACT_SNOWFLAKE) {

        	try {

        		int length = 0;
		
					this.HCP_LEGEND_ID = readString(dis);
					
					this.HCP_STATUS = readString(dis);
					
					this.HCP_CREATED_DT = readDate(dis);
					
					this.HCP_INACTIVE_DT = readDate(dis);
					
					this.LAST_NAME = readString(dis);
					
					this.FIRST_NAME = readString(dis);
					
					this.MIDDLE_NAME = readString(dis);
					
					this.SUFFIX = readString(dis);
					
					this.NPI = readString(dis);
					
					this.CREDENTIALS = readString(dis);
					
					this.STND_CREDENTIALS = readString(dis);
					
					this.HCP_PHONE = readString(dis);
					
					this.EMAIL = readString(dis);
					
			            length = dis.readByte();
           				if (length == -1) {
           	    			this.EMAIL_OPT_OUT = null;
           				} else {
           			    	this.EMAIL_OPT_OUT = dis.readDouble();
           				}
					
					this.OFFICE_HOURS = readString(dis);
					
					this.HCP_TYPE = readString(dis);
					
					this.HCP_ROLE = readString(dis);
					
					this.CART_AREA = readString(dis);
					
			            length = dis.readByte();
           				if (length == -1) {
           	    			this.KOL_IND = null;
           				} else {
           			    	this.KOL_IND = dis.readBoolean();
           				}
					
			            length = dis.readByte();
           				if (length == -1) {
           	    			this.MM_TREATER_IND = null;
           				} else {
           			    	this.MM_TREATER_IND = dis.readBoolean();
           				}
					
			            length = dis.readByte();
           				if (length == -1) {
           	    			this.BMT_IND = null;
           				} else {
           			    	this.BMT_IND = dis.readBoolean();
           				}
					
					this.CLINICAL_TRIAL_ROLE = readString(dis);
					
					this.PRIM_DISEASE_STATE = readString(dis);
					
					this.SEC_DISEASE_STATE = readString(dis);
					
					this.TER_DISEASE_STATE = readString(dis);
					
					this.SPHERE_OF_INFLUENCE = readString(dis);
					
					this.INDICATORS = readString(dis);
					
			            length = dis.readByte();
           				if (length == -1) {
           	    			this.AWARENESS = null;
           				} else {
           			    	this.AWARENESS = dis.readDouble();
           				}
					
			            length = dis.readByte();
           				if (length == -1) {
           	    			this.ACCESS = null;
           				} else {
           			    	this.ACCESS = dis.readDouble();
           				}
					
			            length = dis.readByte();
           				if (length == -1) {
           	    			this.UNDERSTAND_UNMET_NEED = null;
           				} else {
           			    	this.UNDERSTAND_UNMET_NEED = dis.readDouble();
           				}
					
			            length = dis.readByte();
           				if (length == -1) {
           	    			this.TC_KNOWLEDGE = null;
           				} else {
           			    	this.TC_KNOWLEDGE = dis.readDouble();
           				}
					
					this.HCP_CREATED_BY = readString(dis);
					
					this.DATA_THROUGH_DATE = readDate(dis);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);

		

        }

		

      }


    }
    
    public void readData(org.jboss.marshalling.Unmarshaller dis) {

		synchronized(commonByteArrayLock_USCOMM_SUNSHINE_RPT_QA_BEACON_EXTRACT_SNOWFLAKE) {

        	try {

        		int length = 0;
		
					this.HCP_LEGEND_ID = readString(dis);
					
					this.HCP_STATUS = readString(dis);
					
					this.HCP_CREATED_DT = readDate(dis);
					
					this.HCP_INACTIVE_DT = readDate(dis);
					
					this.LAST_NAME = readString(dis);
					
					this.FIRST_NAME = readString(dis);
					
					this.MIDDLE_NAME = readString(dis);
					
					this.SUFFIX = readString(dis);
					
					this.NPI = readString(dis);
					
					this.CREDENTIALS = readString(dis);
					
					this.STND_CREDENTIALS = readString(dis);
					
					this.HCP_PHONE = readString(dis);
					
					this.EMAIL = readString(dis);
					
			            length = dis.readByte();
           				if (length == -1) {
           	    			this.EMAIL_OPT_OUT = null;
           				} else {
           			    	this.EMAIL_OPT_OUT = dis.readDouble();
           				}
					
					this.OFFICE_HOURS = readString(dis);
					
					this.HCP_TYPE = readString(dis);
					
					this.HCP_ROLE = readString(dis);
					
					this.CART_AREA = readString(dis);
					
			            length = dis.readByte();
           				if (length == -1) {
           	    			this.KOL_IND = null;
           				} else {
           			    	this.KOL_IND = dis.readBoolean();
           				}
					
			            length = dis.readByte();
           				if (length == -1) {
           	    			this.MM_TREATER_IND = null;
           				} else {
           			    	this.MM_TREATER_IND = dis.readBoolean();
           				}
					
			            length = dis.readByte();
           				if (length == -1) {
           	    			this.BMT_IND = null;
           				} else {
           			    	this.BMT_IND = dis.readBoolean();
           				}
					
					this.CLINICAL_TRIAL_ROLE = readString(dis);
					
					this.PRIM_DISEASE_STATE = readString(dis);
					
					this.SEC_DISEASE_STATE = readString(dis);
					
					this.TER_DISEASE_STATE = readString(dis);
					
					this.SPHERE_OF_INFLUENCE = readString(dis);
					
					this.INDICATORS = readString(dis);
					
			            length = dis.readByte();
           				if (length == -1) {
           	    			this.AWARENESS = null;
           				} else {
           			    	this.AWARENESS = dis.readDouble();
           				}
					
			            length = dis.readByte();
           				if (length == -1) {
           	    			this.ACCESS = null;
           				} else {
           			    	this.ACCESS = dis.readDouble();
           				}
					
			            length = dis.readByte();
           				if (length == -1) {
           	    			this.UNDERSTAND_UNMET_NEED = null;
           				} else {
           			    	this.UNDERSTAND_UNMET_NEED = dis.readDouble();
           				}
					
			            length = dis.readByte();
           				if (length == -1) {
           	    			this.TC_KNOWLEDGE = null;
           				} else {
           			    	this.TC_KNOWLEDGE = dis.readDouble();
           				}
					
					this.HCP_CREATED_BY = readString(dis);
					
					this.DATA_THROUGH_DATE = readDate(dis);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);

		

        }

		

      }


    }

    public void writeData(ObjectOutputStream dos) {
        try {

		
					// String
				
						writeString(this.HCP_LEGEND_ID,dos);
					
					// String
				
						writeString(this.HCP_STATUS,dos);
					
					// java.util.Date
				
						writeDate(this.HCP_CREATED_DT,dos);
					
					// java.util.Date
				
						writeDate(this.HCP_INACTIVE_DT,dos);
					
					// String
				
						writeString(this.LAST_NAME,dos);
					
					// String
				
						writeString(this.FIRST_NAME,dos);
					
					// String
				
						writeString(this.MIDDLE_NAME,dos);
					
					// String
				
						writeString(this.SUFFIX,dos);
					
					// String
				
						writeString(this.NPI,dos);
					
					// String
				
						writeString(this.CREDENTIALS,dos);
					
					// String
				
						writeString(this.STND_CREDENTIALS,dos);
					
					// String
				
						writeString(this.HCP_PHONE,dos);
					
					// String
				
						writeString(this.EMAIL,dos);
					
					// Double
				
						if(this.EMAIL_OPT_OUT == null) {
			                dos.writeByte(-1);
						} else {
               				dos.writeByte(0);
           			    	dos.writeDouble(this.EMAIL_OPT_OUT);
		            	}
					
					// String
				
						writeString(this.OFFICE_HOURS,dos);
					
					// String
				
						writeString(this.HCP_TYPE,dos);
					
					// String
				
						writeString(this.HCP_ROLE,dos);
					
					// String
				
						writeString(this.CART_AREA,dos);
					
					// Boolean
				
						if(this.KOL_IND == null) {
			                dos.writeByte(-1);
						} else {
               				dos.writeByte(0);
           			    	dos.writeBoolean(this.KOL_IND);
		            	}
					
					// Boolean
				
						if(this.MM_TREATER_IND == null) {
			                dos.writeByte(-1);
						} else {
               				dos.writeByte(0);
           			    	dos.writeBoolean(this.MM_TREATER_IND);
		            	}
					
					// Boolean
				
						if(this.BMT_IND == null) {
			                dos.writeByte(-1);
						} else {
               				dos.writeByte(0);
           			    	dos.writeBoolean(this.BMT_IND);
		            	}
					
					// String
				
						writeString(this.CLINICAL_TRIAL_ROLE,dos);
					
					// String
				
						writeString(this.PRIM_DISEASE_STATE,dos);
					
					// String
				
						writeString(this.SEC_DISEASE_STATE,dos);
					
					// String
				
						writeString(this.TER_DISEASE_STATE,dos);
					
					// String
				
						writeString(this.SPHERE_OF_INFLUENCE,dos);
					
					// String
				
						writeString(this.INDICATORS,dos);
					
					// Double
				
						if(this.AWARENESS == null) {
			                dos.writeByte(-1);
						} else {
               				dos.writeByte(0);
           			    	dos.writeDouble(this.AWARENESS);
		            	}
					
					// Double
				
						if(this.ACCESS == null) {
			                dos.writeByte(-1);
						} else {
               				dos.writeByte(0);
           			    	dos.writeDouble(this.ACCESS);
		            	}
					
					// Double
				
						if(this.UNDERSTAND_UNMET_NEED == null) {
			                dos.writeByte(-1);
						} else {
               				dos.writeByte(0);
           			    	dos.writeDouble(this.UNDERSTAND_UNMET_NEED);
		            	}
					
					// Double
				
						if(this.TC_KNOWLEDGE == null) {
			                dos.writeByte(-1);
						} else {
               				dos.writeByte(0);
           			    	dos.writeDouble(this.TC_KNOWLEDGE);
		            	}
					
					// String
				
						writeString(this.HCP_CREATED_BY,dos);
					
					// java.util.Date
				
						writeDate(this.DATA_THROUGH_DATE,dos);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);
        }


    }
    
    public void writeData(org.jboss.marshalling.Marshaller dos) {
        try {

		
					// String
				
						writeString(this.HCP_LEGEND_ID,dos);
					
					// String
				
						writeString(this.HCP_STATUS,dos);
					
					// java.util.Date
				
						writeDate(this.HCP_CREATED_DT,dos);
					
					// java.util.Date
				
						writeDate(this.HCP_INACTIVE_DT,dos);
					
					// String
				
						writeString(this.LAST_NAME,dos);
					
					// String
				
						writeString(this.FIRST_NAME,dos);
					
					// String
				
						writeString(this.MIDDLE_NAME,dos);
					
					// String
				
						writeString(this.SUFFIX,dos);
					
					// String
				
						writeString(this.NPI,dos);
					
					// String
				
						writeString(this.CREDENTIALS,dos);
					
					// String
				
						writeString(this.STND_CREDENTIALS,dos);
					
					// String
				
						writeString(this.HCP_PHONE,dos);
					
					// String
				
						writeString(this.EMAIL,dos);
					
					// Double
				
						if(this.EMAIL_OPT_OUT == null) {
			                dos.writeByte(-1);
						} else {
               				dos.writeByte(0);
           			    	dos.writeDouble(this.EMAIL_OPT_OUT);
		            	}
					
					// String
				
						writeString(this.OFFICE_HOURS,dos);
					
					// String
				
						writeString(this.HCP_TYPE,dos);
					
					// String
				
						writeString(this.HCP_ROLE,dos);
					
					// String
				
						writeString(this.CART_AREA,dos);
					
					// Boolean
				
						if(this.KOL_IND == null) {
			                dos.writeByte(-1);
						} else {
               				dos.writeByte(0);
           			    	dos.writeBoolean(this.KOL_IND);
		            	}
					
					// Boolean
				
						if(this.MM_TREATER_IND == null) {
			                dos.writeByte(-1);
						} else {
               				dos.writeByte(0);
           			    	dos.writeBoolean(this.MM_TREATER_IND);
		            	}
					
					// Boolean
				
						if(this.BMT_IND == null) {
			                dos.writeByte(-1);
						} else {
               				dos.writeByte(0);
           			    	dos.writeBoolean(this.BMT_IND);
		            	}
					
					// String
				
						writeString(this.CLINICAL_TRIAL_ROLE,dos);
					
					// String
				
						writeString(this.PRIM_DISEASE_STATE,dos);
					
					// String
				
						writeString(this.SEC_DISEASE_STATE,dos);
					
					// String
				
						writeString(this.TER_DISEASE_STATE,dos);
					
					// String
				
						writeString(this.SPHERE_OF_INFLUENCE,dos);
					
					// String
				
						writeString(this.INDICATORS,dos);
					
					// Double
				
						if(this.AWARENESS == null) {
			                dos.writeByte(-1);
						} else {
               				dos.writeByte(0);
           			    	dos.writeDouble(this.AWARENESS);
		            	}
					
					// Double
				
						if(this.ACCESS == null) {
			                dos.writeByte(-1);
						} else {
               				dos.writeByte(0);
           			    	dos.writeDouble(this.ACCESS);
		            	}
					
					// Double
				
						if(this.UNDERSTAND_UNMET_NEED == null) {
			                dos.writeByte(-1);
						} else {
               				dos.writeByte(0);
           			    	dos.writeDouble(this.UNDERSTAND_UNMET_NEED);
		            	}
					
					// Double
				
						if(this.TC_KNOWLEDGE == null) {
			                dos.writeByte(-1);
						} else {
               				dos.writeByte(0);
           			    	dos.writeDouble(this.TC_KNOWLEDGE);
		            	}
					
					// String
				
						writeString(this.HCP_CREATED_BY,dos);
					
					// java.util.Date
				
						writeDate(this.DATA_THROUGH_DATE,dos);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);
        }


    }


    public String toString() {

		StringBuilder sb = new StringBuilder();
		sb.append(super.toString());
		sb.append("[");
		sb.append("HCP_LEGEND_ID="+HCP_LEGEND_ID);
		sb.append(",HCP_STATUS="+HCP_STATUS);
		sb.append(",HCP_CREATED_DT="+String.valueOf(HCP_CREATED_DT));
		sb.append(",HCP_INACTIVE_DT="+String.valueOf(HCP_INACTIVE_DT));
		sb.append(",LAST_NAME="+LAST_NAME);
		sb.append(",FIRST_NAME="+FIRST_NAME);
		sb.append(",MIDDLE_NAME="+MIDDLE_NAME);
		sb.append(",SUFFIX="+SUFFIX);
		sb.append(",NPI="+NPI);
		sb.append(",CREDENTIALS="+CREDENTIALS);
		sb.append(",STND_CREDENTIALS="+STND_CREDENTIALS);
		sb.append(",HCP_PHONE="+HCP_PHONE);
		sb.append(",EMAIL="+EMAIL);
		sb.append(",EMAIL_OPT_OUT="+String.valueOf(EMAIL_OPT_OUT));
		sb.append(",OFFICE_HOURS="+OFFICE_HOURS);
		sb.append(",HCP_TYPE="+HCP_TYPE);
		sb.append(",HCP_ROLE="+HCP_ROLE);
		sb.append(",CART_AREA="+CART_AREA);
		sb.append(",KOL_IND="+String.valueOf(KOL_IND));
		sb.append(",MM_TREATER_IND="+String.valueOf(MM_TREATER_IND));
		sb.append(",BMT_IND="+String.valueOf(BMT_IND));
		sb.append(",CLINICAL_TRIAL_ROLE="+CLINICAL_TRIAL_ROLE);
		sb.append(",PRIM_DISEASE_STATE="+PRIM_DISEASE_STATE);
		sb.append(",SEC_DISEASE_STATE="+SEC_DISEASE_STATE);
		sb.append(",TER_DISEASE_STATE="+TER_DISEASE_STATE);
		sb.append(",SPHERE_OF_INFLUENCE="+SPHERE_OF_INFLUENCE);
		sb.append(",INDICATORS="+INDICATORS);
		sb.append(",AWARENESS="+String.valueOf(AWARENESS));
		sb.append(",ACCESS="+String.valueOf(ACCESS));
		sb.append(",UNDERSTAND_UNMET_NEED="+String.valueOf(UNDERSTAND_UNMET_NEED));
		sb.append(",TC_KNOWLEDGE="+String.valueOf(TC_KNOWLEDGE));
		sb.append(",HCP_CREATED_BY="+HCP_CREATED_BY);
		sb.append(",DATA_THROUGH_DATE="+String.valueOf(DATA_THROUGH_DATE));
	    sb.append("]");

	    return sb.toString();
    }
        public String toLogString(){
        	StringBuilder sb = new StringBuilder();
        	
        				if(HCP_LEGEND_ID == null){
        					sb.append("<null>");
        				}else{
            				sb.append(HCP_LEGEND_ID);
            			}
            		
        			sb.append("|");
        		
        				if(HCP_STATUS == null){
        					sb.append("<null>");
        				}else{
            				sb.append(HCP_STATUS);
            			}
            		
        			sb.append("|");
        		
        				if(HCP_CREATED_DT == null){
        					sb.append("<null>");
        				}else{
            				sb.append(HCP_CREATED_DT);
            			}
            		
        			sb.append("|");
        		
        				if(HCP_INACTIVE_DT == null){
        					sb.append("<null>");
        				}else{
            				sb.append(HCP_INACTIVE_DT);
            			}
            		
        			sb.append("|");
        		
        				if(LAST_NAME == null){
        					sb.append("<null>");
        				}else{
            				sb.append(LAST_NAME);
            			}
            		
        			sb.append("|");
        		
        				if(FIRST_NAME == null){
        					sb.append("<null>");
        				}else{
            				sb.append(FIRST_NAME);
            			}
            		
        			sb.append("|");
        		
        				if(MIDDLE_NAME == null){
        					sb.append("<null>");
        				}else{
            				sb.append(MIDDLE_NAME);
            			}
            		
        			sb.append("|");
        		
        				if(SUFFIX == null){
        					sb.append("<null>");
        				}else{
            				sb.append(SUFFIX);
            			}
            		
        			sb.append("|");
        		
        				if(NPI == null){
        					sb.append("<null>");
        				}else{
            				sb.append(NPI);
            			}
            		
        			sb.append("|");
        		
        				if(CREDENTIALS == null){
        					sb.append("<null>");
        				}else{
            				sb.append(CREDENTIALS);
            			}
            		
        			sb.append("|");
        		
        				if(STND_CREDENTIALS == null){
        					sb.append("<null>");
        				}else{
            				sb.append(STND_CREDENTIALS);
            			}
            		
        			sb.append("|");
        		
        				if(HCP_PHONE == null){
        					sb.append("<null>");
        				}else{
            				sb.append(HCP_PHONE);
            			}
            		
        			sb.append("|");
        		
        				if(EMAIL == null){
        					sb.append("<null>");
        				}else{
            				sb.append(EMAIL);
            			}
            		
        			sb.append("|");
        		
        				if(EMAIL_OPT_OUT == null){
        					sb.append("<null>");
        				}else{
            				sb.append(EMAIL_OPT_OUT);
            			}
            		
        			sb.append("|");
        		
        				if(OFFICE_HOURS == null){
        					sb.append("<null>");
        				}else{
            				sb.append(OFFICE_HOURS);
            			}
            		
        			sb.append("|");
        		
        				if(HCP_TYPE == null){
        					sb.append("<null>");
        				}else{
            				sb.append(HCP_TYPE);
            			}
            		
        			sb.append("|");
        		
        				if(HCP_ROLE == null){
        					sb.append("<null>");
        				}else{
            				sb.append(HCP_ROLE);
            			}
            		
        			sb.append("|");
        		
        				if(CART_AREA == null){
        					sb.append("<null>");
        				}else{
            				sb.append(CART_AREA);
            			}
            		
        			sb.append("|");
        		
        				if(KOL_IND == null){
        					sb.append("<null>");
        				}else{
            				sb.append(KOL_IND);
            			}
            		
        			sb.append("|");
        		
        				if(MM_TREATER_IND == null){
        					sb.append("<null>");
        				}else{
            				sb.append(MM_TREATER_IND);
            			}
            		
        			sb.append("|");
        		
        				if(BMT_IND == null){
        					sb.append("<null>");
        				}else{
            				sb.append(BMT_IND);
            			}
            		
        			sb.append("|");
        		
        				if(CLINICAL_TRIAL_ROLE == null){
        					sb.append("<null>");
        				}else{
            				sb.append(CLINICAL_TRIAL_ROLE);
            			}
            		
        			sb.append("|");
        		
        				if(PRIM_DISEASE_STATE == null){
        					sb.append("<null>");
        				}else{
            				sb.append(PRIM_DISEASE_STATE);
            			}
            		
        			sb.append("|");
        		
        				if(SEC_DISEASE_STATE == null){
        					sb.append("<null>");
        				}else{
            				sb.append(SEC_DISEASE_STATE);
            			}
            		
        			sb.append("|");
        		
        				if(TER_DISEASE_STATE == null){
        					sb.append("<null>");
        				}else{
            				sb.append(TER_DISEASE_STATE);
            			}
            		
        			sb.append("|");
        		
        				if(SPHERE_OF_INFLUENCE == null){
        					sb.append("<null>");
        				}else{
            				sb.append(SPHERE_OF_INFLUENCE);
            			}
            		
        			sb.append("|");
        		
        				if(INDICATORS == null){
        					sb.append("<null>");
        				}else{
            				sb.append(INDICATORS);
            			}
            		
        			sb.append("|");
        		
        				if(AWARENESS == null){
        					sb.append("<null>");
        				}else{
            				sb.append(AWARENESS);
            			}
            		
        			sb.append("|");
        		
        				if(ACCESS == null){
        					sb.append("<null>");
        				}else{
            				sb.append(ACCESS);
            			}
            		
        			sb.append("|");
        		
        				if(UNDERSTAND_UNMET_NEED == null){
        					sb.append("<null>");
        				}else{
            				sb.append(UNDERSTAND_UNMET_NEED);
            			}
            		
        			sb.append("|");
        		
        				if(TC_KNOWLEDGE == null){
        					sb.append("<null>");
        				}else{
            				sb.append(TC_KNOWLEDGE);
            			}
            		
        			sb.append("|");
        		
        				if(HCP_CREATED_BY == null){
        					sb.append("<null>");
        				}else{
            				sb.append(HCP_CREATED_BY);
            			}
            		
        			sb.append("|");
        		
        				if(DATA_THROUGH_DATE == null){
        					sb.append("<null>");
        				}else{
            				sb.append(DATA_THROUGH_DATE);
            			}
            		
        			sb.append("|");
        		
        	return sb.toString();
        }

    /**
     * Compare keys
     */
    public int compareTo(after_tDBInput_1Struct other) {

		int returnValue = -1;
		
						returnValue = checkNullsAndCompare(this.HCP_LEGEND_ID, other.HCP_LEGEND_ID);
						if(returnValue != 0) {
							return returnValue;
						}

					
						returnValue = checkNullsAndCompare(this.HCP_STATUS, other.HCP_STATUS);
						if(returnValue != 0) {
							return returnValue;
						}

					
						returnValue = checkNullsAndCompare(this.HCP_CREATED_DT, other.HCP_CREATED_DT);
						if(returnValue != 0) {
							return returnValue;
						}

					
	    return returnValue;
    }


    private int checkNullsAndCompare(Object object1, Object object2) {
        int returnValue = 0;
		if (object1 instanceof Comparable && object2 instanceof Comparable) {
            returnValue = ((Comparable) object1).compareTo(object2);
        } else if (object1 != null && object2 != null) {
            returnValue = compareStrings(object1.toString(), object2.toString());
        } else if (object1 == null && object2 != null) {
            returnValue = 1;
        } else if (object1 != null && object2 == null) {
            returnValue = -1;
        } else {
            returnValue = 0;
        }

        return returnValue;
    }

    private int compareStrings(String string1, String string2) {
        return string1.compareTo(string2);
    }


}
public void tDBInput_1Process(final java.util.Map<String, Object> globalMap) throws TalendException {
	globalMap.put("tDBInput_1_SUBPROCESS_STATE", 0);

 final boolean execStat = this.execStat;
	
		String iterateId = "";
	
	
	String currentComponent = "";
	java.util.Map<String, Object> resourceMap = new java.util.HashMap<String, Object>();

	try {
			// TDI-39566 avoid throwing an useless Exception
			boolean resumeIt = true;
			if (globalResumeTicket == false && resumeEntryMethodName != null) {
				String currentMethodName = new java.lang.Exception().getStackTrace()[0].getMethodName();
				resumeIt = resumeEntryMethodName.equals(currentMethodName);
			}
			if (resumeIt || globalResumeTicket) { //start the resume
				globalResumeTicket = true;


		tDBInput_2Process(globalMap);
		tDBInput_4Process(globalMap);
		tDBInput_3Process(globalMap);
		tDBInput_5Process(globalMap);
		tDBInput_6Process(globalMap);
		tDBInput_7Process(globalMap);
		tDBInput_8Process(globalMap);

		HCPSStruct HCPS = new HCPSStruct();
OUTPUTStruct OUTPUT = new OUTPUTStruct();





	
	/**
	 * [tDBOutput_1 begin ] start
	 */

	

	
		
		ok_Hash.put("tDBOutput_1", false);
		start_Hash.put("tDBOutput_1", System.currentTimeMillis());
		
	
	currentComponent="tDBOutput_1";

	
			runStat.updateStatAndLog(execStat,enableLogStash,resourceMap,iterateId,0,0,"OUTPUT");
			
		int tos_count_tDBOutput_1 = 0;
		
			if(enableLogStash) {
				talendJobLog.addCM("tDBOutput_1", "tDBOutput_1", "tSnowflakeOutput");
				talendJobLogProcess(globalMap);
			}
			

boolean doesNodeBelongToRequest_tDBOutput_1 = 0 == 0;
@SuppressWarnings("unchecked")
java.util.Map<String, Object> restRequest_tDBOutput_1 = (java.util.Map<String, Object>)globalMap.get("restRequest");
String currentTRestRequestOperation_tDBOutput_1 = (String)(restRequest_tDBOutput_1 != null ? restRequest_tDBOutput_1.get("OPERATION") : null);

org.talend.components.api.component.ComponentDefinition def_tDBOutput_1 =
        new org.talend.components.snowflake.tsnowflakeoutput.TSnowflakeOutputDefinition();

org.talend.components.api.component.runtime.Writer writer_tDBOutput_1 = null;
org.talend.components.api.component.runtime.Reader reader_tDBOutput_1 = null;


org.talend.components.snowflake.tsnowflakeoutput.TSnowflakeOutputProperties props_tDBOutput_1 =
        (org.talend.components.snowflake.tsnowflakeoutput.TSnowflakeOutputProperties) def_tDBOutput_1.createRuntimeProperties();
 		                    props_tDBOutput_1.setValue("tableAction",
 		                        org.talend.components.common.tableaction.TableAction.TableActionEnum.DROP_IF_EXISTS_AND_CREATE);
 		                    
 		                    props_tDBOutput_1.setValue("outputAction",
 		                        org.talend.components.snowflake.tsnowflakeoutput.TSnowflakeOutputProperties.OutputAction.INSERT);
 		                    
 		                    props_tDBOutput_1.setValue("convertColumnsAndTableToUppercase",
 		                    true);
 		                    
 		                    props_tDBOutput_1.setValue("usePersonalDBType",
 		                    false);
 		                    
 		                    props_tDBOutput_1.setValue("convertEmptyStringsToNull",
 		                    false);
 		                    
 		                    props_tDBOutput_1.setValue("useSchemaDatePattern",
 		                    false);
 		                    
 		                    props_tDBOutput_1.setValue("dieOnError",
 		                    false);
 		                    
 		                    class SchemaSettingTool_tDBOutput_1_1_fisrt {
 		                    		
 		                    		String getSchemaValue() {
 		                    				
 		                    						StringBuilder s = new StringBuilder();
                    						
     		                    						a("{\"type\":\"record\",",s);
     		                    						
     		                    						a("\"name\":\"rejectOutput\",\"fields\":[{",s);
     		                    						
     		                    						a("\"name\":\"columnName\",\"type\":\"string\",\"talend.isLocked\":\"false\",\"talend.field.generated\":\"true\",\"talend.field.length\":\"255\"},{",s);
     		                    						
     		                    						a("\"name\":\"rowNumber\",\"type\":\"string\",\"talend.isLocked\":\"false\",\"talend.field.generated\":\"true\",\"talend.field.length\":\"255\"},{",s);
     		                    						
     		                    						a("\"name\":\"category\",\"type\":\"string\",\"talend.isLocked\":\"false\",\"talend.field.generated\":\"true\",\"talend.field.length\":\"255\"},{",s);
     		                    						
     		                    						a("\"name\":\"character\",\"type\":\"string\",\"talend.isLocked\":\"false\",\"talend.field.generated\":\"true\",\"talend.field.length\":\"255\"},{",s);
     		                    						
     		                    						a("\"name\":\"errorMessage\",\"type\":\"string\",\"talend.isLocked\":\"false\",\"talend.field.generated\":\"true\",\"talend.field.length\":\"255\"},{",s);
     		                    						
     		                    						a("\"name\":\"byteOffset\",\"type\":\"string\",\"talend.isLocked\":\"false\",\"talend.field.generated\":\"true\",\"talend.field.length\":\"255\"},{",s);
     		                    						
     		                    						a("\"name\":\"line\",\"type\":\"string\",\"talend.isLocked\":\"false\",\"talend.field.generated\":\"true\",\"talend.field.length\":\"255\"},{",s);
     		                    						
     		                    						a("\"name\":\"sqlState\",\"type\":\"string\",\"talend.isLocked\":\"false\",\"talend.field.generated\":\"true\",\"talend.field.length\":\"255\"},{",s);
     		                    						
     		                    						a("\"name\":\"code\",\"type\":\"string\",\"talend.isLocked\":\"false\",\"talend.field.generated\":\"true\",\"talend.field.length\":\"255\"}]}",s);
     		                    						
     		                    				return s.toString();
     		                    		
 		                    		}
 		                    		
 		                    		void a(String part, StringBuilder strB) {
 		                    				strB.append(part);
 		                    		}
 		                    		
 		                    }
 		                    
 		                    SchemaSettingTool_tDBOutput_1_1_fisrt sst_tDBOutput_1_1_fisrt = new SchemaSettingTool_tDBOutput_1_1_fisrt();
 		                    
 		                    props_tDBOutput_1.schemaReject.setValue("schema",
 		                        new org.apache.avro.Schema.Parser().parse(sst_tDBOutput_1_1_fisrt.getSchemaValue()));
 		                    
 		                    props_tDBOutput_1.connection.setValue("loginTimeout",
 		                    15);
 		                    
 		                    props_tDBOutput_1.connection.setValue("account",
 		                    "LEGENDBIOTECH.east-us-2.azure");
 		                    
 		                    props_tDBOutput_1.connection.setValue("regionID",
 		                    "");
 		                    
 		                    props_tDBOutput_1.connection.setValue("useCustomRegion",
 		                    false);
 		                    
 		                    props_tDBOutput_1.connection.setValue("authenticationType",
 		                        org.talend.components.snowflake.tsnowflakeconnection.AuthenticationType.BASIC);
 		                    
 		                    props_tDBOutput_1.connection.setValue("warehouse",
 		                    "USCOMM_SHARED_DW");
 		                    
 		                    props_tDBOutput_1.connection.setValue("db",
 		                    "USSUNSHINE_RPT_DEV");
 		                    
 		                    props_tDBOutput_1.connection.setValue("schemaName",
 		                    "USSUNSHINE_RPT_SCHEMA");
 		                    
 		                    props_tDBOutput_1.connection.setValue("role",
 		                    "");
 		                    
 		                    props_tDBOutput_1.connection.setValue("jdbcParameters",
 		                    "");
 		                    
 		                    props_tDBOutput_1.connection.userPassword.setValue("useAuth",
 		                    false);
 		                    
 		                    props_tDBOutput_1.connection.userPassword.setValue("userId",
 		                    "SUNSHINE_RPT");
 		                    
 		                        props_tDBOutput_1.connection.userPassword.setValue("password",
 		                        routines.system.PasswordEncryptUtil.decryptPassword("enc:routine.encryption.key.v1:axugqcXi8KlpX0yMhN5zVtifGgOeVjHGpowcoxOEVjU2JWX79Q=="));
 		                        
 		                    props_tDBOutput_1.connection.referencedComponent.setValue("referenceDefinitionName",
 		                    "tSnowflakeConnection");
 		                    
 		                    props_tDBOutput_1.table.setValue("tableName",
 		                    "BEACON_STAGE");
 		                    
 		                    props_tDBOutput_1.table.connection.setValue("loginTimeout",
 		                    15);
 		                    
 		                    props_tDBOutput_1.table.connection.setValue("account",
 		                    "LEGENDBIOTECH.east-us-2.azure");
 		                    
 		                    props_tDBOutput_1.table.connection.setValue("regionID",
 		                    "");
 		                    
 		                    props_tDBOutput_1.table.connection.setValue("useCustomRegion",
 		                    false);
 		                    
 		                    props_tDBOutput_1.table.connection.setValue("authenticationType",
 		                        org.talend.components.snowflake.tsnowflakeconnection.AuthenticationType.BASIC);
 		                    
 		                    props_tDBOutput_1.table.connection.setValue("warehouse",
 		                    "USCOMM_SHARED_DW");
 		                    
 		                    props_tDBOutput_1.table.connection.setValue("db",
 		                    "USSUNSHINE_RPT_DEV");
 		                    
 		                    props_tDBOutput_1.table.connection.setValue("schemaName",
 		                    "USSUNSHINE_RPT_SCHEMA");
 		                    
 		                    props_tDBOutput_1.table.connection.setValue("role",
 		                    "");
 		                    
 		                    props_tDBOutput_1.table.connection.setValue("jdbcParameters",
 		                    "");
 		                    
 		                    props_tDBOutput_1.table.connection.userPassword.setValue("useAuth",
 		                    false);
 		                    
 		                    props_tDBOutput_1.table.connection.userPassword.setValue("userId",
 		                    "SUNSHINE_RPT");
 		                    
 		                        props_tDBOutput_1.table.connection.userPassword.setValue("password",
 		                        routines.system.PasswordEncryptUtil.decryptPassword("enc:routine.encryption.key.v1:eTTgwjj+6T6cFDRgdGPdHJzpywulX6bq3sG3AQtAbT63RaFtOw=="));
 		                        
 		                    props_tDBOutput_1.table.connection.referencedComponent.setValue("referenceDefinitionName",
 		                    "tSnowflakeConnection");
 		                    
 		                    class SchemaSettingTool_tDBOutput_1_2_fisrt {
 		                    		
 		                    		String getSchemaValue() {
 		                    				
 		                    						StringBuilder s = new StringBuilder();
                    						
     		                    						a("{\"type\":\"record\",",s);
     		                    						
     		                    						a("\"name\":\"tDBOutput_1\",\"fields\":[{",s);
     		                    						
     		                    						a("\"name\":\"VENDOR_NAME\",\"type\":[\"string\",\"null\"],\"di.table.comment\":\"\",\"AVRO_TECHNICAL_KEY\":\"VENDOR_NAME\",\"talend.field.dbType\":\"\",\"talend.field.dbColumnName\":\"VENDOR_NAME\",\"di.column.talendType\":\"id_String\",\"di.column.isNullable\":\"true\",\"talend.field.pattern\":\"\",\"talend.field.length\":\"500\",\"di.column.relationshipType\":\"\",\"di.column.originalLength\":\"500\",\"di.table.label\":\"VENDOR_NAME\",\"di.column.relatedEntity\":\"\"},{",s);
     		                    						
     		                    						a("\"name\":\"ACTIVITY_ID\",\"type\":\"string\",\"di.table.comment\":\"\",\"AVRO_TECHNICAL_KEY\":\"ACTIVITY_ID\",\"talend.field.dbColumnName\":\"ACTIVITY_ID\",\"di.column.talendType\":\"id_String\",\"talend.field.pattern\":\"\",\"talend.field.length\":\"500\",\"di.column.relationshipType\":\"\",\"di.column.originalLength\":\"500\",\"di.table.label\":\"ACTIVITY_ID\",\"talend.field.isKey\":\"true\",\"di.column.relatedEntity\":\"\"},{",s);
     		                    						
     		                    						a("\"name\":\"ACTIVITY_TYPE\",\"type\":[\"string\",\"null\"],\"di.table.comment\":\"\",\"AVRO_TECHNICAL_KEY\":\"ACTIVITY_TYPE\",\"talend.field.dbType\":\"\",\"talend.field.dbColumnName\":\"ACTIVITY_TYPE\",\"di.column.talendType\":\"id_String\",\"di.column.isNullable\":\"true\",\"talend.field.pattern\":\"\",\"talend.field.length\":\"500\",\"di.column.relationshipType\":\"\",\"di.column.originalLength\":\"500\",\"di.table.label\":\"ACTIVITY_TYPE\",\"di.column.relatedEntity\":\"\"},{",s);
     		                    						
     		                    						a("\"name\":\"EMPLOYEE_NAME\",\"type\":[\"string\",\"null\"],\"di.table.comment\":\"\",\"AVRO_TECHNICAL_KEY\":\"EMPLOYEE_NAME\",\"talend.field.dbColumnName\":\"EMPLOYEE_NAME\",\"di.column.talendType\":\"id_String\",\"di.column.isNullable\":\"true\",\"talend.field.pattern\":\"\",\"talend.field.length\":\"500\",\"di.column.relationshipType\":\"\",\"di.column.originalLength\":\"500\",\"di.table.label\":\"EMPLOYEE_NAME\",\"di.column.relatedEntity\":\"\"},{",s);
     		                    						
     		                    						a("\"name\":\"BUSINESS_FUNCTIONAL_AREA\",\"type\":[\"string\",\"null\"],\"di.table.comment\":\"\",\"AVRO_TECHNICAL_KEY\":\"BUSINESS_FUNCTIONAL_AREA\",\"talend.field.dbType\":\"\",\"talend.field.dbColumnName\":\"BUSINESS_FUNCTIONAL_AREA\",\"di.column.talendType\":\"id_String\",\"di.column.isNullable\":\"true\",\"talend.field.pattern\":\"\",\"talend.field.length\":\"500\",\"di.column.relationshipType\":\"\",\"di.column.originalLength\":\"500\",\"di.table.label\":\"BUSINESS_FUNCTIONAL_AREA\",\"di.column.relatedEntity\":\"\"},{",s);
     		                    						
     		                    						a("\"name\":\"ACTIVITY_NAME\",\"type\":[\"string\",\"null\"],\"di.table.comment\":\"\",\"AVRO_TECHNICAL_KEY\":\"ACTIVITY_NAME\",\"talend.field.dbColumnName\":\"ACTIVITY_NAME\",\"di.column.talendType\":\"id_String\",\"di.column.isNullable\":\"true\",\"talend.field.pattern\":\"\",\"talend.field.length\":\"500\",\"di.column.relationshipType\":\"\",\"di.column.originalLength\":\"500\",\"di.table.label\":\"ACTIVITY_NAME\",\"di.column.relatedEntity\":\"\"},{",s);
     		                    						
     		                    						a("\"name\":\"PRODUCT\",\"type\":[\"string\",\"null\"],\"di.table.comment\":\"\",\"AVRO_TECHNICAL_KEY\":\"PRODUCT\",\"talend.field.dbColumnName\":\"PRODUCT\",\"di.column.talendType\":\"id_String\",\"di.column.isNullable\":\"true\",\"talend.field.pattern\":\"\",\"talend.field.length\":\"500\",\"di.column.relationshipType\":\"\",\"di.column.originalLength\":\"500\",\"di.table.label\":\"PRODUCT\",\"di.column.relatedEntity\":\"\"},{",s);
     		                    						
     		                    						a("\"name\":\"EXPENSE_ID\",\"type\":\"string\",\"di.table.comment\":\"\",\"AVRO_TECHNICAL_KEY\":\"EXPENSE_ID\",\"talend.field.dbColumnName\":\"EXPENSE_ID\",\"di.column.talendType\":\"id_String\",\"talend.field.pattern\":\"\",\"talend.field.length\":\"500\",\"di.column.relationshipType\":\"\",\"di.column.originalLength\":\"500\",\"di.table.label\":\"EXPENSE_ID\",\"talend.field.isKey\":\"true\",\"di.column.relatedEntity\":\"\"},{",s);
     		                    						
     		                    						a("\"name\":\"NATURE_OF_EXPENSE\",\"type\":[\"string\",\"null\"],\"di.table.comment\":\"\",\"AVRO_TECHNICAL_KEY\":\"NATURE_OF_EXPENSE\",\"talend.field.dbType\":\"\",\"talend.field.dbColumnName\":\"NATURE_OF_EXPENSE\",\"di.column.talendType\":\"id_String\",\"di.column.isNullable\":\"true\",\"talend.field.pattern\":\"\",\"talend.field.length\":\"500\",\"di.column.relationshipType\":\"\",\"di.column.originalLength\":\"500\",\"di.table.label\":\"NATURE_OF_EXPENSE\",\"di.column.relatedEntity\":\"\"},{",s);
     		                    						
     		                    						a("\"name\":\"EXPENSE_TYPE\",\"type\":[\"string\",\"null\"],\"di.table.comment\":\"\",\"AVRO_TECHNICAL_KEY\":\"EXPENSE_TYPE\",\"talend.field.dbType\":\"\",\"talend.field.dbColumnName\":\"EXPENSE_TYPE\",\"di.column.talendType\":\"id_String\",\"di.column.isNullable\":\"true\",\"talend.field.pattern\":\"\",\"talend.field.length\":\"500\",\"di.column.relationshipType\":\"\",\"di.column.originalLength\":\"500\",\"di.table.label\":\"EXPENSE_TYPE\",\"di.column.relatedEntity\":\"\"},{",s);
     		                    						
     		                    						a("\"name\":\"DATE_OF_PAYMENT\",\"type\":[{\"type\":\"int\",\"logicalType\":\"date\"},\"null\"],\"di.table.comment\":\"\",\"AVRO_TECHNICAL_KEY\":\"DATE_OF_PAYMENT\",\"talend.field.dbColumnName\":\"DATE_OF_PAYMENT\",\"di.prop.di.date.date\":\"true\",\"di.column.talendType\":\"id_Date\",\"di.column.isNullable\":\"true\",\"talend.field.pattern\":\"MM/dd/yyyy\",\"di.column.relationshipType\":\"\",\"di.prop.di.column.logicalType\":\"date\",\"di.table.label\":\"DATE_OF_PAYMENT\",\"di.column.relatedEntity\":\"\"},{",s);
     		                    						
     		                    						a("\"name\":\"INDIVIDUAL_RECIPIENT_FIRST_NAME\",\"type\":[\"string\",\"null\"],\"di.table.comment\":\"\",\"AVRO_TECHNICAL_KEY\":\"INDIVIDUAL_RECIPIENT_FIRST_NAME\",\"talend.field.dbColumnName\":\"INDIVIDUAL_RECIPIENT_FIRST_NAME\",\"di.column.talendType\":\"id_String\",\"di.column.isNullable\":\"true\",\"talend.field.pattern\":\"\",\"talend.field.length\":\"500\",\"di.column.relationshipType\":\"\",\"di.column.originalLength\":\"500\",\"di.table.label\":\"INDIVIDUAL_RECIPIENT_FIRST_NAME\",\"di.column.relatedEntity\":\"\"},{",s);
     		                    						
     		                    						a("\"name\":\"INDIVIDUAL_RECIPIENT_MIDDLE_NAME\",\"type\":[\"string\",\"null\"],\"di.table.comment\":\"\",\"AVRO_TECHNICAL_KEY\":\"INDIVIDUAL_RECIPIENT_MIDDLE_NAME\",\"talend.field.dbColumnName\":\"INDIVIDUAL_RECIPIENT_MIDDLE_NAME\",\"di.column.talendType\":\"id_String\",\"di.column.isNullable\":\"true\",\"talend.field.pattern\":\"\",\"talend.field.length\":\"500\",\"di.column.relationshipType\":\"\",\"di.column.originalLength\":\"500\",\"di.table.label\":\"INDIVIDUAL_RECIPIENT_MIDDLE_NAME\",\"di.column.relatedEntity\":\"\"},{",s);
     		                    						
     		                    						a("\"name\":\"INDIVIDUAL_RECIPIENT_LAST_NAME_ORGANIZATION_NAME\",\"type\":[\"string\",\"null\"],\"di.table.comment\":\"\",\"AVRO_TECHNICAL_KEY\":\"INDIVIDUAL_RECIPIENT_LAST_NAME_ORGANIZATION_NAME\",\"talend.field.dbColumnName\":\"INDIVIDUAL_RECIPIENT_LAST_NAME_ORGANIZATION_NAME\",\"di.column.talendType\":\"id_String\",\"di.column.isNullable\":\"true\",\"talend.field.pattern\":\"\",\"talend.field.length\":\"500\",\"di.column.relationshipType\":\"\",\"di.column.originalLength\":\"500\",\"di.table.label\":\"INDIVIDUAL_RECIPIENT_LAST_NAME_ORGANIZATION_NAME\",\"di.column.relatedEntity\":\"\"},{",s);
     		                    						
     		                    						a("\"name\":\"LEGEND_ID\",\"type\":\"string\",\"di.table.comment\":\"\",\"AVRO_TECHNICAL_KEY\":\"LEGEND_ID\",\"talend.field.dbColumnName\":\"LEGEND_ID\",\"di.column.talendType\":\"id_String\",\"talend.field.pattern\":\"\",\"talend.field.length\":\"500\",\"di.column.relationshipType\":\"\",\"di.column.originalLength\":\"500\",\"di.table.label\":\"LEGEND_ID\",\"talend.field.isKey\":\"true\",\"di.column.relatedEntity\":\"\"},{",s);
     		                    						
     		                    						a("\"name\":\"INDIVIDUAL_RECIPIENT_SUFFIX\",\"type\":[\"string\",\"null\"],\"di.table.comment\":\"\",\"AVRO_TECHNICAL_KEY\":\"INDIVIDUAL_RECIPIENT_SUFFIX\",\"talend.field.dbColumnName\":\"INDIVIDUAL_RECIPIENT_SUFFIX\",\"di.column.talendType\":\"id_String\",\"di.column.isNullable\":\"true\",\"talend.field.pattern\":\"\",\"talend.field.length\":\"500\",\"di.column.relationshipType\":\"\",\"di.column.originalLength\":\"500\",\"di.table.label\":\"INDIVIDUAL_RECIPIENT_SUFFIX\",\"di.column.relatedEntity\":\"\"},{",s);
     		                    						
     		                    						a("\"name\":\"RECIPIENT_BUSINESS_STREET_ADDRESS_LINE_1\",\"type\":[\"string\",\"null\"],\"di.table.comment\":\"\",\"AVRO_TECHNICAL_KEY\":\"RECIPIENT_BUSINESS_STREET_ADDRESS_LINE_1\",\"talend.field.dbColumnName\":\"RECIPIENT_BUSINESS_STREET_ADDRESS_LINE_1\",\"di.column.talendType\":\"id_String\",\"di.column.isNullable\":\"true\",\"talend.field.pattern\":\"\",\"talend.field.length\":\"500\",\"di.column.relationshipType\":\"\",\"di.column.originalLength\":\"500\",\"di.table.label\":\"RECIPIENT_BUSINESS_STREET_ADDRESS_LINE_1\",\"di.column.relatedEntity\":\"\"},{",s);
     		                    						
     		                    						a("\"name\":\"RECIPIENT_BUSINESS_STREET_ADDRESS_LINE_2\",\"type\":[\"string\",\"null\"],\"di.table.comment\":\"\",\"AVRO_TECHNICAL_KEY\":\"RECIPIENT_BUSINESS_STREET_ADDRESS_LINE_2\",\"talend.field.dbColumnName\":\"RECIPIENT_BUSINESS_STREET_ADDRESS_LINE_2\",\"di.column.talendType\":\"id_String\",\"di.column.isNullable\":\"true\",\"talend.field.pattern\":\"\",\"talend.field.length\":\"500\",\"di.column.relationshipType\":\"\",\"di.column.originalLength\":\"500\",\"di.table.label\":\"RECIPIENT_BUSINESS_STREET_ADDRESS_LINE_2\",\"di.column.relatedEntity\":\"\"},{",s);
     		                    						
     		                    						a("\"name\":\"RECIPIENT_CITY\",\"type\":[\"string\",\"null\"],\"di.table.comment\":\"\",\"AVRO_TECHNICAL_KEY\":\"RECIPIENT_CITY\",\"talend.field.dbColumnName\":\"RECIPIENT_CITY\",\"di.column.talendType\":\"id_String\",\"di.column.isNullable\":\"true\",\"talend.field.pattern\":\"\",\"talend.field.length\":\"500\",\"di.column.relationshipType\":\"\",\"di.column.originalLength\":\"500\",\"di.table.label\":\"RECIPIENT_CITY\",\"di.column.relatedEntity\":\"\"},{",s);
     		                    						
     		                    						a("\"name\":\"RECIPIENT_STATE\",\"type\":[\"string\",\"null\"],\"di.table.comment\":\"\",\"AVRO_TECHNICAL_KEY\":\"RECIPIENT_STATE\",\"talend.field.dbColumnName\":\"RECIPIENT_STATE\",\"di.column.talendType\":\"id_String\",\"di.column.isNullable\":\"true\",\"talend.field.pattern\":\"\",\"talend.field.length\":\"500\",\"di.column.relationshipType\":\"\",\"di.column.originalLength\":\"500\",\"di.table.label\":\"RECIPIENT_STATE\",\"di.column.relatedEntity\":\"\"},{",s);
     		                    						
     		                    						a("\"name\":\"RECIPIENT_ZIP_CODE_POSTAL_CODE\",\"type\":[\"string\",\"null\"],\"di.table.comment\":\"\",\"AVRO_TECHNICAL_KEY\":\"RECIPIENT_ZIP_CODE_POSTAL_CODE\",\"talend.field.dbColumnName\":\"RECIPIENT_ZIP_CODE_POSTAL_CODE\",\"di.column.talendType\":\"id_String\",\"di.column.isNullable\":\"true\",\"talend.field.pattern\":\"\",\"talend.field.length\":\"500\",\"di.column.relationshipType\":\"\",\"di.column.originalLength\":\"500\",\"di.table.label\":\"RECIPIENT_ZIP_CODE_POSTAL_CODE\",\"di.column.relatedEntity\":\"\"},{",s);
     		                    						
     		                    						a("\"name\":\"RECIPIENT_COUNTRY\",\"type\":[\"string\",\"null\"],\"di.table.comment\":\"\",\"AVRO_TECHNICAL_KEY\":\"RECIPIENT_COUNTRY\",\"talend.field.dbColumnName\":\"RECIPIENT_COUNTRY\",\"di.column.talendType\":\"id_String\",\"di.column.isNullable\":\"true\",\"talend.field.pattern\":\"\",\"talend.field.length\":\"500\",\"di.column.relationshipType\":\"\",\"di.column.originalLength\":\"500\",\"di.table.label\":\"RECIPIENT_COUNTRY\",\"di.column.relatedEntity\":\"\"},{",s);
     		                    						
     		                    						a("\"name\":\"RECIPIENT_TYPE_PROFESSIONAL_DESIGNATION_CREDENTIAL\",\"type\":[\"string\",\"null\"],\"di.table.comment\":\"\",\"AVRO_TECHNICAL_KEY\":\"RECIPIENT_TYPE_PROFESSIONAL_DESIGNATION_CREDENTIAL\",\"talend.field.dbColumnName\":\"RECIPIENT_TYPE_PROFESSIONAL_DESIGNATION_CREDENTIAL\",\"di.column.talendType\":\"id_String\",\"di.column.isNullable\":\"true\",\"talend.field.pattern\":\"\",\"talend.field.length\":\"500\",\"di.column.relationshipType\":\"\",\"di.column.originalLength\":\"500\",\"di.table.label\":\"RECIPIENT_TYPE_PROFESSIONAL_DESIGNATION_CREDENTIAL\",\"di.column.relatedEntity\":\"\"},{",s);
     		                    						
     		                    						a("\"name\":\"RECIPIENT_NPI\",\"type\":[\"string\",\"null\"],\"di.table.comment\":\"\",\"AVRO_TECHNICAL_KEY\":\"RECIPIENT_NPI\",\"talend.field.dbColumnName\":\"RECIPIENT_NPI\",\"di.column.talendType\":\"id_String\",\"di.column.isNullable\":\"true\",\"talend.field.pattern\":\"\",\"talend.field.length\":\"500\",\"di.column.relationshipType\":\"\",\"di.column.originalLength\":\"500\",\"di.table.label\":\"RECIPIENT_NPI\",\"di.column.relatedEntity\":\"\"}],\"di.table.name\":\"tDBOutput_1\",\"di.table.label\":\"tDBOutput_1\"}",s);
     		                    						
     		                    				return s.toString();
     		                    		
 		                    		}
 		                    		
 		                    		void a(String part, StringBuilder strB) {
 		                    				strB.append(part);
 		                    		}
 		                    		
 		                    }
 		                    
 		                    SchemaSettingTool_tDBOutput_1_2_fisrt sst_tDBOutput_1_2_fisrt = new SchemaSettingTool_tDBOutput_1_2_fisrt();
 		                    
 		                    props_tDBOutput_1.table.main.setValue("schema",
 		                        new org.apache.avro.Schema.Parser().parse(sst_tDBOutput_1_2_fisrt.getSchemaValue()));
 		                    
    if (org.talend.components.api.properties.ComponentReferenceProperties.ReferenceType.COMPONENT_INSTANCE == props_tDBOutput_1.connection.referencedComponent.referenceType.getValue()) {
        final String referencedComponentInstanceId_tDBOutput_1 = props_tDBOutput_1.connection.referencedComponent.componentInstanceId.getStringValue();
        if (referencedComponentInstanceId_tDBOutput_1 != null) {
            org.talend.daikon.properties.Properties referencedComponentProperties_tDBOutput_1 = (org.talend.daikon.properties.Properties) globalMap.get(
                referencedComponentInstanceId_tDBOutput_1 + "_COMPONENT_RUNTIME_PROPERTIES");
            props_tDBOutput_1.connection.referencedComponent.setReference(referencedComponentProperties_tDBOutput_1);
        }
    }
    if (org.talend.components.api.properties.ComponentReferenceProperties.ReferenceType.COMPONENT_INSTANCE == props_tDBOutput_1.table.connection.referencedComponent.referenceType.getValue()) {
        final String referencedComponentInstanceId_tDBOutput_1 = props_tDBOutput_1.table.connection.referencedComponent.componentInstanceId.getStringValue();
        if (referencedComponentInstanceId_tDBOutput_1 != null) {
            org.talend.daikon.properties.Properties referencedComponentProperties_tDBOutput_1 = (org.talend.daikon.properties.Properties) globalMap.get(
                referencedComponentInstanceId_tDBOutput_1 + "_COMPONENT_RUNTIME_PROPERTIES");
            props_tDBOutput_1.table.connection.referencedComponent.setReference(referencedComponentProperties_tDBOutput_1);
        }
    }
globalMap.put("tDBOutput_1_COMPONENT_RUNTIME_PROPERTIES", props_tDBOutput_1);
globalMap.putIfAbsent("TALEND_PRODUCT_VERSION", "8.0");
globalMap.put("TALEND_COMPONENTS_VERSION", "0.37.4");
java.net.URL mappings_url_tDBOutput_1= this.getClass().getResource("/xmlMappings");
globalMap.put("tDBOutput_1_MAPPINGS_URL", mappings_url_tDBOutput_1);

org.talend.components.api.container.RuntimeContainer container_tDBOutput_1 = new org.talend.components.api.container.RuntimeContainer() {
    public Object getComponentData(String componentId, String key) {
        return globalMap.get(componentId + "_" + key);
    }

    public void setComponentData(String componentId, String key, Object data) {
        globalMap.put(componentId + "_" + key, data);
    }

    public String getCurrentComponentId() {
        return "tDBOutput_1";
    }

    public Object getGlobalData(String key) {
    	return globalMap.get(key);
    }
};

int nb_line_tDBOutput_1 = 0;

org.talend.components.api.component.ConnectorTopology topology_tDBOutput_1 = null;
topology_tDBOutput_1 = org.talend.components.api.component.ConnectorTopology.INCOMING;

org.talend.daikon.runtime.RuntimeInfo runtime_info_tDBOutput_1 = def_tDBOutput_1.getRuntimeInfo(
    org.talend.components.api.component.runtime.ExecutionEngine.DI, props_tDBOutput_1, topology_tDBOutput_1);
java.util.Set<org.talend.components.api.component.ConnectorTopology> supported_connector_topologies_tDBOutput_1 = def_tDBOutput_1.getSupportedConnectorTopologies();

org.talend.components.api.component.runtime.RuntimableRuntime componentRuntime_tDBOutput_1 = (org.talend.components.api.component.runtime.RuntimableRuntime)(Class.forName(runtime_info_tDBOutput_1.getRuntimeClassName()).newInstance());
org.talend.daikon.properties.ValidationResult initVr_tDBOutput_1 = componentRuntime_tDBOutput_1.initialize(container_tDBOutput_1, props_tDBOutput_1);

if (initVr_tDBOutput_1.getStatus() == org.talend.daikon.properties.ValidationResult.Result.ERROR ) {
    throw new RuntimeException(initVr_tDBOutput_1.getMessage());
}

if(componentRuntime_tDBOutput_1 instanceof org.talend.components.api.component.runtime.ComponentDriverInitialization) {
	org.talend.components.api.component.runtime.ComponentDriverInitialization compDriverInitialization_tDBOutput_1 = (org.talend.components.api.component.runtime.ComponentDriverInitialization)componentRuntime_tDBOutput_1;
	compDriverInitialization_tDBOutput_1.runAtDriver(container_tDBOutput_1);
}

org.talend.components.api.component.runtime.SourceOrSink sourceOrSink_tDBOutput_1 = null;
if(componentRuntime_tDBOutput_1 instanceof org.talend.components.api.component.runtime.SourceOrSink) {
	sourceOrSink_tDBOutput_1 = (org.talend.components.api.component.runtime.SourceOrSink)componentRuntime_tDBOutput_1;
	if (doesNodeBelongToRequest_tDBOutput_1) {
        org.talend.daikon.properties.ValidationResult vr_tDBOutput_1 = sourceOrSink_tDBOutput_1.validate(container_tDBOutput_1);
        if (vr_tDBOutput_1.getStatus() == org.talend.daikon.properties.ValidationResult.Result.ERROR ) {
            throw new RuntimeException(vr_tDBOutput_1.getMessage());
        }
	}
}

    org.talend.codegen.enforcer.IncomingSchemaEnforcer incomingEnforcer_tDBOutput_1 = null;
    if (sourceOrSink_tDBOutput_1 instanceof org.talend.components.api.component.runtime.Sink) {
    	org.talend.components.api.component.runtime.Sink sink_tDBOutput_1 =
            	(org.talend.components.api.component.runtime.Sink)sourceOrSink_tDBOutput_1;
        org.talend.components.api.component.runtime.WriteOperation writeOperation_tDBOutput_1 = sink_tDBOutput_1.createWriteOperation();
        if (doesNodeBelongToRequest_tDBOutput_1) {
            writeOperation_tDBOutput_1.initialize(container_tDBOutput_1);
        }
        writer_tDBOutput_1 = writeOperation_tDBOutput_1.createWriter(container_tDBOutput_1);
        if (doesNodeBelongToRequest_tDBOutput_1) {
            writer_tDBOutput_1.open("tDBOutput_1");
        }

        resourceMap.put("writer_tDBOutput_1", writer_tDBOutput_1);
    } // end of "sourceOrSink_tDBOutput_1 instanceof ...Sink"
    org.talend.components.api.component.Connector c_tDBOutput_1 = null;
    for (org.talend.components.api.component.Connector currentConnector : props_tDBOutput_1.getAvailableConnectors(null, false)) {
        if (currentConnector.getName().equals("MAIN")) {
            c_tDBOutput_1 = currentConnector;
            break;
        }
    }
    org.apache.avro.Schema designSchema_tDBOutput_1 = props_tDBOutput_1.getSchema(c_tDBOutput_1, false);
    incomingEnforcer_tDBOutput_1 = new org.talend.codegen.enforcer.IncomingSchemaEnforcer(designSchema_tDBOutput_1);

                java.lang.Iterable<?> outgoingMainRecordsList_tDBOutput_1 = new java.util.ArrayList<Object>();
                java.util.Iterator outgoingMainRecordsIt_tDBOutput_1 = null;


 



/**
 * [tDBOutput_1 begin ] stop
 */



	
	/**
	 * [tMap_1 begin ] start
	 */

	

	
		
		ok_Hash.put("tMap_1", false);
		start_Hash.put("tMap_1", System.currentTimeMillis());
		
	
	currentComponent="tMap_1";

	
			runStat.updateStatAndLog(execStat,enableLogStash,resourceMap,iterateId,0,0,"HCPS");
			
		int tos_count_tMap_1 = 0;
		
                if(log.isDebugEnabled())
            log.debug("tMap_1 - "  + ("Start to work.") );
            if (log.isDebugEnabled()) {
                class BytesLimit65535_tMap_1{
                    public void limitLog4jByte() throws Exception{
                    StringBuilder log4jParamters_tMap_1 = new StringBuilder();
                    log4jParamters_tMap_1.append("Parameters:");
                            log4jParamters_tMap_1.append("LINK_STYLE" + " = " + "AUTO");
                        log4jParamters_tMap_1.append(" | ");
                            log4jParamters_tMap_1.append("TEMPORARY_DATA_DIRECTORY" + " = " + "");
                        log4jParamters_tMap_1.append(" | ");
                            log4jParamters_tMap_1.append("ROWS_BUFFER_SIZE" + " = " + "2000000");
                        log4jParamters_tMap_1.append(" | ");
                            log4jParamters_tMap_1.append("CHANGE_HASH_AND_EQUALS_FOR_BIGDECIMAL" + " = " + "true");
                        log4jParamters_tMap_1.append(" | ");
                if(log.isDebugEnabled())
            log.debug("tMap_1 - "  + (log4jParamters_tMap_1) );
                    } 
                } 
            new BytesLimit65535_tMap_1().limitLog4jByte();
            }
			if(enableLogStash) {
				talendJobLog.addCM("tMap_1", "tMap_1", "tMap");
				talendJobLogProcess(globalMap);
			}
			




// ###############################
// # Lookup's keys initialization
		int count_HCPS_tMap_1 = 0;
		
		int count_HCPTOINTERACTIONCOM_tMap_1 = 0;
		
		int count_INTERACTIONSCOM_tMap_1 = 0;
		
		int count_HCPADDRESSES_tMap_1 = 0;
		
		int count_PRODUCT_tMap_1 = 0;
		
		int count_RECIPIENT_STATE_tMap_1 = 0;
		
		int count_RECIPIENT_COUNTRY_tMap_1 = 0;
		
		int count_RECIPIENT_TYPE_tMap_1 = 0;
		
	
		org.talend.designer.components.lookup.memory.AdvancedMemoryLookup<HCPTOINTERACTIONCOMStruct> tHash_Lookup_HCPTOINTERACTIONCOM = (org.talend.designer.components.lookup.memory.AdvancedMemoryLookup<HCPTOINTERACTIONCOMStruct>) 
				((org.talend.designer.components.lookup.memory.AdvancedMemoryLookup<HCPTOINTERACTIONCOMStruct>) 
					globalMap.get( "tHash_Lookup_HCPTOINTERACTIONCOM" ))
					;					
					
	

HCPTOINTERACTIONCOMStruct HCPTOINTERACTIONCOMHashKey = new HCPTOINTERACTIONCOMStruct();
HCPTOINTERACTIONCOMStruct HCPTOINTERACTIONCOMDefault = new HCPTOINTERACTIONCOMStruct();
	
		org.talend.designer.components.lookup.memory.AdvancedMemoryLookup<INTERACTIONSCOMStruct> tHash_Lookup_INTERACTIONSCOM = (org.talend.designer.components.lookup.memory.AdvancedMemoryLookup<INTERACTIONSCOMStruct>) 
				((org.talend.designer.components.lookup.memory.AdvancedMemoryLookup<INTERACTIONSCOMStruct>) 
					globalMap.get( "tHash_Lookup_INTERACTIONSCOM" ))
					;					
					
	

INTERACTIONSCOMStruct INTERACTIONSCOMHashKey = new INTERACTIONSCOMStruct();
INTERACTIONSCOMStruct INTERACTIONSCOMDefault = new INTERACTIONSCOMStruct();
	
		org.talend.designer.components.lookup.memory.AdvancedMemoryLookup<HCPADDRESSESStruct> tHash_Lookup_HCPADDRESSES = (org.talend.designer.components.lookup.memory.AdvancedMemoryLookup<HCPADDRESSESStruct>) 
				((org.talend.designer.components.lookup.memory.AdvancedMemoryLookup<HCPADDRESSESStruct>) 
					globalMap.get( "tHash_Lookup_HCPADDRESSES" ))
					;					
					
	

HCPADDRESSESStruct HCPADDRESSESHashKey = new HCPADDRESSESStruct();
HCPADDRESSESStruct HCPADDRESSESDefault = new HCPADDRESSESStruct();
	
		org.talend.designer.components.lookup.memory.AdvancedMemoryLookup<PRODUCTStruct> tHash_Lookup_PRODUCT = (org.talend.designer.components.lookup.memory.AdvancedMemoryLookup<PRODUCTStruct>) 
				((org.talend.designer.components.lookup.memory.AdvancedMemoryLookup<PRODUCTStruct>) 
					globalMap.get( "tHash_Lookup_PRODUCT" ))
					;					
					
	

PRODUCTStruct PRODUCTHashKey = new PRODUCTStruct();
PRODUCTStruct PRODUCTDefault = new PRODUCTStruct();
	
		org.talend.designer.components.lookup.memory.AdvancedMemoryLookup<RECIPIENT_STATEStruct> tHash_Lookup_RECIPIENT_STATE = (org.talend.designer.components.lookup.memory.AdvancedMemoryLookup<RECIPIENT_STATEStruct>) 
				((org.talend.designer.components.lookup.memory.AdvancedMemoryLookup<RECIPIENT_STATEStruct>) 
					globalMap.get( "tHash_Lookup_RECIPIENT_STATE" ))
					;					
					
	

RECIPIENT_STATEStruct RECIPIENT_STATEHashKey = new RECIPIENT_STATEStruct();
RECIPIENT_STATEStruct RECIPIENT_STATEDefault = new RECIPIENT_STATEStruct();
	
		org.talend.designer.components.lookup.memory.AdvancedMemoryLookup<RECIPIENT_COUNTRYStruct> tHash_Lookup_RECIPIENT_COUNTRY = (org.talend.designer.components.lookup.memory.AdvancedMemoryLookup<RECIPIENT_COUNTRYStruct>) 
				((org.talend.designer.components.lookup.memory.AdvancedMemoryLookup<RECIPIENT_COUNTRYStruct>) 
					globalMap.get( "tHash_Lookup_RECIPIENT_COUNTRY" ))
					;					
					
	

RECIPIENT_COUNTRYStruct RECIPIENT_COUNTRYHashKey = new RECIPIENT_COUNTRYStruct();
RECIPIENT_COUNTRYStruct RECIPIENT_COUNTRYDefault = new RECIPIENT_COUNTRYStruct();
	
		org.talend.designer.components.lookup.memory.AdvancedMemoryLookup<RECIPIENT_TYPEStruct> tHash_Lookup_RECIPIENT_TYPE = (org.talend.designer.components.lookup.memory.AdvancedMemoryLookup<RECIPIENT_TYPEStruct>) 
				((org.talend.designer.components.lookup.memory.AdvancedMemoryLookup<RECIPIENT_TYPEStruct>) 
					globalMap.get( "tHash_Lookup_RECIPIENT_TYPE" ))
					;					
					
	

RECIPIENT_TYPEStruct RECIPIENT_TYPEHashKey = new RECIPIENT_TYPEStruct();
RECIPIENT_TYPEStruct RECIPIENT_TYPEDefault = new RECIPIENT_TYPEStruct();
// ###############################        

// ###############################
// # Vars initialization
class  Var__tMap_1__Struct  {
}
Var__tMap_1__Struct Var__tMap_1 = new Var__tMap_1__Struct();
// ###############################

// ###############################
// # Outputs initialization
				int count_OUTPUT_tMap_1 = 0;
				
OUTPUTStruct OUTPUT_tmp = new OUTPUTStruct();
// ###############################

        
        



        









 



/**
 * [tMap_1 begin ] stop
 */



	
	/**
	 * [tDBInput_1 begin ] start
	 */

	

	
		
		ok_Hash.put("tDBInput_1", false);
		start_Hash.put("tDBInput_1", System.currentTimeMillis());
		
	
	currentComponent="tDBInput_1";

	
		int tos_count_tDBInput_1 = 0;
		
			if(enableLogStash) {
				talendJobLog.addCM("tDBInput_1", "HCPS", "tSnowflakeInput");
				talendJobLogProcess(globalMap);
			}
			

boolean doesNodeBelongToRequest_tDBInput_1 = 0 == 0;
@SuppressWarnings("unchecked")
java.util.Map<String, Object> restRequest_tDBInput_1 = (java.util.Map<String, Object>)globalMap.get("restRequest");
String currentTRestRequestOperation_tDBInput_1 = (String)(restRequest_tDBInput_1 != null ? restRequest_tDBInput_1.get("OPERATION") : null);

org.talend.components.api.component.ComponentDefinition def_tDBInput_1 =
        new org.talend.components.snowflake.tsnowflakeinput.TSnowflakeInputDefinition();

org.talend.components.api.component.runtime.Writer writer_tDBInput_1 = null;
org.talend.components.api.component.runtime.Reader reader_tDBInput_1 = null;


org.talend.components.snowflake.tsnowflakeinput.TSnowflakeInputProperties props_tDBInput_1 =
        (org.talend.components.snowflake.tsnowflakeinput.TSnowflakeInputProperties) def_tDBInput_1.createRuntimeProperties();
 		                    props_tDBInput_1.setValue("condition",
 		                    "");
 		                    
 		                    props_tDBInput_1.setValue("manualQuery",
 		                    false);
 		                    
 		                    props_tDBInput_1.setValue("convertColumnsAndTableToUppercase",
 		                    true);
 		                    
 		                    props_tDBInput_1.connection.setValue("useCustomRegion",
 		                    false);
 		                    
 		                    props_tDBInput_1.connection.userPassword.setValue("useAuth",
 		                    false);
 		                    
 		                    props_tDBInput_1.connection.referencedComponent.setValue("referenceType",
 		                        org.talend.components.api.properties.ComponentReferenceProperties.ReferenceType.COMPONENT_INSTANCE);
 		                    
 		                    props_tDBInput_1.connection.referencedComponent.setValue("componentInstanceId",
 		                    "tDBConnection_1");
 		                    
 		                    props_tDBInput_1.connection.referencedComponent.setValue("referenceDefinitionName",
 		                    "tSnowflakeConnection");
 		                    
 		                    props_tDBInput_1.table.setValue("tableName",
 		                    "HCPS");
 		                    
 		                    props_tDBInput_1.table.connection.setValue("useCustomRegion",
 		                    false);
 		                    
 		                    props_tDBInput_1.table.connection.userPassword.setValue("useAuth",
 		                    false);
 		                    
 		                    props_tDBInput_1.table.connection.referencedComponent.setValue("referenceType",
 		                        org.talend.components.api.properties.ComponentReferenceProperties.ReferenceType.COMPONENT_INSTANCE);
 		                    
 		                    props_tDBInput_1.table.connection.referencedComponent.setValue("componentInstanceId",
 		                    "tDBConnection_1");
 		                    
 		                    props_tDBInput_1.table.connection.referencedComponent.setValue("referenceDefinitionName",
 		                    "tSnowflakeConnection");
 		                    
 		                    class SchemaSettingTool_tDBInput_1_1_fisrt {
 		                    		
 		                    		String getSchemaValue() {
 		                    				
 		                    						StringBuilder s = new StringBuilder();
                    						
     		                    						a("{\"type\":\"record\",",s);
     		                    						
     		                    						a("\"name\":\"HCPS\",\"fields\":[{",s);
     		                    						
     		                    						a("\"name\":\"HCP_LEGEND_ID\",\"type\":\"string\",\"talend.field.length\":\"10\",\"talend.field.dbType\":12,\"talend.field.dbColumnName\":\"HCP_LEGEND_ID\",\"talend.field.isKey\":\"true\"},{",s);
     		                    						
     		                    						a("\"name\":\"HCP_STATUS\",\"type\":\"string\",\"talend.field.length\":\"20\",\"talend.field.dbType\":12,\"talend.field.dbColumnName\":\"HCP_STATUS\",\"talend.field.isKey\":\"true\"},{",s);
     		                    						
     		                    						a("\"name\":\"HCP_CREATED_DT\",\"type\":{\"type\":\"int\",\"logicalType\":\"date\"},\"talend.field.pattern\":\"yyyy-MM-dd\",\"talend.field.dbType\":91,\"talend.field.dbColumnName\":\"HCP_CREATED_DT\",\"talend.field.isKey\":\"true\"},{",s);
     		                    						
     		                    						a("\"name\":\"HCP_INACTIVE_DT\",\"type\":[{\"type\":\"int\",\"logicalType\":\"date\"},\"null\"],\"talend.field.pattern\":\"yyyy-MM-dd\",\"talend.field.dbType\":91,\"talend.field.dbColumnName\":\"HCP_INACTIVE_DT\"},{",s);
     		                    						
     		                    						a("\"name\":\"LAST_NAME\",\"type\":[\"string\",\"null\"],\"talend.field.length\":\"50\",\"talend.field.dbType\":12,\"talend.field.dbColumnName\":\"LAST_NAME\"},{",s);
     		                    						
     		                    						a("\"name\":\"FIRST_NAME\",\"type\":[\"string\",\"null\"],\"talend.field.length\":\"50\",\"talend.field.dbType\":12,\"talend.field.dbColumnName\":\"FIRST_NAME\"},{",s);
     		                    						
     		                    						a("\"name\":\"MIDDLE_NAME\",\"type\":[\"string\",\"null\"],\"talend.field.length\":\"50\",\"talend.field.dbType\":12,\"talend.field.dbColumnName\":\"MIDDLE_NAME\"},{",s);
     		                    						
     		                    						a("\"name\":\"SUFFIX\",\"type\":[\"string\",\"null\"],\"talend.field.length\":\"50\",\"talend.field.dbType\":12,\"talend.field.dbColumnName\":\"SUFFIX\"},{",s);
     		                    						
     		                    						a("\"name\":\"NPI\",\"type\":[\"string\",\"null\"],\"talend.field.length\":\"10\",\"talend.field.dbType\":12,\"talend.field.dbColumnName\":\"NPI\"},{",s);
     		                    						
     		                    						a("\"name\":\"CREDENTIALS\",\"type\":[\"string\",\"null\"],\"talend.field.length\":\"10\",\"talend.field.dbType\":12,\"talend.field.dbColumnName\":\"CREDENTIALS\"},{",s);
     		                    						
     		                    						a("\"name\":\"STND_CREDENTIALS\",\"type\":[\"string\",\"null\"],\"talend.field.length\":\"10\",\"talend.field.dbType\":12,\"talend.field.dbColumnName\":\"STND_CREDENTIALS\"},{",s);
     		                    						
     		                    						a("\"name\":\"HCP_PHONE\",\"type\":[\"string\",\"null\"],\"talend.field.length\":\"20\",\"talend.field.dbType\":12,\"talend.field.dbColumnName\":\"HCP_PHONE\"},{",s);
     		                    						
     		                    						a("\"name\":\"EMAIL\",\"type\":[\"string\",\"null\"],\"talend.field.length\":\"100\",\"talend.field.dbType\":12,\"talend.field.dbColumnName\":\"EMAIL\"},{",s);
     		                    						
     		                    						a("\"name\":\"EMAIL_OPT_OUT\",\"type\":[\"double\",\"null\"],\"talend.field.dbType\":8,\"talend.field.dbColumnName\":\"EMAIL_OPT_OUT\"},{",s);
     		                    						
     		                    						a("\"name\":\"OFFICE_HOURS\",\"type\":[\"string\",\"null\"],\"talend.field.length\":\"25\",\"talend.field.dbType\":12,\"talend.field.dbColumnName\":\"OFFICE_HOURS\"},{",s);
     		                    						
     		                    						a("\"name\":\"HCP_TYPE\",\"type\":[\"string\",\"null\"],\"talend.field.length\":\"50\",\"talend.field.dbType\":12,\"talend.field.dbColumnName\":\"HCP_TYPE\"},{",s);
     		                    						
     		                    						a("\"name\":\"HCP_ROLE\",\"type\":[\"string\",\"null\"],\"talend.field.length\":\"50\",\"talend.field.dbType\":12,\"talend.field.dbColumnName\":\"HCP_ROLE\"},{",s);
     		                    						
     		                    						a("\"name\":\"CART_AREA\",\"type\":[\"string\",\"null\"],\"talend.field.length\":\"50\",\"talend.field.dbType\":12,\"talend.field.dbColumnName\":\"CART_AREA\"},{",s);
     		                    						
     		                    						a("\"name\":\"KOL_IND\",\"type\":[\"boolean\",\"null\"],\"talend.field.dbType\":16,\"talend.field.dbColumnName\":\"KOL_IND\"},{",s);
     		                    						
     		                    						a("\"name\":\"MM_TREATER_IND\",\"type\":[\"boolean\",\"null\"],\"talend.field.dbType\":16,\"talend.field.dbColumnName\":\"MM_TREATER_IND\"},{",s);
     		                    						
     		                    						a("\"name\":\"BMT_IND\",\"type\":[\"boolean\",\"null\"],\"talend.field.dbType\":16,\"talend.field.dbColumnName\":\"BMT_IND\"},{",s);
     		                    						
     		                    						a("\"name\":\"CLINICAL_TRIAL_ROLE\",\"type\":[\"string\",\"null\"],\"talend.field.length\":\"100\",\"talend.field.dbType\":12,\"talend.field.dbColumnName\":\"CLINICAL_TRIAL_ROLE\"},{",s);
     		                    						
     		                    						a("\"name\":\"PRIM_DISEASE_STATE\",\"type\":[\"string\",\"null\"],\"talend.field.length\":\"50\",\"talend.field.dbType\":12,\"talend.field.dbColumnName\":\"PRIM_DISEASE_STATE\"},{",s);
     		                    						
     		                    						a("\"name\":\"SEC_DISEASE_STATE\",\"type\":[\"string\",\"null\"],\"talend.field.length\":\"50\",\"talend.field.dbType\":12,\"talend.field.dbColumnName\":\"SEC_DISEASE_STATE\"},{",s);
     		                    						
     		                    						a("\"name\":\"TER_DISEASE_STATE\",\"type\":[\"string\",\"null\"],\"talend.field.length\":\"50\",\"talend.field.dbType\":12,\"talend.field.dbColumnName\":\"TER_DISEASE_STATE\"},{",s);
     		                    						
     		                    						a("\"name\":\"SPHERE_OF_INFLUENCE\",\"type\":[\"string\",\"null\"],\"talend.field.length\":\"200\",\"talend.field.dbType\":12,\"talend.field.dbColumnName\":\"SPHERE_OF_INFLUENCE\"},{",s);
     		                    						
     		                    						a("\"name\":\"INDICATORS\",\"type\":[\"string\",\"null\"],\"talend.field.length\":\"25\",\"talend.field.dbType\":12,\"talend.field.dbColumnName\":\"INDICATORS\"},{",s);
     		                    						
     		                    						a("\"name\":\"AWARENESS\",\"type\":[\"double\",\"null\"],\"talend.field.dbType\":8,\"talend.field.dbColumnName\":\"AWARENESS\"},{",s);
     		                    						
     		                    						a("\"name\":\"ACCESS\",\"type\":[\"double\",\"null\"],\"talend.field.dbType\":8,\"talend.field.dbColumnName\":\"ACCESS\"},{",s);
     		                    						
     		                    						a("\"name\":\"UNDERSTAND_UNMET_NEED\",\"type\":[\"double\",\"null\"],\"talend.field.dbType\":8,\"talend.field.dbColumnName\":\"UNDERSTAND_UNMET_NEED\"},{",s);
     		                    						
     		                    						a("\"name\":\"TC_KNOWLEDGE\",\"type\":[\"double\",\"null\"],\"talend.field.dbType\":8,\"talend.field.dbColumnName\":\"TC_KNOWLEDGE\"},{",s);
     		                    						
     		                    						a("\"name\":\"HCP_CREATED_BY\",\"type\":[\"string\",\"null\"],\"talend.field.length\":\"100\",\"talend.field.dbType\":12,\"talend.field.dbColumnName\":\"HCP_CREATED_BY\"},{",s);
     		                    						
     		                    						a("\"name\":\"DATA_THROUGH_DATE\",\"type\":[{\"type\":\"int\",\"logicalType\":\"date\"},\"null\"],\"talend.field.pattern\":\"yyyy-MM-dd\",\"talend.field.dbType\":91,\"talend.field.dbColumnName\":\"DATA_THROUGH_DATE\"}]}",s);
     		                    						
     		                    				return s.toString();
     		                    		
 		                    		}
 		                    		
 		                    		void a(String part, StringBuilder strB) {
 		                    				strB.append(part);
 		                    		}
 		                    		
 		                    }
 		                    
 		                    SchemaSettingTool_tDBInput_1_1_fisrt sst_tDBInput_1_1_fisrt = new SchemaSettingTool_tDBInput_1_1_fisrt();
 		                    
 		                    props_tDBInput_1.table.main.setValue("schema",
 		                        new org.apache.avro.Schema.Parser().parse(sst_tDBInput_1_1_fisrt.getSchemaValue()));
 		                    
    if (org.talend.components.api.properties.ComponentReferenceProperties.ReferenceType.COMPONENT_INSTANCE == props_tDBInput_1.connection.referencedComponent.referenceType.getValue()) {
        final String referencedComponentInstanceId_tDBInput_1 = props_tDBInput_1.connection.referencedComponent.componentInstanceId.getStringValue();
        if (referencedComponentInstanceId_tDBInput_1 != null) {
            org.talend.daikon.properties.Properties referencedComponentProperties_tDBInput_1 = (org.talend.daikon.properties.Properties) globalMap.get(
                referencedComponentInstanceId_tDBInput_1 + "_COMPONENT_RUNTIME_PROPERTIES");
            props_tDBInput_1.connection.referencedComponent.setReference(referencedComponentProperties_tDBInput_1);
        }
    }
    if (org.talend.components.api.properties.ComponentReferenceProperties.ReferenceType.COMPONENT_INSTANCE == props_tDBInput_1.table.connection.referencedComponent.referenceType.getValue()) {
        final String referencedComponentInstanceId_tDBInput_1 = props_tDBInput_1.table.connection.referencedComponent.componentInstanceId.getStringValue();
        if (referencedComponentInstanceId_tDBInput_1 != null) {
            org.talend.daikon.properties.Properties referencedComponentProperties_tDBInput_1 = (org.talend.daikon.properties.Properties) globalMap.get(
                referencedComponentInstanceId_tDBInput_1 + "_COMPONENT_RUNTIME_PROPERTIES");
            props_tDBInput_1.table.connection.referencedComponent.setReference(referencedComponentProperties_tDBInput_1);
        }
    }
globalMap.put("tDBInput_1_COMPONENT_RUNTIME_PROPERTIES", props_tDBInput_1);
globalMap.putIfAbsent("TALEND_PRODUCT_VERSION", "8.0");
globalMap.put("TALEND_COMPONENTS_VERSION", "0.37.4");
java.net.URL mappings_url_tDBInput_1= this.getClass().getResource("/xmlMappings");
globalMap.put("tDBInput_1_MAPPINGS_URL", mappings_url_tDBInput_1);

org.talend.components.api.container.RuntimeContainer container_tDBInput_1 = new org.talend.components.api.container.RuntimeContainer() {
    public Object getComponentData(String componentId, String key) {
        return globalMap.get(componentId + "_" + key);
    }

    public void setComponentData(String componentId, String key, Object data) {
        globalMap.put(componentId + "_" + key, data);
    }

    public String getCurrentComponentId() {
        return "tDBInput_1";
    }

    public Object getGlobalData(String key) {
    	return globalMap.get(key);
    }
};

int nb_line_tDBInput_1 = 0;

org.talend.components.api.component.ConnectorTopology topology_tDBInput_1 = null;
topology_tDBInput_1 = org.talend.components.api.component.ConnectorTopology.OUTGOING;

org.talend.daikon.runtime.RuntimeInfo runtime_info_tDBInput_1 = def_tDBInput_1.getRuntimeInfo(
    org.talend.components.api.component.runtime.ExecutionEngine.DI, props_tDBInput_1, topology_tDBInput_1);
java.util.Set<org.talend.components.api.component.ConnectorTopology> supported_connector_topologies_tDBInput_1 = def_tDBInput_1.getSupportedConnectorTopologies();

org.talend.components.api.component.runtime.RuntimableRuntime componentRuntime_tDBInput_1 = (org.talend.components.api.component.runtime.RuntimableRuntime)(Class.forName(runtime_info_tDBInput_1.getRuntimeClassName()).newInstance());
org.talend.daikon.properties.ValidationResult initVr_tDBInput_1 = componentRuntime_tDBInput_1.initialize(container_tDBInput_1, props_tDBInput_1);

if (initVr_tDBInput_1.getStatus() == org.talend.daikon.properties.ValidationResult.Result.ERROR ) {
    throw new RuntimeException(initVr_tDBInput_1.getMessage());
}

if(componentRuntime_tDBInput_1 instanceof org.talend.components.api.component.runtime.ComponentDriverInitialization) {
	org.talend.components.api.component.runtime.ComponentDriverInitialization compDriverInitialization_tDBInput_1 = (org.talend.components.api.component.runtime.ComponentDriverInitialization)componentRuntime_tDBInput_1;
	compDriverInitialization_tDBInput_1.runAtDriver(container_tDBInput_1);
}

org.talend.components.api.component.runtime.SourceOrSink sourceOrSink_tDBInput_1 = null;
if(componentRuntime_tDBInput_1 instanceof org.talend.components.api.component.runtime.SourceOrSink) {
	sourceOrSink_tDBInput_1 = (org.talend.components.api.component.runtime.SourceOrSink)componentRuntime_tDBInput_1;
	if (doesNodeBelongToRequest_tDBInput_1) {
        org.talend.daikon.properties.ValidationResult vr_tDBInput_1 = sourceOrSink_tDBInput_1.validate(container_tDBInput_1);
        if (vr_tDBInput_1.getStatus() == org.talend.daikon.properties.ValidationResult.Result.ERROR ) {
            throw new RuntimeException(vr_tDBInput_1.getMessage());
        }
	}
}

    if (sourceOrSink_tDBInput_1 instanceof org.talend.components.api.component.runtime.Source) {
        org.talend.components.api.component.runtime.Source source_tDBInput_1 =
                (org.talend.components.api.component.runtime.Source)sourceOrSink_tDBInput_1;
        reader_tDBInput_1 = source_tDBInput_1.createReader(container_tDBInput_1);
	    reader_tDBInput_1 = new org.talend.codegen.flowvariables.runtime.FlowVariablesReader(reader_tDBInput_1, container_tDBInput_1);

            boolean multi_output_is_allowed_tDBInput_1 = false;
            org.talend.components.api.component.Connector c_tDBInput_1 = null;
            for (org.talend.components.api.component.Connector currentConnector : props_tDBInput_1.getAvailableConnectors(null, true)) {
                if (currentConnector.getName().equals("MAIN")) {
                    c_tDBInput_1 = currentConnector;
                }

                if (currentConnector.getName().equals("REJECT")) {//it's better to move the code to javajet
                    multi_output_is_allowed_tDBInput_1 = true;
                }
            }
            org.apache.avro.Schema schema_tDBInput_1 = props_tDBInput_1.getSchema(c_tDBInput_1, true);

        org.talend.codegen.enforcer.OutgoingSchemaEnforcer outgoingEnforcer_tDBInput_1 = org.talend.codegen.enforcer.EnforcerCreator.createOutgoingEnforcer(schema_tDBInput_1, false);

        // Create a reusable factory that converts the output of the reader to an IndexedRecord.
        org.talend.daikon.avro.converter.IndexedRecordConverter<Object, ? extends org.apache.avro.generic.IndexedRecord> factory_tDBInput_1 = null;

        // Iterate through the incoming data.
        boolean available_tDBInput_1 = reader_tDBInput_1.start();

        resourceMap.put("reader_tDBInput_1", reader_tDBInput_1);

        for (; available_tDBInput_1; available_tDBInput_1 = reader_tDBInput_1.advance()) {
			nb_line_tDBInput_1++;

			
			if (multi_output_is_allowed_tDBInput_1) {
				
					HCPS = null;
				

				
			}
			

			try {
				Object data_tDBInput_1 = reader_tDBInput_1.getCurrent();
				

					if(multi_output_is_allowed_tDBInput_1) {
						HCPS = new HCPSStruct();
					}

					
        // Construct the factory once when the first data arrives.
        if (factory_tDBInput_1 == null) {
            factory_tDBInput_1 = (org.talend.daikon.avro.converter.IndexedRecordConverter<Object, ? extends org.apache.avro.generic.IndexedRecord>)
                    new org.talend.daikon.avro.AvroRegistry()
                            .createIndexedRecordConverter(data_tDBInput_1.getClass());
        }

        // Enforce the outgoing schema on the input.
        outgoingEnforcer_tDBInput_1.setWrapped(factory_tDBInput_1.convertToAvro(data_tDBInput_1));
                Object columnValue_0_tDBInput_1 = outgoingEnforcer_tDBInput_1.get(0);
                        HCPS.HCP_LEGEND_ID = (String) (columnValue_0_tDBInput_1);
                Object columnValue_1_tDBInput_1 = outgoingEnforcer_tDBInput_1.get(1);
                        HCPS.HCP_STATUS = (String) (columnValue_1_tDBInput_1);
                Object columnValue_2_tDBInput_1 = outgoingEnforcer_tDBInput_1.get(2);
                        HCPS.HCP_CREATED_DT = (java.util.Date) (columnValue_2_tDBInput_1);
                Object columnValue_3_tDBInput_1 = outgoingEnforcer_tDBInput_1.get(3);
                        HCPS.HCP_INACTIVE_DT = (java.util.Date) (columnValue_3_tDBInput_1);
                Object columnValue_4_tDBInput_1 = outgoingEnforcer_tDBInput_1.get(4);
                        HCPS.LAST_NAME = (String) (columnValue_4_tDBInput_1);
                Object columnValue_5_tDBInput_1 = outgoingEnforcer_tDBInput_1.get(5);
                        HCPS.FIRST_NAME = (String) (columnValue_5_tDBInput_1);
                Object columnValue_6_tDBInput_1 = outgoingEnforcer_tDBInput_1.get(6);
                        HCPS.MIDDLE_NAME = (String) (columnValue_6_tDBInput_1);
                Object columnValue_7_tDBInput_1 = outgoingEnforcer_tDBInput_1.get(7);
                        HCPS.SUFFIX = (String) (columnValue_7_tDBInput_1);
                Object columnValue_8_tDBInput_1 = outgoingEnforcer_tDBInput_1.get(8);
                        HCPS.NPI = (String) (columnValue_8_tDBInput_1);
                Object columnValue_9_tDBInput_1 = outgoingEnforcer_tDBInput_1.get(9);
                        HCPS.CREDENTIALS = (String) (columnValue_9_tDBInput_1);
                Object columnValue_10_tDBInput_1 = outgoingEnforcer_tDBInput_1.get(10);
                        HCPS.STND_CREDENTIALS = (String) (columnValue_10_tDBInput_1);
                Object columnValue_11_tDBInput_1 = outgoingEnforcer_tDBInput_1.get(11);
                        HCPS.HCP_PHONE = (String) (columnValue_11_tDBInput_1);
                Object columnValue_12_tDBInput_1 = outgoingEnforcer_tDBInput_1.get(12);
                        HCPS.EMAIL = (String) (columnValue_12_tDBInput_1);
                Object columnValue_13_tDBInput_1 = outgoingEnforcer_tDBInput_1.get(13);
                        HCPS.EMAIL_OPT_OUT = (Double) (columnValue_13_tDBInput_1);
                Object columnValue_14_tDBInput_1 = outgoingEnforcer_tDBInput_1.get(14);
                        HCPS.OFFICE_HOURS = (String) (columnValue_14_tDBInput_1);
                Object columnValue_15_tDBInput_1 = outgoingEnforcer_tDBInput_1.get(15);
                        HCPS.HCP_TYPE = (String) (columnValue_15_tDBInput_1);
                Object columnValue_16_tDBInput_1 = outgoingEnforcer_tDBInput_1.get(16);
                        HCPS.HCP_ROLE = (String) (columnValue_16_tDBInput_1);
                Object columnValue_17_tDBInput_1 = outgoingEnforcer_tDBInput_1.get(17);
                        HCPS.CART_AREA = (String) (columnValue_17_tDBInput_1);
                Object columnValue_18_tDBInput_1 = outgoingEnforcer_tDBInput_1.get(18);
                        HCPS.KOL_IND = (Boolean) (columnValue_18_tDBInput_1);
                Object columnValue_19_tDBInput_1 = outgoingEnforcer_tDBInput_1.get(19);
                        HCPS.MM_TREATER_IND = (Boolean) (columnValue_19_tDBInput_1);
                Object columnValue_20_tDBInput_1 = outgoingEnforcer_tDBInput_1.get(20);
                        HCPS.BMT_IND = (Boolean) (columnValue_20_tDBInput_1);
                Object columnValue_21_tDBInput_1 = outgoingEnforcer_tDBInput_1.get(21);
                        HCPS.CLINICAL_TRIAL_ROLE = (String) (columnValue_21_tDBInput_1);
                Object columnValue_22_tDBInput_1 = outgoingEnforcer_tDBInput_1.get(22);
                        HCPS.PRIM_DISEASE_STATE = (String) (columnValue_22_tDBInput_1);
                Object columnValue_23_tDBInput_1 = outgoingEnforcer_tDBInput_1.get(23);
                        HCPS.SEC_DISEASE_STATE = (String) (columnValue_23_tDBInput_1);
                Object columnValue_24_tDBInput_1 = outgoingEnforcer_tDBInput_1.get(24);
                        HCPS.TER_DISEASE_STATE = (String) (columnValue_24_tDBInput_1);
                Object columnValue_25_tDBInput_1 = outgoingEnforcer_tDBInput_1.get(25);
                        HCPS.SPHERE_OF_INFLUENCE = (String) (columnValue_25_tDBInput_1);
                Object columnValue_26_tDBInput_1 = outgoingEnforcer_tDBInput_1.get(26);
                        HCPS.INDICATORS = (String) (columnValue_26_tDBInput_1);
                Object columnValue_27_tDBInput_1 = outgoingEnforcer_tDBInput_1.get(27);
                        HCPS.AWARENESS = (Double) (columnValue_27_tDBInput_1);
                Object columnValue_28_tDBInput_1 = outgoingEnforcer_tDBInput_1.get(28);
                        HCPS.ACCESS = (Double) (columnValue_28_tDBInput_1);
                Object columnValue_29_tDBInput_1 = outgoingEnforcer_tDBInput_1.get(29);
                        HCPS.UNDERSTAND_UNMET_NEED = (Double) (columnValue_29_tDBInput_1);
                Object columnValue_30_tDBInput_1 = outgoingEnforcer_tDBInput_1.get(30);
                        HCPS.TC_KNOWLEDGE = (Double) (columnValue_30_tDBInput_1);
                Object columnValue_31_tDBInput_1 = outgoingEnforcer_tDBInput_1.get(31);
                        HCPS.HCP_CREATED_BY = (String) (columnValue_31_tDBInput_1);
                Object columnValue_32_tDBInput_1 = outgoingEnforcer_tDBInput_1.get(32);
                        HCPS.DATA_THROUGH_DATE = (java.util.Date) (columnValue_32_tDBInput_1);
			} catch (org.talend.components.api.exception.DataRejectException e_tDBInput_1) {
				java.util.Map<String,Object> info_tDBInput_1 = e_tDBInput_1.getRejectInfo();
				
					//TODO use a method instead of getting method by the special key "error/errorMessage"
					Object errorMessage_tDBInput_1 = null;
					if(info_tDBInput_1.containsKey("error")){
						errorMessage_tDBInput_1 = info_tDBInput_1.get("error");
					}else if(info_tDBInput_1.containsKey("errorMessage")){
						errorMessage_tDBInput_1 = info_tDBInput_1.get("errorMessage");
					}else{
						errorMessage_tDBInput_1 = "Rejected but error message missing";
					}
					errorMessage_tDBInput_1 = "Row "+ nb_line_tDBInput_1 + ": "+errorMessage_tDBInput_1;
					System.err.println(errorMessage_tDBInput_1);
				
					// If the record is reject, the main line record should put NULL
					HCPS = null;
				
			} // end of catch

                java.lang.Iterable<?> outgoingMainRecordsList_tDBInput_1 = new java.util.ArrayList<Object>();
                java.util.Iterator outgoingMainRecordsIt_tDBInput_1 = null;


 



/**
 * [tDBInput_1 begin ] stop
 */
	
	/**
	 * [tDBInput_1 main ] start
	 */

	

	
	
	currentComponent="tDBInput_1";

	


 


	tos_count_tDBInput_1++;

/**
 * [tDBInput_1 main ] stop
 */
	
	/**
	 * [tDBInput_1 process_data_begin ] start
	 */

	

	
	
	currentComponent="tDBInput_1";

	


 



/**
 * [tDBInput_1 process_data_begin ] stop
 */

	
	/**
	 * [tMap_1 main ] start
	 */

	

	
	
	currentComponent="tMap_1";

	
			if(runStat.update(execStat,enableLogStash,iterateId,1,1
				
					,"HCPS","tDBInput_1","HCPS","tSnowflakeInput","tMap_1","tMap_1","tMap"
				
			)) {
				talendJobLogProcess(globalMap);
			}
			
    			if(log.isTraceEnabled()){
    				log.trace("HCPS - " + (HCPS==null? "": HCPS.toLogString()));
    			}
    		

		
		
		boolean hasCasePrimitiveKeyWithNull_tMap_1 = false;
		

        // ###############################
        // # Input tables (lookups)
		  boolean rejectedInnerJoin_tMap_1 = false;
		  boolean mainRowRejected_tMap_1 = false;
            				    								  
		

				///////////////////////////////////////////////
				// Starting Lookup Table "HCPTOINTERACTIONCOM" 
				///////////////////////////////////////////////


				
				
                            
 					    boolean forceLoopHCPTOINTERACTIONCOM = false;
       		  	    	
       		  	    	
 							HCPTOINTERACTIONCOMStruct HCPTOINTERACTIONCOMObjectFromLookup = null;
                          
		           		  	if(!rejectedInnerJoin_tMap_1) { // G_TM_M_020

								
								hasCasePrimitiveKeyWithNull_tMap_1 = false;
								
                        		    		    HCPTOINTERACTIONCOMHashKey.HCP_LEGEND_ID = HCPS.HCP_LEGEND_ID ;
                        		    		

								
		                        	HCPTOINTERACTIONCOMHashKey.hashCodeDirty = true;
                        		
	  					
	  							
			  					
			  					
	  					
		  							tHash_Lookup_HCPTOINTERACTIONCOM.lookup( HCPTOINTERACTIONCOMHashKey );

	  							

	  							

 								
								  
								  if(!tHash_Lookup_HCPTOINTERACTIONCOM.hasNext()) { // G_TM_M_090

  								
		  				
	  								
			  							rejectedInnerJoin_tMap_1 = true;
	  								
						
									
  									  		
 								
								  
								  } // G_TM_M_090

  								



							} // G_TM_M_020
			           		  	  
							
				           		if(tHash_Lookup_HCPTOINTERACTIONCOM != null && tHash_Lookup_HCPTOINTERACTIONCOM.getCount(HCPTOINTERACTIONCOMHashKey) > 1) { // G 071
			  							
			  						
									 		
									//System.out.println("WARNING: UNIQUE MATCH is configured for the lookup 'HCPTOINTERACTIONCOM' and it contains more one result from keys :  HCPTOINTERACTIONCOM.HCP_LEGEND_ID = '" + HCPTOINTERACTIONCOMHashKey.HCP_LEGEND_ID + "'");
								} // G 071
							

							HCPTOINTERACTIONCOMStruct HCPTOINTERACTIONCOM = null;
                    		  	 
							   
                    		  	 
	       		  	    	HCPTOINTERACTIONCOMStruct fromLookup_HCPTOINTERACTIONCOM = null;
							HCPTOINTERACTIONCOM = HCPTOINTERACTIONCOMDefault;
										 
							
								 
							
							
								if (tHash_Lookup_HCPTOINTERACTIONCOM !=null && tHash_Lookup_HCPTOINTERACTIONCOM.hasNext()) { // G 099
								
							
								
								fromLookup_HCPTOINTERACTIONCOM = tHash_Lookup_HCPTOINTERACTIONCOM.next();

							
							
								} // G 099
							
							

							if(fromLookup_HCPTOINTERACTIONCOM != null) {
								HCPTOINTERACTIONCOM = fromLookup_HCPTOINTERACTIONCOM;
							}
							
							
							
			  							
								
	                    		  	
		                    
	            	
	           	
	            	
	            	
	            

				///////////////////////////////////////////////
				// Starting Lookup Table "INTERACTIONSCOM" 
				///////////////////////////////////////////////


				
				
                            
 					    boolean forceLoopINTERACTIONSCOM = false;
       		  	    	
       		  	    	
 							INTERACTIONSCOMStruct INTERACTIONSCOMObjectFromLookup = null;
                          
		           		  	if(!rejectedInnerJoin_tMap_1) { // G_TM_M_020

								
								hasCasePrimitiveKeyWithNull_tMap_1 = false;
								
                        		    		    INTERACTIONSCOMHashKey.INTERACTION_ID = HCPTOINTERACTIONCOM.INTERACTION_ID ;
                        		    		

								
		                        	INTERACTIONSCOMHashKey.hashCodeDirty = true;
                        		
	  					
	  							
			  					
			  					
	  					
		  							tHash_Lookup_INTERACTIONSCOM.lookup( INTERACTIONSCOMHashKey );

	  							

	  							

 								
								  
								  if(!tHash_Lookup_INTERACTIONSCOM.hasNext()) { // G_TM_M_090

  								
		  				
	  								
			  							rejectedInnerJoin_tMap_1 = true;
	  								
						
									
  									  		
 								
								  
								  } // G_TM_M_090

  								



							} // G_TM_M_020
			           		  	  
							
				           		if(tHash_Lookup_INTERACTIONSCOM != null && tHash_Lookup_INTERACTIONSCOM.getCount(INTERACTIONSCOMHashKey) > 1) { // G 071
			  							
			  						
									 		
									//System.out.println("WARNING: UNIQUE MATCH is configured for the lookup 'INTERACTIONSCOM' and it contains more one result from keys :  INTERACTIONSCOM.INTERACTION_ID = '" + INTERACTIONSCOMHashKey.INTERACTION_ID + "'");
								} // G 071
							

							INTERACTIONSCOMStruct INTERACTIONSCOM = null;
                    		  	 
							   
                    		  	 
	       		  	    	INTERACTIONSCOMStruct fromLookup_INTERACTIONSCOM = null;
							INTERACTIONSCOM = INTERACTIONSCOMDefault;
										 
							
								 
							
							
								if (tHash_Lookup_INTERACTIONSCOM !=null && tHash_Lookup_INTERACTIONSCOM.hasNext()) { // G 099
								
							
								
								fromLookup_INTERACTIONSCOM = tHash_Lookup_INTERACTIONSCOM.next();

							
							
								} // G 099
							
							

							if(fromLookup_INTERACTIONSCOM != null) {
								INTERACTIONSCOM = fromLookup_INTERACTIONSCOM;
							}
							
							
							
			  							
								
	                    		  	
		                    
	            	
	           	
	            	
	            	
	            

				///////////////////////////////////////////////
				// Starting Lookup Table "HCPADDRESSES" 
				///////////////////////////////////////////////


				
				
                            
 					    boolean forceLoopHCPADDRESSES = false;
       		  	    	
       		  	    	
 							HCPADDRESSESStruct HCPADDRESSESObjectFromLookup = null;
                          
		           		  	if(!rejectedInnerJoin_tMap_1) { // G_TM_M_020

								
								hasCasePrimitiveKeyWithNull_tMap_1 = false;
								
                        		    		    HCPADDRESSESHashKey.HCP_LEGEND_ID = HCPS.HCP_LEGEND_ID ;
                        		    		

								
		                        	HCPADDRESSESHashKey.hashCodeDirty = true;
                        		
	  					
	  							
			  					
			  					
	  					
		  							tHash_Lookup_HCPADDRESSES.lookup( HCPADDRESSESHashKey );

	  							

	  							

 								
								  
								  if(!tHash_Lookup_HCPADDRESSES.hasNext()) { // G_TM_M_090

  								
		  				
	  								
			  							rejectedInnerJoin_tMap_1 = true;
	  								
						
									
  									  		
 								
								  
								  } // G_TM_M_090

  								



							} // G_TM_M_020
			           		  	  
							
				           		if(tHash_Lookup_HCPADDRESSES != null && tHash_Lookup_HCPADDRESSES.getCount(HCPADDRESSESHashKey) > 1) { // G 071
			  							
			  						
									 		
									//System.out.println("WARNING: UNIQUE MATCH is configured for the lookup 'HCPADDRESSES' and it contains more one result from keys :  HCPADDRESSES.HCP_LEGEND_ID = '" + HCPADDRESSESHashKey.HCP_LEGEND_ID + "'");
								} // G 071
							

							HCPADDRESSESStruct HCPADDRESSES = null;
                    		  	 
							   
                    		  	 
	       		  	    	HCPADDRESSESStruct fromLookup_HCPADDRESSES = null;
							HCPADDRESSES = HCPADDRESSESDefault;
										 
							
								 
							
							
								if (tHash_Lookup_HCPADDRESSES !=null && tHash_Lookup_HCPADDRESSES.hasNext()) { // G 099
								
							
								
								fromLookup_HCPADDRESSES = tHash_Lookup_HCPADDRESSES.next();

							
							
								} // G 099
							
							

							if(fromLookup_HCPADDRESSES != null) {
								HCPADDRESSES = fromLookup_HCPADDRESSES;
							}
							
							
							
			  							
								
	                    		  	
		                    
	            	
	           	
	            	
	            	
	            

				///////////////////////////////////////////////
				// Starting Lookup Table "PRODUCT" 
				///////////////////////////////////////////////


				
				
                            
 					    boolean forceLoopPRODUCT = false;
       		  	    	
       		  	    	
 							PRODUCTStruct PRODUCTObjectFromLookup = null;
                          
		           		  	if(!rejectedInnerJoin_tMap_1) { // G_TM_M_020

								
								hasCasePrimitiveKeyWithNull_tMap_1 = false;
								
                        		    		    PRODUCTHashKey.BEACONCRM = INTERACTIONSCOM.PRODUCT ;
                        		    		

								
		                        	PRODUCTHashKey.hashCodeDirty = true;
                        		
	  					
	  							
			  					
			  					
	  					
		  							tHash_Lookup_PRODUCT.lookup( PRODUCTHashKey );

	  							

	  							

 								
								  
								  if(!tHash_Lookup_PRODUCT.hasNext()) { // G_TM_M_090

  								
		  				
	  								
			  							rejectedInnerJoin_tMap_1 = true;
	  								
						
									
  									  		
 								
								  
								  } // G_TM_M_090

  								



							} // G_TM_M_020
			           		  	  
							
				           		if(tHash_Lookup_PRODUCT != null && tHash_Lookup_PRODUCT.getCount(PRODUCTHashKey) > 1) { // G 071
			  							
			  						
									 		
									//System.out.println("WARNING: UNIQUE MATCH is configured for the lookup 'PRODUCT' and it contains more one result from keys :  PRODUCT.BEACONCRM = '" + PRODUCTHashKey.BEACONCRM + "'");
								} // G 071
							

							PRODUCTStruct PRODUCT = null;
                    		  	 
							   
                    		  	 
	       		  	    	PRODUCTStruct fromLookup_PRODUCT = null;
							PRODUCT = PRODUCTDefault;
										 
							
								 
							
							
								if (tHash_Lookup_PRODUCT !=null && tHash_Lookup_PRODUCT.hasNext()) { // G 099
								
							
								
								fromLookup_PRODUCT = tHash_Lookup_PRODUCT.next();

							
							
								} // G 099
							
							

							if(fromLookup_PRODUCT != null) {
								PRODUCT = fromLookup_PRODUCT;
							}
							
							
							
			  							
								
	                    		  	
		                    
	            	
	           	
	            	
	            	
	            

				///////////////////////////////////////////////
				// Starting Lookup Table "RECIPIENT_STATE" 
				///////////////////////////////////////////////


				
				
                            
 					    boolean forceLoopRECIPIENT_STATE = false;
       		  	    	
       		  	    	
 							RECIPIENT_STATEStruct RECIPIENT_STATEObjectFromLookup = null;
                          
		           		  	if(!rejectedInnerJoin_tMap_1) { // G_TM_M_020

								
								hasCasePrimitiveKeyWithNull_tMap_1 = false;
								
                        		    		    RECIPIENT_STATEHashKey.BEACONCRM = HCPADDRESSES.HCP_STATE ;
                        		    		

								
		                        	RECIPIENT_STATEHashKey.hashCodeDirty = true;
                        		
	  					
	  							
			  					
			  					
	  					
		  							tHash_Lookup_RECIPIENT_STATE.lookup( RECIPIENT_STATEHashKey );

	  							

	  							

 								
								  
								  if(!tHash_Lookup_RECIPIENT_STATE.hasNext()) { // G_TM_M_090

  								
		  				
	  								
			  							rejectedInnerJoin_tMap_1 = true;
	  								
						
									
  									  		
 								
								  
								  } // G_TM_M_090

  								



							} // G_TM_M_020
			           		  	  
							
				           		if(tHash_Lookup_RECIPIENT_STATE != null && tHash_Lookup_RECIPIENT_STATE.getCount(RECIPIENT_STATEHashKey) > 1) { // G 071
			  							
			  						
									 		
									//System.out.println("WARNING: UNIQUE MATCH is configured for the lookup 'RECIPIENT_STATE' and it contains more one result from keys :  RECIPIENT_STATE.BEACONCRM = '" + RECIPIENT_STATEHashKey.BEACONCRM + "'");
								} // G 071
							

							RECIPIENT_STATEStruct RECIPIENT_STATE = null;
                    		  	 
							   
                    		  	 
	       		  	    	RECIPIENT_STATEStruct fromLookup_RECIPIENT_STATE = null;
							RECIPIENT_STATE = RECIPIENT_STATEDefault;
										 
							
								 
							
							
								if (tHash_Lookup_RECIPIENT_STATE !=null && tHash_Lookup_RECIPIENT_STATE.hasNext()) { // G 099
								
							
								
								fromLookup_RECIPIENT_STATE = tHash_Lookup_RECIPIENT_STATE.next();

							
							
								} // G 099
							
							

							if(fromLookup_RECIPIENT_STATE != null) {
								RECIPIENT_STATE = fromLookup_RECIPIENT_STATE;
							}
							
							
							
			  							
								
	                    		  	
		                    
	            	
	           	
	            	
	            	
	            

				///////////////////////////////////////////////
				// Starting Lookup Table "RECIPIENT_COUNTRY" 
				///////////////////////////////////////////////


				
				
                            
 					    boolean forceLoopRECIPIENT_COUNTRY = false;
       		  	    	
       		  	    	
 							RECIPIENT_COUNTRYStruct RECIPIENT_COUNTRYObjectFromLookup = null;
                          
		           		  	if(!rejectedInnerJoin_tMap_1) { // G_TM_M_020

								
								hasCasePrimitiveKeyWithNull_tMap_1 = false;
								
                        		    		    RECIPIENT_COUNTRYHashKey.BEACONCRM = HCPADDRESSES.HCP_COUNTRY ;
                        		    		

								
		                        	RECIPIENT_COUNTRYHashKey.hashCodeDirty = true;
                        		
	  					
	  							
			  					
			  					
	  					
		  							tHash_Lookup_RECIPIENT_COUNTRY.lookup( RECIPIENT_COUNTRYHashKey );

	  							

	  							

 								
								  
								  if(!tHash_Lookup_RECIPIENT_COUNTRY.hasNext()) { // G_TM_M_090

  								
		  				
	  								
			  							rejectedInnerJoin_tMap_1 = true;
	  								
						
									
  									  		
 								
								  
								  } // G_TM_M_090

  								



							} // G_TM_M_020
			           		  	  
							
				           		if(tHash_Lookup_RECIPIENT_COUNTRY != null && tHash_Lookup_RECIPIENT_COUNTRY.getCount(RECIPIENT_COUNTRYHashKey) > 1) { // G 071
			  							
			  						
									 		
									//System.out.println("WARNING: UNIQUE MATCH is configured for the lookup 'RECIPIENT_COUNTRY' and it contains more one result from keys :  RECIPIENT_COUNTRY.BEACONCRM = '" + RECIPIENT_COUNTRYHashKey.BEACONCRM + "'");
								} // G 071
							

							RECIPIENT_COUNTRYStruct RECIPIENT_COUNTRY = null;
                    		  	 
							   
                    		  	 
	       		  	    	RECIPIENT_COUNTRYStruct fromLookup_RECIPIENT_COUNTRY = null;
							RECIPIENT_COUNTRY = RECIPIENT_COUNTRYDefault;
										 
							
								 
							
							
								if (tHash_Lookup_RECIPIENT_COUNTRY !=null && tHash_Lookup_RECIPIENT_COUNTRY.hasNext()) { // G 099
								
							
								
								fromLookup_RECIPIENT_COUNTRY = tHash_Lookup_RECIPIENT_COUNTRY.next();

							
							
								} // G 099
							
							

							if(fromLookup_RECIPIENT_COUNTRY != null) {
								RECIPIENT_COUNTRY = fromLookup_RECIPIENT_COUNTRY;
							}
							
							
							
			  							
								
	                    		  	
		                    
	            	
	           	
	            	
	            	
	            

				///////////////////////////////////////////////
				// Starting Lookup Table "RECIPIENT_TYPE" 
				///////////////////////////////////////////////


				
				
                            
 					    boolean forceLoopRECIPIENT_TYPE = false;
       		  	    	
       		  	    	
 							RECIPIENT_TYPEStruct RECIPIENT_TYPEObjectFromLookup = null;
                          
		           		  	if(!rejectedInnerJoin_tMap_1) { // G_TM_M_020

								
								hasCasePrimitiveKeyWithNull_tMap_1 = false;
								
                        		    		    RECIPIENT_TYPEHashKey.BEACONCRM = HCPS.CREDENTIALS ;
                        		    		

								
		                        	RECIPIENT_TYPEHashKey.hashCodeDirty = true;
                        		
	  					
	  							
			  					
			  					
	  					
		  							tHash_Lookup_RECIPIENT_TYPE.lookup( RECIPIENT_TYPEHashKey );

	  							

	  							

 								
								  
								  if(!tHash_Lookup_RECIPIENT_TYPE.hasNext()) { // G_TM_M_090

  								
		  				
	  								
			  							rejectedInnerJoin_tMap_1 = true;
	  								
						
									
  									  		
 								
								  
								  } // G_TM_M_090

  								



							} // G_TM_M_020
			           		  	  
							
				           		if(tHash_Lookup_RECIPIENT_TYPE != null && tHash_Lookup_RECIPIENT_TYPE.getCount(RECIPIENT_TYPEHashKey) > 1) { // G 071
			  							
			  						
									 		
									//System.out.println("WARNING: UNIQUE MATCH is configured for the lookup 'RECIPIENT_TYPE' and it contains more one result from keys :  RECIPIENT_TYPE.BEACONCRM = '" + RECIPIENT_TYPEHashKey.BEACONCRM + "'");
								} // G 071
							

							RECIPIENT_TYPEStruct RECIPIENT_TYPE = null;
                    		  	 
							   
                    		  	 
	       		  	    	RECIPIENT_TYPEStruct fromLookup_RECIPIENT_TYPE = null;
							RECIPIENT_TYPE = RECIPIENT_TYPEDefault;
										 
							
								 
							
							
								if (tHash_Lookup_RECIPIENT_TYPE !=null && tHash_Lookup_RECIPIENT_TYPE.hasNext()) { // G 099
								
							
								
								fromLookup_RECIPIENT_TYPE = tHash_Lookup_RECIPIENT_TYPE.next();

							
							
								} // G 099
							
							

							if(fromLookup_RECIPIENT_TYPE != null) {
								RECIPIENT_TYPE = fromLookup_RECIPIENT_TYPE;
							}
							
							
							
			  							
								
	                    		  	
		                    
	            	
	            	
	            // ###############################
        { // start of Var scope
        
	        // ###############################
        	// # Vars tables
        
Var__tMap_1__Struct Var = Var__tMap_1;// ###############################
        // ###############################
        // # Output tables

OUTPUT = null;

if(!rejectedInnerJoin_tMap_1 ) {

// # Output table : 'OUTPUT'
count_OUTPUT_tMap_1++;

OUTPUT_tmp.VENDOR_NAME = "BeaconCRM" ;
OUTPUT_tmp.ACTIVITY_ID = HCPS.HCP_LEGEND_ID+INTERACTIONSCOM.INTERACTION_ID ;
OUTPUT_tmp.ACTIVITY_TYPE = "Promotional Events / Activities" ;
OUTPUT_tmp.EMPLOYEE_NAME = INTERACTIONSCOM.CALL_CREATED_BY ;
OUTPUT_tmp.BUSINESS_FUNCTIONAL_AREA = "Commercial/Marketing/Market Access" ;
OUTPUT_tmp.ACTIVITY_NAME = INTERACTIONSCOM.MATERIALS_LEFT ;
OUTPUT_tmp.PRODUCT =  PRODUCT.FINAL_OUTPUT ;
OUTPUT_tmp.EXPENSE_ID = HCPS.HCP_LEGEND_ID+"_"+INTERACTIONSCOM.INTERACTION_ID ;
OUTPUT_tmp.NATURE_OF_EXPENSE = "Educational Item - HCP" ;
OUTPUT_tmp.EXPENSE_TYPE = "In-kind items and services" ;
OUTPUT_tmp.DATE_OF_PAYMENT = INTERACTIONSCOM.DATE ;
OUTPUT_tmp.INDIVIDUAL_RECIPIENT_FIRST_NAME = HCPS.FIRST_NAME ;
OUTPUT_tmp.INDIVIDUAL_RECIPIENT_MIDDLE_NAME = HCPS.MIDDLE_NAME ;
OUTPUT_tmp.INDIVIDUAL_RECIPIENT_LAST_NAME_ORGANIZATION_NAME = HCPS.LAST_NAME ;
OUTPUT_tmp.LEGEND_ID = HCPS.HCP_LEGEND_ID ;
OUTPUT_tmp.INDIVIDUAL_RECIPIENT_SUFFIX = HCPS.SUFFIX ;
OUTPUT_tmp.RECIPIENT_BUSINESS_STREET_ADDRESS_LINE_1 = HCPADDRESSES.HCP_ADDRESS ;
OUTPUT_tmp.RECIPIENT_BUSINESS_STREET_ADDRESS_LINE_2 = HCPADDRESSES.HCP_ADDRESS2 ;
OUTPUT_tmp.RECIPIENT_CITY = HCPADDRESSES.HCP_CITY ;
OUTPUT_tmp.RECIPIENT_STATE = RECIPIENT_STATE.FINAL_OUTPUT ;
OUTPUT_tmp.RECIPIENT_ZIP_CODE_POSTAL_CODE = HCPADDRESSES.HCP_ZIP ;
OUTPUT_tmp.RECIPIENT_COUNTRY = RECIPIENT_COUNTRY.FINAL_OUTPUT ;
OUTPUT_tmp.RECIPIENT_TYPE_PROFESSIONAL_DESIGNATION_CREDENTIAL = RECIPIENT_TYPE.FINAL_OUTPUT ;
OUTPUT_tmp.RECIPIENT_NPI = HCPS.NPI ;
OUTPUT = OUTPUT_tmp;
log.debug("tMap_1 - Outputting the record " + count_OUTPUT_tMap_1 + " of the output table 'OUTPUT'.");

}  // closing inner join bracket (2)
// ###############################

} // end of Var scope

rejectedInnerJoin_tMap_1 = false;










 


	tos_count_tMap_1++;

/**
 * [tMap_1 main ] stop
 */
	
	/**
	 * [tMap_1 process_data_begin ] start
	 */

	

	
	
	currentComponent="tMap_1";

	

 



/**
 * [tMap_1 process_data_begin ] stop
 */
// Start of branch "OUTPUT"
if(OUTPUT != null) { 



	
	/**
	 * [tDBOutput_1 main ] start
	 */

	

	
	
	currentComponent="tDBOutput_1";

	
			if(runStat.update(execStat,enableLogStash,iterateId,1,1
				
					,"OUTPUT","tMap_1","tMap_1","tMap","tDBOutput_1","tDBOutput_1","tSnowflakeOutput"
				
			)) {
				talendJobLogProcess(globalMap);
			}
			
    			if(log.isTraceEnabled()){
    				log.trace("OUTPUT - " + (OUTPUT==null? "": OUTPUT.toLogString()));
    			}
    		

        if (incomingEnforcer_tDBOutput_1 != null) {
            incomingEnforcer_tDBOutput_1.createNewRecord();
        }
                //skip the put action if the input column doesn't appear in component runtime schema
                if (incomingEnforcer_tDBOutput_1 != null && incomingEnforcer_tDBOutput_1.getRuntimeSchema().getField("VENDOR_NAME") != null){
                    incomingEnforcer_tDBOutput_1.put("VENDOR_NAME", OUTPUT.VENDOR_NAME);
                }
                //skip the put action if the input column doesn't appear in component runtime schema
                if (incomingEnforcer_tDBOutput_1 != null && incomingEnforcer_tDBOutput_1.getRuntimeSchema().getField("ACTIVITY_ID") != null){
                    incomingEnforcer_tDBOutput_1.put("ACTIVITY_ID", OUTPUT.ACTIVITY_ID);
                }
                //skip the put action if the input column doesn't appear in component runtime schema
                if (incomingEnforcer_tDBOutput_1 != null && incomingEnforcer_tDBOutput_1.getRuntimeSchema().getField("ACTIVITY_TYPE") != null){
                    incomingEnforcer_tDBOutput_1.put("ACTIVITY_TYPE", OUTPUT.ACTIVITY_TYPE);
                }
                //skip the put action if the input column doesn't appear in component runtime schema
                if (incomingEnforcer_tDBOutput_1 != null && incomingEnforcer_tDBOutput_1.getRuntimeSchema().getField("EMPLOYEE_NAME") != null){
                    incomingEnforcer_tDBOutput_1.put("EMPLOYEE_NAME", OUTPUT.EMPLOYEE_NAME);
                }
                //skip the put action if the input column doesn't appear in component runtime schema
                if (incomingEnforcer_tDBOutput_1 != null && incomingEnforcer_tDBOutput_1.getRuntimeSchema().getField("BUSINESS_FUNCTIONAL_AREA") != null){
                    incomingEnforcer_tDBOutput_1.put("BUSINESS_FUNCTIONAL_AREA", OUTPUT.BUSINESS_FUNCTIONAL_AREA);
                }
                //skip the put action if the input column doesn't appear in component runtime schema
                if (incomingEnforcer_tDBOutput_1 != null && incomingEnforcer_tDBOutput_1.getRuntimeSchema().getField("ACTIVITY_NAME") != null){
                    incomingEnforcer_tDBOutput_1.put("ACTIVITY_NAME", OUTPUT.ACTIVITY_NAME);
                }
                //skip the put action if the input column doesn't appear in component runtime schema
                if (incomingEnforcer_tDBOutput_1 != null && incomingEnforcer_tDBOutput_1.getRuntimeSchema().getField("PRODUCT") != null){
                    incomingEnforcer_tDBOutput_1.put("PRODUCT", OUTPUT.PRODUCT);
                }
                //skip the put action if the input column doesn't appear in component runtime schema
                if (incomingEnforcer_tDBOutput_1 != null && incomingEnforcer_tDBOutput_1.getRuntimeSchema().getField("EXPENSE_ID") != null){
                    incomingEnforcer_tDBOutput_1.put("EXPENSE_ID", OUTPUT.EXPENSE_ID);
                }
                //skip the put action if the input column doesn't appear in component runtime schema
                if (incomingEnforcer_tDBOutput_1 != null && incomingEnforcer_tDBOutput_1.getRuntimeSchema().getField("NATURE_OF_EXPENSE") != null){
                    incomingEnforcer_tDBOutput_1.put("NATURE_OF_EXPENSE", OUTPUT.NATURE_OF_EXPENSE);
                }
                //skip the put action if the input column doesn't appear in component runtime schema
                if (incomingEnforcer_tDBOutput_1 != null && incomingEnforcer_tDBOutput_1.getRuntimeSchema().getField("EXPENSE_TYPE") != null){
                    incomingEnforcer_tDBOutput_1.put("EXPENSE_TYPE", OUTPUT.EXPENSE_TYPE);
                }
                //skip the put action if the input column doesn't appear in component runtime schema
                if (incomingEnforcer_tDBOutput_1 != null && incomingEnforcer_tDBOutput_1.getRuntimeSchema().getField("DATE_OF_PAYMENT") != null){
                    incomingEnforcer_tDBOutput_1.put("DATE_OF_PAYMENT", OUTPUT.DATE_OF_PAYMENT);
                }
                //skip the put action if the input column doesn't appear in component runtime schema
                if (incomingEnforcer_tDBOutput_1 != null && incomingEnforcer_tDBOutput_1.getRuntimeSchema().getField("INDIVIDUAL_RECIPIENT_FIRST_NAME") != null){
                    incomingEnforcer_tDBOutput_1.put("INDIVIDUAL_RECIPIENT_FIRST_NAME", OUTPUT.INDIVIDUAL_RECIPIENT_FIRST_NAME);
                }
                //skip the put action if the input column doesn't appear in component runtime schema
                if (incomingEnforcer_tDBOutput_1 != null && incomingEnforcer_tDBOutput_1.getRuntimeSchema().getField("INDIVIDUAL_RECIPIENT_MIDDLE_NAME") != null){
                    incomingEnforcer_tDBOutput_1.put("INDIVIDUAL_RECIPIENT_MIDDLE_NAME", OUTPUT.INDIVIDUAL_RECIPIENT_MIDDLE_NAME);
                }
                //skip the put action if the input column doesn't appear in component runtime schema
                if (incomingEnforcer_tDBOutput_1 != null && incomingEnforcer_tDBOutput_1.getRuntimeSchema().getField("INDIVIDUAL_RECIPIENT_LAST_NAME_ORGANIZATION_NAME") != null){
                    incomingEnforcer_tDBOutput_1.put("INDIVIDUAL_RECIPIENT_LAST_NAME_ORGANIZATION_NAME", OUTPUT.INDIVIDUAL_RECIPIENT_LAST_NAME_ORGANIZATION_NAME);
                }
                //skip the put action if the input column doesn't appear in component runtime schema
                if (incomingEnforcer_tDBOutput_1 != null && incomingEnforcer_tDBOutput_1.getRuntimeSchema().getField("LEGEND_ID") != null){
                    incomingEnforcer_tDBOutput_1.put("LEGEND_ID", OUTPUT.LEGEND_ID);
                }
                //skip the put action if the input column doesn't appear in component runtime schema
                if (incomingEnforcer_tDBOutput_1 != null && incomingEnforcer_tDBOutput_1.getRuntimeSchema().getField("INDIVIDUAL_RECIPIENT_SUFFIX") != null){
                    incomingEnforcer_tDBOutput_1.put("INDIVIDUAL_RECIPIENT_SUFFIX", OUTPUT.INDIVIDUAL_RECIPIENT_SUFFIX);
                }
                //skip the put action if the input column doesn't appear in component runtime schema
                if (incomingEnforcer_tDBOutput_1 != null && incomingEnforcer_tDBOutput_1.getRuntimeSchema().getField("RECIPIENT_BUSINESS_STREET_ADDRESS_LINE_1") != null){
                    incomingEnforcer_tDBOutput_1.put("RECIPIENT_BUSINESS_STREET_ADDRESS_LINE_1", OUTPUT.RECIPIENT_BUSINESS_STREET_ADDRESS_LINE_1);
                }
                //skip the put action if the input column doesn't appear in component runtime schema
                if (incomingEnforcer_tDBOutput_1 != null && incomingEnforcer_tDBOutput_1.getRuntimeSchema().getField("RECIPIENT_BUSINESS_STREET_ADDRESS_LINE_2") != null){
                    incomingEnforcer_tDBOutput_1.put("RECIPIENT_BUSINESS_STREET_ADDRESS_LINE_2", OUTPUT.RECIPIENT_BUSINESS_STREET_ADDRESS_LINE_2);
                }
                //skip the put action if the input column doesn't appear in component runtime schema
                if (incomingEnforcer_tDBOutput_1 != null && incomingEnforcer_tDBOutput_1.getRuntimeSchema().getField("RECIPIENT_CITY") != null){
                    incomingEnforcer_tDBOutput_1.put("RECIPIENT_CITY", OUTPUT.RECIPIENT_CITY);
                }
                //skip the put action if the input column doesn't appear in component runtime schema
                if (incomingEnforcer_tDBOutput_1 != null && incomingEnforcer_tDBOutput_1.getRuntimeSchema().getField("RECIPIENT_STATE") != null){
                    incomingEnforcer_tDBOutput_1.put("RECIPIENT_STATE", OUTPUT.RECIPIENT_STATE);
                }
                //skip the put action if the input column doesn't appear in component runtime schema
                if (incomingEnforcer_tDBOutput_1 != null && incomingEnforcer_tDBOutput_1.getRuntimeSchema().getField("RECIPIENT_ZIP_CODE_POSTAL_CODE") != null){
                    incomingEnforcer_tDBOutput_1.put("RECIPIENT_ZIP_CODE_POSTAL_CODE", OUTPUT.RECIPIENT_ZIP_CODE_POSTAL_CODE);
                }
                //skip the put action if the input column doesn't appear in component runtime schema
                if (incomingEnforcer_tDBOutput_1 != null && incomingEnforcer_tDBOutput_1.getRuntimeSchema().getField("RECIPIENT_COUNTRY") != null){
                    incomingEnforcer_tDBOutput_1.put("RECIPIENT_COUNTRY", OUTPUT.RECIPIENT_COUNTRY);
                }
                //skip the put action if the input column doesn't appear in component runtime schema
                if (incomingEnforcer_tDBOutput_1 != null && incomingEnforcer_tDBOutput_1.getRuntimeSchema().getField("RECIPIENT_TYPE_PROFESSIONAL_DESIGNATION_CREDENTIAL") != null){
                    incomingEnforcer_tDBOutput_1.put("RECIPIENT_TYPE_PROFESSIONAL_DESIGNATION_CREDENTIAL", OUTPUT.RECIPIENT_TYPE_PROFESSIONAL_DESIGNATION_CREDENTIAL);
                }
                //skip the put action if the input column doesn't appear in component runtime schema
                if (incomingEnforcer_tDBOutput_1 != null && incomingEnforcer_tDBOutput_1.getRuntimeSchema().getField("RECIPIENT_NPI") != null){
                    incomingEnforcer_tDBOutput_1.put("RECIPIENT_NPI", OUTPUT.RECIPIENT_NPI);
                }
        
        org.apache.avro.generic.IndexedRecord data_tDBOutput_1 = null;
        if (incomingEnforcer_tDBOutput_1 != null) {
            data_tDBOutput_1 = incomingEnforcer_tDBOutput_1.getCurrentRecord();
        }
        
        if (writer_tDBOutput_1 != null && data_tDBOutput_1 != null) {
        	writer_tDBOutput_1.write(data_tDBOutput_1);
        }
        
        nb_line_tDBOutput_1++;

 


	tos_count_tDBOutput_1++;

/**
 * [tDBOutput_1 main ] stop
 */
	
	/**
	 * [tDBOutput_1 process_data_begin ] start
	 */

	

	
	
	currentComponent="tDBOutput_1";

	


 



/**
 * [tDBOutput_1 process_data_begin ] stop
 */
	
	/**
	 * [tDBOutput_1 process_data_end ] start
	 */

	

	
	
	currentComponent="tDBOutput_1";

	


 



/**
 * [tDBOutput_1 process_data_end ] stop
 */

} // End of branch "OUTPUT"




	
	/**
	 * [tMap_1 process_data_end ] start
	 */

	

	
	
	currentComponent="tMap_1";

	

 



/**
 * [tMap_1 process_data_end ] stop
 */



	
	/**
	 * [tDBInput_1 process_data_end ] start
	 */

	

	
	
	currentComponent="tDBInput_1";

	


 



/**
 * [tDBInput_1 process_data_end ] stop
 */
	
	/**
	 * [tDBInput_1 end ] start
	 */

	

	
	
	currentComponent="tDBInput_1";

	
// end of generic


resourceMap.put("finish_tDBInput_1", Boolean.TRUE);

    } // while  
    } // end of "if (sourceOrSink_tDBInput_1 instanceof ...Source)"
    java.util.Map<String, Object> resultMap_tDBInput_1 = null;
    if (reader_tDBInput_1 != null) {
        reader_tDBInput_1.close();
        resultMap_tDBInput_1 = reader_tDBInput_1.getReturnValues();
    }
if(resultMap_tDBInput_1!=null) {
	for(java.util.Map.Entry<String,Object> entry_tDBInput_1 : resultMap_tDBInput_1.entrySet()) {
		switch(entry_tDBInput_1.getKey()) {
		case org.talend.components.api.component.ComponentDefinition.RETURN_ERROR_MESSAGE :
			container_tDBInput_1.setComponentData("tDBInput_1", "ERROR_MESSAGE", entry_tDBInput_1.getValue());
			break;
		case org.talend.components.api.component.ComponentDefinition.RETURN_TOTAL_RECORD_COUNT :
			container_tDBInput_1.setComponentData("tDBInput_1", "NB_LINE", entry_tDBInput_1.getValue());
			break;
		case org.talend.components.api.component.ComponentDefinition.RETURN_SUCCESS_RECORD_COUNT :
			container_tDBInput_1.setComponentData("tDBInput_1", "NB_SUCCESS", entry_tDBInput_1.getValue());
			break;
		case org.talend.components.api.component.ComponentDefinition.RETURN_REJECT_RECORD_COUNT :
			container_tDBInput_1.setComponentData("tDBInput_1", "NB_REJECT", entry_tDBInput_1.getValue());
			break;
		default :
            StringBuilder studio_key_tDBInput_1 = new StringBuilder();
            for (int i_tDBInput_1 = 0; i_tDBInput_1 < entry_tDBInput_1.getKey().length(); i_tDBInput_1++) {
                char ch_tDBInput_1 = entry_tDBInput_1.getKey().charAt(i_tDBInput_1);
                if(Character.isUpperCase(ch_tDBInput_1) && i_tDBInput_1> 0) {
                	studio_key_tDBInput_1.append('_');
                }
                studio_key_tDBInput_1.append(ch_tDBInput_1);
            }
			container_tDBInput_1.setComponentData("tDBInput_1", studio_key_tDBInput_1.toString().toUpperCase(java.util.Locale.ENGLISH), entry_tDBInput_1.getValue());
			break;
		}
	}
}

 

ok_Hash.put("tDBInput_1", true);
end_Hash.put("tDBInput_1", System.currentTimeMillis());




/**
 * [tDBInput_1 end ] stop
 */

	
	/**
	 * [tMap_1 end ] start
	 */

	

	
	
	currentComponent="tMap_1";

	


// ###############################
// # Lookup hashes releasing
					if(tHash_Lookup_HCPTOINTERACTIONCOM != null) {
						tHash_Lookup_HCPTOINTERACTIONCOM.endGet();
					}
					globalMap.remove( "tHash_Lookup_HCPTOINTERACTIONCOM" );

					
					
				
					if(tHash_Lookup_INTERACTIONSCOM != null) {
						tHash_Lookup_INTERACTIONSCOM.endGet();
					}
					globalMap.remove( "tHash_Lookup_INTERACTIONSCOM" );

					
					
				
					if(tHash_Lookup_HCPADDRESSES != null) {
						tHash_Lookup_HCPADDRESSES.endGet();
					}
					globalMap.remove( "tHash_Lookup_HCPADDRESSES" );

					
					
				
					if(tHash_Lookup_PRODUCT != null) {
						tHash_Lookup_PRODUCT.endGet();
					}
					globalMap.remove( "tHash_Lookup_PRODUCT" );

					
					
				
					if(tHash_Lookup_RECIPIENT_STATE != null) {
						tHash_Lookup_RECIPIENT_STATE.endGet();
					}
					globalMap.remove( "tHash_Lookup_RECIPIENT_STATE" );

					
					
				
					if(tHash_Lookup_RECIPIENT_COUNTRY != null) {
						tHash_Lookup_RECIPIENT_COUNTRY.endGet();
					}
					globalMap.remove( "tHash_Lookup_RECIPIENT_COUNTRY" );

					
					
				
					if(tHash_Lookup_RECIPIENT_TYPE != null) {
						tHash_Lookup_RECIPIENT_TYPE.endGet();
					}
					globalMap.remove( "tHash_Lookup_RECIPIENT_TYPE" );

					
					
				
// ###############################      
				log.debug("tMap_1 - Written records count in the table 'OUTPUT': " + count_OUTPUT_tMap_1 + ".");





			 		if(runStat.updateStatAndLog(execStat,enableLogStash,resourceMap,iterateId,"HCPS",2,0,
			 			"tDBInput_1","HCPS","tSnowflakeInput","tMap_1","tMap_1","tMap","output")) {
						talendJobLogProcess(globalMap);
					}
				
 
                if(log.isDebugEnabled())
            log.debug("tMap_1 - "  + ("Done.") );

ok_Hash.put("tMap_1", true);
end_Hash.put("tMap_1", System.currentTimeMillis());




/**
 * [tMap_1 end ] stop
 */

	
	/**
	 * [tDBOutput_1 end ] start
	 */

	

	
	
	currentComponent="tDBOutput_1";

	
// end of generic


resourceMap.put("finish_tDBOutput_1", Boolean.TRUE);

    java.util.Map<String, Object> resultMap_tDBOutput_1 = null;
    if (writer_tDBOutput_1 != null) {
        org.talend.components.api.component.runtime.Result resultObject_tDBOutput_1 = (org.talend.components.api.component.runtime.Result)writer_tDBOutput_1.close();
        resultMap_tDBOutput_1 = writer_tDBOutput_1.getWriteOperation().finalize(java.util.Arrays.<org.talend.components.api.component.runtime.Result>asList(resultObject_tDBOutput_1), container_tDBOutput_1);
    }
if(resultMap_tDBOutput_1!=null) {
	for(java.util.Map.Entry<String,Object> entry_tDBOutput_1 : resultMap_tDBOutput_1.entrySet()) {
		switch(entry_tDBOutput_1.getKey()) {
		case org.talend.components.api.component.ComponentDefinition.RETURN_ERROR_MESSAGE :
			container_tDBOutput_1.setComponentData("tDBOutput_1", "ERROR_MESSAGE", entry_tDBOutput_1.getValue());
			break;
		case org.talend.components.api.component.ComponentDefinition.RETURN_TOTAL_RECORD_COUNT :
			container_tDBOutput_1.setComponentData("tDBOutput_1", "NB_LINE", entry_tDBOutput_1.getValue());
			break;
		case org.talend.components.api.component.ComponentDefinition.RETURN_SUCCESS_RECORD_COUNT :
			container_tDBOutput_1.setComponentData("tDBOutput_1", "NB_SUCCESS", entry_tDBOutput_1.getValue());
			break;
		case org.talend.components.api.component.ComponentDefinition.RETURN_REJECT_RECORD_COUNT :
			container_tDBOutput_1.setComponentData("tDBOutput_1", "NB_REJECT", entry_tDBOutput_1.getValue());
			break;
		default :
            StringBuilder studio_key_tDBOutput_1 = new StringBuilder();
            for (int i_tDBOutput_1 = 0; i_tDBOutput_1 < entry_tDBOutput_1.getKey().length(); i_tDBOutput_1++) {
                char ch_tDBOutput_1 = entry_tDBOutput_1.getKey().charAt(i_tDBOutput_1);
                if(Character.isUpperCase(ch_tDBOutput_1) && i_tDBOutput_1> 0) {
                	studio_key_tDBOutput_1.append('_');
                }
                studio_key_tDBOutput_1.append(ch_tDBOutput_1);
            }
			container_tDBOutput_1.setComponentData("tDBOutput_1", studio_key_tDBOutput_1.toString().toUpperCase(java.util.Locale.ENGLISH), entry_tDBOutput_1.getValue());
			break;
		}
	}
}

			 		if(runStat.updateStatAndLog(execStat,enableLogStash,resourceMap,iterateId,"OUTPUT",2,0,
			 			"tMap_1","tMap_1","tMap","tDBOutput_1","tDBOutput_1","tSnowflakeOutput","output")) {
						talendJobLogProcess(globalMap);
					}
				
 

ok_Hash.put("tDBOutput_1", true);
end_Hash.put("tDBOutput_1", System.currentTimeMillis());




/**
 * [tDBOutput_1 end ] stop
 */






				}//end the resume

				
				    			if(resumeEntryMethodName == null || globalResumeTicket){
				    				resumeUtil.addLog("CHECKPOINT", "CONNECTION:SUBJOB_OK:tDBInput_1:OnSubjobOk", "", Thread.currentThread().getId() + "", "", "", "", "", "");
								}	    				    			
					    	
								if(execStat){    	
									runStat.updateStatOnConnection("OnSubjobOk1", 0, "ok");
								} 
							
							tDBCommit_1Process(globalMap); 
						



	
			}catch(java.lang.Exception e){	
				
				    if(!(e instanceof TalendException)){
					   log.fatal(currentComponent + " " + e.getMessage(),e);
					}
				
				TalendException te = new TalendException(e, currentComponent, globalMap);
				
				throw te;
			}catch(java.lang.Error error){	
				
					runStat.stopThreadStat();
				
				throw error;
			}finally{
				
					     			//free memory for "tMap_1"
					     			globalMap.remove("tHash_Lookup_HCPTOINTERACTIONCOM"); 
				     			
					     			//free memory for "tMap_1"
					     			globalMap.remove("tHash_Lookup_INTERACTIONSCOM"); 
				     			
					     			//free memory for "tMap_1"
					     			globalMap.remove("tHash_Lookup_HCPADDRESSES"); 
				     			
					     			//free memory for "tMap_1"
					     			globalMap.remove("tHash_Lookup_PRODUCT"); 
				     			
					     			//free memory for "tMap_1"
					     			globalMap.remove("tHash_Lookup_RECIPIENT_STATE"); 
				     			
					     			//free memory for "tMap_1"
					     			globalMap.remove("tHash_Lookup_RECIPIENT_COUNTRY"); 
				     			
					     			//free memory for "tMap_1"
					     			globalMap.remove("tHash_Lookup_RECIPIENT_TYPE"); 
				     			
				try{
					
	
	/**
	 * [tDBInput_1 finally ] start
	 */

	

	
	
	currentComponent="tDBInput_1";

	
// finally of generic


if(resourceMap.get("finish_tDBInput_1")==null){
    if(resourceMap.get("reader_tDBInput_1")!=null){
		try {
			((org.talend.components.api.component.runtime.Reader)resourceMap.get("reader_tDBInput_1")).close();
		} catch (java.io.IOException e_tDBInput_1) {
			String errorMessage_tDBInput_1 = "failed to release the resource in tDBInput_1 :" + e_tDBInput_1.getMessage();
			System.err.println(errorMessage_tDBInput_1);
		}
	}
}
 



/**
 * [tDBInput_1 finally ] stop
 */

	
	/**
	 * [tMap_1 finally ] start
	 */

	

	
	
	currentComponent="tMap_1";

	

 



/**
 * [tMap_1 finally ] stop
 */

	
	/**
	 * [tDBOutput_1 finally ] start
	 */

	

	
	
	currentComponent="tDBOutput_1";

	
// finally of generic


if(resourceMap.get("finish_tDBOutput_1")==null){
    if(resourceMap.get("writer_tDBOutput_1")!=null){
		try {
			((org.talend.components.api.component.runtime.Writer)resourceMap.get("writer_tDBOutput_1")).close();
		} catch (java.io.IOException e_tDBOutput_1) {
			String errorMessage_tDBOutput_1 = "failed to release the resource in tDBOutput_1 :" + e_tDBOutput_1.getMessage();
			System.err.println(errorMessage_tDBOutput_1);
		}
	}
}
 



/**
 * [tDBOutput_1 finally ] stop
 */






				}catch(java.lang.Exception e){	
					//ignore
				}catch(java.lang.Error error){
					//ignore
				}
				resourceMap = null;
			}
		

		globalMap.put("tDBInput_1_SUBPROCESS_STATE", 1);
	}
	

public void tDBCommit_1Process(final java.util.Map<String, Object> globalMap) throws TalendException {
	globalMap.put("tDBCommit_1_SUBPROCESS_STATE", 0);

 final boolean execStat = this.execStat;
	
		String iterateId = "";
	
	
	String currentComponent = "";
	java.util.Map<String, Object> resourceMap = new java.util.HashMap<String, Object>();

	try {
			// TDI-39566 avoid throwing an useless Exception
			boolean resumeIt = true;
			if (globalResumeTicket == false && resumeEntryMethodName != null) {
				String currentMethodName = new java.lang.Exception().getStackTrace()[0].getMethodName();
				resumeIt = resumeEntryMethodName.equals(currentMethodName);
			}
			if (resumeIt || globalResumeTicket) { //start the resume
				globalResumeTicket = true;





	
	/**
	 * [tDBCommit_1 begin ] start
	 */

	

	
		
		ok_Hash.put("tDBCommit_1", false);
		start_Hash.put("tDBCommit_1", System.currentTimeMillis());
		
	
	currentComponent="tDBCommit_1";

	
		int tos_count_tDBCommit_1 = 0;
		
			if(enableLogStash) {
				talendJobLog.addCM("tDBCommit_1", "tDBCommit_1", "tSnowflakeCommit");
				talendJobLogProcess(globalMap);
			}
			

boolean doesNodeBelongToRequest_tDBCommit_1 = 0 == 0;
@SuppressWarnings("unchecked")
java.util.Map<String, Object> restRequest_tDBCommit_1 = (java.util.Map<String, Object>)globalMap.get("restRequest");
String currentTRestRequestOperation_tDBCommit_1 = (String)(restRequest_tDBCommit_1 != null ? restRequest_tDBCommit_1.get("OPERATION") : null);

org.talend.components.api.component.ComponentDefinition def_tDBCommit_1 =
        new org.talend.components.snowflake.tsnowflakecommit.TSnowflakeCommitDefinition();

org.talend.components.api.component.runtime.Writer writer_tDBCommit_1 = null;
org.talend.components.api.component.runtime.Reader reader_tDBCommit_1 = null;


org.talend.components.snowflake.SnowflakeRollbackAndCommitProperties props_tDBCommit_1 =
        (org.talend.components.snowflake.SnowflakeRollbackAndCommitProperties) def_tDBCommit_1.createRuntimeProperties();
 		                    props_tDBCommit_1.setValue("closeConnection",
 		                    true);
 		                    
 		                    props_tDBCommit_1.referencedComponent.setValue("referenceType",
 		                        org.talend.components.api.properties.ComponentReferenceProperties.ReferenceType.COMPONENT_INSTANCE);
 		                    
 		                    props_tDBCommit_1.referencedComponent.setValue("componentInstanceId",
 		                    "tDBConnection_1");
 		                    
 		                    props_tDBCommit_1.referencedComponent.setValue("referenceDefinitionName",
 		                    "tSnowflakeConnection");
 		                    
    if (org.talend.components.api.properties.ComponentReferenceProperties.ReferenceType.COMPONENT_INSTANCE == props_tDBCommit_1.referencedComponent.referenceType.getValue()) {
        final String referencedComponentInstanceId_tDBCommit_1 = props_tDBCommit_1.referencedComponent.componentInstanceId.getStringValue();
        if (referencedComponentInstanceId_tDBCommit_1 != null) {
            org.talend.daikon.properties.Properties referencedComponentProperties_tDBCommit_1 = (org.talend.daikon.properties.Properties) globalMap.get(
                referencedComponentInstanceId_tDBCommit_1 + "_COMPONENT_RUNTIME_PROPERTIES");
            props_tDBCommit_1.referencedComponent.setReference(referencedComponentProperties_tDBCommit_1);
        }
    }
globalMap.put("tDBCommit_1_COMPONENT_RUNTIME_PROPERTIES", props_tDBCommit_1);
globalMap.putIfAbsent("TALEND_PRODUCT_VERSION", "8.0");
globalMap.put("TALEND_COMPONENTS_VERSION", "0.37.4");
java.net.URL mappings_url_tDBCommit_1= this.getClass().getResource("/xmlMappings");
globalMap.put("tDBCommit_1_MAPPINGS_URL", mappings_url_tDBCommit_1);

org.talend.components.api.container.RuntimeContainer container_tDBCommit_1 = new org.talend.components.api.container.RuntimeContainer() {
    public Object getComponentData(String componentId, String key) {
        return globalMap.get(componentId + "_" + key);
    }

    public void setComponentData(String componentId, String key, Object data) {
        globalMap.put(componentId + "_" + key, data);
    }

    public String getCurrentComponentId() {
        return "tDBCommit_1";
    }

    public Object getGlobalData(String key) {
    	return globalMap.get(key);
    }
};

int nb_line_tDBCommit_1 = 0;

org.talend.components.api.component.ConnectorTopology topology_tDBCommit_1 = null;
topology_tDBCommit_1 = org.talend.components.api.component.ConnectorTopology.NONE;

org.talend.daikon.runtime.RuntimeInfo runtime_info_tDBCommit_1 = def_tDBCommit_1.getRuntimeInfo(
    org.talend.components.api.component.runtime.ExecutionEngine.DI, props_tDBCommit_1, topology_tDBCommit_1);
java.util.Set<org.talend.components.api.component.ConnectorTopology> supported_connector_topologies_tDBCommit_1 = def_tDBCommit_1.getSupportedConnectorTopologies();

org.talend.components.api.component.runtime.RuntimableRuntime componentRuntime_tDBCommit_1 = (org.talend.components.api.component.runtime.RuntimableRuntime)(Class.forName(runtime_info_tDBCommit_1.getRuntimeClassName()).newInstance());
org.talend.daikon.properties.ValidationResult initVr_tDBCommit_1 = componentRuntime_tDBCommit_1.initialize(container_tDBCommit_1, props_tDBCommit_1);

if (initVr_tDBCommit_1.getStatus() == org.talend.daikon.properties.ValidationResult.Result.ERROR ) {
    throw new RuntimeException(initVr_tDBCommit_1.getMessage());
}

if(componentRuntime_tDBCommit_1 instanceof org.talend.components.api.component.runtime.ComponentDriverInitialization) {
	org.talend.components.api.component.runtime.ComponentDriverInitialization compDriverInitialization_tDBCommit_1 = (org.talend.components.api.component.runtime.ComponentDriverInitialization)componentRuntime_tDBCommit_1;
	compDriverInitialization_tDBCommit_1.runAtDriver(container_tDBCommit_1);
}

org.talend.components.api.component.runtime.SourceOrSink sourceOrSink_tDBCommit_1 = null;
if(componentRuntime_tDBCommit_1 instanceof org.talend.components.api.component.runtime.SourceOrSink) {
	sourceOrSink_tDBCommit_1 = (org.talend.components.api.component.runtime.SourceOrSink)componentRuntime_tDBCommit_1;
	if (doesNodeBelongToRequest_tDBCommit_1) {
        org.talend.daikon.properties.ValidationResult vr_tDBCommit_1 = sourceOrSink_tDBCommit_1.validate(container_tDBCommit_1);
        if (vr_tDBCommit_1.getStatus() == org.talend.daikon.properties.ValidationResult.Result.ERROR ) {
            throw new RuntimeException(vr_tDBCommit_1.getMessage());
        }
	}
}

 



/**
 * [tDBCommit_1 begin ] stop
 */
	
	/**
	 * [tDBCommit_1 main ] start
	 */

	

	
	
	currentComponent="tDBCommit_1";

	


 


	tos_count_tDBCommit_1++;

/**
 * [tDBCommit_1 main ] stop
 */
	
	/**
	 * [tDBCommit_1 process_data_begin ] start
	 */

	

	
	
	currentComponent="tDBCommit_1";

	


 



/**
 * [tDBCommit_1 process_data_begin ] stop
 */
	
	/**
	 * [tDBCommit_1 process_data_end ] start
	 */

	

	
	
	currentComponent="tDBCommit_1";

	


 



/**
 * [tDBCommit_1 process_data_end ] stop
 */
	
	/**
	 * [tDBCommit_1 end ] start
	 */

	

	
	
	currentComponent="tDBCommit_1";

	
// end of generic

 

ok_Hash.put("tDBCommit_1", true);
end_Hash.put("tDBCommit_1", System.currentTimeMillis());




/**
 * [tDBCommit_1 end ] stop
 */
				}//end the resume

				



	
			}catch(java.lang.Exception e){	
				
				    if(!(e instanceof TalendException)){
					   log.fatal(currentComponent + " " + e.getMessage(),e);
					}
				
				TalendException te = new TalendException(e, currentComponent, globalMap);
				
				throw te;
			}catch(java.lang.Error error){	
				
					runStat.stopThreadStat();
				
				throw error;
			}finally{
				
				try{
					
	
	/**
	 * [tDBCommit_1 finally ] start
	 */

	

	
	
	currentComponent="tDBCommit_1";

	
// finally of generic

 



/**
 * [tDBCommit_1 finally ] stop
 */
				}catch(java.lang.Exception e){	
					//ignore
				}catch(java.lang.Error error){
					//ignore
				}
				resourceMap = null;
			}
		

		globalMap.put("tDBCommit_1_SUBPROCESS_STATE", 1);
	}
	

public void tDBRollback_1Process(final java.util.Map<String, Object> globalMap) throws TalendException {
	globalMap.put("tDBRollback_1_SUBPROCESS_STATE", 0);

 final boolean execStat = this.execStat;
	
		String iterateId = "";
	
	
	String currentComponent = "";
	java.util.Map<String, Object> resourceMap = new java.util.HashMap<String, Object>();

	try {
			// TDI-39566 avoid throwing an useless Exception
			boolean resumeIt = true;
			if (globalResumeTicket == false && resumeEntryMethodName != null) {
				String currentMethodName = new java.lang.Exception().getStackTrace()[0].getMethodName();
				resumeIt = resumeEntryMethodName.equals(currentMethodName);
			}
			if (resumeIt || globalResumeTicket) { //start the resume
				globalResumeTicket = true;





	
	/**
	 * [tDBRollback_1 begin ] start
	 */

	

	
		
		ok_Hash.put("tDBRollback_1", false);
		start_Hash.put("tDBRollback_1", System.currentTimeMillis());
		
	
	currentComponent="tDBRollback_1";

	
		int tos_count_tDBRollback_1 = 0;
		
			if(enableLogStash) {
				talendJobLog.addCM("tDBRollback_1", "tDBRollback_1", "tSnowflakeRollback");
				talendJobLogProcess(globalMap);
			}
			

boolean doesNodeBelongToRequest_tDBRollback_1 = 0 == 0;
@SuppressWarnings("unchecked")
java.util.Map<String, Object> restRequest_tDBRollback_1 = (java.util.Map<String, Object>)globalMap.get("restRequest");
String currentTRestRequestOperation_tDBRollback_1 = (String)(restRequest_tDBRollback_1 != null ? restRequest_tDBRollback_1.get("OPERATION") : null);

org.talend.components.api.component.ComponentDefinition def_tDBRollback_1 =
        new org.talend.components.snowflake.tsnowflakerollback.TSnowflakeRollbackDefinition();

org.talend.components.api.component.runtime.Writer writer_tDBRollback_1 = null;
org.talend.components.api.component.runtime.Reader reader_tDBRollback_1 = null;


org.talend.components.snowflake.SnowflakeRollbackAndCommitProperties props_tDBRollback_1 =
        (org.talend.components.snowflake.SnowflakeRollbackAndCommitProperties) def_tDBRollback_1.createRuntimeProperties();
 		                    props_tDBRollback_1.setValue("closeConnection",
 		                    true);
 		                    
 		                    props_tDBRollback_1.referencedComponent.setValue("referenceType",
 		                        org.talend.components.api.properties.ComponentReferenceProperties.ReferenceType.COMPONENT_INSTANCE);
 		                    
 		                    props_tDBRollback_1.referencedComponent.setValue("componentInstanceId",
 		                    "tDBConnection_1");
 		                    
 		                    props_tDBRollback_1.referencedComponent.setValue("referenceDefinitionName",
 		                    "tSnowflakeConnection");
 		                    
    if (org.talend.components.api.properties.ComponentReferenceProperties.ReferenceType.COMPONENT_INSTANCE == props_tDBRollback_1.referencedComponent.referenceType.getValue()) {
        final String referencedComponentInstanceId_tDBRollback_1 = props_tDBRollback_1.referencedComponent.componentInstanceId.getStringValue();
        if (referencedComponentInstanceId_tDBRollback_1 != null) {
            org.talend.daikon.properties.Properties referencedComponentProperties_tDBRollback_1 = (org.talend.daikon.properties.Properties) globalMap.get(
                referencedComponentInstanceId_tDBRollback_1 + "_COMPONENT_RUNTIME_PROPERTIES");
            props_tDBRollback_1.referencedComponent.setReference(referencedComponentProperties_tDBRollback_1);
        }
    }
globalMap.put("tDBRollback_1_COMPONENT_RUNTIME_PROPERTIES", props_tDBRollback_1);
globalMap.putIfAbsent("TALEND_PRODUCT_VERSION", "8.0");
globalMap.put("TALEND_COMPONENTS_VERSION", "0.37.4");
java.net.URL mappings_url_tDBRollback_1= this.getClass().getResource("/xmlMappings");
globalMap.put("tDBRollback_1_MAPPINGS_URL", mappings_url_tDBRollback_1);

org.talend.components.api.container.RuntimeContainer container_tDBRollback_1 = new org.talend.components.api.container.RuntimeContainer() {
    public Object getComponentData(String componentId, String key) {
        return globalMap.get(componentId + "_" + key);
    }

    public void setComponentData(String componentId, String key, Object data) {
        globalMap.put(componentId + "_" + key, data);
    }

    public String getCurrentComponentId() {
        return "tDBRollback_1";
    }

    public Object getGlobalData(String key) {
    	return globalMap.get(key);
    }
};

int nb_line_tDBRollback_1 = 0;

org.talend.components.api.component.ConnectorTopology topology_tDBRollback_1 = null;
topology_tDBRollback_1 = org.talend.components.api.component.ConnectorTopology.NONE;

org.talend.daikon.runtime.RuntimeInfo runtime_info_tDBRollback_1 = def_tDBRollback_1.getRuntimeInfo(
    org.talend.components.api.component.runtime.ExecutionEngine.DI, props_tDBRollback_1, topology_tDBRollback_1);
java.util.Set<org.talend.components.api.component.ConnectorTopology> supported_connector_topologies_tDBRollback_1 = def_tDBRollback_1.getSupportedConnectorTopologies();

org.talend.components.api.component.runtime.RuntimableRuntime componentRuntime_tDBRollback_1 = (org.talend.components.api.component.runtime.RuntimableRuntime)(Class.forName(runtime_info_tDBRollback_1.getRuntimeClassName()).newInstance());
org.talend.daikon.properties.ValidationResult initVr_tDBRollback_1 = componentRuntime_tDBRollback_1.initialize(container_tDBRollback_1, props_tDBRollback_1);

if (initVr_tDBRollback_1.getStatus() == org.talend.daikon.properties.ValidationResult.Result.ERROR ) {
    throw new RuntimeException(initVr_tDBRollback_1.getMessage());
}

if(componentRuntime_tDBRollback_1 instanceof org.talend.components.api.component.runtime.ComponentDriverInitialization) {
	org.talend.components.api.component.runtime.ComponentDriverInitialization compDriverInitialization_tDBRollback_1 = (org.talend.components.api.component.runtime.ComponentDriverInitialization)componentRuntime_tDBRollback_1;
	compDriverInitialization_tDBRollback_1.runAtDriver(container_tDBRollback_1);
}

org.talend.components.api.component.runtime.SourceOrSink sourceOrSink_tDBRollback_1 = null;
if(componentRuntime_tDBRollback_1 instanceof org.talend.components.api.component.runtime.SourceOrSink) {
	sourceOrSink_tDBRollback_1 = (org.talend.components.api.component.runtime.SourceOrSink)componentRuntime_tDBRollback_1;
	if (doesNodeBelongToRequest_tDBRollback_1) {
        org.talend.daikon.properties.ValidationResult vr_tDBRollback_1 = sourceOrSink_tDBRollback_1.validate(container_tDBRollback_1);
        if (vr_tDBRollback_1.getStatus() == org.talend.daikon.properties.ValidationResult.Result.ERROR ) {
            throw new RuntimeException(vr_tDBRollback_1.getMessage());
        }
	}
}

 



/**
 * [tDBRollback_1 begin ] stop
 */
	
	/**
	 * [tDBRollback_1 main ] start
	 */

	

	
	
	currentComponent="tDBRollback_1";

	


 


	tos_count_tDBRollback_1++;

/**
 * [tDBRollback_1 main ] stop
 */
	
	/**
	 * [tDBRollback_1 process_data_begin ] start
	 */

	

	
	
	currentComponent="tDBRollback_1";

	


 



/**
 * [tDBRollback_1 process_data_begin ] stop
 */
	
	/**
	 * [tDBRollback_1 process_data_end ] start
	 */

	

	
	
	currentComponent="tDBRollback_1";

	


 



/**
 * [tDBRollback_1 process_data_end ] stop
 */
	
	/**
	 * [tDBRollback_1 end ] start
	 */

	

	
	
	currentComponent="tDBRollback_1";

	
// end of generic

 

ok_Hash.put("tDBRollback_1", true);
end_Hash.put("tDBRollback_1", System.currentTimeMillis());




/**
 * [tDBRollback_1 end ] stop
 */
				}//end the resume

				



	
			}catch(java.lang.Exception e){	
				
				    if(!(e instanceof TalendException)){
					   log.fatal(currentComponent + " " + e.getMessage(),e);
					}
				
				TalendException te = new TalendException(e, currentComponent, globalMap);
				
				throw te;
			}catch(java.lang.Error error){	
				
					runStat.stopThreadStat();
				
				throw error;
			}finally{
				
				try{
					
	
	/**
	 * [tDBRollback_1 finally ] start
	 */

	

	
	
	currentComponent="tDBRollback_1";

	
// finally of generic

 



/**
 * [tDBRollback_1 finally ] stop
 */
				}catch(java.lang.Exception e){	
					//ignore
				}catch(java.lang.Error error){
					//ignore
				}
				resourceMap = null;
			}
		

		globalMap.put("tDBRollback_1_SUBPROCESS_STATE", 1);
	}
	


public static class HCPTOINTERACTIONCOMStruct implements routines.system.IPersistableComparableLookupRow<HCPTOINTERACTIONCOMStruct> {
    final static byte[] commonByteArrayLock_USCOMM_SUNSHINE_RPT_QA_BEACON_EXTRACT_SNOWFLAKE = new byte[0];
    static byte[] commonByteArray_USCOMM_SUNSHINE_RPT_QA_BEACON_EXTRACT_SNOWFLAKE = new byte[0];
	protected static final int DEFAULT_HASHCODE = 1;
    protected static final int PRIME = 31;
    protected int hashCode = DEFAULT_HASHCODE;
    public boolean hashCodeDirty = true;

    public String loopKey;



	
			    public String INTERACTION_ID;

				public String getINTERACTION_ID () {
					return this.INTERACTION_ID;
				}

				public Boolean INTERACTION_IDIsNullable(){
				    return false;
				}
				public Boolean INTERACTION_IDIsKey(){
				    return true;
				}
				public Integer INTERACTION_IDLength(){
				    return 10;
				}
				public Integer INTERACTION_IDPrecision(){
				    return null;
				}
				public String INTERACTION_IDDefault(){
				
					return null;
				
				}
				public String INTERACTION_IDComment(){
				
				    return "";
				
				}
				public String INTERACTION_IDPattern(){
				
					return "";
				
				}
				public String INTERACTION_IDOriginalDbColumnName(){
				
					return "INTERACTION_ID";
				
				}

				
			    public String HCP_LEGEND_ID;

				public String getHCP_LEGEND_ID () {
					return this.HCP_LEGEND_ID;
				}

				public Boolean HCP_LEGEND_IDIsNullable(){
				    return false;
				}
				public Boolean HCP_LEGEND_IDIsKey(){
				    return true;
				}
				public Integer HCP_LEGEND_IDLength(){
				    return 10;
				}
				public Integer HCP_LEGEND_IDPrecision(){
				    return null;
				}
				public String HCP_LEGEND_IDDefault(){
				
					return null;
				
				}
				public String HCP_LEGEND_IDComment(){
				
				    return "";
				
				}
				public String HCP_LEGEND_IDPattern(){
				
					return "";
				
				}
				public String HCP_LEGEND_IDOriginalDbColumnName(){
				
					return "HCP_LEGEND_ID";
				
				}

				
			    public java.util.Date DATA_THROUGH_DATE;

				public java.util.Date getDATA_THROUGH_DATE () {
					return this.DATA_THROUGH_DATE;
				}

				public Boolean DATA_THROUGH_DATEIsNullable(){
				    return true;
				}
				public Boolean DATA_THROUGH_DATEIsKey(){
				    return false;
				}
				public Integer DATA_THROUGH_DATELength(){
				    return null;
				}
				public Integer DATA_THROUGH_DATEPrecision(){
				    return null;
				}
				public String DATA_THROUGH_DATEDefault(){
				
					return null;
				
				}
				public String DATA_THROUGH_DATEComment(){
				
				    return "";
				
				}
				public String DATA_THROUGH_DATEPattern(){
				
					return "yyyy-MM-dd";
				
				}
				public String DATA_THROUGH_DATEOriginalDbColumnName(){
				
					return "DATA_THROUGH_DATE";
				
				}

				


	@Override
	public int hashCode() {
		if (this.hashCodeDirty) {
			final int prime = PRIME;
			int result = DEFAULT_HASHCODE;
	
						result = prime * result + ((this.HCP_LEGEND_ID == null) ? 0 : this.HCP_LEGEND_ID.hashCode());
					
    		this.hashCode = result;
    		this.hashCodeDirty = false;
		}
		return this.hashCode;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) return true;
		if (obj == null) return false;
		if (getClass() != obj.getClass()) return false;
		final HCPTOINTERACTIONCOMStruct other = (HCPTOINTERACTIONCOMStruct) obj;
		
						if (this.HCP_LEGEND_ID == null) {
							if (other.HCP_LEGEND_ID != null)
								return false;
						
						} else if (!this.HCP_LEGEND_ID.equals(other.HCP_LEGEND_ID))
						
							return false;
					

		return true;
    }

	public void copyDataTo(HCPTOINTERACTIONCOMStruct other) {

		other.INTERACTION_ID = this.INTERACTION_ID;
	            other.HCP_LEGEND_ID = this.HCP_LEGEND_ID;
	            other.DATA_THROUGH_DATE = this.DATA_THROUGH_DATE;
	            
	}

	public void copyKeysDataTo(HCPTOINTERACTIONCOMStruct other) {

		other.HCP_LEGEND_ID = this.HCP_LEGEND_ID;
	            	
	}



	
	private String readString(DataInputStream dis, ObjectInputStream ois) throws IOException{
		String strReturn = null;
		int length = 0;
        length = dis.readInt();
		if (length == -1) {
			strReturn = null;
		} else {
			byte[] byteArray = new byte[length];
			dis.read(byteArray);
			strReturn = new String(byteArray, utf8Charset);
		}
		return strReturn;
	}
	
	private String readString(DataInputStream dis, org.jboss.marshalling.Unmarshaller unmarshaller) throws IOException{
		String strReturn = null;
		int length = 0;
        length = unmarshaller.readInt();
		if (length == -1) {
			strReturn = null;
		} else {
			byte[] byteArray = new byte[length];
			unmarshaller.read(byteArray);
			strReturn = new String(byteArray, utf8Charset);
		}
		return strReturn;
	}
	
	private void writeString(String str, DataOutputStream dos, org.jboss.marshalling.Marshaller marshaller) throws IOException{
		if(str == null) {
			marshaller.writeInt(-1);
		} else {
            byte[] byteArray = str.getBytes(utf8Charset);
            marshaller.writeInt(byteArray.length);
            marshaller.write(byteArray);
    	}
	}

	private void writeString(String str, DataOutputStream dos, ObjectOutputStream oos) throws IOException{
		if(str == null) {
            dos.writeInt(-1);
		} else {
            byte[] byteArray = str.getBytes(utf8Charset);
	    	dos.writeInt(byteArray.length);
			dos.write(byteArray);
    	}
	}

	private String readString(ObjectInputStream dis) throws IOException{
		String strReturn = null;
		int length = 0;
        length = dis.readInt();
		if (length == -1) {
			strReturn = null;
		} else {
			if(length > commonByteArray_USCOMM_SUNSHINE_RPT_QA_BEACON_EXTRACT_SNOWFLAKE.length) {
				if(length < 1024 && commonByteArray_USCOMM_SUNSHINE_RPT_QA_BEACON_EXTRACT_SNOWFLAKE.length == 0) {
   					commonByteArray_USCOMM_SUNSHINE_RPT_QA_BEACON_EXTRACT_SNOWFLAKE = new byte[1024];
				} else {
   					commonByteArray_USCOMM_SUNSHINE_RPT_QA_BEACON_EXTRACT_SNOWFLAKE = new byte[2 * length];
   				}
			}
			dis.readFully(commonByteArray_USCOMM_SUNSHINE_RPT_QA_BEACON_EXTRACT_SNOWFLAKE, 0, length);
			strReturn = new String(commonByteArray_USCOMM_SUNSHINE_RPT_QA_BEACON_EXTRACT_SNOWFLAKE, 0, length, utf8Charset);
		}
		return strReturn;
	}
	
	private String readString(org.jboss.marshalling.Unmarshaller unmarshaller) throws IOException{
		String strReturn = null;
		int length = 0;
        length = unmarshaller.readInt();
		if (length == -1) {
			strReturn = null;
		} else {
			if(length > commonByteArray_USCOMM_SUNSHINE_RPT_QA_BEACON_EXTRACT_SNOWFLAKE.length) {
				if(length < 1024 && commonByteArray_USCOMM_SUNSHINE_RPT_QA_BEACON_EXTRACT_SNOWFLAKE.length == 0) {
   					commonByteArray_USCOMM_SUNSHINE_RPT_QA_BEACON_EXTRACT_SNOWFLAKE = new byte[1024];
				} else {
   					commonByteArray_USCOMM_SUNSHINE_RPT_QA_BEACON_EXTRACT_SNOWFLAKE = new byte[2 * length];
   				}
			}
			unmarshaller.readFully(commonByteArray_USCOMM_SUNSHINE_RPT_QA_BEACON_EXTRACT_SNOWFLAKE, 0, length);
			strReturn = new String(commonByteArray_USCOMM_SUNSHINE_RPT_QA_BEACON_EXTRACT_SNOWFLAKE, 0, length, utf8Charset);
		}
		return strReturn;
	}

    private void writeString(String str, ObjectOutputStream dos) throws IOException{
		if(str == null) {
            dos.writeInt(-1);
		} else {
            byte[] byteArray = str.getBytes(utf8Charset);
	    	dos.writeInt(byteArray.length);
			dos.write(byteArray);
    	}
    }
    
    private void writeString(String str, org.jboss.marshalling.Marshaller marshaller) throws IOException{
		if(str == null) {
			marshaller.writeInt(-1);
		} else {
            byte[] byteArray = str.getBytes(utf8Charset);
            marshaller.writeInt(byteArray.length);
            marshaller.write(byteArray);
    	}
    }

	private java.util.Date readDate(DataInputStream dis, ObjectInputStream ois) throws IOException{
		java.util.Date dateReturn = null;
		int length = 0;
        length = dis.readByte();
		if (length == -1) {
			dateReturn = null;
		} else {
	    	dateReturn = new Date(dis.readLong());
		}
		return dateReturn;
	}
	
	private java.util.Date readDate(DataInputStream dis, org.jboss.marshalling.Unmarshaller unmarshaller ) throws IOException{
		java.util.Date dateReturn = null;
		int length = 0;
        length = unmarshaller.readByte();
		if (length == -1) {
			dateReturn = null;
		} else {
	    	dateReturn = new Date(unmarshaller.readLong());
		}
		return dateReturn;
	}

	private void writeDate(java.util.Date date1, DataOutputStream dos, ObjectOutputStream oos) throws IOException{
		if(date1 == null) {
            dos.writeByte(-1);
		} else {
			dos.writeByte(0);
	    	dos.writeLong(date1.getTime());
    	}
	}
	
	private void writeDate(java.util.Date date1, DataOutputStream dos, org.jboss.marshalling.Marshaller marshaller) throws IOException{
		if(date1 == null) {
			marshaller.writeByte(-1);
		} else {
			marshaller.writeByte(0);
			marshaller.writeLong(date1.getTime());
    	}
	}

    public void readKeysData(ObjectInputStream dis) {

		synchronized(commonByteArrayLock_USCOMM_SUNSHINE_RPT_QA_BEACON_EXTRACT_SNOWFLAKE) {

        	try {

        		int length = 0;
		
					this.HCP_LEGEND_ID = readString(dis);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);

		

        }

		

      }


    }
    
    public void readKeysData(org.jboss.marshalling.Unmarshaller dis) {

		synchronized(commonByteArrayLock_USCOMM_SUNSHINE_RPT_QA_BEACON_EXTRACT_SNOWFLAKE) {

        	try {

        		int length = 0;
		
					this.HCP_LEGEND_ID = readString(dis);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);

		

        }

		

      }


    }

    public void writeKeysData(ObjectOutputStream dos) {
        try {

		
					// String
				
						writeString(this.HCP_LEGEND_ID,dos);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);
        }


    }
    
    public void writeKeysData(org.jboss.marshalling.Marshaller dos) {
        try {

		
					// String
				
						writeString(this.HCP_LEGEND_ID,dos);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);
        }


    }



    /**
     * Fill Values data by reading ObjectInputStream.
     */
    public void readValuesData(DataInputStream dis, ObjectInputStream ois) {
        try {

			int length = 0;
		
						this.INTERACTION_ID = readString(dis,ois);
					
						this.DATA_THROUGH_DATE = readDate(dis,ois);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);

		

        }

		

    }
    
    public void readValuesData(DataInputStream dis, org.jboss.marshalling.Unmarshaller objectIn) {
        try {
			int length = 0;
		
						this.INTERACTION_ID = readString(dis,objectIn);
					
						this.DATA_THROUGH_DATE = readDate(dis,objectIn);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);

		

        }

		

    }

    /**
     * Return a byte array which represents Values data.
     */
    public void writeValuesData(DataOutputStream dos, ObjectOutputStream oos) {
        try {

		
						writeString(this.INTERACTION_ID, dos, oos);
					
						writeDate(this.DATA_THROUGH_DATE, dos, oos);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);
        	}

    }
    
    public void writeValuesData(DataOutputStream dos, org.jboss.marshalling.Marshaller objectOut){
                try {

		
						writeString(this.INTERACTION_ID, dos, objectOut);
					
						writeDate(this.DATA_THROUGH_DATE, dos, objectOut);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);
        	}
    }


    
    public boolean supportMarshaller(){
        return true;
    }


    public String toString() {

		StringBuilder sb = new StringBuilder();
		sb.append(super.toString());
		sb.append("[");
		sb.append("INTERACTION_ID="+INTERACTION_ID);
		sb.append(",HCP_LEGEND_ID="+HCP_LEGEND_ID);
		sb.append(",DATA_THROUGH_DATE="+String.valueOf(DATA_THROUGH_DATE));
	    sb.append("]");

	    return sb.toString();
    }
        public String toLogString(){
        	StringBuilder sb = new StringBuilder();
        	
        				if(INTERACTION_ID == null){
        					sb.append("<null>");
        				}else{
            				sb.append(INTERACTION_ID);
            			}
            		
        			sb.append("|");
        		
        				if(HCP_LEGEND_ID == null){
        					sb.append("<null>");
        				}else{
            				sb.append(HCP_LEGEND_ID);
            			}
            		
        			sb.append("|");
        		
        				if(DATA_THROUGH_DATE == null){
        					sb.append("<null>");
        				}else{
            				sb.append(DATA_THROUGH_DATE);
            			}
            		
        			sb.append("|");
        		
        	return sb.toString();
        }

    /**
     * Compare keys
     */
    public int compareTo(HCPTOINTERACTIONCOMStruct other) {

		int returnValue = -1;
		
						returnValue = checkNullsAndCompare(this.HCP_LEGEND_ID, other.HCP_LEGEND_ID);
						if(returnValue != 0) {
							return returnValue;
						}

					
	    return returnValue;
    }


    private int checkNullsAndCompare(Object object1, Object object2) {
        int returnValue = 0;
		if (object1 instanceof Comparable && object2 instanceof Comparable) {
            returnValue = ((Comparable) object1).compareTo(object2);
        } else if (object1 != null && object2 != null) {
            returnValue = compareStrings(object1.toString(), object2.toString());
        } else if (object1 == null && object2 != null) {
            returnValue = 1;
        } else if (object1 != null && object2 == null) {
            returnValue = -1;
        } else {
            returnValue = 0;
        }

        return returnValue;
    }

    private int compareStrings(String string1, String string2) {
        return string1.compareTo(string2);
    }


}
public void tDBInput_2Process(final java.util.Map<String, Object> globalMap) throws TalendException {
	globalMap.put("tDBInput_2_SUBPROCESS_STATE", 0);

 final boolean execStat = this.execStat;
	
		String iterateId = "";
	
	
	String currentComponent = "";
	java.util.Map<String, Object> resourceMap = new java.util.HashMap<String, Object>();

	try {
			// TDI-39566 avoid throwing an useless Exception
			boolean resumeIt = true;
			if (globalResumeTicket == false && resumeEntryMethodName != null) {
				String currentMethodName = new java.lang.Exception().getStackTrace()[0].getMethodName();
				resumeIt = resumeEntryMethodName.equals(currentMethodName);
			}
			if (resumeIt || globalResumeTicket) { //start the resume
				globalResumeTicket = true;



		HCPTOINTERACTIONCOMStruct HCPTOINTERACTIONCOM = new HCPTOINTERACTIONCOMStruct();




	
	/**
	 * [tAdvancedHash_HCPTOINTERACTIONCOM begin ] start
	 */

	

	
		
		ok_Hash.put("tAdvancedHash_HCPTOINTERACTIONCOM", false);
		start_Hash.put("tAdvancedHash_HCPTOINTERACTIONCOM", System.currentTimeMillis());
		
	
	currentComponent="tAdvancedHash_HCPTOINTERACTIONCOM";

	
			runStat.updateStatAndLog(execStat,enableLogStash,resourceMap,iterateId,0,0,"HCPTOINTERACTIONCOM");
			
		int tos_count_tAdvancedHash_HCPTOINTERACTIONCOM = 0;
		
			if(enableLogStash) {
				talendJobLog.addCM("tAdvancedHash_HCPTOINTERACTIONCOM", "tAdvancedHash_HCPTOINTERACTIONCOM", "tAdvancedHash");
				talendJobLogProcess(globalMap);
			}
			

			   		// connection name:HCPTOINTERACTIONCOM
			   		// source node:tDBInput_2 - inputs:(after_tDBInput_1) outputs:(HCPTOINTERACTIONCOM,HCPTOINTERACTIONCOM) | target node:tAdvancedHash_HCPTOINTERACTIONCOM - inputs:(HCPTOINTERACTIONCOM) outputs:()
			   		// linked node: tMap_1 - inputs:(HCPS,HCPTOINTERACTIONCOM,INTERACTIONSCOM,HCPADDRESSES,PRODUCT,RECIPIENT_STATE,RECIPIENT_COUNTRY,RECIPIENT_TYPE) outputs:(OUTPUT)
			   
			   		org.talend.designer.components.lookup.common.ICommonLookup.MATCHING_MODE matchingModeEnum_HCPTOINTERACTIONCOM = 
			   			org.talend.designer.components.lookup.common.ICommonLookup.MATCHING_MODE.UNIQUE_MATCH;
			   			
			   
	   			org.talend.designer.components.lookup.memory.AdvancedMemoryLookup<HCPTOINTERACTIONCOMStruct> tHash_Lookup_HCPTOINTERACTIONCOM =org.talend.designer.components.lookup.memory.AdvancedMemoryLookup.
	   						<HCPTOINTERACTIONCOMStruct>getLookup(matchingModeEnum_HCPTOINTERACTIONCOM);
	   						   
		   	   	   globalMap.put("tHash_Lookup_HCPTOINTERACTIONCOM", tHash_Lookup_HCPTOINTERACTIONCOM);
		   	   	   
				
           

 



/**
 * [tAdvancedHash_HCPTOINTERACTIONCOM begin ] stop
 */



	
	/**
	 * [tDBInput_2 begin ] start
	 */

	

	
		
		ok_Hash.put("tDBInput_2", false);
		start_Hash.put("tDBInput_2", System.currentTimeMillis());
		
	
	currentComponent="tDBInput_2";

	
		int tos_count_tDBInput_2 = 0;
		
			if(enableLogStash) {
				talendJobLog.addCM("tDBInput_2", "HCPTOINTERACTIONCOM", "tSnowflakeInput");
				talendJobLogProcess(globalMap);
			}
			

boolean doesNodeBelongToRequest_tDBInput_2 = 0 == 0;
@SuppressWarnings("unchecked")
java.util.Map<String, Object> restRequest_tDBInput_2 = (java.util.Map<String, Object>)globalMap.get("restRequest");
String currentTRestRequestOperation_tDBInput_2 = (String)(restRequest_tDBInput_2 != null ? restRequest_tDBInput_2.get("OPERATION") : null);

org.talend.components.api.component.ComponentDefinition def_tDBInput_2 =
        new org.talend.components.snowflake.tsnowflakeinput.TSnowflakeInputDefinition();

org.talend.components.api.component.runtime.Writer writer_tDBInput_2 = null;
org.talend.components.api.component.runtime.Reader reader_tDBInput_2 = null;


org.talend.components.snowflake.tsnowflakeinput.TSnowflakeInputProperties props_tDBInput_2 =
        (org.talend.components.snowflake.tsnowflakeinput.TSnowflakeInputProperties) def_tDBInput_2.createRuntimeProperties();
 		                    props_tDBInput_2.setValue("condition",
 		                    "");
 		                    
 		                    props_tDBInput_2.setValue("manualQuery",
 		                    false);
 		                    
 		                    props_tDBInput_2.setValue("convertColumnsAndTableToUppercase",
 		                    true);
 		                    
 		                    props_tDBInput_2.connection.setValue("useCustomRegion",
 		                    false);
 		                    
 		                    props_tDBInput_2.connection.userPassword.setValue("useAuth",
 		                    false);
 		                    
 		                    props_tDBInput_2.connection.referencedComponent.setValue("referenceType",
 		                        org.talend.components.api.properties.ComponentReferenceProperties.ReferenceType.COMPONENT_INSTANCE);
 		                    
 		                    props_tDBInput_2.connection.referencedComponent.setValue("componentInstanceId",
 		                    "tDBConnection_1");
 		                    
 		                    props_tDBInput_2.connection.referencedComponent.setValue("referenceDefinitionName",
 		                    "tSnowflakeConnection");
 		                    
 		                    props_tDBInput_2.table.setValue("tableName",
 		                    "HCPTOINTERACTIONCOM");
 		                    
 		                    props_tDBInput_2.table.connection.setValue("useCustomRegion",
 		                    false);
 		                    
 		                    props_tDBInput_2.table.connection.userPassword.setValue("useAuth",
 		                    false);
 		                    
 		                    props_tDBInput_2.table.connection.referencedComponent.setValue("referenceType",
 		                        org.talend.components.api.properties.ComponentReferenceProperties.ReferenceType.COMPONENT_INSTANCE);
 		                    
 		                    props_tDBInput_2.table.connection.referencedComponent.setValue("componentInstanceId",
 		                    "tDBConnection_1");
 		                    
 		                    props_tDBInput_2.table.connection.referencedComponent.setValue("referenceDefinitionName",
 		                    "tSnowflakeConnection");
 		                    
 		                    class SchemaSettingTool_tDBInput_2_1_fisrt {
 		                    		
 		                    		String getSchemaValue() {
 		                    				
 		                    						StringBuilder s = new StringBuilder();
                    						
     		                    						a("{\"type\":\"record\",",s);
     		                    						
     		                    						a("\"name\":\"HCPTOINTERACTIONCOM\",\"fields\":[{",s);
     		                    						
     		                    						a("\"name\":\"INTERACTION_ID\",\"type\":\"string\",\"talend.field.length\":\"10\",\"talend.field.dbType\":12,\"talend.field.dbColumnName\":\"INTERACTION_ID\",\"talend.field.isKey\":\"true\"},{",s);
     		                    						
     		                    						a("\"name\":\"HCP_LEGEND_ID\",\"type\":\"string\",\"talend.field.length\":\"10\",\"talend.field.dbType\":12,\"talend.field.dbColumnName\":\"HCP_LEGEND_ID\",\"talend.field.isKey\":\"true\"},{",s);
     		                    						
     		                    						a("\"name\":\"DATA_THROUGH_DATE\",\"type\":[{\"type\":\"int\",\"logicalType\":\"date\"},\"null\"],\"talend.field.pattern\":\"yyyy-MM-dd\",\"talend.field.dbType\":91,\"talend.field.dbColumnName\":\"DATA_THROUGH_DATE\"}]}",s);
     		                    						
     		                    				return s.toString();
     		                    		
 		                    		}
 		                    		
 		                    		void a(String part, StringBuilder strB) {
 		                    				strB.append(part);
 		                    		}
 		                    		
 		                    }
 		                    
 		                    SchemaSettingTool_tDBInput_2_1_fisrt sst_tDBInput_2_1_fisrt = new SchemaSettingTool_tDBInput_2_1_fisrt();
 		                    
 		                    props_tDBInput_2.table.main.setValue("schema",
 		                        new org.apache.avro.Schema.Parser().parse(sst_tDBInput_2_1_fisrt.getSchemaValue()));
 		                    
    if (org.talend.components.api.properties.ComponentReferenceProperties.ReferenceType.COMPONENT_INSTANCE == props_tDBInput_2.connection.referencedComponent.referenceType.getValue()) {
        final String referencedComponentInstanceId_tDBInput_2 = props_tDBInput_2.connection.referencedComponent.componentInstanceId.getStringValue();
        if (referencedComponentInstanceId_tDBInput_2 != null) {
            org.talend.daikon.properties.Properties referencedComponentProperties_tDBInput_2 = (org.talend.daikon.properties.Properties) globalMap.get(
                referencedComponentInstanceId_tDBInput_2 + "_COMPONENT_RUNTIME_PROPERTIES");
            props_tDBInput_2.connection.referencedComponent.setReference(referencedComponentProperties_tDBInput_2);
        }
    }
    if (org.talend.components.api.properties.ComponentReferenceProperties.ReferenceType.COMPONENT_INSTANCE == props_tDBInput_2.table.connection.referencedComponent.referenceType.getValue()) {
        final String referencedComponentInstanceId_tDBInput_2 = props_tDBInput_2.table.connection.referencedComponent.componentInstanceId.getStringValue();
        if (referencedComponentInstanceId_tDBInput_2 != null) {
            org.talend.daikon.properties.Properties referencedComponentProperties_tDBInput_2 = (org.talend.daikon.properties.Properties) globalMap.get(
                referencedComponentInstanceId_tDBInput_2 + "_COMPONENT_RUNTIME_PROPERTIES");
            props_tDBInput_2.table.connection.referencedComponent.setReference(referencedComponentProperties_tDBInput_2);
        }
    }
globalMap.put("tDBInput_2_COMPONENT_RUNTIME_PROPERTIES", props_tDBInput_2);
globalMap.putIfAbsent("TALEND_PRODUCT_VERSION", "8.0");
globalMap.put("TALEND_COMPONENTS_VERSION", "0.37.4");
java.net.URL mappings_url_tDBInput_2= this.getClass().getResource("/xmlMappings");
globalMap.put("tDBInput_2_MAPPINGS_URL", mappings_url_tDBInput_2);

org.talend.components.api.container.RuntimeContainer container_tDBInput_2 = new org.talend.components.api.container.RuntimeContainer() {
    public Object getComponentData(String componentId, String key) {
        return globalMap.get(componentId + "_" + key);
    }

    public void setComponentData(String componentId, String key, Object data) {
        globalMap.put(componentId + "_" + key, data);
    }

    public String getCurrentComponentId() {
        return "tDBInput_2";
    }

    public Object getGlobalData(String key) {
    	return globalMap.get(key);
    }
};

int nb_line_tDBInput_2 = 0;

org.talend.components.api.component.ConnectorTopology topology_tDBInput_2 = null;
topology_tDBInput_2 = org.talend.components.api.component.ConnectorTopology.OUTGOING;

org.talend.daikon.runtime.RuntimeInfo runtime_info_tDBInput_2 = def_tDBInput_2.getRuntimeInfo(
    org.talend.components.api.component.runtime.ExecutionEngine.DI, props_tDBInput_2, topology_tDBInput_2);
java.util.Set<org.talend.components.api.component.ConnectorTopology> supported_connector_topologies_tDBInput_2 = def_tDBInput_2.getSupportedConnectorTopologies();

org.talend.components.api.component.runtime.RuntimableRuntime componentRuntime_tDBInput_2 = (org.talend.components.api.component.runtime.RuntimableRuntime)(Class.forName(runtime_info_tDBInput_2.getRuntimeClassName()).newInstance());
org.talend.daikon.properties.ValidationResult initVr_tDBInput_2 = componentRuntime_tDBInput_2.initialize(container_tDBInput_2, props_tDBInput_2);

if (initVr_tDBInput_2.getStatus() == org.talend.daikon.properties.ValidationResult.Result.ERROR ) {
    throw new RuntimeException(initVr_tDBInput_2.getMessage());
}

if(componentRuntime_tDBInput_2 instanceof org.talend.components.api.component.runtime.ComponentDriverInitialization) {
	org.talend.components.api.component.runtime.ComponentDriverInitialization compDriverInitialization_tDBInput_2 = (org.talend.components.api.component.runtime.ComponentDriverInitialization)componentRuntime_tDBInput_2;
	compDriverInitialization_tDBInput_2.runAtDriver(container_tDBInput_2);
}

org.talend.components.api.component.runtime.SourceOrSink sourceOrSink_tDBInput_2 = null;
if(componentRuntime_tDBInput_2 instanceof org.talend.components.api.component.runtime.SourceOrSink) {
	sourceOrSink_tDBInput_2 = (org.talend.components.api.component.runtime.SourceOrSink)componentRuntime_tDBInput_2;
	if (doesNodeBelongToRequest_tDBInput_2) {
        org.talend.daikon.properties.ValidationResult vr_tDBInput_2 = sourceOrSink_tDBInput_2.validate(container_tDBInput_2);
        if (vr_tDBInput_2.getStatus() == org.talend.daikon.properties.ValidationResult.Result.ERROR ) {
            throw new RuntimeException(vr_tDBInput_2.getMessage());
        }
	}
}

    if (sourceOrSink_tDBInput_2 instanceof org.talend.components.api.component.runtime.Source) {
        org.talend.components.api.component.runtime.Source source_tDBInput_2 =
                (org.talend.components.api.component.runtime.Source)sourceOrSink_tDBInput_2;
        reader_tDBInput_2 = source_tDBInput_2.createReader(container_tDBInput_2);
	    reader_tDBInput_2 = new org.talend.codegen.flowvariables.runtime.FlowVariablesReader(reader_tDBInput_2, container_tDBInput_2);

            boolean multi_output_is_allowed_tDBInput_2 = false;
            org.talend.components.api.component.Connector c_tDBInput_2 = null;
            for (org.talend.components.api.component.Connector currentConnector : props_tDBInput_2.getAvailableConnectors(null, true)) {
                if (currentConnector.getName().equals("MAIN")) {
                    c_tDBInput_2 = currentConnector;
                }

                if (currentConnector.getName().equals("REJECT")) {//it's better to move the code to javajet
                    multi_output_is_allowed_tDBInput_2 = true;
                }
            }
            org.apache.avro.Schema schema_tDBInput_2 = props_tDBInput_2.getSchema(c_tDBInput_2, true);

        org.talend.codegen.enforcer.OutgoingSchemaEnforcer outgoingEnforcer_tDBInput_2 = org.talend.codegen.enforcer.EnforcerCreator.createOutgoingEnforcer(schema_tDBInput_2, false);

        // Create a reusable factory that converts the output of the reader to an IndexedRecord.
        org.talend.daikon.avro.converter.IndexedRecordConverter<Object, ? extends org.apache.avro.generic.IndexedRecord> factory_tDBInput_2 = null;

        // Iterate through the incoming data.
        boolean available_tDBInput_2 = reader_tDBInput_2.start();

        resourceMap.put("reader_tDBInput_2", reader_tDBInput_2);

        for (; available_tDBInput_2; available_tDBInput_2 = reader_tDBInput_2.advance()) {
			nb_line_tDBInput_2++;

			
			if (multi_output_is_allowed_tDBInput_2) {
				
					HCPTOINTERACTIONCOM = null;
				

				
			}
			

			try {
				Object data_tDBInput_2 = reader_tDBInput_2.getCurrent();
				

					if(multi_output_is_allowed_tDBInput_2) {
						HCPTOINTERACTIONCOM = new HCPTOINTERACTIONCOMStruct();
					}

					
        // Construct the factory once when the first data arrives.
        if (factory_tDBInput_2 == null) {
            factory_tDBInput_2 = (org.talend.daikon.avro.converter.IndexedRecordConverter<Object, ? extends org.apache.avro.generic.IndexedRecord>)
                    new org.talend.daikon.avro.AvroRegistry()
                            .createIndexedRecordConverter(data_tDBInput_2.getClass());
        }

        // Enforce the outgoing schema on the input.
        outgoingEnforcer_tDBInput_2.setWrapped(factory_tDBInput_2.convertToAvro(data_tDBInput_2));
                Object columnValue_0_tDBInput_2 = outgoingEnforcer_tDBInput_2.get(0);
                        HCPTOINTERACTIONCOM.INTERACTION_ID = (String) (columnValue_0_tDBInput_2);
                Object columnValue_1_tDBInput_2 = outgoingEnforcer_tDBInput_2.get(1);
                        HCPTOINTERACTIONCOM.HCP_LEGEND_ID = (String) (columnValue_1_tDBInput_2);
                Object columnValue_2_tDBInput_2 = outgoingEnforcer_tDBInput_2.get(2);
                        HCPTOINTERACTIONCOM.DATA_THROUGH_DATE = (java.util.Date) (columnValue_2_tDBInput_2);
			} catch (org.talend.components.api.exception.DataRejectException e_tDBInput_2) {
				java.util.Map<String,Object> info_tDBInput_2 = e_tDBInput_2.getRejectInfo();
				
					//TODO use a method instead of getting method by the special key "error/errorMessage"
					Object errorMessage_tDBInput_2 = null;
					if(info_tDBInput_2.containsKey("error")){
						errorMessage_tDBInput_2 = info_tDBInput_2.get("error");
					}else if(info_tDBInput_2.containsKey("errorMessage")){
						errorMessage_tDBInput_2 = info_tDBInput_2.get("errorMessage");
					}else{
						errorMessage_tDBInput_2 = "Rejected but error message missing";
					}
					errorMessage_tDBInput_2 = "Row "+ nb_line_tDBInput_2 + ": "+errorMessage_tDBInput_2;
					System.err.println(errorMessage_tDBInput_2);
				
					// If the record is reject, the main line record should put NULL
					HCPTOINTERACTIONCOM = null;
				
			} // end of catch

                java.lang.Iterable<?> outgoingMainRecordsList_tDBInput_2 = new java.util.ArrayList<Object>();
                java.util.Iterator outgoingMainRecordsIt_tDBInput_2 = null;


 



/**
 * [tDBInput_2 begin ] stop
 */
	
	/**
	 * [tDBInput_2 main ] start
	 */

	

	
	
	currentComponent="tDBInput_2";

	


 


	tos_count_tDBInput_2++;

/**
 * [tDBInput_2 main ] stop
 */
	
	/**
	 * [tDBInput_2 process_data_begin ] start
	 */

	

	
	
	currentComponent="tDBInput_2";

	


 



/**
 * [tDBInput_2 process_data_begin ] stop
 */

	
	/**
	 * [tAdvancedHash_HCPTOINTERACTIONCOM main ] start
	 */

	

	
	
	currentComponent="tAdvancedHash_HCPTOINTERACTIONCOM";

	
			if(runStat.update(execStat,enableLogStash,iterateId,1,1
				
					,"HCPTOINTERACTIONCOM","tDBInput_2","HCPTOINTERACTIONCOM","tSnowflakeInput","tAdvancedHash_HCPTOINTERACTIONCOM","tAdvancedHash_HCPTOINTERACTIONCOM","tAdvancedHash"
				
			)) {
				talendJobLogProcess(globalMap);
			}
			
    			if(log.isTraceEnabled()){
    				log.trace("HCPTOINTERACTIONCOM - " + (HCPTOINTERACTIONCOM==null? "": HCPTOINTERACTIONCOM.toLogString()));
    			}
    		


			   
			   

					HCPTOINTERACTIONCOMStruct HCPTOINTERACTIONCOM_HashRow = new HCPTOINTERACTIONCOMStruct();
		   	   	   
				
				HCPTOINTERACTIONCOM_HashRow.INTERACTION_ID = HCPTOINTERACTIONCOM.INTERACTION_ID;
				
				HCPTOINTERACTIONCOM_HashRow.HCP_LEGEND_ID = HCPTOINTERACTIONCOM.HCP_LEGEND_ID;
				
				HCPTOINTERACTIONCOM_HashRow.DATA_THROUGH_DATE = HCPTOINTERACTIONCOM.DATA_THROUGH_DATE;
				
			tHash_Lookup_HCPTOINTERACTIONCOM.put(HCPTOINTERACTIONCOM_HashRow);
			
            




 


	tos_count_tAdvancedHash_HCPTOINTERACTIONCOM++;

/**
 * [tAdvancedHash_HCPTOINTERACTIONCOM main ] stop
 */
	
	/**
	 * [tAdvancedHash_HCPTOINTERACTIONCOM process_data_begin ] start
	 */

	

	
	
	currentComponent="tAdvancedHash_HCPTOINTERACTIONCOM";

	

 



/**
 * [tAdvancedHash_HCPTOINTERACTIONCOM process_data_begin ] stop
 */
	
	/**
	 * [tAdvancedHash_HCPTOINTERACTIONCOM process_data_end ] start
	 */

	

	
	
	currentComponent="tAdvancedHash_HCPTOINTERACTIONCOM";

	

 



/**
 * [tAdvancedHash_HCPTOINTERACTIONCOM process_data_end ] stop
 */



	
	/**
	 * [tDBInput_2 process_data_end ] start
	 */

	

	
	
	currentComponent="tDBInput_2";

	


 



/**
 * [tDBInput_2 process_data_end ] stop
 */
	
	/**
	 * [tDBInput_2 end ] start
	 */

	

	
	
	currentComponent="tDBInput_2";

	
// end of generic


resourceMap.put("finish_tDBInput_2", Boolean.TRUE);

    } // while  
    } // end of "if (sourceOrSink_tDBInput_2 instanceof ...Source)"
    java.util.Map<String, Object> resultMap_tDBInput_2 = null;
    if (reader_tDBInput_2 != null) {
        reader_tDBInput_2.close();
        resultMap_tDBInput_2 = reader_tDBInput_2.getReturnValues();
    }
if(resultMap_tDBInput_2!=null) {
	for(java.util.Map.Entry<String,Object> entry_tDBInput_2 : resultMap_tDBInput_2.entrySet()) {
		switch(entry_tDBInput_2.getKey()) {
		case org.talend.components.api.component.ComponentDefinition.RETURN_ERROR_MESSAGE :
			container_tDBInput_2.setComponentData("tDBInput_2", "ERROR_MESSAGE", entry_tDBInput_2.getValue());
			break;
		case org.talend.components.api.component.ComponentDefinition.RETURN_TOTAL_RECORD_COUNT :
			container_tDBInput_2.setComponentData("tDBInput_2", "NB_LINE", entry_tDBInput_2.getValue());
			break;
		case org.talend.components.api.component.ComponentDefinition.RETURN_SUCCESS_RECORD_COUNT :
			container_tDBInput_2.setComponentData("tDBInput_2", "NB_SUCCESS", entry_tDBInput_2.getValue());
			break;
		case org.talend.components.api.component.ComponentDefinition.RETURN_REJECT_RECORD_COUNT :
			container_tDBInput_2.setComponentData("tDBInput_2", "NB_REJECT", entry_tDBInput_2.getValue());
			break;
		default :
            StringBuilder studio_key_tDBInput_2 = new StringBuilder();
            for (int i_tDBInput_2 = 0; i_tDBInput_2 < entry_tDBInput_2.getKey().length(); i_tDBInput_2++) {
                char ch_tDBInput_2 = entry_tDBInput_2.getKey().charAt(i_tDBInput_2);
                if(Character.isUpperCase(ch_tDBInput_2) && i_tDBInput_2> 0) {
                	studio_key_tDBInput_2.append('_');
                }
                studio_key_tDBInput_2.append(ch_tDBInput_2);
            }
			container_tDBInput_2.setComponentData("tDBInput_2", studio_key_tDBInput_2.toString().toUpperCase(java.util.Locale.ENGLISH), entry_tDBInput_2.getValue());
			break;
		}
	}
}

 

ok_Hash.put("tDBInput_2", true);
end_Hash.put("tDBInput_2", System.currentTimeMillis());




/**
 * [tDBInput_2 end ] stop
 */

	
	/**
	 * [tAdvancedHash_HCPTOINTERACTIONCOM end ] start
	 */

	

	
	
	currentComponent="tAdvancedHash_HCPTOINTERACTIONCOM";

	

tHash_Lookup_HCPTOINTERACTIONCOM.endPut();

			 		if(runStat.updateStatAndLog(execStat,enableLogStash,resourceMap,iterateId,"HCPTOINTERACTIONCOM",2,0,
			 			"tDBInput_2","HCPTOINTERACTIONCOM","tSnowflakeInput","tAdvancedHash_HCPTOINTERACTIONCOM","tAdvancedHash_HCPTOINTERACTIONCOM","tAdvancedHash","output")) {
						talendJobLogProcess(globalMap);
					}
				
 

ok_Hash.put("tAdvancedHash_HCPTOINTERACTIONCOM", true);
end_Hash.put("tAdvancedHash_HCPTOINTERACTIONCOM", System.currentTimeMillis());




/**
 * [tAdvancedHash_HCPTOINTERACTIONCOM end ] stop
 */



				}//end the resume

				



	
			}catch(java.lang.Exception e){	
				
				    if(!(e instanceof TalendException)){
					   log.fatal(currentComponent + " " + e.getMessage(),e);
					}
				
				TalendException te = new TalendException(e, currentComponent, globalMap);
				
				throw te;
			}catch(java.lang.Error error){	
				
					runStat.stopThreadStat();
				
				throw error;
			}finally{
				
				try{
					
	
	/**
	 * [tDBInput_2 finally ] start
	 */

	

	
	
	currentComponent="tDBInput_2";

	
// finally of generic


if(resourceMap.get("finish_tDBInput_2")==null){
    if(resourceMap.get("reader_tDBInput_2")!=null){
		try {
			((org.talend.components.api.component.runtime.Reader)resourceMap.get("reader_tDBInput_2")).close();
		} catch (java.io.IOException e_tDBInput_2) {
			String errorMessage_tDBInput_2 = "failed to release the resource in tDBInput_2 :" + e_tDBInput_2.getMessage();
			System.err.println(errorMessage_tDBInput_2);
		}
	}
}
 



/**
 * [tDBInput_2 finally ] stop
 */

	
	/**
	 * [tAdvancedHash_HCPTOINTERACTIONCOM finally ] start
	 */

	

	
	
	currentComponent="tAdvancedHash_HCPTOINTERACTIONCOM";

	

 



/**
 * [tAdvancedHash_HCPTOINTERACTIONCOM finally ] stop
 */



				}catch(java.lang.Exception e){	
					//ignore
				}catch(java.lang.Error error){
					//ignore
				}
				resourceMap = null;
			}
		

		globalMap.put("tDBInput_2_SUBPROCESS_STATE", 1);
	}
	


public static class INTERACTIONSCOMStruct implements routines.system.IPersistableComparableLookupRow<INTERACTIONSCOMStruct> {
    final static byte[] commonByteArrayLock_USCOMM_SUNSHINE_RPT_QA_BEACON_EXTRACT_SNOWFLAKE = new byte[0];
    static byte[] commonByteArray_USCOMM_SUNSHINE_RPT_QA_BEACON_EXTRACT_SNOWFLAKE = new byte[0];
	protected static final int DEFAULT_HASHCODE = 1;
    protected static final int PRIME = 31;
    protected int hashCode = DEFAULT_HASHCODE;
    public boolean hashCodeDirty = true;

    public String loopKey;



	
			    public String INTERACTION_ID;

				public String getINTERACTION_ID () {
					return this.INTERACTION_ID;
				}

				public Boolean INTERACTION_IDIsNullable(){
				    return false;
				}
				public Boolean INTERACTION_IDIsKey(){
				    return true;
				}
				public Integer INTERACTION_IDLength(){
				    return 10;
				}
				public Integer INTERACTION_IDPrecision(){
				    return null;
				}
				public String INTERACTION_IDDefault(){
				
					return null;
				
				}
				public String INTERACTION_IDComment(){
				
				    return "";
				
				}
				public String INTERACTION_IDPattern(){
				
					return "";
				
				}
				public String INTERACTION_IDOriginalDbColumnName(){
				
					return "INTERACTION_ID";
				
				}

				
			    public String ACCT_LEGEND_ID;

				public String getACCT_LEGEND_ID () {
					return this.ACCT_LEGEND_ID;
				}

				public Boolean ACCT_LEGEND_IDIsNullable(){
				    return true;
				}
				public Boolean ACCT_LEGEND_IDIsKey(){
				    return false;
				}
				public Integer ACCT_LEGEND_IDLength(){
				    return 10;
				}
				public Integer ACCT_LEGEND_IDPrecision(){
				    return null;
				}
				public String ACCT_LEGEND_IDDefault(){
				
					return null;
				
				}
				public String ACCT_LEGEND_IDComment(){
				
				    return "";
				
				}
				public String ACCT_LEGEND_IDPattern(){
				
					return "";
				
				}
				public String ACCT_LEGEND_IDOriginalDbColumnName(){
				
					return "ACCT_LEGEND_ID";
				
				}

				
			    public String ACCOUNT_TERRITORY_ID;

				public String getACCOUNT_TERRITORY_ID () {
					return this.ACCOUNT_TERRITORY_ID;
				}

				public Boolean ACCOUNT_TERRITORY_IDIsNullable(){
				    return true;
				}
				public Boolean ACCOUNT_TERRITORY_IDIsKey(){
				    return false;
				}
				public Integer ACCOUNT_TERRITORY_IDLength(){
				    return 10;
				}
				public Integer ACCOUNT_TERRITORY_IDPrecision(){
				    return null;
				}
				public String ACCOUNT_TERRITORY_IDDefault(){
				
					return null;
				
				}
				public String ACCOUNT_TERRITORY_IDComment(){
				
				    return "";
				
				}
				public String ACCOUNT_TERRITORY_IDPattern(){
				
					return "";
				
				}
				public String ACCOUNT_TERRITORY_IDOriginalDbColumnName(){
				
					return "ACCOUNT_TERRITORY_ID";
				
				}

				
			    public String ACCOUNT_TERRITORY_NAME;

				public String getACCOUNT_TERRITORY_NAME () {
					return this.ACCOUNT_TERRITORY_NAME;
				}

				public Boolean ACCOUNT_TERRITORY_NAMEIsNullable(){
				    return true;
				}
				public Boolean ACCOUNT_TERRITORY_NAMEIsKey(){
				    return false;
				}
				public Integer ACCOUNT_TERRITORY_NAMELength(){
				    return 50;
				}
				public Integer ACCOUNT_TERRITORY_NAMEPrecision(){
				    return null;
				}
				public String ACCOUNT_TERRITORY_NAMEDefault(){
				
					return null;
				
				}
				public String ACCOUNT_TERRITORY_NAMEComment(){
				
				    return "";
				
				}
				public String ACCOUNT_TERRITORY_NAMEPattern(){
				
					return "";
				
				}
				public String ACCOUNT_TERRITORY_NAMEOriginalDbColumnName(){
				
					return "ACCOUNT_TERRITORY_NAME";
				
				}

				
			    public String PARENT_GEO_ID;

				public String getPARENT_GEO_ID () {
					return this.PARENT_GEO_ID;
				}

				public Boolean PARENT_GEO_IDIsNullable(){
				    return true;
				}
				public Boolean PARENT_GEO_IDIsKey(){
				    return false;
				}
				public Integer PARENT_GEO_IDLength(){
				    return 10;
				}
				public Integer PARENT_GEO_IDPrecision(){
				    return null;
				}
				public String PARENT_GEO_IDDefault(){
				
					return null;
				
				}
				public String PARENT_GEO_IDComment(){
				
				    return "";
				
				}
				public String PARENT_GEO_IDPattern(){
				
					return "";
				
				}
				public String PARENT_GEO_IDOriginalDbColumnName(){
				
					return "PARENT_GEO_ID";
				
				}

				
			    public String PARENT_GEO_NAME;

				public String getPARENT_GEO_NAME () {
					return this.PARENT_GEO_NAME;
				}

				public Boolean PARENT_GEO_NAMEIsNullable(){
				    return true;
				}
				public Boolean PARENT_GEO_NAMEIsKey(){
				    return false;
				}
				public Integer PARENT_GEO_NAMELength(){
				    return 50;
				}
				public Integer PARENT_GEO_NAMEPrecision(){
				    return null;
				}
				public String PARENT_GEO_NAMEDefault(){
				
					return null;
				
				}
				public String PARENT_GEO_NAMEComment(){
				
				    return "";
				
				}
				public String PARENT_GEO_NAMEPattern(){
				
					return "";
				
				}
				public String PARENT_GEO_NAMEOriginalDbColumnName(){
				
					return "PARENT_GEO_NAME";
				
				}

				
			    public java.util.Date DATE;

				public java.util.Date getDATE () {
					return this.DATE;
				}

				public Boolean DATEIsNullable(){
				    return true;
				}
				public Boolean DATEIsKey(){
				    return false;
				}
				public Integer DATELength(){
				    return null;
				}
				public Integer DATEPrecision(){
				    return null;
				}
				public String DATEDefault(){
				
					return null;
				
				}
				public String DATEComment(){
				
				    return "";
				
				}
				public String DATEPattern(){
				
					return "yyyy-MM-dd";
				
				}
				public String DATEOriginalDbColumnName(){
				
					return "DATE";
				
				}

				
			    public String TYPE;

				public String getTYPE () {
					return this.TYPE;
				}

				public Boolean TYPEIsNullable(){
				    return true;
				}
				public Boolean TYPEIsKey(){
				    return false;
				}
				public Integer TYPELength(){
				    return 50;
				}
				public Integer TYPEPrecision(){
				    return null;
				}
				public String TYPEDefault(){
				
					return null;
				
				}
				public String TYPEComment(){
				
				    return "";
				
				}
				public String TYPEPattern(){
				
					return "";
				
				}
				public String TYPEOriginalDbColumnName(){
				
					return "TYPE";
				
				}

				
			    public String TOPICS;

				public String getTOPICS () {
					return this.TOPICS;
				}

				public Boolean TOPICSIsNullable(){
				    return true;
				}
				public Boolean TOPICSIsKey(){
				    return false;
				}
				public Integer TOPICSLength(){
				    return 100;
				}
				public Integer TOPICSPrecision(){
				    return null;
				}
				public String TOPICSDefault(){
				
					return null;
				
				}
				public String TOPICSComment(){
				
				    return "";
				
				}
				public String TOPICSPattern(){
				
					return "";
				
				}
				public String TOPICSOriginalDbColumnName(){
				
					return "TOPICS";
				
				}

				
			    public String CALL_CREATED_BY;

				public String getCALL_CREATED_BY () {
					return this.CALL_CREATED_BY;
				}

				public Boolean CALL_CREATED_BYIsNullable(){
				    return true;
				}
				public Boolean CALL_CREATED_BYIsKey(){
				    return false;
				}
				public Integer CALL_CREATED_BYLength(){
				    return 50;
				}
				public Integer CALL_CREATED_BYPrecision(){
				    return null;
				}
				public String CALL_CREATED_BYDefault(){
				
					return null;
				
				}
				public String CALL_CREATED_BYComment(){
				
				    return "";
				
				}
				public String CALL_CREATED_BYPattern(){
				
					return "";
				
				}
				public String CALL_CREATED_BYOriginalDbColumnName(){
				
					return "CALL_CREATED_BY";
				
				}

				
			    public String CREATED_BY_TEAM;

				public String getCREATED_BY_TEAM () {
					return this.CREATED_BY_TEAM;
				}

				public Boolean CREATED_BY_TEAMIsNullable(){
				    return true;
				}
				public Boolean CREATED_BY_TEAMIsKey(){
				    return false;
				}
				public Integer CREATED_BY_TEAMLength(){
				    return 50;
				}
				public Integer CREATED_BY_TEAMPrecision(){
				    return null;
				}
				public String CREATED_BY_TEAMDefault(){
				
					return null;
				
				}
				public String CREATED_BY_TEAMComment(){
				
				    return "";
				
				}
				public String CREATED_BY_TEAMPattern(){
				
					return "";
				
				}
				public String CREATED_BY_TEAMOriginalDbColumnName(){
				
					return "CREATED_BY_TEAM";
				
				}

				
			    public String PRODUCT;

				public String getPRODUCT () {
					return this.PRODUCT;
				}

				public Boolean PRODUCTIsNullable(){
				    return true;
				}
				public Boolean PRODUCTIsKey(){
				    return false;
				}
				public Integer PRODUCTLength(){
				    return 50;
				}
				public Integer PRODUCTPrecision(){
				    return null;
				}
				public String PRODUCTDefault(){
				
					return null;
				
				}
				public String PRODUCTComment(){
				
				    return "";
				
				}
				public String PRODUCTPattern(){
				
					return "";
				
				}
				public String PRODUCTOriginalDbColumnName(){
				
					return "PRODUCT";
				
				}

				
			    public String MEDIUM;

				public String getMEDIUM () {
					return this.MEDIUM;
				}

				public Boolean MEDIUMIsNullable(){
				    return true;
				}
				public Boolean MEDIUMIsKey(){
				    return false;
				}
				public Integer MEDIUMLength(){
				    return 50;
				}
				public Integer MEDIUMPrecision(){
				    return null;
				}
				public String MEDIUMDefault(){
				
					return null;
				
				}
				public String MEDIUMComment(){
				
				    return "";
				
				}
				public String MEDIUMPattern(){
				
					return "";
				
				}
				public String MEDIUMOriginalDbColumnName(){
				
					return "MEDIUM";
				
				}

				
			    public String EMAIL_TRIGGER;

				public String getEMAIL_TRIGGER () {
					return this.EMAIL_TRIGGER;
				}

				public Boolean EMAIL_TRIGGERIsNullable(){
				    return true;
				}
				public Boolean EMAIL_TRIGGERIsKey(){
				    return false;
				}
				public Integer EMAIL_TRIGGERLength(){
				    return 250;
				}
				public Integer EMAIL_TRIGGERPrecision(){
				    return null;
				}
				public String EMAIL_TRIGGERDefault(){
				
					return null;
				
				}
				public String EMAIL_TRIGGERComment(){
				
				    return "";
				
				}
				public String EMAIL_TRIGGERPattern(){
				
					return "";
				
				}
				public String EMAIL_TRIGGEROriginalDbColumnName(){
				
					return "EMAIL_TRIGGER";
				
				}

				
			    public String CORE_MESSAGE;

				public String getCORE_MESSAGE () {
					return this.CORE_MESSAGE;
				}

				public Boolean CORE_MESSAGEIsNullable(){
				    return true;
				}
				public Boolean CORE_MESSAGEIsKey(){
				    return false;
				}
				public Integer CORE_MESSAGELength(){
				    return 250;
				}
				public Integer CORE_MESSAGEPrecision(){
				    return null;
				}
				public String CORE_MESSAGEDefault(){
				
					return null;
				
				}
				public String CORE_MESSAGEComment(){
				
				    return "";
				
				}
				public String CORE_MESSAGEPattern(){
				
					return "";
				
				}
				public String CORE_MESSAGEOriginalDbColumnName(){
				
					return "CORE_MESSAGE";
				
				}

				
			    public String MEAL;

				public String getMEAL () {
					return this.MEAL;
				}

				public Boolean MEALIsNullable(){
				    return true;
				}
				public Boolean MEALIsKey(){
				    return false;
				}
				public Integer MEALLength(){
				    return 3;
				}
				public Integer MEALPrecision(){
				    return null;
				}
				public String MEALDefault(){
				
					return null;
				
				}
				public String MEALComment(){
				
				    return "";
				
				}
				public String MEALPattern(){
				
					return "";
				
				}
				public String MEALOriginalDbColumnName(){
				
					return "MEAL";
				
				}

				
			    public String MATERIALS_LEFT;

				public String getMATERIALS_LEFT () {
					return this.MATERIALS_LEFT;
				}

				public Boolean MATERIALS_LEFTIsNullable(){
				    return true;
				}
				public Boolean MATERIALS_LEFTIsKey(){
				    return false;
				}
				public Integer MATERIALS_LEFTLength(){
				    return 250;
				}
				public Integer MATERIALS_LEFTPrecision(){
				    return null;
				}
				public String MATERIALS_LEFTDefault(){
				
					return null;
				
				}
				public String MATERIALS_LEFTComment(){
				
				    return "";
				
				}
				public String MATERIALS_LEFTPattern(){
				
					return "";
				
				}
				public String MATERIALS_LEFTOriginalDbColumnName(){
				
					return "MATERIALS_LEFT";
				
				}

				
			    public String MATERIALS_USED;

				public String getMATERIALS_USED () {
					return this.MATERIALS_USED;
				}

				public Boolean MATERIALS_USEDIsNullable(){
				    return true;
				}
				public Boolean MATERIALS_USEDIsKey(){
				    return false;
				}
				public Integer MATERIALS_USEDLength(){
				    return 250;
				}
				public Integer MATERIALS_USEDPrecision(){
				    return null;
				}
				public String MATERIALS_USEDDefault(){
				
					return null;
				
				}
				public String MATERIALS_USEDComment(){
				
				    return "";
				
				}
				public String MATERIALS_USEDPattern(){
				
					return "";
				
				}
				public String MATERIALS_USEDOriginalDbColumnName(){
				
					return "MATERIALS_USED";
				
				}

				
			    public Boolean WELCOME_PRESENTATION;

				public Boolean getWELCOME_PRESENTATION () {
					return this.WELCOME_PRESENTATION;
				}

				public Boolean WELCOME_PRESENTATIONIsNullable(){
				    return true;
				}
				public Boolean WELCOME_PRESENTATIONIsKey(){
				    return false;
				}
				public Integer WELCOME_PRESENTATIONLength(){
				    return null;
				}
				public Integer WELCOME_PRESENTATIONPrecision(){
				    return null;
				}
				public String WELCOME_PRESENTATIONDefault(){
				
					return null;
				
				}
				public String WELCOME_PRESENTATIONComment(){
				
				    return "";
				
				}
				public String WELCOME_PRESENTATIONPattern(){
				
					return "";
				
				}
				public String WELCOME_PRESENTATIONOriginalDbColumnName(){
				
					return "WELCOME_PRESENTATION";
				
				}

				
			    public Boolean SITE_ACTIVATION_SUPPORT_CALL;

				public Boolean getSITE_ACTIVATION_SUPPORT_CALL () {
					return this.SITE_ACTIVATION_SUPPORT_CALL;
				}

				public Boolean SITE_ACTIVATION_SUPPORT_CALLIsNullable(){
				    return true;
				}
				public Boolean SITE_ACTIVATION_SUPPORT_CALLIsKey(){
				    return false;
				}
				public Integer SITE_ACTIVATION_SUPPORT_CALLLength(){
				    return null;
				}
				public Integer SITE_ACTIVATION_SUPPORT_CALLPrecision(){
				    return null;
				}
				public String SITE_ACTIVATION_SUPPORT_CALLDefault(){
				
					return null;
				
				}
				public String SITE_ACTIVATION_SUPPORT_CALLComment(){
				
				    return "";
				
				}
				public String SITE_ACTIVATION_SUPPORT_CALLPattern(){
				
					return "";
				
				}
				public String SITE_ACTIVATION_SUPPORT_CALLOriginalDbColumnName(){
				
					return "SITE_ACTIVATION_SUPPORT_CALL";
				
				}

				
			    public Double PERIOD_WK_OFFSET;

				public Double getPERIOD_WK_OFFSET () {
					return this.PERIOD_WK_OFFSET;
				}

				public Boolean PERIOD_WK_OFFSETIsNullable(){
				    return true;
				}
				public Boolean PERIOD_WK_OFFSETIsKey(){
				    return false;
				}
				public Integer PERIOD_WK_OFFSETLength(){
				    return null;
				}
				public Integer PERIOD_WK_OFFSETPrecision(){
				    return null;
				}
				public String PERIOD_WK_OFFSETDefault(){
				
					return null;
				
				}
				public String PERIOD_WK_OFFSETComment(){
				
				    return "";
				
				}
				public String PERIOD_WK_OFFSETPattern(){
				
					return "";
				
				}
				public String PERIOD_WK_OFFSETOriginalDbColumnName(){
				
					return "PERIOD_WK_OFFSET";
				
				}

				
			    public Double PERIOD_MO_OFFSET;

				public Double getPERIOD_MO_OFFSET () {
					return this.PERIOD_MO_OFFSET;
				}

				public Boolean PERIOD_MO_OFFSETIsNullable(){
				    return true;
				}
				public Boolean PERIOD_MO_OFFSETIsKey(){
				    return false;
				}
				public Integer PERIOD_MO_OFFSETLength(){
				    return null;
				}
				public Integer PERIOD_MO_OFFSETPrecision(){
				    return null;
				}
				public String PERIOD_MO_OFFSETDefault(){
				
					return null;
				
				}
				public String PERIOD_MO_OFFSETComment(){
				
				    return "";
				
				}
				public String PERIOD_MO_OFFSETPattern(){
				
					return "";
				
				}
				public String PERIOD_MO_OFFSETOriginalDbColumnName(){
				
					return "PERIOD_MO_OFFSET";
				
				}

				
			    public Double PERIOD_QTR_OFFSET;

				public Double getPERIOD_QTR_OFFSET () {
					return this.PERIOD_QTR_OFFSET;
				}

				public Boolean PERIOD_QTR_OFFSETIsNullable(){
				    return true;
				}
				public Boolean PERIOD_QTR_OFFSETIsKey(){
				    return false;
				}
				public Integer PERIOD_QTR_OFFSETLength(){
				    return null;
				}
				public Integer PERIOD_QTR_OFFSETPrecision(){
				    return null;
				}
				public String PERIOD_QTR_OFFSETDefault(){
				
					return null;
				
				}
				public String PERIOD_QTR_OFFSETComment(){
				
				    return "";
				
				}
				public String PERIOD_QTR_OFFSETPattern(){
				
					return "";
				
				}
				public String PERIOD_QTR_OFFSETOriginalDbColumnName(){
				
					return "PERIOD_QTR_OFFSET";
				
				}

				
			    public Double PERIOD_YR_OFFSET;

				public Double getPERIOD_YR_OFFSET () {
					return this.PERIOD_YR_OFFSET;
				}

				public Boolean PERIOD_YR_OFFSETIsNullable(){
				    return true;
				}
				public Boolean PERIOD_YR_OFFSETIsKey(){
				    return false;
				}
				public Integer PERIOD_YR_OFFSETLength(){
				    return null;
				}
				public Integer PERIOD_YR_OFFSETPrecision(){
				    return null;
				}
				public String PERIOD_YR_OFFSETDefault(){
				
					return null;
				
				}
				public String PERIOD_YR_OFFSETComment(){
				
				    return "";
				
				}
				public String PERIOD_YR_OFFSETPattern(){
				
					return "";
				
				}
				public String PERIOD_YR_OFFSETOriginalDbColumnName(){
				
					return "PERIOD_YR_OFFSET";
				
				}

				
			    public Boolean PMTD_FLAG;

				public Boolean getPMTD_FLAG () {
					return this.PMTD_FLAG;
				}

				public Boolean PMTD_FLAGIsNullable(){
				    return true;
				}
				public Boolean PMTD_FLAGIsKey(){
				    return false;
				}
				public Integer PMTD_FLAGLength(){
				    return null;
				}
				public Integer PMTD_FLAGPrecision(){
				    return null;
				}
				public String PMTD_FLAGDefault(){
				
					return null;
				
				}
				public String PMTD_FLAGComment(){
				
				    return "";
				
				}
				public String PMTD_FLAGPattern(){
				
					return "";
				
				}
				public String PMTD_FLAGOriginalDbColumnName(){
				
					return "PMTD_FLAG";
				
				}

				
			    public Boolean PQTD_FLAG;

				public Boolean getPQTD_FLAG () {
					return this.PQTD_FLAG;
				}

				public Boolean PQTD_FLAGIsNullable(){
				    return true;
				}
				public Boolean PQTD_FLAGIsKey(){
				    return false;
				}
				public Integer PQTD_FLAGLength(){
				    return null;
				}
				public Integer PQTD_FLAGPrecision(){
				    return null;
				}
				public String PQTD_FLAGDefault(){
				
					return null;
				
				}
				public String PQTD_FLAGComment(){
				
				    return "";
				
				}
				public String PQTD_FLAGPattern(){
				
					return "";
				
				}
				public String PQTD_FLAGOriginalDbColumnName(){
				
					return "PQTD_FLAG";
				
				}

				
			    public Boolean PYTD_FLAG;

				public Boolean getPYTD_FLAG () {
					return this.PYTD_FLAG;
				}

				public Boolean PYTD_FLAGIsNullable(){
				    return true;
				}
				public Boolean PYTD_FLAGIsKey(){
				    return false;
				}
				public Integer PYTD_FLAGLength(){
				    return null;
				}
				public Integer PYTD_FLAGPrecision(){
				    return null;
				}
				public String PYTD_FLAGDefault(){
				
					return null;
				
				}
				public String PYTD_FLAGComment(){
				
				    return "";
				
				}
				public String PYTD_FLAGPattern(){
				
					return "";
				
				}
				public String PYTD_FLAGOriginalDbColumnName(){
				
					return "PYTD_FLAG";
				
				}

				
			    public java.util.Date DATA_THROUGH_DATE;

				public java.util.Date getDATA_THROUGH_DATE () {
					return this.DATA_THROUGH_DATE;
				}

				public Boolean DATA_THROUGH_DATEIsNullable(){
				    return true;
				}
				public Boolean DATA_THROUGH_DATEIsKey(){
				    return false;
				}
				public Integer DATA_THROUGH_DATELength(){
				    return null;
				}
				public Integer DATA_THROUGH_DATEPrecision(){
				    return null;
				}
				public String DATA_THROUGH_DATEDefault(){
				
					return null;
				
				}
				public String DATA_THROUGH_DATEComment(){
				
				    return "";
				
				}
				public String DATA_THROUGH_DATEPattern(){
				
					return "yyyy-MM-dd";
				
				}
				public String DATA_THROUGH_DATEOriginalDbColumnName(){
				
					return "DATA_THROUGH_DATE";
				
				}

				


	@Override
	public int hashCode() {
		if (this.hashCodeDirty) {
			final int prime = PRIME;
			int result = DEFAULT_HASHCODE;
	
						result = prime * result + ((this.INTERACTION_ID == null) ? 0 : this.INTERACTION_ID.hashCode());
					
    		this.hashCode = result;
    		this.hashCodeDirty = false;
		}
		return this.hashCode;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) return true;
		if (obj == null) return false;
		if (getClass() != obj.getClass()) return false;
		final INTERACTIONSCOMStruct other = (INTERACTIONSCOMStruct) obj;
		
						if (this.INTERACTION_ID == null) {
							if (other.INTERACTION_ID != null)
								return false;
						
						} else if (!this.INTERACTION_ID.equals(other.INTERACTION_ID))
						
							return false;
					

		return true;
    }

	public void copyDataTo(INTERACTIONSCOMStruct other) {

		other.INTERACTION_ID = this.INTERACTION_ID;
	            other.ACCT_LEGEND_ID = this.ACCT_LEGEND_ID;
	            other.ACCOUNT_TERRITORY_ID = this.ACCOUNT_TERRITORY_ID;
	            other.ACCOUNT_TERRITORY_NAME = this.ACCOUNT_TERRITORY_NAME;
	            other.PARENT_GEO_ID = this.PARENT_GEO_ID;
	            other.PARENT_GEO_NAME = this.PARENT_GEO_NAME;
	            other.DATE = this.DATE;
	            other.TYPE = this.TYPE;
	            other.TOPICS = this.TOPICS;
	            other.CALL_CREATED_BY = this.CALL_CREATED_BY;
	            other.CREATED_BY_TEAM = this.CREATED_BY_TEAM;
	            other.PRODUCT = this.PRODUCT;
	            other.MEDIUM = this.MEDIUM;
	            other.EMAIL_TRIGGER = this.EMAIL_TRIGGER;
	            other.CORE_MESSAGE = this.CORE_MESSAGE;
	            other.MEAL = this.MEAL;
	            other.MATERIALS_LEFT = this.MATERIALS_LEFT;
	            other.MATERIALS_USED = this.MATERIALS_USED;
	            other.WELCOME_PRESENTATION = this.WELCOME_PRESENTATION;
	            other.SITE_ACTIVATION_SUPPORT_CALL = this.SITE_ACTIVATION_SUPPORT_CALL;
	            other.PERIOD_WK_OFFSET = this.PERIOD_WK_OFFSET;
	            other.PERIOD_MO_OFFSET = this.PERIOD_MO_OFFSET;
	            other.PERIOD_QTR_OFFSET = this.PERIOD_QTR_OFFSET;
	            other.PERIOD_YR_OFFSET = this.PERIOD_YR_OFFSET;
	            other.PMTD_FLAG = this.PMTD_FLAG;
	            other.PQTD_FLAG = this.PQTD_FLAG;
	            other.PYTD_FLAG = this.PYTD_FLAG;
	            other.DATA_THROUGH_DATE = this.DATA_THROUGH_DATE;
	            
	}

	public void copyKeysDataTo(INTERACTIONSCOMStruct other) {

		other.INTERACTION_ID = this.INTERACTION_ID;
	            	
	}




	private String readString(ObjectInputStream dis) throws IOException{
		String strReturn = null;
		int length = 0;
        length = dis.readInt();
		if (length == -1) {
			strReturn = null;
		} else {
			if(length > commonByteArray_USCOMM_SUNSHINE_RPT_QA_BEACON_EXTRACT_SNOWFLAKE.length) {
				if(length < 1024 && commonByteArray_USCOMM_SUNSHINE_RPT_QA_BEACON_EXTRACT_SNOWFLAKE.length == 0) {
   					commonByteArray_USCOMM_SUNSHINE_RPT_QA_BEACON_EXTRACT_SNOWFLAKE = new byte[1024];
				} else {
   					commonByteArray_USCOMM_SUNSHINE_RPT_QA_BEACON_EXTRACT_SNOWFLAKE = new byte[2 * length];
   				}
			}
			dis.readFully(commonByteArray_USCOMM_SUNSHINE_RPT_QA_BEACON_EXTRACT_SNOWFLAKE, 0, length);
			strReturn = new String(commonByteArray_USCOMM_SUNSHINE_RPT_QA_BEACON_EXTRACT_SNOWFLAKE, 0, length, utf8Charset);
		}
		return strReturn;
	}
	
	private String readString(org.jboss.marshalling.Unmarshaller unmarshaller) throws IOException{
		String strReturn = null;
		int length = 0;
        length = unmarshaller.readInt();
		if (length == -1) {
			strReturn = null;
		} else {
			if(length > commonByteArray_USCOMM_SUNSHINE_RPT_QA_BEACON_EXTRACT_SNOWFLAKE.length) {
				if(length < 1024 && commonByteArray_USCOMM_SUNSHINE_RPT_QA_BEACON_EXTRACT_SNOWFLAKE.length == 0) {
   					commonByteArray_USCOMM_SUNSHINE_RPT_QA_BEACON_EXTRACT_SNOWFLAKE = new byte[1024];
				} else {
   					commonByteArray_USCOMM_SUNSHINE_RPT_QA_BEACON_EXTRACT_SNOWFLAKE = new byte[2 * length];
   				}
			}
			unmarshaller.readFully(commonByteArray_USCOMM_SUNSHINE_RPT_QA_BEACON_EXTRACT_SNOWFLAKE, 0, length);
			strReturn = new String(commonByteArray_USCOMM_SUNSHINE_RPT_QA_BEACON_EXTRACT_SNOWFLAKE, 0, length, utf8Charset);
		}
		return strReturn;
	}

    private void writeString(String str, ObjectOutputStream dos) throws IOException{
		if(str == null) {
            dos.writeInt(-1);
		} else {
            byte[] byteArray = str.getBytes(utf8Charset);
	    	dos.writeInt(byteArray.length);
			dos.write(byteArray);
    	}
    }
    
    private void writeString(String str, org.jboss.marshalling.Marshaller marshaller) throws IOException{
		if(str == null) {
			marshaller.writeInt(-1);
		} else {
            byte[] byteArray = str.getBytes(utf8Charset);
            marshaller.writeInt(byteArray.length);
            marshaller.write(byteArray);
    	}
    }
	
	private String readString(DataInputStream dis, ObjectInputStream ois) throws IOException{
		String strReturn = null;
		int length = 0;
        length = dis.readInt();
		if (length == -1) {
			strReturn = null;
		} else {
			byte[] byteArray = new byte[length];
			dis.read(byteArray);
			strReturn = new String(byteArray, utf8Charset);
		}
		return strReturn;
	}
	
	private String readString(DataInputStream dis, org.jboss.marshalling.Unmarshaller unmarshaller) throws IOException{
		String strReturn = null;
		int length = 0;
        length = unmarshaller.readInt();
		if (length == -1) {
			strReturn = null;
		} else {
			byte[] byteArray = new byte[length];
			unmarshaller.read(byteArray);
			strReturn = new String(byteArray, utf8Charset);
		}
		return strReturn;
	}
	
	private void writeString(String str, DataOutputStream dos, org.jboss.marshalling.Marshaller marshaller) throws IOException{
		if(str == null) {
			marshaller.writeInt(-1);
		} else {
            byte[] byteArray = str.getBytes(utf8Charset);
            marshaller.writeInt(byteArray.length);
            marshaller.write(byteArray);
    	}
	}

	private void writeString(String str, DataOutputStream dos, ObjectOutputStream oos) throws IOException{
		if(str == null) {
            dos.writeInt(-1);
		} else {
            byte[] byteArray = str.getBytes(utf8Charset);
	    	dos.writeInt(byteArray.length);
			dos.write(byteArray);
    	}
	}

	private java.util.Date readDate(DataInputStream dis, ObjectInputStream ois) throws IOException{
		java.util.Date dateReturn = null;
		int length = 0;
        length = dis.readByte();
		if (length == -1) {
			dateReturn = null;
		} else {
	    	dateReturn = new Date(dis.readLong());
		}
		return dateReturn;
	}
	
	private java.util.Date readDate(DataInputStream dis, org.jboss.marshalling.Unmarshaller unmarshaller ) throws IOException{
		java.util.Date dateReturn = null;
		int length = 0;
        length = unmarshaller.readByte();
		if (length == -1) {
			dateReturn = null;
		} else {
	    	dateReturn = new Date(unmarshaller.readLong());
		}
		return dateReturn;
	}

	private void writeDate(java.util.Date date1, DataOutputStream dos, ObjectOutputStream oos) throws IOException{
		if(date1 == null) {
            dos.writeByte(-1);
		} else {
			dos.writeByte(0);
	    	dos.writeLong(date1.getTime());
    	}
	}
	
	private void writeDate(java.util.Date date1, DataOutputStream dos, org.jboss.marshalling.Marshaller marshaller) throws IOException{
		if(date1 == null) {
			marshaller.writeByte(-1);
		} else {
			marshaller.writeByte(0);
			marshaller.writeLong(date1.getTime());
    	}
	}

    public void readKeysData(ObjectInputStream dis) {

		synchronized(commonByteArrayLock_USCOMM_SUNSHINE_RPT_QA_BEACON_EXTRACT_SNOWFLAKE) {

        	try {

        		int length = 0;
		
					this.INTERACTION_ID = readString(dis);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);

		

        }

		

      }


    }
    
    public void readKeysData(org.jboss.marshalling.Unmarshaller dis) {

		synchronized(commonByteArrayLock_USCOMM_SUNSHINE_RPT_QA_BEACON_EXTRACT_SNOWFLAKE) {

        	try {

        		int length = 0;
		
					this.INTERACTION_ID = readString(dis);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);

		

        }

		

      }


    }

    public void writeKeysData(ObjectOutputStream dos) {
        try {

		
					// String
				
						writeString(this.INTERACTION_ID,dos);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);
        }


    }
    
    public void writeKeysData(org.jboss.marshalling.Marshaller dos) {
        try {

		
					// String
				
						writeString(this.INTERACTION_ID,dos);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);
        }


    }



    /**
     * Fill Values data by reading ObjectInputStream.
     */
    public void readValuesData(DataInputStream dis, ObjectInputStream ois) {
        try {

			int length = 0;
		
						this.ACCT_LEGEND_ID = readString(dis,ois);
					
						this.ACCOUNT_TERRITORY_ID = readString(dis,ois);
					
						this.ACCOUNT_TERRITORY_NAME = readString(dis,ois);
					
						this.PARENT_GEO_ID = readString(dis,ois);
					
						this.PARENT_GEO_NAME = readString(dis,ois);
					
						this.DATE = readDate(dis,ois);
					
						this.TYPE = readString(dis,ois);
					
						this.TOPICS = readString(dis,ois);
					
						this.CALL_CREATED_BY = readString(dis,ois);
					
						this.CREATED_BY_TEAM = readString(dis,ois);
					
						this.PRODUCT = readString(dis,ois);
					
						this.MEDIUM = readString(dis,ois);
					
						this.EMAIL_TRIGGER = readString(dis,ois);
					
						this.CORE_MESSAGE = readString(dis,ois);
					
						this.MEAL = readString(dis,ois);
					
						this.MATERIALS_LEFT = readString(dis,ois);
					
						this.MATERIALS_USED = readString(dis,ois);
					
			            length = dis.readByte();
           				if (length == -1) {
           	    			this.WELCOME_PRESENTATION = null;
           				} else {
           			    	this.WELCOME_PRESENTATION = dis.readBoolean();
           				}
					
			            length = dis.readByte();
           				if (length == -1) {
           	    			this.SITE_ACTIVATION_SUPPORT_CALL = null;
           				} else {
           			    	this.SITE_ACTIVATION_SUPPORT_CALL = dis.readBoolean();
           				}
					
			            length = dis.readByte();
           				if (length == -1) {
           	    			this.PERIOD_WK_OFFSET = null;
           				} else {
           			    	this.PERIOD_WK_OFFSET = dis.readDouble();
           				}
					
			            length = dis.readByte();
           				if (length == -1) {
           	    			this.PERIOD_MO_OFFSET = null;
           				} else {
           			    	this.PERIOD_MO_OFFSET = dis.readDouble();
           				}
					
			            length = dis.readByte();
           				if (length == -1) {
           	    			this.PERIOD_QTR_OFFSET = null;
           				} else {
           			    	this.PERIOD_QTR_OFFSET = dis.readDouble();
           				}
					
			            length = dis.readByte();
           				if (length == -1) {
           	    			this.PERIOD_YR_OFFSET = null;
           				} else {
           			    	this.PERIOD_YR_OFFSET = dis.readDouble();
           				}
					
			            length = dis.readByte();
           				if (length == -1) {
           	    			this.PMTD_FLAG = null;
           				} else {
           			    	this.PMTD_FLAG = dis.readBoolean();
           				}
					
			            length = dis.readByte();
           				if (length == -1) {
           	    			this.PQTD_FLAG = null;
           				} else {
           			    	this.PQTD_FLAG = dis.readBoolean();
           				}
					
			            length = dis.readByte();
           				if (length == -1) {
           	    			this.PYTD_FLAG = null;
           				} else {
           			    	this.PYTD_FLAG = dis.readBoolean();
           				}
					
						this.DATA_THROUGH_DATE = readDate(dis,ois);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);

		

        }

		

    }
    
    public void readValuesData(DataInputStream dis, org.jboss.marshalling.Unmarshaller objectIn) {
        try {
			int length = 0;
		
						this.ACCT_LEGEND_ID = readString(dis,objectIn);
					
						this.ACCOUNT_TERRITORY_ID = readString(dis,objectIn);
					
						this.ACCOUNT_TERRITORY_NAME = readString(dis,objectIn);
					
						this.PARENT_GEO_ID = readString(dis,objectIn);
					
						this.PARENT_GEO_NAME = readString(dis,objectIn);
					
						this.DATE = readDate(dis,objectIn);
					
						this.TYPE = readString(dis,objectIn);
					
						this.TOPICS = readString(dis,objectIn);
					
						this.CALL_CREATED_BY = readString(dis,objectIn);
					
						this.CREATED_BY_TEAM = readString(dis,objectIn);
					
						this.PRODUCT = readString(dis,objectIn);
					
						this.MEDIUM = readString(dis,objectIn);
					
						this.EMAIL_TRIGGER = readString(dis,objectIn);
					
						this.CORE_MESSAGE = readString(dis,objectIn);
					
						this.MEAL = readString(dis,objectIn);
					
						this.MATERIALS_LEFT = readString(dis,objectIn);
					
						this.MATERIALS_USED = readString(dis,objectIn);
					
			            length = objectIn.readByte();
           				if (length == -1) {
           	    			this.WELCOME_PRESENTATION = null;
           				} else {
           			    	this.WELCOME_PRESENTATION = objectIn.readBoolean();
           				}
					
			            length = objectIn.readByte();
           				if (length == -1) {
           	    			this.SITE_ACTIVATION_SUPPORT_CALL = null;
           				} else {
           			    	this.SITE_ACTIVATION_SUPPORT_CALL = objectIn.readBoolean();
           				}
					
			            length = objectIn.readByte();
           				if (length == -1) {
           	    			this.PERIOD_WK_OFFSET = null;
           				} else {
           			    	this.PERIOD_WK_OFFSET = objectIn.readDouble();
           				}
					
			            length = objectIn.readByte();
           				if (length == -1) {
           	    			this.PERIOD_MO_OFFSET = null;
           				} else {
           			    	this.PERIOD_MO_OFFSET = objectIn.readDouble();
           				}
					
			            length = objectIn.readByte();
           				if (length == -1) {
           	    			this.PERIOD_QTR_OFFSET = null;
           				} else {
           			    	this.PERIOD_QTR_OFFSET = objectIn.readDouble();
           				}
					
			            length = objectIn.readByte();
           				if (length == -1) {
           	    			this.PERIOD_YR_OFFSET = null;
           				} else {
           			    	this.PERIOD_YR_OFFSET = objectIn.readDouble();
           				}
					
			            length = objectIn.readByte();
           				if (length == -1) {
           	    			this.PMTD_FLAG = null;
           				} else {
           			    	this.PMTD_FLAG = objectIn.readBoolean();
           				}
					
			            length = objectIn.readByte();
           				if (length == -1) {
           	    			this.PQTD_FLAG = null;
           				} else {
           			    	this.PQTD_FLAG = objectIn.readBoolean();
           				}
					
			            length = objectIn.readByte();
           				if (length == -1) {
           	    			this.PYTD_FLAG = null;
           				} else {
           			    	this.PYTD_FLAG = objectIn.readBoolean();
           				}
					
						this.DATA_THROUGH_DATE = readDate(dis,objectIn);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);

		

        }

		

    }

    /**
     * Return a byte array which represents Values data.
     */
    public void writeValuesData(DataOutputStream dos, ObjectOutputStream oos) {
        try {

		
						writeString(this.ACCT_LEGEND_ID, dos, oos);
					
						writeString(this.ACCOUNT_TERRITORY_ID, dos, oos);
					
						writeString(this.ACCOUNT_TERRITORY_NAME, dos, oos);
					
						writeString(this.PARENT_GEO_ID, dos, oos);
					
						writeString(this.PARENT_GEO_NAME, dos, oos);
					
						writeDate(this.DATE, dos, oos);
					
						writeString(this.TYPE, dos, oos);
					
						writeString(this.TOPICS, dos, oos);
					
						writeString(this.CALL_CREATED_BY, dos, oos);
					
						writeString(this.CREATED_BY_TEAM, dos, oos);
					
						writeString(this.PRODUCT, dos, oos);
					
						writeString(this.MEDIUM, dos, oos);
					
						writeString(this.EMAIL_TRIGGER, dos, oos);
					
						writeString(this.CORE_MESSAGE, dos, oos);
					
						writeString(this.MEAL, dos, oos);
					
						writeString(this.MATERIALS_LEFT, dos, oos);
					
						writeString(this.MATERIALS_USED, dos, oos);
					
						if(this.WELCOME_PRESENTATION == null) {
			                dos.writeByte(-1);
						} else {
               				dos.writeByte(0);
           			    	dos.writeBoolean(this.WELCOME_PRESENTATION);
		            	}
					
						if(this.SITE_ACTIVATION_SUPPORT_CALL == null) {
			                dos.writeByte(-1);
						} else {
               				dos.writeByte(0);
           			    	dos.writeBoolean(this.SITE_ACTIVATION_SUPPORT_CALL);
		            	}
					
						if(this.PERIOD_WK_OFFSET == null) {
			                dos.writeByte(-1);
						} else {
               				dos.writeByte(0);
           			    	dos.writeDouble(this.PERIOD_WK_OFFSET);
		            	}
					
						if(this.PERIOD_MO_OFFSET == null) {
			                dos.writeByte(-1);
						} else {
               				dos.writeByte(0);
           			    	dos.writeDouble(this.PERIOD_MO_OFFSET);
		            	}
					
						if(this.PERIOD_QTR_OFFSET == null) {
			                dos.writeByte(-1);
						} else {
               				dos.writeByte(0);
           			    	dos.writeDouble(this.PERIOD_QTR_OFFSET);
		            	}
					
						if(this.PERIOD_YR_OFFSET == null) {
			                dos.writeByte(-1);
						} else {
               				dos.writeByte(0);
           			    	dos.writeDouble(this.PERIOD_YR_OFFSET);
		            	}
					
						if(this.PMTD_FLAG == null) {
			                dos.writeByte(-1);
						} else {
               				dos.writeByte(0);
           			    	dos.writeBoolean(this.PMTD_FLAG);
		            	}
					
						if(this.PQTD_FLAG == null) {
			                dos.writeByte(-1);
						} else {
               				dos.writeByte(0);
           			    	dos.writeBoolean(this.PQTD_FLAG);
		            	}
					
						if(this.PYTD_FLAG == null) {
			                dos.writeByte(-1);
						} else {
               				dos.writeByte(0);
           			    	dos.writeBoolean(this.PYTD_FLAG);
		            	}
					
						writeDate(this.DATA_THROUGH_DATE, dos, oos);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);
        	}

    }
    
    public void writeValuesData(DataOutputStream dos, org.jboss.marshalling.Marshaller objectOut){
                try {

		
						writeString(this.ACCT_LEGEND_ID, dos, objectOut);
					
						writeString(this.ACCOUNT_TERRITORY_ID, dos, objectOut);
					
						writeString(this.ACCOUNT_TERRITORY_NAME, dos, objectOut);
					
						writeString(this.PARENT_GEO_ID, dos, objectOut);
					
						writeString(this.PARENT_GEO_NAME, dos, objectOut);
					
						writeDate(this.DATE, dos, objectOut);
					
						writeString(this.TYPE, dos, objectOut);
					
						writeString(this.TOPICS, dos, objectOut);
					
						writeString(this.CALL_CREATED_BY, dos, objectOut);
					
						writeString(this.CREATED_BY_TEAM, dos, objectOut);
					
						writeString(this.PRODUCT, dos, objectOut);
					
						writeString(this.MEDIUM, dos, objectOut);
					
						writeString(this.EMAIL_TRIGGER, dos, objectOut);
					
						writeString(this.CORE_MESSAGE, dos, objectOut);
					
						writeString(this.MEAL, dos, objectOut);
					
						writeString(this.MATERIALS_LEFT, dos, objectOut);
					
						writeString(this.MATERIALS_USED, dos, objectOut);
					
						if(this.WELCOME_PRESENTATION == null) {
							objectOut.writeByte(-1);
						} else {
							objectOut.writeByte(0);
							objectOut.writeBoolean(this.WELCOME_PRESENTATION);
		            	}
					
						if(this.SITE_ACTIVATION_SUPPORT_CALL == null) {
							objectOut.writeByte(-1);
						} else {
							objectOut.writeByte(0);
							objectOut.writeBoolean(this.SITE_ACTIVATION_SUPPORT_CALL);
		            	}
					
						if(this.PERIOD_WK_OFFSET == null) {
							objectOut.writeByte(-1);
						} else {
							objectOut.writeByte(0);
							objectOut.writeDouble(this.PERIOD_WK_OFFSET);
		            	}
					
						if(this.PERIOD_MO_OFFSET == null) {
							objectOut.writeByte(-1);
						} else {
							objectOut.writeByte(0);
							objectOut.writeDouble(this.PERIOD_MO_OFFSET);
		            	}
					
						if(this.PERIOD_QTR_OFFSET == null) {
							objectOut.writeByte(-1);
						} else {
							objectOut.writeByte(0);
							objectOut.writeDouble(this.PERIOD_QTR_OFFSET);
		            	}
					
						if(this.PERIOD_YR_OFFSET == null) {
							objectOut.writeByte(-1);
						} else {
							objectOut.writeByte(0);
							objectOut.writeDouble(this.PERIOD_YR_OFFSET);
		            	}
					
						if(this.PMTD_FLAG == null) {
							objectOut.writeByte(-1);
						} else {
							objectOut.writeByte(0);
							objectOut.writeBoolean(this.PMTD_FLAG);
		            	}
					
						if(this.PQTD_FLAG == null) {
							objectOut.writeByte(-1);
						} else {
							objectOut.writeByte(0);
							objectOut.writeBoolean(this.PQTD_FLAG);
		            	}
					
						if(this.PYTD_FLAG == null) {
							objectOut.writeByte(-1);
						} else {
							objectOut.writeByte(0);
							objectOut.writeBoolean(this.PYTD_FLAG);
		            	}
					
						writeDate(this.DATA_THROUGH_DATE, dos, objectOut);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);
        	}
    }


    
    public boolean supportMarshaller(){
        return true;
    }


    public String toString() {

		StringBuilder sb = new StringBuilder();
		sb.append(super.toString());
		sb.append("[");
		sb.append("INTERACTION_ID="+INTERACTION_ID);
		sb.append(",ACCT_LEGEND_ID="+ACCT_LEGEND_ID);
		sb.append(",ACCOUNT_TERRITORY_ID="+ACCOUNT_TERRITORY_ID);
		sb.append(",ACCOUNT_TERRITORY_NAME="+ACCOUNT_TERRITORY_NAME);
		sb.append(",PARENT_GEO_ID="+PARENT_GEO_ID);
		sb.append(",PARENT_GEO_NAME="+PARENT_GEO_NAME);
		sb.append(",DATE="+String.valueOf(DATE));
		sb.append(",TYPE="+TYPE);
		sb.append(",TOPICS="+TOPICS);
		sb.append(",CALL_CREATED_BY="+CALL_CREATED_BY);
		sb.append(",CREATED_BY_TEAM="+CREATED_BY_TEAM);
		sb.append(",PRODUCT="+PRODUCT);
		sb.append(",MEDIUM="+MEDIUM);
		sb.append(",EMAIL_TRIGGER="+EMAIL_TRIGGER);
		sb.append(",CORE_MESSAGE="+CORE_MESSAGE);
		sb.append(",MEAL="+MEAL);
		sb.append(",MATERIALS_LEFT="+MATERIALS_LEFT);
		sb.append(",MATERIALS_USED="+MATERIALS_USED);
		sb.append(",WELCOME_PRESENTATION="+String.valueOf(WELCOME_PRESENTATION));
		sb.append(",SITE_ACTIVATION_SUPPORT_CALL="+String.valueOf(SITE_ACTIVATION_SUPPORT_CALL));
		sb.append(",PERIOD_WK_OFFSET="+String.valueOf(PERIOD_WK_OFFSET));
		sb.append(",PERIOD_MO_OFFSET="+String.valueOf(PERIOD_MO_OFFSET));
		sb.append(",PERIOD_QTR_OFFSET="+String.valueOf(PERIOD_QTR_OFFSET));
		sb.append(",PERIOD_YR_OFFSET="+String.valueOf(PERIOD_YR_OFFSET));
		sb.append(",PMTD_FLAG="+String.valueOf(PMTD_FLAG));
		sb.append(",PQTD_FLAG="+String.valueOf(PQTD_FLAG));
		sb.append(",PYTD_FLAG="+String.valueOf(PYTD_FLAG));
		sb.append(",DATA_THROUGH_DATE="+String.valueOf(DATA_THROUGH_DATE));
	    sb.append("]");

	    return sb.toString();
    }
        public String toLogString(){
        	StringBuilder sb = new StringBuilder();
        	
        				if(INTERACTION_ID == null){
        					sb.append("<null>");
        				}else{
            				sb.append(INTERACTION_ID);
            			}
            		
        			sb.append("|");
        		
        				if(ACCT_LEGEND_ID == null){
        					sb.append("<null>");
        				}else{
            				sb.append(ACCT_LEGEND_ID);
            			}
            		
        			sb.append("|");
        		
        				if(ACCOUNT_TERRITORY_ID == null){
        					sb.append("<null>");
        				}else{
            				sb.append(ACCOUNT_TERRITORY_ID);
            			}
            		
        			sb.append("|");
        		
        				if(ACCOUNT_TERRITORY_NAME == null){
        					sb.append("<null>");
        				}else{
            				sb.append(ACCOUNT_TERRITORY_NAME);
            			}
            		
        			sb.append("|");
        		
        				if(PARENT_GEO_ID == null){
        					sb.append("<null>");
        				}else{
            				sb.append(PARENT_GEO_ID);
            			}
            		
        			sb.append("|");
        		
        				if(PARENT_GEO_NAME == null){
        					sb.append("<null>");
        				}else{
            				sb.append(PARENT_GEO_NAME);
            			}
            		
        			sb.append("|");
        		
        				if(DATE == null){
        					sb.append("<null>");
        				}else{
            				sb.append(DATE);
            			}
            		
        			sb.append("|");
        		
        				if(TYPE == null){
        					sb.append("<null>");
        				}else{
            				sb.append(TYPE);
            			}
            		
        			sb.append("|");
        		
        				if(TOPICS == null){
        					sb.append("<null>");
        				}else{
            				sb.append(TOPICS);
            			}
            		
        			sb.append("|");
        		
        				if(CALL_CREATED_BY == null){
        					sb.append("<null>");
        				}else{
            				sb.append(CALL_CREATED_BY);
            			}
            		
        			sb.append("|");
        		
        				if(CREATED_BY_TEAM == null){
        					sb.append("<null>");
        				}else{
            				sb.append(CREATED_BY_TEAM);
            			}
            		
        			sb.append("|");
        		
        				if(PRODUCT == null){
        					sb.append("<null>");
        				}else{
            				sb.append(PRODUCT);
            			}
            		
        			sb.append("|");
        		
        				if(MEDIUM == null){
        					sb.append("<null>");
        				}else{
            				sb.append(MEDIUM);
            			}
            		
        			sb.append("|");
        		
        				if(EMAIL_TRIGGER == null){
        					sb.append("<null>");
        				}else{
            				sb.append(EMAIL_TRIGGER);
            			}
            		
        			sb.append("|");
        		
        				if(CORE_MESSAGE == null){
        					sb.append("<null>");
        				}else{
            				sb.append(CORE_MESSAGE);
            			}
            		
        			sb.append("|");
        		
        				if(MEAL == null){
        					sb.append("<null>");
        				}else{
            				sb.append(MEAL);
            			}
            		
        			sb.append("|");
        		
        				if(MATERIALS_LEFT == null){
        					sb.append("<null>");
        				}else{
            				sb.append(MATERIALS_LEFT);
            			}
            		
        			sb.append("|");
        		
        				if(MATERIALS_USED == null){
        					sb.append("<null>");
        				}else{
            				sb.append(MATERIALS_USED);
            			}
            		
        			sb.append("|");
        		
        				if(WELCOME_PRESENTATION == null){
        					sb.append("<null>");
        				}else{
            				sb.append(WELCOME_PRESENTATION);
            			}
            		
        			sb.append("|");
        		
        				if(SITE_ACTIVATION_SUPPORT_CALL == null){
        					sb.append("<null>");
        				}else{
            				sb.append(SITE_ACTIVATION_SUPPORT_CALL);
            			}
            		
        			sb.append("|");
        		
        				if(PERIOD_WK_OFFSET == null){
        					sb.append("<null>");
        				}else{
            				sb.append(PERIOD_WK_OFFSET);
            			}
            		
        			sb.append("|");
        		
        				if(PERIOD_MO_OFFSET == null){
        					sb.append("<null>");
        				}else{
            				sb.append(PERIOD_MO_OFFSET);
            			}
            		
        			sb.append("|");
        		
        				if(PERIOD_QTR_OFFSET == null){
        					sb.append("<null>");
        				}else{
            				sb.append(PERIOD_QTR_OFFSET);
            			}
            		
        			sb.append("|");
        		
        				if(PERIOD_YR_OFFSET == null){
        					sb.append("<null>");
        				}else{
            				sb.append(PERIOD_YR_OFFSET);
            			}
            		
        			sb.append("|");
        		
        				if(PMTD_FLAG == null){
        					sb.append("<null>");
        				}else{
            				sb.append(PMTD_FLAG);
            			}
            		
        			sb.append("|");
        		
        				if(PQTD_FLAG == null){
        					sb.append("<null>");
        				}else{
            				sb.append(PQTD_FLAG);
            			}
            		
        			sb.append("|");
        		
        				if(PYTD_FLAG == null){
        					sb.append("<null>");
        				}else{
            				sb.append(PYTD_FLAG);
            			}
            		
        			sb.append("|");
        		
        				if(DATA_THROUGH_DATE == null){
        					sb.append("<null>");
        				}else{
            				sb.append(DATA_THROUGH_DATE);
            			}
            		
        			sb.append("|");
        		
        	return sb.toString();
        }

    /**
     * Compare keys
     */
    public int compareTo(INTERACTIONSCOMStruct other) {

		int returnValue = -1;
		
						returnValue = checkNullsAndCompare(this.INTERACTION_ID, other.INTERACTION_ID);
						if(returnValue != 0) {
							return returnValue;
						}

					
	    return returnValue;
    }


    private int checkNullsAndCompare(Object object1, Object object2) {
        int returnValue = 0;
		if (object1 instanceof Comparable && object2 instanceof Comparable) {
            returnValue = ((Comparable) object1).compareTo(object2);
        } else if (object1 != null && object2 != null) {
            returnValue = compareStrings(object1.toString(), object2.toString());
        } else if (object1 == null && object2 != null) {
            returnValue = 1;
        } else if (object1 != null && object2 == null) {
            returnValue = -1;
        } else {
            returnValue = 0;
        }

        return returnValue;
    }

    private int compareStrings(String string1, String string2) {
        return string1.compareTo(string2);
    }


}
public void tDBInput_4Process(final java.util.Map<String, Object> globalMap) throws TalendException {
	globalMap.put("tDBInput_4_SUBPROCESS_STATE", 0);

 final boolean execStat = this.execStat;
	
		String iterateId = "";
	
	
	String currentComponent = "";
	java.util.Map<String, Object> resourceMap = new java.util.HashMap<String, Object>();

	try {
			// TDI-39566 avoid throwing an useless Exception
			boolean resumeIt = true;
			if (globalResumeTicket == false && resumeEntryMethodName != null) {
				String currentMethodName = new java.lang.Exception().getStackTrace()[0].getMethodName();
				resumeIt = resumeEntryMethodName.equals(currentMethodName);
			}
			if (resumeIt || globalResumeTicket) { //start the resume
				globalResumeTicket = true;



		INTERACTIONSCOMStruct INTERACTIONSCOM = new INTERACTIONSCOMStruct();




	
	/**
	 * [tAdvancedHash_INTERACTIONSCOM begin ] start
	 */

	

	
		
		ok_Hash.put("tAdvancedHash_INTERACTIONSCOM", false);
		start_Hash.put("tAdvancedHash_INTERACTIONSCOM", System.currentTimeMillis());
		
	
	currentComponent="tAdvancedHash_INTERACTIONSCOM";

	
			runStat.updateStatAndLog(execStat,enableLogStash,resourceMap,iterateId,0,0,"INTERACTIONSCOM");
			
		int tos_count_tAdvancedHash_INTERACTIONSCOM = 0;
		
			if(enableLogStash) {
				talendJobLog.addCM("tAdvancedHash_INTERACTIONSCOM", "tAdvancedHash_INTERACTIONSCOM", "tAdvancedHash");
				talendJobLogProcess(globalMap);
			}
			

			   		// connection name:INTERACTIONSCOM
			   		// source node:tDBInput_4 - inputs:(after_tDBInput_1) outputs:(INTERACTIONSCOM,INTERACTIONSCOM) | target node:tAdvancedHash_INTERACTIONSCOM - inputs:(INTERACTIONSCOM) outputs:()
			   		// linked node: tMap_1 - inputs:(HCPS,HCPTOINTERACTIONCOM,INTERACTIONSCOM,HCPADDRESSES,PRODUCT,RECIPIENT_STATE,RECIPIENT_COUNTRY,RECIPIENT_TYPE) outputs:(OUTPUT)
			   
			   		org.talend.designer.components.lookup.common.ICommonLookup.MATCHING_MODE matchingModeEnum_INTERACTIONSCOM = 
			   			org.talend.designer.components.lookup.common.ICommonLookup.MATCHING_MODE.UNIQUE_MATCH;
			   			
			   
	   			org.talend.designer.components.lookup.memory.AdvancedMemoryLookup<INTERACTIONSCOMStruct> tHash_Lookup_INTERACTIONSCOM =org.talend.designer.components.lookup.memory.AdvancedMemoryLookup.
	   						<INTERACTIONSCOMStruct>getLookup(matchingModeEnum_INTERACTIONSCOM);
	   						   
		   	   	   globalMap.put("tHash_Lookup_INTERACTIONSCOM", tHash_Lookup_INTERACTIONSCOM);
		   	   	   
				
           

 



/**
 * [tAdvancedHash_INTERACTIONSCOM begin ] stop
 */



	
	/**
	 * [tDBInput_4 begin ] start
	 */

	

	
		
		ok_Hash.put("tDBInput_4", false);
		start_Hash.put("tDBInput_4", System.currentTimeMillis());
		
	
	currentComponent="tDBInput_4";

	
		int tos_count_tDBInput_4 = 0;
		
			if(enableLogStash) {
				talendJobLog.addCM("tDBInput_4", "INTERACTIONSCOM", "tSnowflakeInput");
				talendJobLogProcess(globalMap);
			}
			

boolean doesNodeBelongToRequest_tDBInput_4 = 0 == 0;
@SuppressWarnings("unchecked")
java.util.Map<String, Object> restRequest_tDBInput_4 = (java.util.Map<String, Object>)globalMap.get("restRequest");
String currentTRestRequestOperation_tDBInput_4 = (String)(restRequest_tDBInput_4 != null ? restRequest_tDBInput_4.get("OPERATION") : null);

org.talend.components.api.component.ComponentDefinition def_tDBInput_4 =
        new org.talend.components.snowflake.tsnowflakeinput.TSnowflakeInputDefinition();

org.talend.components.api.component.runtime.Writer writer_tDBInput_4 = null;
org.talend.components.api.component.runtime.Reader reader_tDBInput_4 = null;


org.talend.components.snowflake.tsnowflakeinput.TSnowflakeInputProperties props_tDBInput_4 =
        (org.talend.components.snowflake.tsnowflakeinput.TSnowflakeInputProperties) def_tDBInput_4.createRuntimeProperties();
 		                    props_tDBInput_4.setValue("condition",
 		                    "");
 		                    
 		                    props_tDBInput_4.setValue("manualQuery",
 		                    false);
 		                    
 		                    props_tDBInput_4.setValue("convertColumnsAndTableToUppercase",
 		                    true);
 		                    
 		                    props_tDBInput_4.connection.setValue("useCustomRegion",
 		                    false);
 		                    
 		                    props_tDBInput_4.connection.userPassword.setValue("useAuth",
 		                    false);
 		                    
 		                    props_tDBInput_4.connection.referencedComponent.setValue("referenceType",
 		                        org.talend.components.api.properties.ComponentReferenceProperties.ReferenceType.COMPONENT_INSTANCE);
 		                    
 		                    props_tDBInput_4.connection.referencedComponent.setValue("componentInstanceId",
 		                    "tDBConnection_1");
 		                    
 		                    props_tDBInput_4.connection.referencedComponent.setValue("referenceDefinitionName",
 		                    "tSnowflakeConnection");
 		                    
 		                    props_tDBInput_4.table.setValue("tableName",
 		                    "INTERACTIONSCOM");
 		                    
 		                    props_tDBInput_4.table.connection.setValue("useCustomRegion",
 		                    false);
 		                    
 		                    props_tDBInput_4.table.connection.userPassword.setValue("useAuth",
 		                    false);
 		                    
 		                    props_tDBInput_4.table.connection.referencedComponent.setValue("referenceType",
 		                        org.talend.components.api.properties.ComponentReferenceProperties.ReferenceType.COMPONENT_INSTANCE);
 		                    
 		                    props_tDBInput_4.table.connection.referencedComponent.setValue("componentInstanceId",
 		                    "tDBConnection_1");
 		                    
 		                    props_tDBInput_4.table.connection.referencedComponent.setValue("referenceDefinitionName",
 		                    "tSnowflakeConnection");
 		                    
 		                    class SchemaSettingTool_tDBInput_4_1_fisrt {
 		                    		
 		                    		String getSchemaValue() {
 		                    				
 		                    						StringBuilder s = new StringBuilder();
                    						
     		                    						a("{\"type\":\"record\",",s);
     		                    						
     		                    						a("\"name\":\"INTERACTIONSCOM\",\"fields\":[{",s);
     		                    						
     		                    						a("\"name\":\"INTERACTION_ID\",\"type\":\"string\",\"talend.field.length\":\"10\",\"talend.field.dbType\":12,\"talend.field.dbColumnName\":\"INTERACTION_ID\",\"talend.field.isKey\":\"true\"},{",s);
     		                    						
     		                    						a("\"name\":\"ACCT_LEGEND_ID\",\"type\":[\"string\",\"null\"],\"talend.field.length\":\"10\",\"talend.field.dbType\":12,\"talend.field.dbColumnName\":\"ACCT_LEGEND_ID\"},{",s);
     		                    						
     		                    						a("\"name\":\"ACCOUNT_TERRITORY_ID\",\"type\":[\"string\",\"null\"],\"talend.field.length\":\"10\",\"talend.field.dbType\":12,\"talend.field.dbColumnName\":\"ACCOUNT_TERRITORY_ID\"},{",s);
     		                    						
     		                    						a("\"name\":\"ACCOUNT_TERRITORY_NAME\",\"type\":[\"string\",\"null\"],\"talend.field.length\":\"50\",\"talend.field.dbType\":12,\"talend.field.dbColumnName\":\"ACCOUNT_TERRITORY_NAME\"},{",s);
     		                    						
     		                    						a("\"name\":\"PARENT_GEO_ID\",\"type\":[\"string\",\"null\"],\"talend.field.length\":\"10\",\"talend.field.dbType\":12,\"talend.field.dbColumnName\":\"PARENT_GEO_ID\"},{",s);
     		                    						
     		                    						a("\"name\":\"PARENT_GEO_NAME\",\"type\":[\"string\",\"null\"],\"talend.field.length\":\"50\",\"talend.field.dbType\":12,\"talend.field.dbColumnName\":\"PARENT_GEO_NAME\"},{",s);
     		                    						
     		                    						a("\"name\":\"DATE\",\"type\":[{\"type\":\"int\",\"logicalType\":\"date\"},\"null\"],\"talend.field.pattern\":\"yyyy-MM-dd\",\"talend.field.dbType\":91,\"talend.field.dbColumnName\":\"DATE\"},{",s);
     		                    						
     		                    						a("\"name\":\"TYPE\",\"type\":[\"string\",\"null\"],\"talend.field.length\":\"50\",\"talend.field.dbType\":12,\"talend.field.dbColumnName\":\"TYPE\"},{",s);
     		                    						
     		                    						a("\"name\":\"TOPICS\",\"type\":[\"string\",\"null\"],\"talend.field.length\":\"100\",\"talend.field.dbType\":12,\"talend.field.dbColumnName\":\"TOPICS\"},{",s);
     		                    						
     		                    						a("\"name\":\"CALL_CREATED_BY\",\"type\":[\"string\",\"null\"],\"talend.field.length\":\"50\",\"talend.field.dbType\":12,\"talend.field.dbColumnName\":\"CALL_CREATED_BY\"},{",s);
     		                    						
     		                    						a("\"name\":\"CREATED_BY_TEAM\",\"type\":[\"string\",\"null\"],\"talend.field.length\":\"50\",\"talend.field.dbType\":12,\"talend.field.dbColumnName\":\"CREATED_BY_TEAM\"},{",s);
     		                    						
     		                    						a("\"name\":\"PRODUCT\",\"type\":[\"string\",\"null\"],\"talend.field.length\":\"50\",\"talend.field.dbType\":12,\"talend.field.dbColumnName\":\"PRODUCT\"},{",s);
     		                    						
     		                    						a("\"name\":\"MEDIUM\",\"type\":[\"string\",\"null\"],\"talend.field.length\":\"50\",\"talend.field.dbType\":12,\"talend.field.dbColumnName\":\"MEDIUM\"},{",s);
     		                    						
     		                    						a("\"name\":\"EMAIL_TRIGGER\",\"type\":[\"string\",\"null\"],\"talend.field.length\":\"250\",\"talend.field.dbType\":12,\"talend.field.dbColumnName\":\"EMAIL_TRIGGER\"},{",s);
     		                    						
     		                    						a("\"name\":\"CORE_MESSAGE\",\"type\":[\"string\",\"null\"],\"talend.field.length\":\"250\",\"talend.field.dbType\":12,\"talend.field.dbColumnName\":\"CORE_MESSAGE\"},{",s);
     		                    						
     		                    						a("\"name\":\"MEAL\",\"type\":[\"string\",\"null\"],\"talend.field.length\":\"3\",\"talend.field.dbType\":12,\"talend.field.dbColumnName\":\"MEAL\"},{",s);
     		                    						
     		                    						a("\"name\":\"MATERIALS_LEFT\",\"type\":[\"string\",\"null\"],\"talend.field.length\":\"250\",\"talend.field.dbType\":12,\"talend.field.dbColumnName\":\"MATERIALS_LEFT\"},{",s);
     		                    						
     		                    						a("\"name\":\"MATERIALS_USED\",\"type\":[\"string\",\"null\"],\"talend.field.length\":\"250\",\"talend.field.dbType\":12,\"talend.field.dbColumnName\":\"MATERIALS_USED\"},{",s);
     		                    						
     		                    						a("\"name\":\"WELCOME_PRESENTATION\",\"type\":[\"boolean\",\"null\"],\"talend.field.dbType\":16,\"talend.field.dbColumnName\":\"WELCOME_PRESENTATION\"},{",s);
     		                    						
     		                    						a("\"name\":\"SITE_ACTIVATION_SUPPORT_CALL\",\"type\":[\"boolean\",\"null\"],\"talend.field.dbType\":16,\"talend.field.dbColumnName\":\"SITE_ACTIVATION_SUPPORT_CALL\"},{",s);
     		                    						
     		                    						a("\"name\":\"PERIOD_WK_OFFSET\",\"type\":[\"double\",\"null\"],\"talend.field.dbType\":8,\"talend.field.dbColumnName\":\"PERIOD_WK_OFFSET\"},{",s);
     		                    						
     		                    						a("\"name\":\"PERIOD_MO_OFFSET\",\"type\":[\"double\",\"null\"],\"talend.field.dbType\":8,\"talend.field.dbColumnName\":\"PERIOD_MO_OFFSET\"},{",s);
     		                    						
     		                    						a("\"name\":\"PERIOD_QTR_OFFSET\",\"type\":[\"double\",\"null\"],\"talend.field.dbType\":8,\"talend.field.dbColumnName\":\"PERIOD_QTR_OFFSET\"},{",s);
     		                    						
     		                    						a("\"name\":\"PERIOD_YR_OFFSET\",\"type\":[\"double\",\"null\"],\"talend.field.dbType\":8,\"talend.field.dbColumnName\":\"PERIOD_YR_OFFSET\"},{",s);
     		                    						
     		                    						a("\"name\":\"PMTD_FLAG\",\"type\":[\"boolean\",\"null\"],\"talend.field.dbType\":16,\"talend.field.dbColumnName\":\"PMTD_FLAG\"},{",s);
     		                    						
     		                    						a("\"name\":\"PQTD_FLAG\",\"type\":[\"boolean\",\"null\"],\"talend.field.dbType\":16,\"talend.field.dbColumnName\":\"PQTD_FLAG\"},{",s);
     		                    						
     		                    						a("\"name\":\"PYTD_FLAG\",\"type\":[\"boolean\",\"null\"],\"talend.field.dbType\":16,\"talend.field.dbColumnName\":\"PYTD_FLAG\"},{",s);
     		                    						
     		                    						a("\"name\":\"DATA_THROUGH_DATE\",\"type\":[{\"type\":\"int\",\"logicalType\":\"date\"},\"null\"],\"talend.field.pattern\":\"yyyy-MM-dd\",\"talend.field.dbType\":91,\"talend.field.dbColumnName\":\"DATA_THROUGH_DATE\"}]}",s);
     		                    						
     		                    				return s.toString();
     		                    		
 		                    		}
 		                    		
 		                    		void a(String part, StringBuilder strB) {
 		                    				strB.append(part);
 		                    		}
 		                    		
 		                    }
 		                    
 		                    SchemaSettingTool_tDBInput_4_1_fisrt sst_tDBInput_4_1_fisrt = new SchemaSettingTool_tDBInput_4_1_fisrt();
 		                    
 		                    props_tDBInput_4.table.main.setValue("schema",
 		                        new org.apache.avro.Schema.Parser().parse(sst_tDBInput_4_1_fisrt.getSchemaValue()));
 		                    
    if (org.talend.components.api.properties.ComponentReferenceProperties.ReferenceType.COMPONENT_INSTANCE == props_tDBInput_4.connection.referencedComponent.referenceType.getValue()) {
        final String referencedComponentInstanceId_tDBInput_4 = props_tDBInput_4.connection.referencedComponent.componentInstanceId.getStringValue();
        if (referencedComponentInstanceId_tDBInput_4 != null) {
            org.talend.daikon.properties.Properties referencedComponentProperties_tDBInput_4 = (org.talend.daikon.properties.Properties) globalMap.get(
                referencedComponentInstanceId_tDBInput_4 + "_COMPONENT_RUNTIME_PROPERTIES");
            props_tDBInput_4.connection.referencedComponent.setReference(referencedComponentProperties_tDBInput_4);
        }
    }
    if (org.talend.components.api.properties.ComponentReferenceProperties.ReferenceType.COMPONENT_INSTANCE == props_tDBInput_4.table.connection.referencedComponent.referenceType.getValue()) {
        final String referencedComponentInstanceId_tDBInput_4 = props_tDBInput_4.table.connection.referencedComponent.componentInstanceId.getStringValue();
        if (referencedComponentInstanceId_tDBInput_4 != null) {
            org.talend.daikon.properties.Properties referencedComponentProperties_tDBInput_4 = (org.talend.daikon.properties.Properties) globalMap.get(
                referencedComponentInstanceId_tDBInput_4 + "_COMPONENT_RUNTIME_PROPERTIES");
            props_tDBInput_4.table.connection.referencedComponent.setReference(referencedComponentProperties_tDBInput_4);
        }
    }
globalMap.put("tDBInput_4_COMPONENT_RUNTIME_PROPERTIES", props_tDBInput_4);
globalMap.putIfAbsent("TALEND_PRODUCT_VERSION", "8.0");
globalMap.put("TALEND_COMPONENTS_VERSION", "0.37.4");
java.net.URL mappings_url_tDBInput_4= this.getClass().getResource("/xmlMappings");
globalMap.put("tDBInput_4_MAPPINGS_URL", mappings_url_tDBInput_4);

org.talend.components.api.container.RuntimeContainer container_tDBInput_4 = new org.talend.components.api.container.RuntimeContainer() {
    public Object getComponentData(String componentId, String key) {
        return globalMap.get(componentId + "_" + key);
    }

    public void setComponentData(String componentId, String key, Object data) {
        globalMap.put(componentId + "_" + key, data);
    }

    public String getCurrentComponentId() {
        return "tDBInput_4";
    }

    public Object getGlobalData(String key) {
    	return globalMap.get(key);
    }
};

int nb_line_tDBInput_4 = 0;

org.talend.components.api.component.ConnectorTopology topology_tDBInput_4 = null;
topology_tDBInput_4 = org.talend.components.api.component.ConnectorTopology.OUTGOING;

org.talend.daikon.runtime.RuntimeInfo runtime_info_tDBInput_4 = def_tDBInput_4.getRuntimeInfo(
    org.talend.components.api.component.runtime.ExecutionEngine.DI, props_tDBInput_4, topology_tDBInput_4);
java.util.Set<org.talend.components.api.component.ConnectorTopology> supported_connector_topologies_tDBInput_4 = def_tDBInput_4.getSupportedConnectorTopologies();

org.talend.components.api.component.runtime.RuntimableRuntime componentRuntime_tDBInput_4 = (org.talend.components.api.component.runtime.RuntimableRuntime)(Class.forName(runtime_info_tDBInput_4.getRuntimeClassName()).newInstance());
org.talend.daikon.properties.ValidationResult initVr_tDBInput_4 = componentRuntime_tDBInput_4.initialize(container_tDBInput_4, props_tDBInput_4);

if (initVr_tDBInput_4.getStatus() == org.talend.daikon.properties.ValidationResult.Result.ERROR ) {
    throw new RuntimeException(initVr_tDBInput_4.getMessage());
}

if(componentRuntime_tDBInput_4 instanceof org.talend.components.api.component.runtime.ComponentDriverInitialization) {
	org.talend.components.api.component.runtime.ComponentDriverInitialization compDriverInitialization_tDBInput_4 = (org.talend.components.api.component.runtime.ComponentDriverInitialization)componentRuntime_tDBInput_4;
	compDriverInitialization_tDBInput_4.runAtDriver(container_tDBInput_4);
}

org.talend.components.api.component.runtime.SourceOrSink sourceOrSink_tDBInput_4 = null;
if(componentRuntime_tDBInput_4 instanceof org.talend.components.api.component.runtime.SourceOrSink) {
	sourceOrSink_tDBInput_4 = (org.talend.components.api.component.runtime.SourceOrSink)componentRuntime_tDBInput_4;
	if (doesNodeBelongToRequest_tDBInput_4) {
        org.talend.daikon.properties.ValidationResult vr_tDBInput_4 = sourceOrSink_tDBInput_4.validate(container_tDBInput_4);
        if (vr_tDBInput_4.getStatus() == org.talend.daikon.properties.ValidationResult.Result.ERROR ) {
            throw new RuntimeException(vr_tDBInput_4.getMessage());
        }
	}
}

    if (sourceOrSink_tDBInput_4 instanceof org.talend.components.api.component.runtime.Source) {
        org.talend.components.api.component.runtime.Source source_tDBInput_4 =
                (org.talend.components.api.component.runtime.Source)sourceOrSink_tDBInput_4;
        reader_tDBInput_4 = source_tDBInput_4.createReader(container_tDBInput_4);
	    reader_tDBInput_4 = new org.talend.codegen.flowvariables.runtime.FlowVariablesReader(reader_tDBInput_4, container_tDBInput_4);

            boolean multi_output_is_allowed_tDBInput_4 = false;
            org.talend.components.api.component.Connector c_tDBInput_4 = null;
            for (org.talend.components.api.component.Connector currentConnector : props_tDBInput_4.getAvailableConnectors(null, true)) {
                if (currentConnector.getName().equals("MAIN")) {
                    c_tDBInput_4 = currentConnector;
                }

                if (currentConnector.getName().equals("REJECT")) {//it's better to move the code to javajet
                    multi_output_is_allowed_tDBInput_4 = true;
                }
            }
            org.apache.avro.Schema schema_tDBInput_4 = props_tDBInput_4.getSchema(c_tDBInput_4, true);

        org.talend.codegen.enforcer.OutgoingSchemaEnforcer outgoingEnforcer_tDBInput_4 = org.talend.codegen.enforcer.EnforcerCreator.createOutgoingEnforcer(schema_tDBInput_4, false);

        // Create a reusable factory that converts the output of the reader to an IndexedRecord.
        org.talend.daikon.avro.converter.IndexedRecordConverter<Object, ? extends org.apache.avro.generic.IndexedRecord> factory_tDBInput_4 = null;

        // Iterate through the incoming data.
        boolean available_tDBInput_4 = reader_tDBInput_4.start();

        resourceMap.put("reader_tDBInput_4", reader_tDBInput_4);

        for (; available_tDBInput_4; available_tDBInput_4 = reader_tDBInput_4.advance()) {
			nb_line_tDBInput_4++;

			
			if (multi_output_is_allowed_tDBInput_4) {
				
					INTERACTIONSCOM = null;
				

				
			}
			

			try {
				Object data_tDBInput_4 = reader_tDBInput_4.getCurrent();
				

					if(multi_output_is_allowed_tDBInput_4) {
						INTERACTIONSCOM = new INTERACTIONSCOMStruct();
					}

					
        // Construct the factory once when the first data arrives.
        if (factory_tDBInput_4 == null) {
            factory_tDBInput_4 = (org.talend.daikon.avro.converter.IndexedRecordConverter<Object, ? extends org.apache.avro.generic.IndexedRecord>)
                    new org.talend.daikon.avro.AvroRegistry()
                            .createIndexedRecordConverter(data_tDBInput_4.getClass());
        }

        // Enforce the outgoing schema on the input.
        outgoingEnforcer_tDBInput_4.setWrapped(factory_tDBInput_4.convertToAvro(data_tDBInput_4));
                Object columnValue_0_tDBInput_4 = outgoingEnforcer_tDBInput_4.get(0);
                        INTERACTIONSCOM.INTERACTION_ID = (String) (columnValue_0_tDBInput_4);
                Object columnValue_1_tDBInput_4 = outgoingEnforcer_tDBInput_4.get(1);
                        INTERACTIONSCOM.ACCT_LEGEND_ID = (String) (columnValue_1_tDBInput_4);
                Object columnValue_2_tDBInput_4 = outgoingEnforcer_tDBInput_4.get(2);
                        INTERACTIONSCOM.ACCOUNT_TERRITORY_ID = (String) (columnValue_2_tDBInput_4);
                Object columnValue_3_tDBInput_4 = outgoingEnforcer_tDBInput_4.get(3);
                        INTERACTIONSCOM.ACCOUNT_TERRITORY_NAME = (String) (columnValue_3_tDBInput_4);
                Object columnValue_4_tDBInput_4 = outgoingEnforcer_tDBInput_4.get(4);
                        INTERACTIONSCOM.PARENT_GEO_ID = (String) (columnValue_4_tDBInput_4);
                Object columnValue_5_tDBInput_4 = outgoingEnforcer_tDBInput_4.get(5);
                        INTERACTIONSCOM.PARENT_GEO_NAME = (String) (columnValue_5_tDBInput_4);
                Object columnValue_6_tDBInput_4 = outgoingEnforcer_tDBInput_4.get(6);
                        INTERACTIONSCOM.DATE = (java.util.Date) (columnValue_6_tDBInput_4);
                Object columnValue_7_tDBInput_4 = outgoingEnforcer_tDBInput_4.get(7);
                        INTERACTIONSCOM.TYPE = (String) (columnValue_7_tDBInput_4);
                Object columnValue_8_tDBInput_4 = outgoingEnforcer_tDBInput_4.get(8);
                        INTERACTIONSCOM.TOPICS = (String) (columnValue_8_tDBInput_4);
                Object columnValue_9_tDBInput_4 = outgoingEnforcer_tDBInput_4.get(9);
                        INTERACTIONSCOM.CALL_CREATED_BY = (String) (columnValue_9_tDBInput_4);
                Object columnValue_10_tDBInput_4 = outgoingEnforcer_tDBInput_4.get(10);
                        INTERACTIONSCOM.CREATED_BY_TEAM = (String) (columnValue_10_tDBInput_4);
                Object columnValue_11_tDBInput_4 = outgoingEnforcer_tDBInput_4.get(11);
                        INTERACTIONSCOM.PRODUCT = (String) (columnValue_11_tDBInput_4);
                Object columnValue_12_tDBInput_4 = outgoingEnforcer_tDBInput_4.get(12);
                        INTERACTIONSCOM.MEDIUM = (String) (columnValue_12_tDBInput_4);
                Object columnValue_13_tDBInput_4 = outgoingEnforcer_tDBInput_4.get(13);
                        INTERACTIONSCOM.EMAIL_TRIGGER = (String) (columnValue_13_tDBInput_4);
                Object columnValue_14_tDBInput_4 = outgoingEnforcer_tDBInput_4.get(14);
                        INTERACTIONSCOM.CORE_MESSAGE = (String) (columnValue_14_tDBInput_4);
                Object columnValue_15_tDBInput_4 = outgoingEnforcer_tDBInput_4.get(15);
                        INTERACTIONSCOM.MEAL = (String) (columnValue_15_tDBInput_4);
                Object columnValue_16_tDBInput_4 = outgoingEnforcer_tDBInput_4.get(16);
                        INTERACTIONSCOM.MATERIALS_LEFT = (String) (columnValue_16_tDBInput_4);
                Object columnValue_17_tDBInput_4 = outgoingEnforcer_tDBInput_4.get(17);
                        INTERACTIONSCOM.MATERIALS_USED = (String) (columnValue_17_tDBInput_4);
                Object columnValue_18_tDBInput_4 = outgoingEnforcer_tDBInput_4.get(18);
                        INTERACTIONSCOM.WELCOME_PRESENTATION = (Boolean) (columnValue_18_tDBInput_4);
                Object columnValue_19_tDBInput_4 = outgoingEnforcer_tDBInput_4.get(19);
                        INTERACTIONSCOM.SITE_ACTIVATION_SUPPORT_CALL = (Boolean) (columnValue_19_tDBInput_4);
                Object columnValue_20_tDBInput_4 = outgoingEnforcer_tDBInput_4.get(20);
                        INTERACTIONSCOM.PERIOD_WK_OFFSET = (Double) (columnValue_20_tDBInput_4);
                Object columnValue_21_tDBInput_4 = outgoingEnforcer_tDBInput_4.get(21);
                        INTERACTIONSCOM.PERIOD_MO_OFFSET = (Double) (columnValue_21_tDBInput_4);
                Object columnValue_22_tDBInput_4 = outgoingEnforcer_tDBInput_4.get(22);
                        INTERACTIONSCOM.PERIOD_QTR_OFFSET = (Double) (columnValue_22_tDBInput_4);
                Object columnValue_23_tDBInput_4 = outgoingEnforcer_tDBInput_4.get(23);
                        INTERACTIONSCOM.PERIOD_YR_OFFSET = (Double) (columnValue_23_tDBInput_4);
                Object columnValue_24_tDBInput_4 = outgoingEnforcer_tDBInput_4.get(24);
                        INTERACTIONSCOM.PMTD_FLAG = (Boolean) (columnValue_24_tDBInput_4);
                Object columnValue_25_tDBInput_4 = outgoingEnforcer_tDBInput_4.get(25);
                        INTERACTIONSCOM.PQTD_FLAG = (Boolean) (columnValue_25_tDBInput_4);
                Object columnValue_26_tDBInput_4 = outgoingEnforcer_tDBInput_4.get(26);
                        INTERACTIONSCOM.PYTD_FLAG = (Boolean) (columnValue_26_tDBInput_4);
                Object columnValue_27_tDBInput_4 = outgoingEnforcer_tDBInput_4.get(27);
                        INTERACTIONSCOM.DATA_THROUGH_DATE = (java.util.Date) (columnValue_27_tDBInput_4);
			} catch (org.talend.components.api.exception.DataRejectException e_tDBInput_4) {
				java.util.Map<String,Object> info_tDBInput_4 = e_tDBInput_4.getRejectInfo();
				
					//TODO use a method instead of getting method by the special key "error/errorMessage"
					Object errorMessage_tDBInput_4 = null;
					if(info_tDBInput_4.containsKey("error")){
						errorMessage_tDBInput_4 = info_tDBInput_4.get("error");
					}else if(info_tDBInput_4.containsKey("errorMessage")){
						errorMessage_tDBInput_4 = info_tDBInput_4.get("errorMessage");
					}else{
						errorMessage_tDBInput_4 = "Rejected but error message missing";
					}
					errorMessage_tDBInput_4 = "Row "+ nb_line_tDBInput_4 + ": "+errorMessage_tDBInput_4;
					System.err.println(errorMessage_tDBInput_4);
				
					// If the record is reject, the main line record should put NULL
					INTERACTIONSCOM = null;
				
			} // end of catch

                java.lang.Iterable<?> outgoingMainRecordsList_tDBInput_4 = new java.util.ArrayList<Object>();
                java.util.Iterator outgoingMainRecordsIt_tDBInput_4 = null;


 



/**
 * [tDBInput_4 begin ] stop
 */
	
	/**
	 * [tDBInput_4 main ] start
	 */

	

	
	
	currentComponent="tDBInput_4";

	


 


	tos_count_tDBInput_4++;

/**
 * [tDBInput_4 main ] stop
 */
	
	/**
	 * [tDBInput_4 process_data_begin ] start
	 */

	

	
	
	currentComponent="tDBInput_4";

	


 



/**
 * [tDBInput_4 process_data_begin ] stop
 */

	
	/**
	 * [tAdvancedHash_INTERACTIONSCOM main ] start
	 */

	

	
	
	currentComponent="tAdvancedHash_INTERACTIONSCOM";

	
			if(runStat.update(execStat,enableLogStash,iterateId,1,1
				
					,"INTERACTIONSCOM","tDBInput_4","INTERACTIONSCOM","tSnowflakeInput","tAdvancedHash_INTERACTIONSCOM","tAdvancedHash_INTERACTIONSCOM","tAdvancedHash"
				
			)) {
				talendJobLogProcess(globalMap);
			}
			
    			if(log.isTraceEnabled()){
    				log.trace("INTERACTIONSCOM - " + (INTERACTIONSCOM==null? "": INTERACTIONSCOM.toLogString()));
    			}
    		


			   
			   

					INTERACTIONSCOMStruct INTERACTIONSCOM_HashRow = new INTERACTIONSCOMStruct();
		   	   	   
				
				INTERACTIONSCOM_HashRow.INTERACTION_ID = INTERACTIONSCOM.INTERACTION_ID;
				
				INTERACTIONSCOM_HashRow.ACCT_LEGEND_ID = INTERACTIONSCOM.ACCT_LEGEND_ID;
				
				INTERACTIONSCOM_HashRow.ACCOUNT_TERRITORY_ID = INTERACTIONSCOM.ACCOUNT_TERRITORY_ID;
				
				INTERACTIONSCOM_HashRow.ACCOUNT_TERRITORY_NAME = INTERACTIONSCOM.ACCOUNT_TERRITORY_NAME;
				
				INTERACTIONSCOM_HashRow.PARENT_GEO_ID = INTERACTIONSCOM.PARENT_GEO_ID;
				
				INTERACTIONSCOM_HashRow.PARENT_GEO_NAME = INTERACTIONSCOM.PARENT_GEO_NAME;
				
				INTERACTIONSCOM_HashRow.DATE = INTERACTIONSCOM.DATE;
				
				INTERACTIONSCOM_HashRow.TYPE = INTERACTIONSCOM.TYPE;
				
				INTERACTIONSCOM_HashRow.TOPICS = INTERACTIONSCOM.TOPICS;
				
				INTERACTIONSCOM_HashRow.CALL_CREATED_BY = INTERACTIONSCOM.CALL_CREATED_BY;
				
				INTERACTIONSCOM_HashRow.CREATED_BY_TEAM = INTERACTIONSCOM.CREATED_BY_TEAM;
				
				INTERACTIONSCOM_HashRow.PRODUCT = INTERACTIONSCOM.PRODUCT;
				
				INTERACTIONSCOM_HashRow.MEDIUM = INTERACTIONSCOM.MEDIUM;
				
				INTERACTIONSCOM_HashRow.EMAIL_TRIGGER = INTERACTIONSCOM.EMAIL_TRIGGER;
				
				INTERACTIONSCOM_HashRow.CORE_MESSAGE = INTERACTIONSCOM.CORE_MESSAGE;
				
				INTERACTIONSCOM_HashRow.MEAL = INTERACTIONSCOM.MEAL;
				
				INTERACTIONSCOM_HashRow.MATERIALS_LEFT = INTERACTIONSCOM.MATERIALS_LEFT;
				
				INTERACTIONSCOM_HashRow.MATERIALS_USED = INTERACTIONSCOM.MATERIALS_USED;
				
				INTERACTIONSCOM_HashRow.WELCOME_PRESENTATION = INTERACTIONSCOM.WELCOME_PRESENTATION;
				
				INTERACTIONSCOM_HashRow.SITE_ACTIVATION_SUPPORT_CALL = INTERACTIONSCOM.SITE_ACTIVATION_SUPPORT_CALL;
				
				INTERACTIONSCOM_HashRow.PERIOD_WK_OFFSET = INTERACTIONSCOM.PERIOD_WK_OFFSET;
				
				INTERACTIONSCOM_HashRow.PERIOD_MO_OFFSET = INTERACTIONSCOM.PERIOD_MO_OFFSET;
				
				INTERACTIONSCOM_HashRow.PERIOD_QTR_OFFSET = INTERACTIONSCOM.PERIOD_QTR_OFFSET;
				
				INTERACTIONSCOM_HashRow.PERIOD_YR_OFFSET = INTERACTIONSCOM.PERIOD_YR_OFFSET;
				
				INTERACTIONSCOM_HashRow.PMTD_FLAG = INTERACTIONSCOM.PMTD_FLAG;
				
				INTERACTIONSCOM_HashRow.PQTD_FLAG = INTERACTIONSCOM.PQTD_FLAG;
				
				INTERACTIONSCOM_HashRow.PYTD_FLAG = INTERACTIONSCOM.PYTD_FLAG;
				
				INTERACTIONSCOM_HashRow.DATA_THROUGH_DATE = INTERACTIONSCOM.DATA_THROUGH_DATE;
				
			tHash_Lookup_INTERACTIONSCOM.put(INTERACTIONSCOM_HashRow);
			
            




 


	tos_count_tAdvancedHash_INTERACTIONSCOM++;

/**
 * [tAdvancedHash_INTERACTIONSCOM main ] stop
 */
	
	/**
	 * [tAdvancedHash_INTERACTIONSCOM process_data_begin ] start
	 */

	

	
	
	currentComponent="tAdvancedHash_INTERACTIONSCOM";

	

 



/**
 * [tAdvancedHash_INTERACTIONSCOM process_data_begin ] stop
 */
	
	/**
	 * [tAdvancedHash_INTERACTIONSCOM process_data_end ] start
	 */

	

	
	
	currentComponent="tAdvancedHash_INTERACTIONSCOM";

	

 



/**
 * [tAdvancedHash_INTERACTIONSCOM process_data_end ] stop
 */



	
	/**
	 * [tDBInput_4 process_data_end ] start
	 */

	

	
	
	currentComponent="tDBInput_4";

	


 



/**
 * [tDBInput_4 process_data_end ] stop
 */
	
	/**
	 * [tDBInput_4 end ] start
	 */

	

	
	
	currentComponent="tDBInput_4";

	
// end of generic


resourceMap.put("finish_tDBInput_4", Boolean.TRUE);

    } // while  
    } // end of "if (sourceOrSink_tDBInput_4 instanceof ...Source)"
    java.util.Map<String, Object> resultMap_tDBInput_4 = null;
    if (reader_tDBInput_4 != null) {
        reader_tDBInput_4.close();
        resultMap_tDBInput_4 = reader_tDBInput_4.getReturnValues();
    }
if(resultMap_tDBInput_4!=null) {
	for(java.util.Map.Entry<String,Object> entry_tDBInput_4 : resultMap_tDBInput_4.entrySet()) {
		switch(entry_tDBInput_4.getKey()) {
		case org.talend.components.api.component.ComponentDefinition.RETURN_ERROR_MESSAGE :
			container_tDBInput_4.setComponentData("tDBInput_4", "ERROR_MESSAGE", entry_tDBInput_4.getValue());
			break;
		case org.talend.components.api.component.ComponentDefinition.RETURN_TOTAL_RECORD_COUNT :
			container_tDBInput_4.setComponentData("tDBInput_4", "NB_LINE", entry_tDBInput_4.getValue());
			break;
		case org.talend.components.api.component.ComponentDefinition.RETURN_SUCCESS_RECORD_COUNT :
			container_tDBInput_4.setComponentData("tDBInput_4", "NB_SUCCESS", entry_tDBInput_4.getValue());
			break;
		case org.talend.components.api.component.ComponentDefinition.RETURN_REJECT_RECORD_COUNT :
			container_tDBInput_4.setComponentData("tDBInput_4", "NB_REJECT", entry_tDBInput_4.getValue());
			break;
		default :
            StringBuilder studio_key_tDBInput_4 = new StringBuilder();
            for (int i_tDBInput_4 = 0; i_tDBInput_4 < entry_tDBInput_4.getKey().length(); i_tDBInput_4++) {
                char ch_tDBInput_4 = entry_tDBInput_4.getKey().charAt(i_tDBInput_4);
                if(Character.isUpperCase(ch_tDBInput_4) && i_tDBInput_4> 0) {
                	studio_key_tDBInput_4.append('_');
                }
                studio_key_tDBInput_4.append(ch_tDBInput_4);
            }
			container_tDBInput_4.setComponentData("tDBInput_4", studio_key_tDBInput_4.toString().toUpperCase(java.util.Locale.ENGLISH), entry_tDBInput_4.getValue());
			break;
		}
	}
}

 

ok_Hash.put("tDBInput_4", true);
end_Hash.put("tDBInput_4", System.currentTimeMillis());




/**
 * [tDBInput_4 end ] stop
 */

	
	/**
	 * [tAdvancedHash_INTERACTIONSCOM end ] start
	 */

	

	
	
	currentComponent="tAdvancedHash_INTERACTIONSCOM";

	

tHash_Lookup_INTERACTIONSCOM.endPut();

			 		if(runStat.updateStatAndLog(execStat,enableLogStash,resourceMap,iterateId,"INTERACTIONSCOM",2,0,
			 			"tDBInput_4","INTERACTIONSCOM","tSnowflakeInput","tAdvancedHash_INTERACTIONSCOM","tAdvancedHash_INTERACTIONSCOM","tAdvancedHash","output")) {
						talendJobLogProcess(globalMap);
					}
				
 

ok_Hash.put("tAdvancedHash_INTERACTIONSCOM", true);
end_Hash.put("tAdvancedHash_INTERACTIONSCOM", System.currentTimeMillis());




/**
 * [tAdvancedHash_INTERACTIONSCOM end ] stop
 */



				}//end the resume

				



	
			}catch(java.lang.Exception e){	
				
				    if(!(e instanceof TalendException)){
					   log.fatal(currentComponent + " " + e.getMessage(),e);
					}
				
				TalendException te = new TalendException(e, currentComponent, globalMap);
				
				throw te;
			}catch(java.lang.Error error){	
				
					runStat.stopThreadStat();
				
				throw error;
			}finally{
				
				try{
					
	
	/**
	 * [tDBInput_4 finally ] start
	 */

	

	
	
	currentComponent="tDBInput_4";

	
// finally of generic


if(resourceMap.get("finish_tDBInput_4")==null){
    if(resourceMap.get("reader_tDBInput_4")!=null){
		try {
			((org.talend.components.api.component.runtime.Reader)resourceMap.get("reader_tDBInput_4")).close();
		} catch (java.io.IOException e_tDBInput_4) {
			String errorMessage_tDBInput_4 = "failed to release the resource in tDBInput_4 :" + e_tDBInput_4.getMessage();
			System.err.println(errorMessage_tDBInput_4);
		}
	}
}
 



/**
 * [tDBInput_4 finally ] stop
 */

	
	/**
	 * [tAdvancedHash_INTERACTIONSCOM finally ] start
	 */

	

	
	
	currentComponent="tAdvancedHash_INTERACTIONSCOM";

	

 



/**
 * [tAdvancedHash_INTERACTIONSCOM finally ] stop
 */



				}catch(java.lang.Exception e){	
					//ignore
				}catch(java.lang.Error error){
					//ignore
				}
				resourceMap = null;
			}
		

		globalMap.put("tDBInput_4_SUBPROCESS_STATE", 1);
	}
	


public static class HCPADDRESSESStruct implements routines.system.IPersistableComparableLookupRow<HCPADDRESSESStruct> {
    final static byte[] commonByteArrayLock_USCOMM_SUNSHINE_RPT_QA_BEACON_EXTRACT_SNOWFLAKE = new byte[0];
    static byte[] commonByteArray_USCOMM_SUNSHINE_RPT_QA_BEACON_EXTRACT_SNOWFLAKE = new byte[0];
	protected static final int DEFAULT_HASHCODE = 1;
    protected static final int PRIME = 31;
    protected int hashCode = DEFAULT_HASHCODE;
    public boolean hashCodeDirty = true;

    public String loopKey;



	
			    public String HCP_LEGEND_ID;

				public String getHCP_LEGEND_ID () {
					return this.HCP_LEGEND_ID;
				}

				public Boolean HCP_LEGEND_IDIsNullable(){
				    return false;
				}
				public Boolean HCP_LEGEND_IDIsKey(){
				    return true;
				}
				public Integer HCP_LEGEND_IDLength(){
				    return 10;
				}
				public Integer HCP_LEGEND_IDPrecision(){
				    return null;
				}
				public String HCP_LEGEND_IDDefault(){
				
					return null;
				
				}
				public String HCP_LEGEND_IDComment(){
				
				    return "";
				
				}
				public String HCP_LEGEND_IDPattern(){
				
					return "";
				
				}
				public String HCP_LEGEND_IDOriginalDbColumnName(){
				
					return "HCP_LEGEND_ID";
				
				}

				
			    public String HCP_ADDR_LEGEND_ID;

				public String getHCP_ADDR_LEGEND_ID () {
					return this.HCP_ADDR_LEGEND_ID;
				}

				public Boolean HCP_ADDR_LEGEND_IDIsNullable(){
				    return false;
				}
				public Boolean HCP_ADDR_LEGEND_IDIsKey(){
				    return true;
				}
				public Integer HCP_ADDR_LEGEND_IDLength(){
				    return 10;
				}
				public Integer HCP_ADDR_LEGEND_IDPrecision(){
				    return null;
				}
				public String HCP_ADDR_LEGEND_IDDefault(){
				
					return null;
				
				}
				public String HCP_ADDR_LEGEND_IDComment(){
				
				    return "";
				
				}
				public String HCP_ADDR_LEGEND_IDPattern(){
				
					return "";
				
				}
				public String HCP_ADDR_LEGEND_IDOriginalDbColumnName(){
				
					return "HCP_ADDR_LEGEND_ID";
				
				}

				
			    public java.util.Date HCP_ADDR_CREATED_DT;

				public java.util.Date getHCP_ADDR_CREATED_DT () {
					return this.HCP_ADDR_CREATED_DT;
				}

				public Boolean HCP_ADDR_CREATED_DTIsNullable(){
				    return false;
				}
				public Boolean HCP_ADDR_CREATED_DTIsKey(){
				    return true;
				}
				public Integer HCP_ADDR_CREATED_DTLength(){
				    return null;
				}
				public Integer HCP_ADDR_CREATED_DTPrecision(){
				    return null;
				}
				public String HCP_ADDR_CREATED_DTDefault(){
				
					return null;
				
				}
				public String HCP_ADDR_CREATED_DTComment(){
				
				    return "";
				
				}
				public String HCP_ADDR_CREATED_DTPattern(){
				
					return "yyyy-MM-dd";
				
				}
				public String HCP_ADDR_CREATED_DTOriginalDbColumnName(){
				
					return "HCP_ADDR_CREATED_DT";
				
				}

				
			    public java.util.Date HCP_ADDR_LAST_RECEIVED_DT;

				public java.util.Date getHCP_ADDR_LAST_RECEIVED_DT () {
					return this.HCP_ADDR_LAST_RECEIVED_DT;
				}

				public Boolean HCP_ADDR_LAST_RECEIVED_DTIsNullable(){
				    return true;
				}
				public Boolean HCP_ADDR_LAST_RECEIVED_DTIsKey(){
				    return false;
				}
				public Integer HCP_ADDR_LAST_RECEIVED_DTLength(){
				    return null;
				}
				public Integer HCP_ADDR_LAST_RECEIVED_DTPrecision(){
				    return null;
				}
				public String HCP_ADDR_LAST_RECEIVED_DTDefault(){
				
					return null;
				
				}
				public String HCP_ADDR_LAST_RECEIVED_DTComment(){
				
				    return "";
				
				}
				public String HCP_ADDR_LAST_RECEIVED_DTPattern(){
				
					return "yyyy-MM-dd";
				
				}
				public String HCP_ADDR_LAST_RECEIVED_DTOriginalDbColumnName(){
				
					return "HCP_ADDR_LAST_RECEIVED_DT";
				
				}

				
			    public java.util.Date HCP_ADDR_INACTIVE_DT;

				public java.util.Date getHCP_ADDR_INACTIVE_DT () {
					return this.HCP_ADDR_INACTIVE_DT;
				}

				public Boolean HCP_ADDR_INACTIVE_DTIsNullable(){
				    return true;
				}
				public Boolean HCP_ADDR_INACTIVE_DTIsKey(){
				    return false;
				}
				public Integer HCP_ADDR_INACTIVE_DTLength(){
				    return null;
				}
				public Integer HCP_ADDR_INACTIVE_DTPrecision(){
				    return null;
				}
				public String HCP_ADDR_INACTIVE_DTDefault(){
				
					return null;
				
				}
				public String HCP_ADDR_INACTIVE_DTComment(){
				
				    return "";
				
				}
				public String HCP_ADDR_INACTIVE_DTPattern(){
				
					return "yyyy-MM-dd";
				
				}
				public String HCP_ADDR_INACTIVE_DTOriginalDbColumnName(){
				
					return "HCP_ADDR_INACTIVE_DT";
				
				}

				
			    public String HCP_ADDRESS;

				public String getHCP_ADDRESS () {
					return this.HCP_ADDRESS;
				}

				public Boolean HCP_ADDRESSIsNullable(){
				    return true;
				}
				public Boolean HCP_ADDRESSIsKey(){
				    return false;
				}
				public Integer HCP_ADDRESSLength(){
				    return 200;
				}
				public Integer HCP_ADDRESSPrecision(){
				    return null;
				}
				public String HCP_ADDRESSDefault(){
				
					return null;
				
				}
				public String HCP_ADDRESSComment(){
				
				    return "";
				
				}
				public String HCP_ADDRESSPattern(){
				
					return "";
				
				}
				public String HCP_ADDRESSOriginalDbColumnName(){
				
					return "HCP_ADDRESS";
				
				}

				
			    public String HCP_ADDRESS2;

				public String getHCP_ADDRESS2 () {
					return this.HCP_ADDRESS2;
				}

				public Boolean HCP_ADDRESS2IsNullable(){
				    return true;
				}
				public Boolean HCP_ADDRESS2IsKey(){
				    return false;
				}
				public Integer HCP_ADDRESS2Length(){
				    return 100;
				}
				public Integer HCP_ADDRESS2Precision(){
				    return null;
				}
				public String HCP_ADDRESS2Default(){
				
					return null;
				
				}
				public String HCP_ADDRESS2Comment(){
				
				    return "";
				
				}
				public String HCP_ADDRESS2Pattern(){
				
					return "";
				
				}
				public String HCP_ADDRESS2OriginalDbColumnName(){
				
					return "HCP_ADDRESS2";
				
				}

				
			    public String HCP_CITY;

				public String getHCP_CITY () {
					return this.HCP_CITY;
				}

				public Boolean HCP_CITYIsNullable(){
				    return true;
				}
				public Boolean HCP_CITYIsKey(){
				    return false;
				}
				public Integer HCP_CITYLength(){
				    return 50;
				}
				public Integer HCP_CITYPrecision(){
				    return null;
				}
				public String HCP_CITYDefault(){
				
					return null;
				
				}
				public String HCP_CITYComment(){
				
				    return "";
				
				}
				public String HCP_CITYPattern(){
				
					return "";
				
				}
				public String HCP_CITYOriginalDbColumnName(){
				
					return "HCP_CITY";
				
				}

				
			    public String HCP_STATE;

				public String getHCP_STATE () {
					return this.HCP_STATE;
				}

				public Boolean HCP_STATEIsNullable(){
				    return true;
				}
				public Boolean HCP_STATEIsKey(){
				    return false;
				}
				public Integer HCP_STATELength(){
				    return 2;
				}
				public Integer HCP_STATEPrecision(){
				    return null;
				}
				public String HCP_STATEDefault(){
				
					return null;
				
				}
				public String HCP_STATEComment(){
				
				    return "";
				
				}
				public String HCP_STATEPattern(){
				
					return "";
				
				}
				public String HCP_STATEOriginalDbColumnName(){
				
					return "HCP_STATE";
				
				}

				
			    public String HCP_ZIP;

				public String getHCP_ZIP () {
					return this.HCP_ZIP;
				}

				public Boolean HCP_ZIPIsNullable(){
				    return true;
				}
				public Boolean HCP_ZIPIsKey(){
				    return false;
				}
				public Integer HCP_ZIPLength(){
				    return 5;
				}
				public Integer HCP_ZIPPrecision(){
				    return null;
				}
				public String HCP_ZIPDefault(){
				
					return null;
				
				}
				public String HCP_ZIPComment(){
				
				    return "";
				
				}
				public String HCP_ZIPPattern(){
				
					return "";
				
				}
				public String HCP_ZIPOriginalDbColumnName(){
				
					return "HCP_ZIP";
				
				}

				
			    public String HCP_COUNTRY;

				public String getHCP_COUNTRY () {
					return this.HCP_COUNTRY;
				}

				public Boolean HCP_COUNTRYIsNullable(){
				    return true;
				}
				public Boolean HCP_COUNTRYIsKey(){
				    return false;
				}
				public Integer HCP_COUNTRYLength(){
				    return 2;
				}
				public Integer HCP_COUNTRYPrecision(){
				    return null;
				}
				public String HCP_COUNTRYDefault(){
				
					return null;
				
				}
				public String HCP_COUNTRYComment(){
				
				    return "";
				
				}
				public String HCP_COUNTRYPattern(){
				
					return "";
				
				}
				public String HCP_COUNTRYOriginalDbColumnName(){
				
					return "HCP_COUNTRY";
				
				}

				
			    public Double HCP_LATITUDE;

				public Double getHCP_LATITUDE () {
					return this.HCP_LATITUDE;
				}

				public Boolean HCP_LATITUDEIsNullable(){
				    return true;
				}
				public Boolean HCP_LATITUDEIsKey(){
				    return false;
				}
				public Integer HCP_LATITUDELength(){
				    return null;
				}
				public Integer HCP_LATITUDEPrecision(){
				    return null;
				}
				public String HCP_LATITUDEDefault(){
				
					return null;
				
				}
				public String HCP_LATITUDEComment(){
				
				    return "";
				
				}
				public String HCP_LATITUDEPattern(){
				
					return "";
				
				}
				public String HCP_LATITUDEOriginalDbColumnName(){
				
					return "HCP_LATITUDE";
				
				}

				
			    public Double HCP_LONGITUDE;

				public Double getHCP_LONGITUDE () {
					return this.HCP_LONGITUDE;
				}

				public Boolean HCP_LONGITUDEIsNullable(){
				    return true;
				}
				public Boolean HCP_LONGITUDEIsKey(){
				    return false;
				}
				public Integer HCP_LONGITUDELength(){
				    return null;
				}
				public Integer HCP_LONGITUDEPrecision(){
				    return null;
				}
				public String HCP_LONGITUDEDefault(){
				
					return null;
				
				}
				public String HCP_LONGITUDEComment(){
				
				    return "";
				
				}
				public String HCP_LONGITUDEPattern(){
				
					return "";
				
				}
				public String HCP_LONGITUDEOriginalDbColumnName(){
				
					return "HCP_LONGITUDE";
				
				}

				
			    public Boolean HCP_PRIMARY_ADDRESS;

				public Boolean getHCP_PRIMARY_ADDRESS () {
					return this.HCP_PRIMARY_ADDRESS;
				}

				public Boolean HCP_PRIMARY_ADDRESSIsNullable(){
				    return true;
				}
				public Boolean HCP_PRIMARY_ADDRESSIsKey(){
				    return false;
				}
				public Integer HCP_PRIMARY_ADDRESSLength(){
				    return null;
				}
				public Integer HCP_PRIMARY_ADDRESSPrecision(){
				    return null;
				}
				public String HCP_PRIMARY_ADDRESSDefault(){
				
					return null;
				
				}
				public String HCP_PRIMARY_ADDRESSComment(){
				
				    return "";
				
				}
				public String HCP_PRIMARY_ADDRESSPattern(){
				
					return "";
				
				}
				public String HCP_PRIMARY_ADDRESSOriginalDbColumnName(){
				
					return "HCP_PRIMARY_ADDRESS";
				
				}

				
			    public java.util.Date DATA_THROUGH_DATE;

				public java.util.Date getDATA_THROUGH_DATE () {
					return this.DATA_THROUGH_DATE;
				}

				public Boolean DATA_THROUGH_DATEIsNullable(){
				    return true;
				}
				public Boolean DATA_THROUGH_DATEIsKey(){
				    return false;
				}
				public Integer DATA_THROUGH_DATELength(){
				    return null;
				}
				public Integer DATA_THROUGH_DATEPrecision(){
				    return null;
				}
				public String DATA_THROUGH_DATEDefault(){
				
					return null;
				
				}
				public String DATA_THROUGH_DATEComment(){
				
				    return "";
				
				}
				public String DATA_THROUGH_DATEPattern(){
				
					return "yyyy-MM-dd";
				
				}
				public String DATA_THROUGH_DATEOriginalDbColumnName(){
				
					return "DATA_THROUGH_DATE";
				
				}

				


	@Override
	public int hashCode() {
		if (this.hashCodeDirty) {
			final int prime = PRIME;
			int result = DEFAULT_HASHCODE;
	
						result = prime * result + ((this.HCP_LEGEND_ID == null) ? 0 : this.HCP_LEGEND_ID.hashCode());
					
    		this.hashCode = result;
    		this.hashCodeDirty = false;
		}
		return this.hashCode;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) return true;
		if (obj == null) return false;
		if (getClass() != obj.getClass()) return false;
		final HCPADDRESSESStruct other = (HCPADDRESSESStruct) obj;
		
						if (this.HCP_LEGEND_ID == null) {
							if (other.HCP_LEGEND_ID != null)
								return false;
						
						} else if (!this.HCP_LEGEND_ID.equals(other.HCP_LEGEND_ID))
						
							return false;
					

		return true;
    }

	public void copyDataTo(HCPADDRESSESStruct other) {

		other.HCP_LEGEND_ID = this.HCP_LEGEND_ID;
	            other.HCP_ADDR_LEGEND_ID = this.HCP_ADDR_LEGEND_ID;
	            other.HCP_ADDR_CREATED_DT = this.HCP_ADDR_CREATED_DT;
	            other.HCP_ADDR_LAST_RECEIVED_DT = this.HCP_ADDR_LAST_RECEIVED_DT;
	            other.HCP_ADDR_INACTIVE_DT = this.HCP_ADDR_INACTIVE_DT;
	            other.HCP_ADDRESS = this.HCP_ADDRESS;
	            other.HCP_ADDRESS2 = this.HCP_ADDRESS2;
	            other.HCP_CITY = this.HCP_CITY;
	            other.HCP_STATE = this.HCP_STATE;
	            other.HCP_ZIP = this.HCP_ZIP;
	            other.HCP_COUNTRY = this.HCP_COUNTRY;
	            other.HCP_LATITUDE = this.HCP_LATITUDE;
	            other.HCP_LONGITUDE = this.HCP_LONGITUDE;
	            other.HCP_PRIMARY_ADDRESS = this.HCP_PRIMARY_ADDRESS;
	            other.DATA_THROUGH_DATE = this.DATA_THROUGH_DATE;
	            
	}

	public void copyKeysDataTo(HCPADDRESSESStruct other) {

		other.HCP_LEGEND_ID = this.HCP_LEGEND_ID;
	            	
	}




	private String readString(ObjectInputStream dis) throws IOException{
		String strReturn = null;
		int length = 0;
        length = dis.readInt();
		if (length == -1) {
			strReturn = null;
		} else {
			if(length > commonByteArray_USCOMM_SUNSHINE_RPT_QA_BEACON_EXTRACT_SNOWFLAKE.length) {
				if(length < 1024 && commonByteArray_USCOMM_SUNSHINE_RPT_QA_BEACON_EXTRACT_SNOWFLAKE.length == 0) {
   					commonByteArray_USCOMM_SUNSHINE_RPT_QA_BEACON_EXTRACT_SNOWFLAKE = new byte[1024];
				} else {
   					commonByteArray_USCOMM_SUNSHINE_RPT_QA_BEACON_EXTRACT_SNOWFLAKE = new byte[2 * length];
   				}
			}
			dis.readFully(commonByteArray_USCOMM_SUNSHINE_RPT_QA_BEACON_EXTRACT_SNOWFLAKE, 0, length);
			strReturn = new String(commonByteArray_USCOMM_SUNSHINE_RPT_QA_BEACON_EXTRACT_SNOWFLAKE, 0, length, utf8Charset);
		}
		return strReturn;
	}
	
	private String readString(org.jboss.marshalling.Unmarshaller unmarshaller) throws IOException{
		String strReturn = null;
		int length = 0;
        length = unmarshaller.readInt();
		if (length == -1) {
			strReturn = null;
		} else {
			if(length > commonByteArray_USCOMM_SUNSHINE_RPT_QA_BEACON_EXTRACT_SNOWFLAKE.length) {
				if(length < 1024 && commonByteArray_USCOMM_SUNSHINE_RPT_QA_BEACON_EXTRACT_SNOWFLAKE.length == 0) {
   					commonByteArray_USCOMM_SUNSHINE_RPT_QA_BEACON_EXTRACT_SNOWFLAKE = new byte[1024];
				} else {
   					commonByteArray_USCOMM_SUNSHINE_RPT_QA_BEACON_EXTRACT_SNOWFLAKE = new byte[2 * length];
   				}
			}
			unmarshaller.readFully(commonByteArray_USCOMM_SUNSHINE_RPT_QA_BEACON_EXTRACT_SNOWFLAKE, 0, length);
			strReturn = new String(commonByteArray_USCOMM_SUNSHINE_RPT_QA_BEACON_EXTRACT_SNOWFLAKE, 0, length, utf8Charset);
		}
		return strReturn;
	}

    private void writeString(String str, ObjectOutputStream dos) throws IOException{
		if(str == null) {
            dos.writeInt(-1);
		} else {
            byte[] byteArray = str.getBytes(utf8Charset);
	    	dos.writeInt(byteArray.length);
			dos.write(byteArray);
    	}
    }
    
    private void writeString(String str, org.jboss.marshalling.Marshaller marshaller) throws IOException{
		if(str == null) {
			marshaller.writeInt(-1);
		} else {
            byte[] byteArray = str.getBytes(utf8Charset);
            marshaller.writeInt(byteArray.length);
            marshaller.write(byteArray);
    	}
    }
	
	private String readString(DataInputStream dis, ObjectInputStream ois) throws IOException{
		String strReturn = null;
		int length = 0;
        length = dis.readInt();
		if (length == -1) {
			strReturn = null;
		} else {
			byte[] byteArray = new byte[length];
			dis.read(byteArray);
			strReturn = new String(byteArray, utf8Charset);
		}
		return strReturn;
	}
	
	private String readString(DataInputStream dis, org.jboss.marshalling.Unmarshaller unmarshaller) throws IOException{
		String strReturn = null;
		int length = 0;
        length = unmarshaller.readInt();
		if (length == -1) {
			strReturn = null;
		} else {
			byte[] byteArray = new byte[length];
			unmarshaller.read(byteArray);
			strReturn = new String(byteArray, utf8Charset);
		}
		return strReturn;
	}
	
	private void writeString(String str, DataOutputStream dos, org.jboss.marshalling.Marshaller marshaller) throws IOException{
		if(str == null) {
			marshaller.writeInt(-1);
		} else {
            byte[] byteArray = str.getBytes(utf8Charset);
            marshaller.writeInt(byteArray.length);
            marshaller.write(byteArray);
    	}
	}

	private void writeString(String str, DataOutputStream dos, ObjectOutputStream oos) throws IOException{
		if(str == null) {
            dos.writeInt(-1);
		} else {
            byte[] byteArray = str.getBytes(utf8Charset);
	    	dos.writeInt(byteArray.length);
			dos.write(byteArray);
    	}
	}

	private java.util.Date readDate(DataInputStream dis, ObjectInputStream ois) throws IOException{
		java.util.Date dateReturn = null;
		int length = 0;
        length = dis.readByte();
		if (length == -1) {
			dateReturn = null;
		} else {
	    	dateReturn = new Date(dis.readLong());
		}
		return dateReturn;
	}
	
	private java.util.Date readDate(DataInputStream dis, org.jboss.marshalling.Unmarshaller unmarshaller ) throws IOException{
		java.util.Date dateReturn = null;
		int length = 0;
        length = unmarshaller.readByte();
		if (length == -1) {
			dateReturn = null;
		} else {
	    	dateReturn = new Date(unmarshaller.readLong());
		}
		return dateReturn;
	}

	private void writeDate(java.util.Date date1, DataOutputStream dos, ObjectOutputStream oos) throws IOException{
		if(date1 == null) {
            dos.writeByte(-1);
		} else {
			dos.writeByte(0);
	    	dos.writeLong(date1.getTime());
    	}
	}
	
	private void writeDate(java.util.Date date1, DataOutputStream dos, org.jboss.marshalling.Marshaller marshaller) throws IOException{
		if(date1 == null) {
			marshaller.writeByte(-1);
		} else {
			marshaller.writeByte(0);
			marshaller.writeLong(date1.getTime());
    	}
	}

    public void readKeysData(ObjectInputStream dis) {

		synchronized(commonByteArrayLock_USCOMM_SUNSHINE_RPT_QA_BEACON_EXTRACT_SNOWFLAKE) {

        	try {

        		int length = 0;
		
					this.HCP_LEGEND_ID = readString(dis);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);

		

        }

		

      }


    }
    
    public void readKeysData(org.jboss.marshalling.Unmarshaller dis) {

		synchronized(commonByteArrayLock_USCOMM_SUNSHINE_RPT_QA_BEACON_EXTRACT_SNOWFLAKE) {

        	try {

        		int length = 0;
		
					this.HCP_LEGEND_ID = readString(dis);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);

		

        }

		

      }


    }

    public void writeKeysData(ObjectOutputStream dos) {
        try {

		
					// String
				
						writeString(this.HCP_LEGEND_ID,dos);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);
        }


    }
    
    public void writeKeysData(org.jboss.marshalling.Marshaller dos) {
        try {

		
					// String
				
						writeString(this.HCP_LEGEND_ID,dos);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);
        }


    }



    /**
     * Fill Values data by reading ObjectInputStream.
     */
    public void readValuesData(DataInputStream dis, ObjectInputStream ois) {
        try {

			int length = 0;
		
						this.HCP_ADDR_LEGEND_ID = readString(dis,ois);
					
						this.HCP_ADDR_CREATED_DT = readDate(dis,ois);
					
						this.HCP_ADDR_LAST_RECEIVED_DT = readDate(dis,ois);
					
						this.HCP_ADDR_INACTIVE_DT = readDate(dis,ois);
					
						this.HCP_ADDRESS = readString(dis,ois);
					
						this.HCP_ADDRESS2 = readString(dis,ois);
					
						this.HCP_CITY = readString(dis,ois);
					
						this.HCP_STATE = readString(dis,ois);
					
						this.HCP_ZIP = readString(dis,ois);
					
						this.HCP_COUNTRY = readString(dis,ois);
					
			            length = dis.readByte();
           				if (length == -1) {
           	    			this.HCP_LATITUDE = null;
           				} else {
           			    	this.HCP_LATITUDE = dis.readDouble();
           				}
					
			            length = dis.readByte();
           				if (length == -1) {
           	    			this.HCP_LONGITUDE = null;
           				} else {
           			    	this.HCP_LONGITUDE = dis.readDouble();
           				}
					
			            length = dis.readByte();
           				if (length == -1) {
           	    			this.HCP_PRIMARY_ADDRESS = null;
           				} else {
           			    	this.HCP_PRIMARY_ADDRESS = dis.readBoolean();
           				}
					
						this.DATA_THROUGH_DATE = readDate(dis,ois);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);

		

        }

		

    }
    
    public void readValuesData(DataInputStream dis, org.jboss.marshalling.Unmarshaller objectIn) {
        try {
			int length = 0;
		
						this.HCP_ADDR_LEGEND_ID = readString(dis,objectIn);
					
						this.HCP_ADDR_CREATED_DT = readDate(dis,objectIn);
					
						this.HCP_ADDR_LAST_RECEIVED_DT = readDate(dis,objectIn);
					
						this.HCP_ADDR_INACTIVE_DT = readDate(dis,objectIn);
					
						this.HCP_ADDRESS = readString(dis,objectIn);
					
						this.HCP_ADDRESS2 = readString(dis,objectIn);
					
						this.HCP_CITY = readString(dis,objectIn);
					
						this.HCP_STATE = readString(dis,objectIn);
					
						this.HCP_ZIP = readString(dis,objectIn);
					
						this.HCP_COUNTRY = readString(dis,objectIn);
					
			            length = objectIn.readByte();
           				if (length == -1) {
           	    			this.HCP_LATITUDE = null;
           				} else {
           			    	this.HCP_LATITUDE = objectIn.readDouble();
           				}
					
			            length = objectIn.readByte();
           				if (length == -1) {
           	    			this.HCP_LONGITUDE = null;
           				} else {
           			    	this.HCP_LONGITUDE = objectIn.readDouble();
           				}
					
			            length = objectIn.readByte();
           				if (length == -1) {
           	    			this.HCP_PRIMARY_ADDRESS = null;
           				} else {
           			    	this.HCP_PRIMARY_ADDRESS = objectIn.readBoolean();
           				}
					
						this.DATA_THROUGH_DATE = readDate(dis,objectIn);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);

		

        }

		

    }

    /**
     * Return a byte array which represents Values data.
     */
    public void writeValuesData(DataOutputStream dos, ObjectOutputStream oos) {
        try {

		
						writeString(this.HCP_ADDR_LEGEND_ID, dos, oos);
					
						writeDate(this.HCP_ADDR_CREATED_DT, dos, oos);
					
						writeDate(this.HCP_ADDR_LAST_RECEIVED_DT, dos, oos);
					
						writeDate(this.HCP_ADDR_INACTIVE_DT, dos, oos);
					
						writeString(this.HCP_ADDRESS, dos, oos);
					
						writeString(this.HCP_ADDRESS2, dos, oos);
					
						writeString(this.HCP_CITY, dos, oos);
					
						writeString(this.HCP_STATE, dos, oos);
					
						writeString(this.HCP_ZIP, dos, oos);
					
						writeString(this.HCP_COUNTRY, dos, oos);
					
						if(this.HCP_LATITUDE == null) {
			                dos.writeByte(-1);
						} else {
               				dos.writeByte(0);
           			    	dos.writeDouble(this.HCP_LATITUDE);
		            	}
					
						if(this.HCP_LONGITUDE == null) {
			                dos.writeByte(-1);
						} else {
               				dos.writeByte(0);
           			    	dos.writeDouble(this.HCP_LONGITUDE);
		            	}
					
						if(this.HCP_PRIMARY_ADDRESS == null) {
			                dos.writeByte(-1);
						} else {
               				dos.writeByte(0);
           			    	dos.writeBoolean(this.HCP_PRIMARY_ADDRESS);
		            	}
					
						writeDate(this.DATA_THROUGH_DATE, dos, oos);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);
        	}

    }
    
    public void writeValuesData(DataOutputStream dos, org.jboss.marshalling.Marshaller objectOut){
                try {

		
						writeString(this.HCP_ADDR_LEGEND_ID, dos, objectOut);
					
						writeDate(this.HCP_ADDR_CREATED_DT, dos, objectOut);
					
						writeDate(this.HCP_ADDR_LAST_RECEIVED_DT, dos, objectOut);
					
						writeDate(this.HCP_ADDR_INACTIVE_DT, dos, objectOut);
					
						writeString(this.HCP_ADDRESS, dos, objectOut);
					
						writeString(this.HCP_ADDRESS2, dos, objectOut);
					
						writeString(this.HCP_CITY, dos, objectOut);
					
						writeString(this.HCP_STATE, dos, objectOut);
					
						writeString(this.HCP_ZIP, dos, objectOut);
					
						writeString(this.HCP_COUNTRY, dos, objectOut);
					
						if(this.HCP_LATITUDE == null) {
							objectOut.writeByte(-1);
						} else {
							objectOut.writeByte(0);
							objectOut.writeDouble(this.HCP_LATITUDE);
		            	}
					
						if(this.HCP_LONGITUDE == null) {
							objectOut.writeByte(-1);
						} else {
							objectOut.writeByte(0);
							objectOut.writeDouble(this.HCP_LONGITUDE);
		            	}
					
						if(this.HCP_PRIMARY_ADDRESS == null) {
							objectOut.writeByte(-1);
						} else {
							objectOut.writeByte(0);
							objectOut.writeBoolean(this.HCP_PRIMARY_ADDRESS);
		            	}
					
						writeDate(this.DATA_THROUGH_DATE, dos, objectOut);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);
        	}
    }


    
    public boolean supportMarshaller(){
        return true;
    }


    public String toString() {

		StringBuilder sb = new StringBuilder();
		sb.append(super.toString());
		sb.append("[");
		sb.append("HCP_LEGEND_ID="+HCP_LEGEND_ID);
		sb.append(",HCP_ADDR_LEGEND_ID="+HCP_ADDR_LEGEND_ID);
		sb.append(",HCP_ADDR_CREATED_DT="+String.valueOf(HCP_ADDR_CREATED_DT));
		sb.append(",HCP_ADDR_LAST_RECEIVED_DT="+String.valueOf(HCP_ADDR_LAST_RECEIVED_DT));
		sb.append(",HCP_ADDR_INACTIVE_DT="+String.valueOf(HCP_ADDR_INACTIVE_DT));
		sb.append(",HCP_ADDRESS="+HCP_ADDRESS);
		sb.append(",HCP_ADDRESS2="+HCP_ADDRESS2);
		sb.append(",HCP_CITY="+HCP_CITY);
		sb.append(",HCP_STATE="+HCP_STATE);
		sb.append(",HCP_ZIP="+HCP_ZIP);
		sb.append(",HCP_COUNTRY="+HCP_COUNTRY);
		sb.append(",HCP_LATITUDE="+String.valueOf(HCP_LATITUDE));
		sb.append(",HCP_LONGITUDE="+String.valueOf(HCP_LONGITUDE));
		sb.append(",HCP_PRIMARY_ADDRESS="+String.valueOf(HCP_PRIMARY_ADDRESS));
		sb.append(",DATA_THROUGH_DATE="+String.valueOf(DATA_THROUGH_DATE));
	    sb.append("]");

	    return sb.toString();
    }
        public String toLogString(){
        	StringBuilder sb = new StringBuilder();
        	
        				if(HCP_LEGEND_ID == null){
        					sb.append("<null>");
        				}else{
            				sb.append(HCP_LEGEND_ID);
            			}
            		
        			sb.append("|");
        		
        				if(HCP_ADDR_LEGEND_ID == null){
        					sb.append("<null>");
        				}else{
            				sb.append(HCP_ADDR_LEGEND_ID);
            			}
            		
        			sb.append("|");
        		
        				if(HCP_ADDR_CREATED_DT == null){
        					sb.append("<null>");
        				}else{
            				sb.append(HCP_ADDR_CREATED_DT);
            			}
            		
        			sb.append("|");
        		
        				if(HCP_ADDR_LAST_RECEIVED_DT == null){
        					sb.append("<null>");
        				}else{
            				sb.append(HCP_ADDR_LAST_RECEIVED_DT);
            			}
            		
        			sb.append("|");
        		
        				if(HCP_ADDR_INACTIVE_DT == null){
        					sb.append("<null>");
        				}else{
            				sb.append(HCP_ADDR_INACTIVE_DT);
            			}
            		
        			sb.append("|");
        		
        				if(HCP_ADDRESS == null){
        					sb.append("<null>");
        				}else{
            				sb.append(HCP_ADDRESS);
            			}
            		
        			sb.append("|");
        		
        				if(HCP_ADDRESS2 == null){
        					sb.append("<null>");
        				}else{
            				sb.append(HCP_ADDRESS2);
            			}
            		
        			sb.append("|");
        		
        				if(HCP_CITY == null){
        					sb.append("<null>");
        				}else{
            				sb.append(HCP_CITY);
            			}
            		
        			sb.append("|");
        		
        				if(HCP_STATE == null){
        					sb.append("<null>");
        				}else{
            				sb.append(HCP_STATE);
            			}
            		
        			sb.append("|");
        		
        				if(HCP_ZIP == null){
        					sb.append("<null>");
        				}else{
            				sb.append(HCP_ZIP);
            			}
            		
        			sb.append("|");
        		
        				if(HCP_COUNTRY == null){
        					sb.append("<null>");
        				}else{
            				sb.append(HCP_COUNTRY);
            			}
            		
        			sb.append("|");
        		
        				if(HCP_LATITUDE == null){
        					sb.append("<null>");
        				}else{
            				sb.append(HCP_LATITUDE);
            			}
            		
        			sb.append("|");
        		
        				if(HCP_LONGITUDE == null){
        					sb.append("<null>");
        				}else{
            				sb.append(HCP_LONGITUDE);
            			}
            		
        			sb.append("|");
        		
        				if(HCP_PRIMARY_ADDRESS == null){
        					sb.append("<null>");
        				}else{
            				sb.append(HCP_PRIMARY_ADDRESS);
            			}
            		
        			sb.append("|");
        		
        				if(DATA_THROUGH_DATE == null){
        					sb.append("<null>");
        				}else{
            				sb.append(DATA_THROUGH_DATE);
            			}
            		
        			sb.append("|");
        		
        	return sb.toString();
        }

    /**
     * Compare keys
     */
    public int compareTo(HCPADDRESSESStruct other) {

		int returnValue = -1;
		
						returnValue = checkNullsAndCompare(this.HCP_LEGEND_ID, other.HCP_LEGEND_ID);
						if(returnValue != 0) {
							return returnValue;
						}

					
	    return returnValue;
    }


    private int checkNullsAndCompare(Object object1, Object object2) {
        int returnValue = 0;
		if (object1 instanceof Comparable && object2 instanceof Comparable) {
            returnValue = ((Comparable) object1).compareTo(object2);
        } else if (object1 != null && object2 != null) {
            returnValue = compareStrings(object1.toString(), object2.toString());
        } else if (object1 == null && object2 != null) {
            returnValue = 1;
        } else if (object1 != null && object2 == null) {
            returnValue = -1;
        } else {
            returnValue = 0;
        }

        return returnValue;
    }

    private int compareStrings(String string1, String string2) {
        return string1.compareTo(string2);
    }


}
public void tDBInput_3Process(final java.util.Map<String, Object> globalMap) throws TalendException {
	globalMap.put("tDBInput_3_SUBPROCESS_STATE", 0);

 final boolean execStat = this.execStat;
	
		String iterateId = "";
	
	
	String currentComponent = "";
	java.util.Map<String, Object> resourceMap = new java.util.HashMap<String, Object>();

	try {
			// TDI-39566 avoid throwing an useless Exception
			boolean resumeIt = true;
			if (globalResumeTicket == false && resumeEntryMethodName != null) {
				String currentMethodName = new java.lang.Exception().getStackTrace()[0].getMethodName();
				resumeIt = resumeEntryMethodName.equals(currentMethodName);
			}
			if (resumeIt || globalResumeTicket) { //start the resume
				globalResumeTicket = true;



		HCPADDRESSESStruct HCPADDRESSES = new HCPADDRESSESStruct();




	
	/**
	 * [tAdvancedHash_HCPADDRESSES begin ] start
	 */

	

	
		
		ok_Hash.put("tAdvancedHash_HCPADDRESSES", false);
		start_Hash.put("tAdvancedHash_HCPADDRESSES", System.currentTimeMillis());
		
	
	currentComponent="tAdvancedHash_HCPADDRESSES";

	
			runStat.updateStatAndLog(execStat,enableLogStash,resourceMap,iterateId,0,0,"HCPADDRESSES");
			
		int tos_count_tAdvancedHash_HCPADDRESSES = 0;
		
			if(enableLogStash) {
				talendJobLog.addCM("tAdvancedHash_HCPADDRESSES", "tAdvancedHash_HCPADDRESSES", "tAdvancedHash");
				talendJobLogProcess(globalMap);
			}
			

			   		// connection name:HCPADDRESSES
			   		// source node:tDBInput_3 - inputs:(after_tDBInput_1) outputs:(HCPADDRESSES,HCPADDRESSES) | target node:tAdvancedHash_HCPADDRESSES - inputs:(HCPADDRESSES) outputs:()
			   		// linked node: tMap_1 - inputs:(HCPS,HCPTOINTERACTIONCOM,INTERACTIONSCOM,HCPADDRESSES,PRODUCT,RECIPIENT_STATE,RECIPIENT_COUNTRY,RECIPIENT_TYPE) outputs:(OUTPUT)
			   
			   		org.talend.designer.components.lookup.common.ICommonLookup.MATCHING_MODE matchingModeEnum_HCPADDRESSES = 
			   			org.talend.designer.components.lookup.common.ICommonLookup.MATCHING_MODE.UNIQUE_MATCH;
			   			
			   
	   			org.talend.designer.components.lookup.memory.AdvancedMemoryLookup<HCPADDRESSESStruct> tHash_Lookup_HCPADDRESSES =org.talend.designer.components.lookup.memory.AdvancedMemoryLookup.
	   						<HCPADDRESSESStruct>getLookup(matchingModeEnum_HCPADDRESSES);
	   						   
		   	   	   globalMap.put("tHash_Lookup_HCPADDRESSES", tHash_Lookup_HCPADDRESSES);
		   	   	   
				
           

 



/**
 * [tAdvancedHash_HCPADDRESSES begin ] stop
 */



	
	/**
	 * [tDBInput_3 begin ] start
	 */

	

	
		
		ok_Hash.put("tDBInput_3", false);
		start_Hash.put("tDBInput_3", System.currentTimeMillis());
		
	
	currentComponent="tDBInput_3";

	
		int tos_count_tDBInput_3 = 0;
		
			if(enableLogStash) {
				talendJobLog.addCM("tDBInput_3", "HCPADDRESSES", "tSnowflakeInput");
				talendJobLogProcess(globalMap);
			}
			

boolean doesNodeBelongToRequest_tDBInput_3 = 0 == 0;
@SuppressWarnings("unchecked")
java.util.Map<String, Object> restRequest_tDBInput_3 = (java.util.Map<String, Object>)globalMap.get("restRequest");
String currentTRestRequestOperation_tDBInput_3 = (String)(restRequest_tDBInput_3 != null ? restRequest_tDBInput_3.get("OPERATION") : null);

org.talend.components.api.component.ComponentDefinition def_tDBInput_3 =
        new org.talend.components.snowflake.tsnowflakeinput.TSnowflakeInputDefinition();

org.talend.components.api.component.runtime.Writer writer_tDBInput_3 = null;
org.talend.components.api.component.runtime.Reader reader_tDBInput_3 = null;


org.talend.components.snowflake.tsnowflakeinput.TSnowflakeInputProperties props_tDBInput_3 =
        (org.talend.components.snowflake.tsnowflakeinput.TSnowflakeInputProperties) def_tDBInput_3.createRuntimeProperties();
 		                    props_tDBInput_3.setValue("condition",
 		                    "");
 		                    
 		                    props_tDBInput_3.setValue("manualQuery",
 		                    false);
 		                    
 		                    props_tDBInput_3.setValue("convertColumnsAndTableToUppercase",
 		                    true);
 		                    
 		                    props_tDBInput_3.connection.setValue("useCustomRegion",
 		                    false);
 		                    
 		                    props_tDBInput_3.connection.userPassword.setValue("useAuth",
 		                    false);
 		                    
 		                    props_tDBInput_3.connection.referencedComponent.setValue("referenceType",
 		                        org.talend.components.api.properties.ComponentReferenceProperties.ReferenceType.COMPONENT_INSTANCE);
 		                    
 		                    props_tDBInput_3.connection.referencedComponent.setValue("componentInstanceId",
 		                    "tDBConnection_1");
 		                    
 		                    props_tDBInput_3.connection.referencedComponent.setValue("referenceDefinitionName",
 		                    "tSnowflakeConnection");
 		                    
 		                    props_tDBInput_3.table.setValue("tableName",
 		                    "HCPADDRESSES");
 		                    
 		                    props_tDBInput_3.table.connection.setValue("useCustomRegion",
 		                    false);
 		                    
 		                    props_tDBInput_3.table.connection.userPassword.setValue("useAuth",
 		                    false);
 		                    
 		                    props_tDBInput_3.table.connection.referencedComponent.setValue("referenceType",
 		                        org.talend.components.api.properties.ComponentReferenceProperties.ReferenceType.COMPONENT_INSTANCE);
 		                    
 		                    props_tDBInput_3.table.connection.referencedComponent.setValue("componentInstanceId",
 		                    "tDBConnection_1");
 		                    
 		                    props_tDBInput_3.table.connection.referencedComponent.setValue("referenceDefinitionName",
 		                    "tSnowflakeConnection");
 		                    
 		                    class SchemaSettingTool_tDBInput_3_1_fisrt {
 		                    		
 		                    		String getSchemaValue() {
 		                    				
 		                    						StringBuilder s = new StringBuilder();
                    						
     		                    						a("{\"type\":\"record\",",s);
     		                    						
     		                    						a("\"name\":\"HCPADDRESSES\",\"fields\":[{",s);
     		                    						
     		                    						a("\"name\":\"HCP_LEGEND_ID\",\"type\":\"string\",\"talend.field.length\":\"10\",\"talend.field.dbType\":12,\"talend.field.dbColumnName\":\"HCP_LEGEND_ID\",\"talend.field.isKey\":\"true\"},{",s);
     		                    						
     		                    						a("\"name\":\"HCP_ADDR_LEGEND_ID\",\"type\":\"string\",\"talend.field.length\":\"10\",\"talend.field.dbType\":12,\"talend.field.dbColumnName\":\"HCP_ADDR_LEGEND_ID\",\"talend.field.isKey\":\"true\"},{",s);
     		                    						
     		                    						a("\"name\":\"HCP_ADDR_CREATED_DT\",\"type\":{\"type\":\"int\",\"logicalType\":\"date\"},\"talend.field.pattern\":\"yyyy-MM-dd\",\"talend.field.dbType\":91,\"talend.field.dbColumnName\":\"HCP_ADDR_CREATED_DT\",\"talend.field.isKey\":\"true\"},{",s);
     		                    						
     		                    						a("\"name\":\"HCP_ADDR_LAST_RECEIVED_DT\",\"type\":[{\"type\":\"int\",\"logicalType\":\"date\"},\"null\"],\"talend.field.pattern\":\"yyyy-MM-dd\",\"talend.field.dbType\":91,\"talend.field.dbColumnName\":\"HCP_ADDR_LAST_RECEIVED_DT\"},{",s);
     		                    						
     		                    						a("\"name\":\"HCP_ADDR_INACTIVE_DT\",\"type\":[{\"type\":\"int\",\"logicalType\":\"date\"},\"null\"],\"talend.field.pattern\":\"yyyy-MM-dd\",\"talend.field.dbType\":91,\"talend.field.dbColumnName\":\"HCP_ADDR_INACTIVE_DT\"},{",s);
     		                    						
     		                    						a("\"name\":\"HCP_ADDRESS\",\"type\":[\"string\",\"null\"],\"talend.field.length\":\"200\",\"talend.field.dbType\":12,\"talend.field.dbColumnName\":\"HCP_ADDRESS\"},{",s);
     		                    						
     		                    						a("\"name\":\"HCP_ADDRESS2\",\"type\":[\"string\",\"null\"],\"talend.field.length\":\"100\",\"talend.field.dbType\":12,\"talend.field.dbColumnName\":\"HCP_ADDRESS2\"},{",s);
     		                    						
     		                    						a("\"name\":\"HCP_CITY\",\"type\":[\"string\",\"null\"],\"talend.field.length\":\"50\",\"talend.field.dbType\":12,\"talend.field.dbColumnName\":\"HCP_CITY\"},{",s);
     		                    						
     		                    						a("\"name\":\"HCP_STATE\",\"type\":[\"string\",\"null\"],\"talend.field.length\":\"2\",\"talend.field.dbType\":12,\"talend.field.dbColumnName\":\"HCP_STATE\"},{",s);
     		                    						
     		                    						a("\"name\":\"HCP_ZIP\",\"type\":[\"string\",\"null\"],\"talend.field.length\":\"5\",\"talend.field.dbType\":12,\"talend.field.dbColumnName\":\"HCP_ZIP\"},{",s);
     		                    						
     		                    						a("\"name\":\"HCP_COUNTRY\",\"type\":[\"string\",\"null\"],\"talend.field.length\":\"2\",\"talend.field.dbType\":12,\"talend.field.dbColumnName\":\"HCP_COUNTRY\"},{",s);
     		                    						
     		                    						a("\"name\":\"HCP_LATITUDE\",\"type\":[\"double\",\"null\"],\"talend.field.dbType\":8,\"talend.field.dbColumnName\":\"HCP_LATITUDE\"},{",s);
     		                    						
     		                    						a("\"name\":\"HCP_LONGITUDE\",\"type\":[\"double\",\"null\"],\"talend.field.dbType\":8,\"talend.field.dbColumnName\":\"HCP_LONGITUDE\"},{",s);
     		                    						
     		                    						a("\"name\":\"HCP_PRIMARY_ADDRESS\",\"type\":[\"boolean\",\"null\"],\"talend.field.dbType\":16,\"talend.field.dbColumnName\":\"HCP_PRIMARY_ADDRESS\"},{",s);
     		                    						
     		                    						a("\"name\":\"DATA_THROUGH_DATE\",\"type\":[{\"type\":\"int\",\"logicalType\":\"date\"},\"null\"],\"talend.field.pattern\":\"yyyy-MM-dd\",\"talend.field.dbType\":91,\"talend.field.dbColumnName\":\"DATA_THROUGH_DATE\"}]}",s);
     		                    						
     		                    				return s.toString();
     		                    		
 		                    		}
 		                    		
 		                    		void a(String part, StringBuilder strB) {
 		                    				strB.append(part);
 		                    		}
 		                    		
 		                    }
 		                    
 		                    SchemaSettingTool_tDBInput_3_1_fisrt sst_tDBInput_3_1_fisrt = new SchemaSettingTool_tDBInput_3_1_fisrt();
 		                    
 		                    props_tDBInput_3.table.main.setValue("schema",
 		                        new org.apache.avro.Schema.Parser().parse(sst_tDBInput_3_1_fisrt.getSchemaValue()));
 		                    
    if (org.talend.components.api.properties.ComponentReferenceProperties.ReferenceType.COMPONENT_INSTANCE == props_tDBInput_3.connection.referencedComponent.referenceType.getValue()) {
        final String referencedComponentInstanceId_tDBInput_3 = props_tDBInput_3.connection.referencedComponent.componentInstanceId.getStringValue();
        if (referencedComponentInstanceId_tDBInput_3 != null) {
            org.talend.daikon.properties.Properties referencedComponentProperties_tDBInput_3 = (org.talend.daikon.properties.Properties) globalMap.get(
                referencedComponentInstanceId_tDBInput_3 + "_COMPONENT_RUNTIME_PROPERTIES");
            props_tDBInput_3.connection.referencedComponent.setReference(referencedComponentProperties_tDBInput_3);
        }
    }
    if (org.talend.components.api.properties.ComponentReferenceProperties.ReferenceType.COMPONENT_INSTANCE == props_tDBInput_3.table.connection.referencedComponent.referenceType.getValue()) {
        final String referencedComponentInstanceId_tDBInput_3 = props_tDBInput_3.table.connection.referencedComponent.componentInstanceId.getStringValue();
        if (referencedComponentInstanceId_tDBInput_3 != null) {
            org.talend.daikon.properties.Properties referencedComponentProperties_tDBInput_3 = (org.talend.daikon.properties.Properties) globalMap.get(
                referencedComponentInstanceId_tDBInput_3 + "_COMPONENT_RUNTIME_PROPERTIES");
            props_tDBInput_3.table.connection.referencedComponent.setReference(referencedComponentProperties_tDBInput_3);
        }
    }
globalMap.put("tDBInput_3_COMPONENT_RUNTIME_PROPERTIES", props_tDBInput_3);
globalMap.putIfAbsent("TALEND_PRODUCT_VERSION", "8.0");
globalMap.put("TALEND_COMPONENTS_VERSION", "0.37.4");
java.net.URL mappings_url_tDBInput_3= this.getClass().getResource("/xmlMappings");
globalMap.put("tDBInput_3_MAPPINGS_URL", mappings_url_tDBInput_3);

org.talend.components.api.container.RuntimeContainer container_tDBInput_3 = new org.talend.components.api.container.RuntimeContainer() {
    public Object getComponentData(String componentId, String key) {
        return globalMap.get(componentId + "_" + key);
    }

    public void setComponentData(String componentId, String key, Object data) {
        globalMap.put(componentId + "_" + key, data);
    }

    public String getCurrentComponentId() {
        return "tDBInput_3";
    }

    public Object getGlobalData(String key) {
    	return globalMap.get(key);
    }
};

int nb_line_tDBInput_3 = 0;

org.talend.components.api.component.ConnectorTopology topology_tDBInput_3 = null;
topology_tDBInput_3 = org.talend.components.api.component.ConnectorTopology.OUTGOING;

org.talend.daikon.runtime.RuntimeInfo runtime_info_tDBInput_3 = def_tDBInput_3.getRuntimeInfo(
    org.talend.components.api.component.runtime.ExecutionEngine.DI, props_tDBInput_3, topology_tDBInput_3);
java.util.Set<org.talend.components.api.component.ConnectorTopology> supported_connector_topologies_tDBInput_3 = def_tDBInput_3.getSupportedConnectorTopologies();

org.talend.components.api.component.runtime.RuntimableRuntime componentRuntime_tDBInput_3 = (org.talend.components.api.component.runtime.RuntimableRuntime)(Class.forName(runtime_info_tDBInput_3.getRuntimeClassName()).newInstance());
org.talend.daikon.properties.ValidationResult initVr_tDBInput_3 = componentRuntime_tDBInput_3.initialize(container_tDBInput_3, props_tDBInput_3);

if (initVr_tDBInput_3.getStatus() == org.talend.daikon.properties.ValidationResult.Result.ERROR ) {
    throw new RuntimeException(initVr_tDBInput_3.getMessage());
}

if(componentRuntime_tDBInput_3 instanceof org.talend.components.api.component.runtime.ComponentDriverInitialization) {
	org.talend.components.api.component.runtime.ComponentDriverInitialization compDriverInitialization_tDBInput_3 = (org.talend.components.api.component.runtime.ComponentDriverInitialization)componentRuntime_tDBInput_3;
	compDriverInitialization_tDBInput_3.runAtDriver(container_tDBInput_3);
}

org.talend.components.api.component.runtime.SourceOrSink sourceOrSink_tDBInput_3 = null;
if(componentRuntime_tDBInput_3 instanceof org.talend.components.api.component.runtime.SourceOrSink) {
	sourceOrSink_tDBInput_3 = (org.talend.components.api.component.runtime.SourceOrSink)componentRuntime_tDBInput_3;
	if (doesNodeBelongToRequest_tDBInput_3) {
        org.talend.daikon.properties.ValidationResult vr_tDBInput_3 = sourceOrSink_tDBInput_3.validate(container_tDBInput_3);
        if (vr_tDBInput_3.getStatus() == org.talend.daikon.properties.ValidationResult.Result.ERROR ) {
            throw new RuntimeException(vr_tDBInput_3.getMessage());
        }
	}
}

    if (sourceOrSink_tDBInput_3 instanceof org.talend.components.api.component.runtime.Source) {
        org.talend.components.api.component.runtime.Source source_tDBInput_3 =
                (org.talend.components.api.component.runtime.Source)sourceOrSink_tDBInput_3;
        reader_tDBInput_3 = source_tDBInput_3.createReader(container_tDBInput_3);
	    reader_tDBInput_3 = new org.talend.codegen.flowvariables.runtime.FlowVariablesReader(reader_tDBInput_3, container_tDBInput_3);

            boolean multi_output_is_allowed_tDBInput_3 = false;
            org.talend.components.api.component.Connector c_tDBInput_3 = null;
            for (org.talend.components.api.component.Connector currentConnector : props_tDBInput_3.getAvailableConnectors(null, true)) {
                if (currentConnector.getName().equals("MAIN")) {
                    c_tDBInput_3 = currentConnector;
                }

                if (currentConnector.getName().equals("REJECT")) {//it's better to move the code to javajet
                    multi_output_is_allowed_tDBInput_3 = true;
                }
            }
            org.apache.avro.Schema schema_tDBInput_3 = props_tDBInput_3.getSchema(c_tDBInput_3, true);

        org.talend.codegen.enforcer.OutgoingSchemaEnforcer outgoingEnforcer_tDBInput_3 = org.talend.codegen.enforcer.EnforcerCreator.createOutgoingEnforcer(schema_tDBInput_3, false);

        // Create a reusable factory that converts the output of the reader to an IndexedRecord.
        org.talend.daikon.avro.converter.IndexedRecordConverter<Object, ? extends org.apache.avro.generic.IndexedRecord> factory_tDBInput_3 = null;

        // Iterate through the incoming data.
        boolean available_tDBInput_3 = reader_tDBInput_3.start();

        resourceMap.put("reader_tDBInput_3", reader_tDBInput_3);

        for (; available_tDBInput_3; available_tDBInput_3 = reader_tDBInput_3.advance()) {
			nb_line_tDBInput_3++;

			
			if (multi_output_is_allowed_tDBInput_3) {
				
					HCPADDRESSES = null;
				

				
			}
			

			try {
				Object data_tDBInput_3 = reader_tDBInput_3.getCurrent();
				

					if(multi_output_is_allowed_tDBInput_3) {
						HCPADDRESSES = new HCPADDRESSESStruct();
					}

					
        // Construct the factory once when the first data arrives.
        if (factory_tDBInput_3 == null) {
            factory_tDBInput_3 = (org.talend.daikon.avro.converter.IndexedRecordConverter<Object, ? extends org.apache.avro.generic.IndexedRecord>)
                    new org.talend.daikon.avro.AvroRegistry()
                            .createIndexedRecordConverter(data_tDBInput_3.getClass());
        }

        // Enforce the outgoing schema on the input.
        outgoingEnforcer_tDBInput_3.setWrapped(factory_tDBInput_3.convertToAvro(data_tDBInput_3));
                Object columnValue_0_tDBInput_3 = outgoingEnforcer_tDBInput_3.get(0);
                        HCPADDRESSES.HCP_LEGEND_ID = (String) (columnValue_0_tDBInput_3);
                Object columnValue_1_tDBInput_3 = outgoingEnforcer_tDBInput_3.get(1);
                        HCPADDRESSES.HCP_ADDR_LEGEND_ID = (String) (columnValue_1_tDBInput_3);
                Object columnValue_2_tDBInput_3 = outgoingEnforcer_tDBInput_3.get(2);
                        HCPADDRESSES.HCP_ADDR_CREATED_DT = (java.util.Date) (columnValue_2_tDBInput_3);
                Object columnValue_3_tDBInput_3 = outgoingEnforcer_tDBInput_3.get(3);
                        HCPADDRESSES.HCP_ADDR_LAST_RECEIVED_DT = (java.util.Date) (columnValue_3_tDBInput_3);
                Object columnValue_4_tDBInput_3 = outgoingEnforcer_tDBInput_3.get(4);
                        HCPADDRESSES.HCP_ADDR_INACTIVE_DT = (java.util.Date) (columnValue_4_tDBInput_3);
                Object columnValue_5_tDBInput_3 = outgoingEnforcer_tDBInput_3.get(5);
                        HCPADDRESSES.HCP_ADDRESS = (String) (columnValue_5_tDBInput_3);
                Object columnValue_6_tDBInput_3 = outgoingEnforcer_tDBInput_3.get(6);
                        HCPADDRESSES.HCP_ADDRESS2 = (String) (columnValue_6_tDBInput_3);
                Object columnValue_7_tDBInput_3 = outgoingEnforcer_tDBInput_3.get(7);
                        HCPADDRESSES.HCP_CITY = (String) (columnValue_7_tDBInput_3);
                Object columnValue_8_tDBInput_3 = outgoingEnforcer_tDBInput_3.get(8);
                        HCPADDRESSES.HCP_STATE = (String) (columnValue_8_tDBInput_3);
                Object columnValue_9_tDBInput_3 = outgoingEnforcer_tDBInput_3.get(9);
                        HCPADDRESSES.HCP_ZIP = (String) (columnValue_9_tDBInput_3);
                Object columnValue_10_tDBInput_3 = outgoingEnforcer_tDBInput_3.get(10);
                        HCPADDRESSES.HCP_COUNTRY = (String) (columnValue_10_tDBInput_3);
                Object columnValue_11_tDBInput_3 = outgoingEnforcer_tDBInput_3.get(11);
                        HCPADDRESSES.HCP_LATITUDE = (Double) (columnValue_11_tDBInput_3);
                Object columnValue_12_tDBInput_3 = outgoingEnforcer_tDBInput_3.get(12);
                        HCPADDRESSES.HCP_LONGITUDE = (Double) (columnValue_12_tDBInput_3);
                Object columnValue_13_tDBInput_3 = outgoingEnforcer_tDBInput_3.get(13);
                        HCPADDRESSES.HCP_PRIMARY_ADDRESS = (Boolean) (columnValue_13_tDBInput_3);
                Object columnValue_14_tDBInput_3 = outgoingEnforcer_tDBInput_3.get(14);
                        HCPADDRESSES.DATA_THROUGH_DATE = (java.util.Date) (columnValue_14_tDBInput_3);
			} catch (org.talend.components.api.exception.DataRejectException e_tDBInput_3) {
				java.util.Map<String,Object> info_tDBInput_3 = e_tDBInput_3.getRejectInfo();
				
					//TODO use a method instead of getting method by the special key "error/errorMessage"
					Object errorMessage_tDBInput_3 = null;
					if(info_tDBInput_3.containsKey("error")){
						errorMessage_tDBInput_3 = info_tDBInput_3.get("error");
					}else if(info_tDBInput_3.containsKey("errorMessage")){
						errorMessage_tDBInput_3 = info_tDBInput_3.get("errorMessage");
					}else{
						errorMessage_tDBInput_3 = "Rejected but error message missing";
					}
					errorMessage_tDBInput_3 = "Row "+ nb_line_tDBInput_3 + ": "+errorMessage_tDBInput_3;
					System.err.println(errorMessage_tDBInput_3);
				
					// If the record is reject, the main line record should put NULL
					HCPADDRESSES = null;
				
			} // end of catch

                java.lang.Iterable<?> outgoingMainRecordsList_tDBInput_3 = new java.util.ArrayList<Object>();
                java.util.Iterator outgoingMainRecordsIt_tDBInput_3 = null;


 



/**
 * [tDBInput_3 begin ] stop
 */
	
	/**
	 * [tDBInput_3 main ] start
	 */

	

	
	
	currentComponent="tDBInput_3";

	


 


	tos_count_tDBInput_3++;

/**
 * [tDBInput_3 main ] stop
 */
	
	/**
	 * [tDBInput_3 process_data_begin ] start
	 */

	

	
	
	currentComponent="tDBInput_3";

	


 



/**
 * [tDBInput_3 process_data_begin ] stop
 */

	
	/**
	 * [tAdvancedHash_HCPADDRESSES main ] start
	 */

	

	
	
	currentComponent="tAdvancedHash_HCPADDRESSES";

	
			if(runStat.update(execStat,enableLogStash,iterateId,1,1
				
					,"HCPADDRESSES","tDBInput_3","HCPADDRESSES","tSnowflakeInput","tAdvancedHash_HCPADDRESSES","tAdvancedHash_HCPADDRESSES","tAdvancedHash"
				
			)) {
				talendJobLogProcess(globalMap);
			}
			
    			if(log.isTraceEnabled()){
    				log.trace("HCPADDRESSES - " + (HCPADDRESSES==null? "": HCPADDRESSES.toLogString()));
    			}
    		


			   
			   

					HCPADDRESSESStruct HCPADDRESSES_HashRow = new HCPADDRESSESStruct();
		   	   	   
				
				HCPADDRESSES_HashRow.HCP_LEGEND_ID = HCPADDRESSES.HCP_LEGEND_ID;
				
				HCPADDRESSES_HashRow.HCP_ADDR_LEGEND_ID = HCPADDRESSES.HCP_ADDR_LEGEND_ID;
				
				HCPADDRESSES_HashRow.HCP_ADDR_CREATED_DT = HCPADDRESSES.HCP_ADDR_CREATED_DT;
				
				HCPADDRESSES_HashRow.HCP_ADDR_LAST_RECEIVED_DT = HCPADDRESSES.HCP_ADDR_LAST_RECEIVED_DT;
				
				HCPADDRESSES_HashRow.HCP_ADDR_INACTIVE_DT = HCPADDRESSES.HCP_ADDR_INACTIVE_DT;
				
				HCPADDRESSES_HashRow.HCP_ADDRESS = HCPADDRESSES.HCP_ADDRESS;
				
				HCPADDRESSES_HashRow.HCP_ADDRESS2 = HCPADDRESSES.HCP_ADDRESS2;
				
				HCPADDRESSES_HashRow.HCP_CITY = HCPADDRESSES.HCP_CITY;
				
				HCPADDRESSES_HashRow.HCP_STATE = HCPADDRESSES.HCP_STATE;
				
				HCPADDRESSES_HashRow.HCP_ZIP = HCPADDRESSES.HCP_ZIP;
				
				HCPADDRESSES_HashRow.HCP_COUNTRY = HCPADDRESSES.HCP_COUNTRY;
				
				HCPADDRESSES_HashRow.HCP_LATITUDE = HCPADDRESSES.HCP_LATITUDE;
				
				HCPADDRESSES_HashRow.HCP_LONGITUDE = HCPADDRESSES.HCP_LONGITUDE;
				
				HCPADDRESSES_HashRow.HCP_PRIMARY_ADDRESS = HCPADDRESSES.HCP_PRIMARY_ADDRESS;
				
				HCPADDRESSES_HashRow.DATA_THROUGH_DATE = HCPADDRESSES.DATA_THROUGH_DATE;
				
			tHash_Lookup_HCPADDRESSES.put(HCPADDRESSES_HashRow);
			
            




 


	tos_count_tAdvancedHash_HCPADDRESSES++;

/**
 * [tAdvancedHash_HCPADDRESSES main ] stop
 */
	
	/**
	 * [tAdvancedHash_HCPADDRESSES process_data_begin ] start
	 */

	

	
	
	currentComponent="tAdvancedHash_HCPADDRESSES";

	

 



/**
 * [tAdvancedHash_HCPADDRESSES process_data_begin ] stop
 */
	
	/**
	 * [tAdvancedHash_HCPADDRESSES process_data_end ] start
	 */

	

	
	
	currentComponent="tAdvancedHash_HCPADDRESSES";

	

 



/**
 * [tAdvancedHash_HCPADDRESSES process_data_end ] stop
 */



	
	/**
	 * [tDBInput_3 process_data_end ] start
	 */

	

	
	
	currentComponent="tDBInput_3";

	


 



/**
 * [tDBInput_3 process_data_end ] stop
 */
	
	/**
	 * [tDBInput_3 end ] start
	 */

	

	
	
	currentComponent="tDBInput_3";

	
// end of generic


resourceMap.put("finish_tDBInput_3", Boolean.TRUE);

    } // while  
    } // end of "if (sourceOrSink_tDBInput_3 instanceof ...Source)"
    java.util.Map<String, Object> resultMap_tDBInput_3 = null;
    if (reader_tDBInput_3 != null) {
        reader_tDBInput_3.close();
        resultMap_tDBInput_3 = reader_tDBInput_3.getReturnValues();
    }
if(resultMap_tDBInput_3!=null) {
	for(java.util.Map.Entry<String,Object> entry_tDBInput_3 : resultMap_tDBInput_3.entrySet()) {
		switch(entry_tDBInput_3.getKey()) {
		case org.talend.components.api.component.ComponentDefinition.RETURN_ERROR_MESSAGE :
			container_tDBInput_3.setComponentData("tDBInput_3", "ERROR_MESSAGE", entry_tDBInput_3.getValue());
			break;
		case org.talend.components.api.component.ComponentDefinition.RETURN_TOTAL_RECORD_COUNT :
			container_tDBInput_3.setComponentData("tDBInput_3", "NB_LINE", entry_tDBInput_3.getValue());
			break;
		case org.talend.components.api.component.ComponentDefinition.RETURN_SUCCESS_RECORD_COUNT :
			container_tDBInput_3.setComponentData("tDBInput_3", "NB_SUCCESS", entry_tDBInput_3.getValue());
			break;
		case org.talend.components.api.component.ComponentDefinition.RETURN_REJECT_RECORD_COUNT :
			container_tDBInput_3.setComponentData("tDBInput_3", "NB_REJECT", entry_tDBInput_3.getValue());
			break;
		default :
            StringBuilder studio_key_tDBInput_3 = new StringBuilder();
            for (int i_tDBInput_3 = 0; i_tDBInput_3 < entry_tDBInput_3.getKey().length(); i_tDBInput_3++) {
                char ch_tDBInput_3 = entry_tDBInput_3.getKey().charAt(i_tDBInput_3);
                if(Character.isUpperCase(ch_tDBInput_3) && i_tDBInput_3> 0) {
                	studio_key_tDBInput_3.append('_');
                }
                studio_key_tDBInput_3.append(ch_tDBInput_3);
            }
			container_tDBInput_3.setComponentData("tDBInput_3", studio_key_tDBInput_3.toString().toUpperCase(java.util.Locale.ENGLISH), entry_tDBInput_3.getValue());
			break;
		}
	}
}

 

ok_Hash.put("tDBInput_3", true);
end_Hash.put("tDBInput_3", System.currentTimeMillis());




/**
 * [tDBInput_3 end ] stop
 */

	
	/**
	 * [tAdvancedHash_HCPADDRESSES end ] start
	 */

	

	
	
	currentComponent="tAdvancedHash_HCPADDRESSES";

	

tHash_Lookup_HCPADDRESSES.endPut();

			 		if(runStat.updateStatAndLog(execStat,enableLogStash,resourceMap,iterateId,"HCPADDRESSES",2,0,
			 			"tDBInput_3","HCPADDRESSES","tSnowflakeInput","tAdvancedHash_HCPADDRESSES","tAdvancedHash_HCPADDRESSES","tAdvancedHash","output")) {
						talendJobLogProcess(globalMap);
					}
				
 

ok_Hash.put("tAdvancedHash_HCPADDRESSES", true);
end_Hash.put("tAdvancedHash_HCPADDRESSES", System.currentTimeMillis());




/**
 * [tAdvancedHash_HCPADDRESSES end ] stop
 */



				}//end the resume

				



	
			}catch(java.lang.Exception e){	
				
				    if(!(e instanceof TalendException)){
					   log.fatal(currentComponent + " " + e.getMessage(),e);
					}
				
				TalendException te = new TalendException(e, currentComponent, globalMap);
				
				throw te;
			}catch(java.lang.Error error){	
				
					runStat.stopThreadStat();
				
				throw error;
			}finally{
				
				try{
					
	
	/**
	 * [tDBInput_3 finally ] start
	 */

	

	
	
	currentComponent="tDBInput_3";

	
// finally of generic


if(resourceMap.get("finish_tDBInput_3")==null){
    if(resourceMap.get("reader_tDBInput_3")!=null){
		try {
			((org.talend.components.api.component.runtime.Reader)resourceMap.get("reader_tDBInput_3")).close();
		} catch (java.io.IOException e_tDBInput_3) {
			String errorMessage_tDBInput_3 = "failed to release the resource in tDBInput_3 :" + e_tDBInput_3.getMessage();
			System.err.println(errorMessage_tDBInput_3);
		}
	}
}
 



/**
 * [tDBInput_3 finally ] stop
 */

	
	/**
	 * [tAdvancedHash_HCPADDRESSES finally ] start
	 */

	

	
	
	currentComponent="tAdvancedHash_HCPADDRESSES";

	

 



/**
 * [tAdvancedHash_HCPADDRESSES finally ] stop
 */



				}catch(java.lang.Exception e){	
					//ignore
				}catch(java.lang.Error error){
					//ignore
				}
				resourceMap = null;
			}
		

		globalMap.put("tDBInput_3_SUBPROCESS_STATE", 1);
	}
	


public static class PRODUCTStruct implements routines.system.IPersistableComparableLookupRow<PRODUCTStruct> {
    final static byte[] commonByteArrayLock_USCOMM_SUNSHINE_RPT_QA_BEACON_EXTRACT_SNOWFLAKE = new byte[0];
    static byte[] commonByteArray_USCOMM_SUNSHINE_RPT_QA_BEACON_EXTRACT_SNOWFLAKE = new byte[0];
	protected static final int DEFAULT_HASHCODE = 1;
    protected static final int PRIME = 31;
    protected int hashCode = DEFAULT_HASHCODE;
    public boolean hashCodeDirty = true;

    public String loopKey;



	
			    public String MANUAL_TEMPLATE;

				public String getMANUAL_TEMPLATE () {
					return this.MANUAL_TEMPLATE;
				}

				public Boolean MANUAL_TEMPLATEIsNullable(){
				    return true;
				}
				public Boolean MANUAL_TEMPLATEIsKey(){
				    return false;
				}
				public Integer MANUAL_TEMPLATELength(){
				    return 500;
				}
				public Integer MANUAL_TEMPLATEPrecision(){
				    return null;
				}
				public String MANUAL_TEMPLATEDefault(){
				
					return null;
				
				}
				public String MANUAL_TEMPLATEComment(){
				
				    return "";
				
				}
				public String MANUAL_TEMPLATEPattern(){
				
					return "";
				
				}
				public String MANUAL_TEMPLATEOriginalDbColumnName(){
				
					return "MANUAL_TEMPLATE";
				
				}

				
			    public String CONCUR;

				public String getCONCUR () {
					return this.CONCUR;
				}

				public Boolean CONCURIsNullable(){
				    return true;
				}
				public Boolean CONCURIsKey(){
				    return false;
				}
				public Integer CONCURLength(){
				    return 500;
				}
				public Integer CONCURPrecision(){
				    return null;
				}
				public String CONCURDefault(){
				
					return null;
				
				}
				public String CONCURComment(){
				
				    return "";
				
				}
				public String CONCURPattern(){
				
					return "";
				
				}
				public String CONCUROriginalDbColumnName(){
				
					return "CONCUR";
				
				}

				
			    public String BEACONCRM;

				public String getBEACONCRM () {
					return this.BEACONCRM;
				}

				public Boolean BEACONCRMIsNullable(){
				    return true;
				}
				public Boolean BEACONCRMIsKey(){
				    return false;
				}
				public Integer BEACONCRMLength(){
				    return 500;
				}
				public Integer BEACONCRMPrecision(){
				    return null;
				}
				public String BEACONCRMDefault(){
				
					return null;
				
				}
				public String BEACONCRMComment(){
				
				    return "";
				
				}
				public String BEACONCRMPattern(){
				
					return "";
				
				}
				public String BEACONCRMOriginalDbColumnName(){
				
					return "BEACONCRM";
				
				}

				
			    public String SAP;

				public String getSAP () {
					return this.SAP;
				}

				public Boolean SAPIsNullable(){
				    return true;
				}
				public Boolean SAPIsKey(){
				    return false;
				}
				public Integer SAPLength(){
				    return 500;
				}
				public Integer SAPPrecision(){
				    return null;
				}
				public String SAPDefault(){
				
					return null;
				
				}
				public String SAPComment(){
				
				    return "";
				
				}
				public String SAPPattern(){
				
					return "";
				
				}
				public String SAPOriginalDbColumnName(){
				
					return "SAP";
				
				}

				
			    public String FINAL_OUTPUT;

				public String getFINAL_OUTPUT () {
					return this.FINAL_OUTPUT;
				}

				public Boolean FINAL_OUTPUTIsNullable(){
				    return true;
				}
				public Boolean FINAL_OUTPUTIsKey(){
				    return false;
				}
				public Integer FINAL_OUTPUTLength(){
				    return 500;
				}
				public Integer FINAL_OUTPUTPrecision(){
				    return null;
				}
				public String FINAL_OUTPUTDefault(){
				
					return null;
				
				}
				public String FINAL_OUTPUTComment(){
				
				    return "";
				
				}
				public String FINAL_OUTPUTPattern(){
				
					return "";
				
				}
				public String FINAL_OUTPUTOriginalDbColumnName(){
				
					return "FINAL_OUTPUT";
				
				}

				


	@Override
	public int hashCode() {
		if (this.hashCodeDirty) {
			final int prime = PRIME;
			int result = DEFAULT_HASHCODE;
	
						result = prime * result + ((this.BEACONCRM == null) ? 0 : this.BEACONCRM.hashCode());
					
    		this.hashCode = result;
    		this.hashCodeDirty = false;
		}
		return this.hashCode;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) return true;
		if (obj == null) return false;
		if (getClass() != obj.getClass()) return false;
		final PRODUCTStruct other = (PRODUCTStruct) obj;
		
						if (this.BEACONCRM == null) {
							if (other.BEACONCRM != null)
								return false;
						
						} else if (!this.BEACONCRM.equals(other.BEACONCRM))
						
							return false;
					

		return true;
    }

	public void copyDataTo(PRODUCTStruct other) {

		other.MANUAL_TEMPLATE = this.MANUAL_TEMPLATE;
	            other.CONCUR = this.CONCUR;
	            other.BEACONCRM = this.BEACONCRM;
	            other.SAP = this.SAP;
	            other.FINAL_OUTPUT = this.FINAL_OUTPUT;
	            
	}

	public void copyKeysDataTo(PRODUCTStruct other) {

		other.BEACONCRM = this.BEACONCRM;
	            	
	}



	
	private String readString(DataInputStream dis, ObjectInputStream ois) throws IOException{
		String strReturn = null;
		int length = 0;
        length = dis.readInt();
		if (length == -1) {
			strReturn = null;
		} else {
			byte[] byteArray = new byte[length];
			dis.read(byteArray);
			strReturn = new String(byteArray, utf8Charset);
		}
		return strReturn;
	}
	
	private String readString(DataInputStream dis, org.jboss.marshalling.Unmarshaller unmarshaller) throws IOException{
		String strReturn = null;
		int length = 0;
        length = unmarshaller.readInt();
		if (length == -1) {
			strReturn = null;
		} else {
			byte[] byteArray = new byte[length];
			unmarshaller.read(byteArray);
			strReturn = new String(byteArray, utf8Charset);
		}
		return strReturn;
	}
	
	private void writeString(String str, DataOutputStream dos, org.jboss.marshalling.Marshaller marshaller) throws IOException{
		if(str == null) {
			marshaller.writeInt(-1);
		} else {
            byte[] byteArray = str.getBytes(utf8Charset);
            marshaller.writeInt(byteArray.length);
            marshaller.write(byteArray);
    	}
	}

	private void writeString(String str, DataOutputStream dos, ObjectOutputStream oos) throws IOException{
		if(str == null) {
            dos.writeInt(-1);
		} else {
            byte[] byteArray = str.getBytes(utf8Charset);
	    	dos.writeInt(byteArray.length);
			dos.write(byteArray);
    	}
	}

	private String readString(ObjectInputStream dis) throws IOException{
		String strReturn = null;
		int length = 0;
        length = dis.readInt();
		if (length == -1) {
			strReturn = null;
		} else {
			if(length > commonByteArray_USCOMM_SUNSHINE_RPT_QA_BEACON_EXTRACT_SNOWFLAKE.length) {
				if(length < 1024 && commonByteArray_USCOMM_SUNSHINE_RPT_QA_BEACON_EXTRACT_SNOWFLAKE.length == 0) {
   					commonByteArray_USCOMM_SUNSHINE_RPT_QA_BEACON_EXTRACT_SNOWFLAKE = new byte[1024];
				} else {
   					commonByteArray_USCOMM_SUNSHINE_RPT_QA_BEACON_EXTRACT_SNOWFLAKE = new byte[2 * length];
   				}
			}
			dis.readFully(commonByteArray_USCOMM_SUNSHINE_RPT_QA_BEACON_EXTRACT_SNOWFLAKE, 0, length);
			strReturn = new String(commonByteArray_USCOMM_SUNSHINE_RPT_QA_BEACON_EXTRACT_SNOWFLAKE, 0, length, utf8Charset);
		}
		return strReturn;
	}
	
	private String readString(org.jboss.marshalling.Unmarshaller unmarshaller) throws IOException{
		String strReturn = null;
		int length = 0;
        length = unmarshaller.readInt();
		if (length == -1) {
			strReturn = null;
		} else {
			if(length > commonByteArray_USCOMM_SUNSHINE_RPT_QA_BEACON_EXTRACT_SNOWFLAKE.length) {
				if(length < 1024 && commonByteArray_USCOMM_SUNSHINE_RPT_QA_BEACON_EXTRACT_SNOWFLAKE.length == 0) {
   					commonByteArray_USCOMM_SUNSHINE_RPT_QA_BEACON_EXTRACT_SNOWFLAKE = new byte[1024];
				} else {
   					commonByteArray_USCOMM_SUNSHINE_RPT_QA_BEACON_EXTRACT_SNOWFLAKE = new byte[2 * length];
   				}
			}
			unmarshaller.readFully(commonByteArray_USCOMM_SUNSHINE_RPT_QA_BEACON_EXTRACT_SNOWFLAKE, 0, length);
			strReturn = new String(commonByteArray_USCOMM_SUNSHINE_RPT_QA_BEACON_EXTRACT_SNOWFLAKE, 0, length, utf8Charset);
		}
		return strReturn;
	}

    private void writeString(String str, ObjectOutputStream dos) throws IOException{
		if(str == null) {
            dos.writeInt(-1);
		} else {
            byte[] byteArray = str.getBytes(utf8Charset);
	    	dos.writeInt(byteArray.length);
			dos.write(byteArray);
    	}
    }
    
    private void writeString(String str, org.jboss.marshalling.Marshaller marshaller) throws IOException{
		if(str == null) {
			marshaller.writeInt(-1);
		} else {
            byte[] byteArray = str.getBytes(utf8Charset);
            marshaller.writeInt(byteArray.length);
            marshaller.write(byteArray);
    	}
    }

    public void readKeysData(ObjectInputStream dis) {

		synchronized(commonByteArrayLock_USCOMM_SUNSHINE_RPT_QA_BEACON_EXTRACT_SNOWFLAKE) {

        	try {

        		int length = 0;
		
					this.BEACONCRM = readString(dis);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);

		

        }

		

      }


    }
    
    public void readKeysData(org.jboss.marshalling.Unmarshaller dis) {

		synchronized(commonByteArrayLock_USCOMM_SUNSHINE_RPT_QA_BEACON_EXTRACT_SNOWFLAKE) {

        	try {

        		int length = 0;
		
					this.BEACONCRM = readString(dis);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);

		

        }

		

      }


    }

    public void writeKeysData(ObjectOutputStream dos) {
        try {

		
					// String
				
						writeString(this.BEACONCRM,dos);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);
        }


    }
    
    public void writeKeysData(org.jboss.marshalling.Marshaller dos) {
        try {

		
					// String
				
						writeString(this.BEACONCRM,dos);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);
        }


    }



    /**
     * Fill Values data by reading ObjectInputStream.
     */
    public void readValuesData(DataInputStream dis, ObjectInputStream ois) {
        try {

			int length = 0;
		
						this.MANUAL_TEMPLATE = readString(dis,ois);
					
						this.CONCUR = readString(dis,ois);
					
						this.SAP = readString(dis,ois);
					
						this.FINAL_OUTPUT = readString(dis,ois);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);

		

        }

		

    }
    
    public void readValuesData(DataInputStream dis, org.jboss.marshalling.Unmarshaller objectIn) {
        try {
			int length = 0;
		
						this.MANUAL_TEMPLATE = readString(dis,objectIn);
					
						this.CONCUR = readString(dis,objectIn);
					
						this.SAP = readString(dis,objectIn);
					
						this.FINAL_OUTPUT = readString(dis,objectIn);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);

		

        }

		

    }

    /**
     * Return a byte array which represents Values data.
     */
    public void writeValuesData(DataOutputStream dos, ObjectOutputStream oos) {
        try {

		
						writeString(this.MANUAL_TEMPLATE, dos, oos);
					
						writeString(this.CONCUR, dos, oos);
					
						writeString(this.SAP, dos, oos);
					
						writeString(this.FINAL_OUTPUT, dos, oos);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);
        	}

    }
    
    public void writeValuesData(DataOutputStream dos, org.jboss.marshalling.Marshaller objectOut){
                try {

		
						writeString(this.MANUAL_TEMPLATE, dos, objectOut);
					
						writeString(this.CONCUR, dos, objectOut);
					
						writeString(this.SAP, dos, objectOut);
					
						writeString(this.FINAL_OUTPUT, dos, objectOut);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);
        	}
    }


    
    public boolean supportMarshaller(){
        return true;
    }


    public String toString() {

		StringBuilder sb = new StringBuilder();
		sb.append(super.toString());
		sb.append("[");
		sb.append("MANUAL_TEMPLATE="+MANUAL_TEMPLATE);
		sb.append(",CONCUR="+CONCUR);
		sb.append(",BEACONCRM="+BEACONCRM);
		sb.append(",SAP="+SAP);
		sb.append(",FINAL_OUTPUT="+FINAL_OUTPUT);
	    sb.append("]");

	    return sb.toString();
    }
        public String toLogString(){
        	StringBuilder sb = new StringBuilder();
        	
        				if(MANUAL_TEMPLATE == null){
        					sb.append("<null>");
        				}else{
            				sb.append(MANUAL_TEMPLATE);
            			}
            		
        			sb.append("|");
        		
        				if(CONCUR == null){
        					sb.append("<null>");
        				}else{
            				sb.append(CONCUR);
            			}
            		
        			sb.append("|");
        		
        				if(BEACONCRM == null){
        					sb.append("<null>");
        				}else{
            				sb.append(BEACONCRM);
            			}
            		
        			sb.append("|");
        		
        				if(SAP == null){
        					sb.append("<null>");
        				}else{
            				sb.append(SAP);
            			}
            		
        			sb.append("|");
        		
        				if(FINAL_OUTPUT == null){
        					sb.append("<null>");
        				}else{
            				sb.append(FINAL_OUTPUT);
            			}
            		
        			sb.append("|");
        		
        	return sb.toString();
        }

    /**
     * Compare keys
     */
    public int compareTo(PRODUCTStruct other) {

		int returnValue = -1;
		
						returnValue = checkNullsAndCompare(this.BEACONCRM, other.BEACONCRM);
						if(returnValue != 0) {
							return returnValue;
						}

					
	    return returnValue;
    }


    private int checkNullsAndCompare(Object object1, Object object2) {
        int returnValue = 0;
		if (object1 instanceof Comparable && object2 instanceof Comparable) {
            returnValue = ((Comparable) object1).compareTo(object2);
        } else if (object1 != null && object2 != null) {
            returnValue = compareStrings(object1.toString(), object2.toString());
        } else if (object1 == null && object2 != null) {
            returnValue = 1;
        } else if (object1 != null && object2 == null) {
            returnValue = -1;
        } else {
            returnValue = 0;
        }

        return returnValue;
    }

    private int compareStrings(String string1, String string2) {
        return string1.compareTo(string2);
    }


}
public void tDBInput_5Process(final java.util.Map<String, Object> globalMap) throws TalendException {
	globalMap.put("tDBInput_5_SUBPROCESS_STATE", 0);

 final boolean execStat = this.execStat;
	
		String iterateId = "";
	
	
	String currentComponent = "";
	java.util.Map<String, Object> resourceMap = new java.util.HashMap<String, Object>();

	try {
			// TDI-39566 avoid throwing an useless Exception
			boolean resumeIt = true;
			if (globalResumeTicket == false && resumeEntryMethodName != null) {
				String currentMethodName = new java.lang.Exception().getStackTrace()[0].getMethodName();
				resumeIt = resumeEntryMethodName.equals(currentMethodName);
			}
			if (resumeIt || globalResumeTicket) { //start the resume
				globalResumeTicket = true;



		PRODUCTStruct PRODUCT = new PRODUCTStruct();




	
	/**
	 * [tAdvancedHash_PRODUCT begin ] start
	 */

	

	
		
		ok_Hash.put("tAdvancedHash_PRODUCT", false);
		start_Hash.put("tAdvancedHash_PRODUCT", System.currentTimeMillis());
		
	
	currentComponent="tAdvancedHash_PRODUCT";

	
			runStat.updateStatAndLog(execStat,enableLogStash,resourceMap,iterateId,0,0,"PRODUCT");
			
		int tos_count_tAdvancedHash_PRODUCT = 0;
		
			if(enableLogStash) {
				talendJobLog.addCM("tAdvancedHash_PRODUCT", "tAdvancedHash_PRODUCT", "tAdvancedHash");
				talendJobLogProcess(globalMap);
			}
			

			   		// connection name:PRODUCT
			   		// source node:tDBInput_5 - inputs:(after_tDBInput_1) outputs:(PRODUCT,PRODUCT) | target node:tAdvancedHash_PRODUCT - inputs:(PRODUCT) outputs:()
			   		// linked node: tMap_1 - inputs:(HCPS,HCPTOINTERACTIONCOM,INTERACTIONSCOM,HCPADDRESSES,PRODUCT,RECIPIENT_STATE,RECIPIENT_COUNTRY,RECIPIENT_TYPE) outputs:(OUTPUT)
			   
			   		org.talend.designer.components.lookup.common.ICommonLookup.MATCHING_MODE matchingModeEnum_PRODUCT = 
			   			org.talend.designer.components.lookup.common.ICommonLookup.MATCHING_MODE.UNIQUE_MATCH;
			   			
			   
	   			org.talend.designer.components.lookup.memory.AdvancedMemoryLookup<PRODUCTStruct> tHash_Lookup_PRODUCT =org.talend.designer.components.lookup.memory.AdvancedMemoryLookup.
	   						<PRODUCTStruct>getLookup(matchingModeEnum_PRODUCT);
	   						   
		   	   	   globalMap.put("tHash_Lookup_PRODUCT", tHash_Lookup_PRODUCT);
		   	   	   
				
           

 



/**
 * [tAdvancedHash_PRODUCT begin ] stop
 */



	
	/**
	 * [tDBInput_5 begin ] start
	 */

	

	
		
		ok_Hash.put("tDBInput_5", false);
		start_Hash.put("tDBInput_5", System.currentTimeMillis());
		
	
	currentComponent="tDBInput_5";

	
		int tos_count_tDBInput_5 = 0;
		
			if(enableLogStash) {
				talendJobLog.addCM("tDBInput_5", "PRODUCT", "tSnowflakeInput");
				talendJobLogProcess(globalMap);
			}
			

boolean doesNodeBelongToRequest_tDBInput_5 = 0 == 0;
@SuppressWarnings("unchecked")
java.util.Map<String, Object> restRequest_tDBInput_5 = (java.util.Map<String, Object>)globalMap.get("restRequest");
String currentTRestRequestOperation_tDBInput_5 = (String)(restRequest_tDBInput_5 != null ? restRequest_tDBInput_5.get("OPERATION") : null);

org.talend.components.api.component.ComponentDefinition def_tDBInput_5 =
        new org.talend.components.snowflake.tsnowflakeinput.TSnowflakeInputDefinition();

org.talend.components.api.component.runtime.Writer writer_tDBInput_5 = null;
org.talend.components.api.component.runtime.Reader reader_tDBInput_5 = null;


org.talend.components.snowflake.tsnowflakeinput.TSnowflakeInputProperties props_tDBInput_5 =
        (org.talend.components.snowflake.tsnowflakeinput.TSnowflakeInputProperties) def_tDBInput_5.createRuntimeProperties();
 		                    props_tDBInput_5.setValue("condition",
 		                    "");
 		                    
 		                    props_tDBInput_5.setValue("manualQuery",
 		                    false);
 		                    
 		                    props_tDBInput_5.setValue("convertColumnsAndTableToUppercase",
 		                    true);
 		                    
 		                    props_tDBInput_5.connection.setValue("useCustomRegion",
 		                    false);
 		                    
 		                    props_tDBInput_5.connection.userPassword.setValue("useAuth",
 		                    false);
 		                    
 		                    props_tDBInput_5.connection.referencedComponent.setValue("referenceType",
 		                        org.talend.components.api.properties.ComponentReferenceProperties.ReferenceType.COMPONENT_INSTANCE);
 		                    
 		                    props_tDBInput_5.connection.referencedComponent.setValue("componentInstanceId",
 		                    "tDBConnection_2");
 		                    
 		                    props_tDBInput_5.connection.referencedComponent.setValue("referenceDefinitionName",
 		                    "tSnowflakeConnection");
 		                    
 		                    props_tDBInput_5.table.setValue("tableName",
 		                    "PRODUCT");
 		                    
 		                    props_tDBInput_5.table.connection.setValue("useCustomRegion",
 		                    false);
 		                    
 		                    props_tDBInput_5.table.connection.userPassword.setValue("useAuth",
 		                    false);
 		                    
 		                    props_tDBInput_5.table.connection.referencedComponent.setValue("referenceType",
 		                        org.talend.components.api.properties.ComponentReferenceProperties.ReferenceType.COMPONENT_INSTANCE);
 		                    
 		                    props_tDBInput_5.table.connection.referencedComponent.setValue("componentInstanceId",
 		                    "tDBConnection_2");
 		                    
 		                    props_tDBInput_5.table.connection.referencedComponent.setValue("referenceDefinitionName",
 		                    "tSnowflakeConnection");
 		                    
 		                    class SchemaSettingTool_tDBInput_5_1_fisrt {
 		                    		
 		                    		String getSchemaValue() {
 		                    				
 		                    						StringBuilder s = new StringBuilder();
                    						
     		                    						a("{\"type\":\"record\",",s);
     		                    						
     		                    						a("\"name\":\"PRODUCT\",\"fields\":[{",s);
     		                    						
     		                    						a("\"name\":\"MANUAL_TEMPLATE\",\"type\":[\"string\",\"null\"],\"talend.field.length\":\"500\",\"talend.field.dbType\":12,\"talend.field.dbColumnName\":\"MANUAL_TEMPLATE\"},{",s);
     		                    						
     		                    						a("\"name\":\"CONCUR\",\"type\":[\"string\",\"null\"],\"talend.field.length\":\"500\",\"talend.field.dbType\":12,\"talend.field.dbColumnName\":\"CONCUR\"},{",s);
     		                    						
     		                    						a("\"name\":\"BEACONCRM\",\"type\":[\"string\",\"null\"],\"talend.field.length\":\"500\",\"talend.field.dbType\":12,\"talend.field.dbColumnName\":\"BEACONCRM\"},{",s);
     		                    						
     		                    						a("\"name\":\"SAP\",\"type\":[\"string\",\"null\"],\"talend.field.length\":\"500\",\"talend.field.dbType\":12,\"talend.field.dbColumnName\":\"SAP\"},{",s);
     		                    						
     		                    						a("\"name\":\"FINAL_OUTPUT\",\"type\":[\"string\",\"null\"],\"talend.field.length\":\"500\",\"talend.field.dbType\":12,\"talend.field.dbColumnName\":\"FINAL_OUTPUT\"}]}",s);
     		                    						
     		                    				return s.toString();
     		                    		
 		                    		}
 		                    		
 		                    		void a(String part, StringBuilder strB) {
 		                    				strB.append(part);
 		                    		}
 		                    		
 		                    }
 		                    
 		                    SchemaSettingTool_tDBInput_5_1_fisrt sst_tDBInput_5_1_fisrt = new SchemaSettingTool_tDBInput_5_1_fisrt();
 		                    
 		                    props_tDBInput_5.table.main.setValue("schema",
 		                        new org.apache.avro.Schema.Parser().parse(sst_tDBInput_5_1_fisrt.getSchemaValue()));
 		                    
    if (org.talend.components.api.properties.ComponentReferenceProperties.ReferenceType.COMPONENT_INSTANCE == props_tDBInput_5.connection.referencedComponent.referenceType.getValue()) {
        final String referencedComponentInstanceId_tDBInput_5 = props_tDBInput_5.connection.referencedComponent.componentInstanceId.getStringValue();
        if (referencedComponentInstanceId_tDBInput_5 != null) {
            org.talend.daikon.properties.Properties referencedComponentProperties_tDBInput_5 = (org.talend.daikon.properties.Properties) globalMap.get(
                referencedComponentInstanceId_tDBInput_5 + "_COMPONENT_RUNTIME_PROPERTIES");
            props_tDBInput_5.connection.referencedComponent.setReference(referencedComponentProperties_tDBInput_5);
        }
    }
    if (org.talend.components.api.properties.ComponentReferenceProperties.ReferenceType.COMPONENT_INSTANCE == props_tDBInput_5.table.connection.referencedComponent.referenceType.getValue()) {
        final String referencedComponentInstanceId_tDBInput_5 = props_tDBInput_5.table.connection.referencedComponent.componentInstanceId.getStringValue();
        if (referencedComponentInstanceId_tDBInput_5 != null) {
            org.talend.daikon.properties.Properties referencedComponentProperties_tDBInput_5 = (org.talend.daikon.properties.Properties) globalMap.get(
                referencedComponentInstanceId_tDBInput_5 + "_COMPONENT_RUNTIME_PROPERTIES");
            props_tDBInput_5.table.connection.referencedComponent.setReference(referencedComponentProperties_tDBInput_5);
        }
    }
globalMap.put("tDBInput_5_COMPONENT_RUNTIME_PROPERTIES", props_tDBInput_5);
globalMap.putIfAbsent("TALEND_PRODUCT_VERSION", "8.0");
globalMap.put("TALEND_COMPONENTS_VERSION", "0.37.4");
java.net.URL mappings_url_tDBInput_5= this.getClass().getResource("/xmlMappings");
globalMap.put("tDBInput_5_MAPPINGS_URL", mappings_url_tDBInput_5);

org.talend.components.api.container.RuntimeContainer container_tDBInput_5 = new org.talend.components.api.container.RuntimeContainer() {
    public Object getComponentData(String componentId, String key) {
        return globalMap.get(componentId + "_" + key);
    }

    public void setComponentData(String componentId, String key, Object data) {
        globalMap.put(componentId + "_" + key, data);
    }

    public String getCurrentComponentId() {
        return "tDBInput_5";
    }

    public Object getGlobalData(String key) {
    	return globalMap.get(key);
    }
};

int nb_line_tDBInput_5 = 0;

org.talend.components.api.component.ConnectorTopology topology_tDBInput_5 = null;
topology_tDBInput_5 = org.talend.components.api.component.ConnectorTopology.OUTGOING;

org.talend.daikon.runtime.RuntimeInfo runtime_info_tDBInput_5 = def_tDBInput_5.getRuntimeInfo(
    org.talend.components.api.component.runtime.ExecutionEngine.DI, props_tDBInput_5, topology_tDBInput_5);
java.util.Set<org.talend.components.api.component.ConnectorTopology> supported_connector_topologies_tDBInput_5 = def_tDBInput_5.getSupportedConnectorTopologies();

org.talend.components.api.component.runtime.RuntimableRuntime componentRuntime_tDBInput_5 = (org.talend.components.api.component.runtime.RuntimableRuntime)(Class.forName(runtime_info_tDBInput_5.getRuntimeClassName()).newInstance());
org.talend.daikon.properties.ValidationResult initVr_tDBInput_5 = componentRuntime_tDBInput_5.initialize(container_tDBInput_5, props_tDBInput_5);

if (initVr_tDBInput_5.getStatus() == org.talend.daikon.properties.ValidationResult.Result.ERROR ) {
    throw new RuntimeException(initVr_tDBInput_5.getMessage());
}

if(componentRuntime_tDBInput_5 instanceof org.talend.components.api.component.runtime.ComponentDriverInitialization) {
	org.talend.components.api.component.runtime.ComponentDriverInitialization compDriverInitialization_tDBInput_5 = (org.talend.components.api.component.runtime.ComponentDriverInitialization)componentRuntime_tDBInput_5;
	compDriverInitialization_tDBInput_5.runAtDriver(container_tDBInput_5);
}

org.talend.components.api.component.runtime.SourceOrSink sourceOrSink_tDBInput_5 = null;
if(componentRuntime_tDBInput_5 instanceof org.talend.components.api.component.runtime.SourceOrSink) {
	sourceOrSink_tDBInput_5 = (org.talend.components.api.component.runtime.SourceOrSink)componentRuntime_tDBInput_5;
	if (doesNodeBelongToRequest_tDBInput_5) {
        org.talend.daikon.properties.ValidationResult vr_tDBInput_5 = sourceOrSink_tDBInput_5.validate(container_tDBInput_5);
        if (vr_tDBInput_5.getStatus() == org.talend.daikon.properties.ValidationResult.Result.ERROR ) {
            throw new RuntimeException(vr_tDBInput_5.getMessage());
        }
	}
}

    if (sourceOrSink_tDBInput_5 instanceof org.talend.components.api.component.runtime.Source) {
        org.talend.components.api.component.runtime.Source source_tDBInput_5 =
                (org.talend.components.api.component.runtime.Source)sourceOrSink_tDBInput_5;
        reader_tDBInput_5 = source_tDBInput_5.createReader(container_tDBInput_5);
	    reader_tDBInput_5 = new org.talend.codegen.flowvariables.runtime.FlowVariablesReader(reader_tDBInput_5, container_tDBInput_5);

            boolean multi_output_is_allowed_tDBInput_5 = false;
            org.talend.components.api.component.Connector c_tDBInput_5 = null;
            for (org.talend.components.api.component.Connector currentConnector : props_tDBInput_5.getAvailableConnectors(null, true)) {
                if (currentConnector.getName().equals("MAIN")) {
                    c_tDBInput_5 = currentConnector;
                }

                if (currentConnector.getName().equals("REJECT")) {//it's better to move the code to javajet
                    multi_output_is_allowed_tDBInput_5 = true;
                }
            }
            org.apache.avro.Schema schema_tDBInput_5 = props_tDBInput_5.getSchema(c_tDBInput_5, true);

        org.talend.codegen.enforcer.OutgoingSchemaEnforcer outgoingEnforcer_tDBInput_5 = org.talend.codegen.enforcer.EnforcerCreator.createOutgoingEnforcer(schema_tDBInput_5, false);

        // Create a reusable factory that converts the output of the reader to an IndexedRecord.
        org.talend.daikon.avro.converter.IndexedRecordConverter<Object, ? extends org.apache.avro.generic.IndexedRecord> factory_tDBInput_5 = null;

        // Iterate through the incoming data.
        boolean available_tDBInput_5 = reader_tDBInput_5.start();

        resourceMap.put("reader_tDBInput_5", reader_tDBInput_5);

        for (; available_tDBInput_5; available_tDBInput_5 = reader_tDBInput_5.advance()) {
			nb_line_tDBInput_5++;

			
			if (multi_output_is_allowed_tDBInput_5) {
				
					PRODUCT = null;
				

				
			}
			

			try {
				Object data_tDBInput_5 = reader_tDBInput_5.getCurrent();
				

					if(multi_output_is_allowed_tDBInput_5) {
						PRODUCT = new PRODUCTStruct();
					}

					
        // Construct the factory once when the first data arrives.
        if (factory_tDBInput_5 == null) {
            factory_tDBInput_5 = (org.talend.daikon.avro.converter.IndexedRecordConverter<Object, ? extends org.apache.avro.generic.IndexedRecord>)
                    new org.talend.daikon.avro.AvroRegistry()
                            .createIndexedRecordConverter(data_tDBInput_5.getClass());
        }

        // Enforce the outgoing schema on the input.
        outgoingEnforcer_tDBInput_5.setWrapped(factory_tDBInput_5.convertToAvro(data_tDBInput_5));
                Object columnValue_0_tDBInput_5 = outgoingEnforcer_tDBInput_5.get(0);
                        PRODUCT.MANUAL_TEMPLATE = (String) (columnValue_0_tDBInput_5);
                Object columnValue_1_tDBInput_5 = outgoingEnforcer_tDBInput_5.get(1);
                        PRODUCT.CONCUR = (String) (columnValue_1_tDBInput_5);
                Object columnValue_2_tDBInput_5 = outgoingEnforcer_tDBInput_5.get(2);
                        PRODUCT.BEACONCRM = (String) (columnValue_2_tDBInput_5);
                Object columnValue_3_tDBInput_5 = outgoingEnforcer_tDBInput_5.get(3);
                        PRODUCT.SAP = (String) (columnValue_3_tDBInput_5);
                Object columnValue_4_tDBInput_5 = outgoingEnforcer_tDBInput_5.get(4);
                        PRODUCT.FINAL_OUTPUT = (String) (columnValue_4_tDBInput_5);
			} catch (org.talend.components.api.exception.DataRejectException e_tDBInput_5) {
				java.util.Map<String,Object> info_tDBInput_5 = e_tDBInput_5.getRejectInfo();
				
					//TODO use a method instead of getting method by the special key "error/errorMessage"
					Object errorMessage_tDBInput_5 = null;
					if(info_tDBInput_5.containsKey("error")){
						errorMessage_tDBInput_5 = info_tDBInput_5.get("error");
					}else if(info_tDBInput_5.containsKey("errorMessage")){
						errorMessage_tDBInput_5 = info_tDBInput_5.get("errorMessage");
					}else{
						errorMessage_tDBInput_5 = "Rejected but error message missing";
					}
					errorMessage_tDBInput_5 = "Row "+ nb_line_tDBInput_5 + ": "+errorMessage_tDBInput_5;
					System.err.println(errorMessage_tDBInput_5);
				
					// If the record is reject, the main line record should put NULL
					PRODUCT = null;
				
			} // end of catch

                java.lang.Iterable<?> outgoingMainRecordsList_tDBInput_5 = new java.util.ArrayList<Object>();
                java.util.Iterator outgoingMainRecordsIt_tDBInput_5 = null;


 



/**
 * [tDBInput_5 begin ] stop
 */
	
	/**
	 * [tDBInput_5 main ] start
	 */

	

	
	
	currentComponent="tDBInput_5";

	


 


	tos_count_tDBInput_5++;

/**
 * [tDBInput_5 main ] stop
 */
	
	/**
	 * [tDBInput_5 process_data_begin ] start
	 */

	

	
	
	currentComponent="tDBInput_5";

	


 



/**
 * [tDBInput_5 process_data_begin ] stop
 */

	
	/**
	 * [tAdvancedHash_PRODUCT main ] start
	 */

	

	
	
	currentComponent="tAdvancedHash_PRODUCT";

	
			if(runStat.update(execStat,enableLogStash,iterateId,1,1
				
					,"PRODUCT","tDBInput_5","PRODUCT","tSnowflakeInput","tAdvancedHash_PRODUCT","tAdvancedHash_PRODUCT","tAdvancedHash"
				
			)) {
				talendJobLogProcess(globalMap);
			}
			
    			if(log.isTraceEnabled()){
    				log.trace("PRODUCT - " + (PRODUCT==null? "": PRODUCT.toLogString()));
    			}
    		


			   
			   

					PRODUCTStruct PRODUCT_HashRow = new PRODUCTStruct();
		   	   	   
				
				PRODUCT_HashRow.MANUAL_TEMPLATE = PRODUCT.MANUAL_TEMPLATE;
				
				PRODUCT_HashRow.CONCUR = PRODUCT.CONCUR;
				
				PRODUCT_HashRow.BEACONCRM = PRODUCT.BEACONCRM;
				
				PRODUCT_HashRow.SAP = PRODUCT.SAP;
				
				PRODUCT_HashRow.FINAL_OUTPUT = PRODUCT.FINAL_OUTPUT;
				
			tHash_Lookup_PRODUCT.put(PRODUCT_HashRow);
			
            




 


	tos_count_tAdvancedHash_PRODUCT++;

/**
 * [tAdvancedHash_PRODUCT main ] stop
 */
	
	/**
	 * [tAdvancedHash_PRODUCT process_data_begin ] start
	 */

	

	
	
	currentComponent="tAdvancedHash_PRODUCT";

	

 



/**
 * [tAdvancedHash_PRODUCT process_data_begin ] stop
 */
	
	/**
	 * [tAdvancedHash_PRODUCT process_data_end ] start
	 */

	

	
	
	currentComponent="tAdvancedHash_PRODUCT";

	

 



/**
 * [tAdvancedHash_PRODUCT process_data_end ] stop
 */



	
	/**
	 * [tDBInput_5 process_data_end ] start
	 */

	

	
	
	currentComponent="tDBInput_5";

	


 



/**
 * [tDBInput_5 process_data_end ] stop
 */
	
	/**
	 * [tDBInput_5 end ] start
	 */

	

	
	
	currentComponent="tDBInput_5";

	
// end of generic


resourceMap.put("finish_tDBInput_5", Boolean.TRUE);

    } // while  
    } // end of "if (sourceOrSink_tDBInput_5 instanceof ...Source)"
    java.util.Map<String, Object> resultMap_tDBInput_5 = null;
    if (reader_tDBInput_5 != null) {
        reader_tDBInput_5.close();
        resultMap_tDBInput_5 = reader_tDBInput_5.getReturnValues();
    }
if(resultMap_tDBInput_5!=null) {
	for(java.util.Map.Entry<String,Object> entry_tDBInput_5 : resultMap_tDBInput_5.entrySet()) {
		switch(entry_tDBInput_5.getKey()) {
		case org.talend.components.api.component.ComponentDefinition.RETURN_ERROR_MESSAGE :
			container_tDBInput_5.setComponentData("tDBInput_5", "ERROR_MESSAGE", entry_tDBInput_5.getValue());
			break;
		case org.talend.components.api.component.ComponentDefinition.RETURN_TOTAL_RECORD_COUNT :
			container_tDBInput_5.setComponentData("tDBInput_5", "NB_LINE", entry_tDBInput_5.getValue());
			break;
		case org.talend.components.api.component.ComponentDefinition.RETURN_SUCCESS_RECORD_COUNT :
			container_tDBInput_5.setComponentData("tDBInput_5", "NB_SUCCESS", entry_tDBInput_5.getValue());
			break;
		case org.talend.components.api.component.ComponentDefinition.RETURN_REJECT_RECORD_COUNT :
			container_tDBInput_5.setComponentData("tDBInput_5", "NB_REJECT", entry_tDBInput_5.getValue());
			break;
		default :
            StringBuilder studio_key_tDBInput_5 = new StringBuilder();
            for (int i_tDBInput_5 = 0; i_tDBInput_5 < entry_tDBInput_5.getKey().length(); i_tDBInput_5++) {
                char ch_tDBInput_5 = entry_tDBInput_5.getKey().charAt(i_tDBInput_5);
                if(Character.isUpperCase(ch_tDBInput_5) && i_tDBInput_5> 0) {
                	studio_key_tDBInput_5.append('_');
                }
                studio_key_tDBInput_5.append(ch_tDBInput_5);
            }
			container_tDBInput_5.setComponentData("tDBInput_5", studio_key_tDBInput_5.toString().toUpperCase(java.util.Locale.ENGLISH), entry_tDBInput_5.getValue());
			break;
		}
	}
}

 

ok_Hash.put("tDBInput_5", true);
end_Hash.put("tDBInput_5", System.currentTimeMillis());




/**
 * [tDBInput_5 end ] stop
 */

	
	/**
	 * [tAdvancedHash_PRODUCT end ] start
	 */

	

	
	
	currentComponent="tAdvancedHash_PRODUCT";

	

tHash_Lookup_PRODUCT.endPut();

			 		if(runStat.updateStatAndLog(execStat,enableLogStash,resourceMap,iterateId,"PRODUCT",2,0,
			 			"tDBInput_5","PRODUCT","tSnowflakeInput","tAdvancedHash_PRODUCT","tAdvancedHash_PRODUCT","tAdvancedHash","output")) {
						talendJobLogProcess(globalMap);
					}
				
 

ok_Hash.put("tAdvancedHash_PRODUCT", true);
end_Hash.put("tAdvancedHash_PRODUCT", System.currentTimeMillis());




/**
 * [tAdvancedHash_PRODUCT end ] stop
 */



				}//end the resume

				



	
			}catch(java.lang.Exception e){	
				
				    if(!(e instanceof TalendException)){
					   log.fatal(currentComponent + " " + e.getMessage(),e);
					}
				
				TalendException te = new TalendException(e, currentComponent, globalMap);
				
				throw te;
			}catch(java.lang.Error error){	
				
					runStat.stopThreadStat();
				
				throw error;
			}finally{
				
				try{
					
	
	/**
	 * [tDBInput_5 finally ] start
	 */

	

	
	
	currentComponent="tDBInput_5";

	
// finally of generic


if(resourceMap.get("finish_tDBInput_5")==null){
    if(resourceMap.get("reader_tDBInput_5")!=null){
		try {
			((org.talend.components.api.component.runtime.Reader)resourceMap.get("reader_tDBInput_5")).close();
		} catch (java.io.IOException e_tDBInput_5) {
			String errorMessage_tDBInput_5 = "failed to release the resource in tDBInput_5 :" + e_tDBInput_5.getMessage();
			System.err.println(errorMessage_tDBInput_5);
		}
	}
}
 



/**
 * [tDBInput_5 finally ] stop
 */

	
	/**
	 * [tAdvancedHash_PRODUCT finally ] start
	 */

	

	
	
	currentComponent="tAdvancedHash_PRODUCT";

	

 



/**
 * [tAdvancedHash_PRODUCT finally ] stop
 */



				}catch(java.lang.Exception e){	
					//ignore
				}catch(java.lang.Error error){
					//ignore
				}
				resourceMap = null;
			}
		

		globalMap.put("tDBInput_5_SUBPROCESS_STATE", 1);
	}
	


public static class RECIPIENT_STATEStruct implements routines.system.IPersistableComparableLookupRow<RECIPIENT_STATEStruct> {
    final static byte[] commonByteArrayLock_USCOMM_SUNSHINE_RPT_QA_BEACON_EXTRACT_SNOWFLAKE = new byte[0];
    static byte[] commonByteArray_USCOMM_SUNSHINE_RPT_QA_BEACON_EXTRACT_SNOWFLAKE = new byte[0];
	protected static final int DEFAULT_HASHCODE = 1;
    protected static final int PRIME = 31;
    protected int hashCode = DEFAULT_HASHCODE;
    public boolean hashCodeDirty = true;

    public String loopKey;



	
			    public String MANUAL_TEMPLATE;

				public String getMANUAL_TEMPLATE () {
					return this.MANUAL_TEMPLATE;
				}

				public Boolean MANUAL_TEMPLATEIsNullable(){
				    return true;
				}
				public Boolean MANUAL_TEMPLATEIsKey(){
				    return false;
				}
				public Integer MANUAL_TEMPLATELength(){
				    return 500;
				}
				public Integer MANUAL_TEMPLATEPrecision(){
				    return null;
				}
				public String MANUAL_TEMPLATEDefault(){
				
					return null;
				
				}
				public String MANUAL_TEMPLATEComment(){
				
				    return "";
				
				}
				public String MANUAL_TEMPLATEPattern(){
				
					return "";
				
				}
				public String MANUAL_TEMPLATEOriginalDbColumnName(){
				
					return "MANUAL_TEMPLATE";
				
				}

				
			    public String CONCUR;

				public String getCONCUR () {
					return this.CONCUR;
				}

				public Boolean CONCURIsNullable(){
				    return true;
				}
				public Boolean CONCURIsKey(){
				    return false;
				}
				public Integer CONCURLength(){
				    return 500;
				}
				public Integer CONCURPrecision(){
				    return null;
				}
				public String CONCURDefault(){
				
					return null;
				
				}
				public String CONCURComment(){
				
				    return "";
				
				}
				public String CONCURPattern(){
				
					return "";
				
				}
				public String CONCUROriginalDbColumnName(){
				
					return "CONCUR";
				
				}

				
			    public String BEACONCRM;

				public String getBEACONCRM () {
					return this.BEACONCRM;
				}

				public Boolean BEACONCRMIsNullable(){
				    return true;
				}
				public Boolean BEACONCRMIsKey(){
				    return false;
				}
				public Integer BEACONCRMLength(){
				    return 500;
				}
				public Integer BEACONCRMPrecision(){
				    return null;
				}
				public String BEACONCRMDefault(){
				
					return null;
				
				}
				public String BEACONCRMComment(){
				
				    return "";
				
				}
				public String BEACONCRMPattern(){
				
					return "";
				
				}
				public String BEACONCRMOriginalDbColumnName(){
				
					return "BEACONCRM";
				
				}

				
			    public String SAP;

				public String getSAP () {
					return this.SAP;
				}

				public Boolean SAPIsNullable(){
				    return true;
				}
				public Boolean SAPIsKey(){
				    return false;
				}
				public Integer SAPLength(){
				    return 500;
				}
				public Integer SAPPrecision(){
				    return null;
				}
				public String SAPDefault(){
				
					return null;
				
				}
				public String SAPComment(){
				
				    return "";
				
				}
				public String SAPPattern(){
				
					return "";
				
				}
				public String SAPOriginalDbColumnName(){
				
					return "SAP";
				
				}

				
			    public String FINAL_OUTPUT;

				public String getFINAL_OUTPUT () {
					return this.FINAL_OUTPUT;
				}

				public Boolean FINAL_OUTPUTIsNullable(){
				    return true;
				}
				public Boolean FINAL_OUTPUTIsKey(){
				    return false;
				}
				public Integer FINAL_OUTPUTLength(){
				    return 500;
				}
				public Integer FINAL_OUTPUTPrecision(){
				    return null;
				}
				public String FINAL_OUTPUTDefault(){
				
					return null;
				
				}
				public String FINAL_OUTPUTComment(){
				
				    return "";
				
				}
				public String FINAL_OUTPUTPattern(){
				
					return "";
				
				}
				public String FINAL_OUTPUTOriginalDbColumnName(){
				
					return "FINAL_OUTPUT";
				
				}

				


	@Override
	public int hashCode() {
		if (this.hashCodeDirty) {
			final int prime = PRIME;
			int result = DEFAULT_HASHCODE;
	
						result = prime * result + ((this.BEACONCRM == null) ? 0 : this.BEACONCRM.hashCode());
					
    		this.hashCode = result;
    		this.hashCodeDirty = false;
		}
		return this.hashCode;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) return true;
		if (obj == null) return false;
		if (getClass() != obj.getClass()) return false;
		final RECIPIENT_STATEStruct other = (RECIPIENT_STATEStruct) obj;
		
						if (this.BEACONCRM == null) {
							if (other.BEACONCRM != null)
								return false;
						
						} else if (!this.BEACONCRM.equals(other.BEACONCRM))
						
							return false;
					

		return true;
    }

	public void copyDataTo(RECIPIENT_STATEStruct other) {

		other.MANUAL_TEMPLATE = this.MANUAL_TEMPLATE;
	            other.CONCUR = this.CONCUR;
	            other.BEACONCRM = this.BEACONCRM;
	            other.SAP = this.SAP;
	            other.FINAL_OUTPUT = this.FINAL_OUTPUT;
	            
	}

	public void copyKeysDataTo(RECIPIENT_STATEStruct other) {

		other.BEACONCRM = this.BEACONCRM;
	            	
	}



	
	private String readString(DataInputStream dis, ObjectInputStream ois) throws IOException{
		String strReturn = null;
		int length = 0;
        length = dis.readInt();
		if (length == -1) {
			strReturn = null;
		} else {
			byte[] byteArray = new byte[length];
			dis.read(byteArray);
			strReturn = new String(byteArray, utf8Charset);
		}
		return strReturn;
	}
	
	private String readString(DataInputStream dis, org.jboss.marshalling.Unmarshaller unmarshaller) throws IOException{
		String strReturn = null;
		int length = 0;
        length = unmarshaller.readInt();
		if (length == -1) {
			strReturn = null;
		} else {
			byte[] byteArray = new byte[length];
			unmarshaller.read(byteArray);
			strReturn = new String(byteArray, utf8Charset);
		}
		return strReturn;
	}
	
	private void writeString(String str, DataOutputStream dos, org.jboss.marshalling.Marshaller marshaller) throws IOException{
		if(str == null) {
			marshaller.writeInt(-1);
		} else {
            byte[] byteArray = str.getBytes(utf8Charset);
            marshaller.writeInt(byteArray.length);
            marshaller.write(byteArray);
    	}
	}

	private void writeString(String str, DataOutputStream dos, ObjectOutputStream oos) throws IOException{
		if(str == null) {
            dos.writeInt(-1);
		} else {
            byte[] byteArray = str.getBytes(utf8Charset);
	    	dos.writeInt(byteArray.length);
			dos.write(byteArray);
    	}
	}

	private String readString(ObjectInputStream dis) throws IOException{
		String strReturn = null;
		int length = 0;
        length = dis.readInt();
		if (length == -1) {
			strReturn = null;
		} else {
			if(length > commonByteArray_USCOMM_SUNSHINE_RPT_QA_BEACON_EXTRACT_SNOWFLAKE.length) {
				if(length < 1024 && commonByteArray_USCOMM_SUNSHINE_RPT_QA_BEACON_EXTRACT_SNOWFLAKE.length == 0) {
   					commonByteArray_USCOMM_SUNSHINE_RPT_QA_BEACON_EXTRACT_SNOWFLAKE = new byte[1024];
				} else {
   					commonByteArray_USCOMM_SUNSHINE_RPT_QA_BEACON_EXTRACT_SNOWFLAKE = new byte[2 * length];
   				}
			}
			dis.readFully(commonByteArray_USCOMM_SUNSHINE_RPT_QA_BEACON_EXTRACT_SNOWFLAKE, 0, length);
			strReturn = new String(commonByteArray_USCOMM_SUNSHINE_RPT_QA_BEACON_EXTRACT_SNOWFLAKE, 0, length, utf8Charset);
		}
		return strReturn;
	}
	
	private String readString(org.jboss.marshalling.Unmarshaller unmarshaller) throws IOException{
		String strReturn = null;
		int length = 0;
        length = unmarshaller.readInt();
		if (length == -1) {
			strReturn = null;
		} else {
			if(length > commonByteArray_USCOMM_SUNSHINE_RPT_QA_BEACON_EXTRACT_SNOWFLAKE.length) {
				if(length < 1024 && commonByteArray_USCOMM_SUNSHINE_RPT_QA_BEACON_EXTRACT_SNOWFLAKE.length == 0) {
   					commonByteArray_USCOMM_SUNSHINE_RPT_QA_BEACON_EXTRACT_SNOWFLAKE = new byte[1024];
				} else {
   					commonByteArray_USCOMM_SUNSHINE_RPT_QA_BEACON_EXTRACT_SNOWFLAKE = new byte[2 * length];
   				}
			}
			unmarshaller.readFully(commonByteArray_USCOMM_SUNSHINE_RPT_QA_BEACON_EXTRACT_SNOWFLAKE, 0, length);
			strReturn = new String(commonByteArray_USCOMM_SUNSHINE_RPT_QA_BEACON_EXTRACT_SNOWFLAKE, 0, length, utf8Charset);
		}
		return strReturn;
	}

    private void writeString(String str, ObjectOutputStream dos) throws IOException{
		if(str == null) {
            dos.writeInt(-1);
		} else {
            byte[] byteArray = str.getBytes(utf8Charset);
	    	dos.writeInt(byteArray.length);
			dos.write(byteArray);
    	}
    }
    
    private void writeString(String str, org.jboss.marshalling.Marshaller marshaller) throws IOException{
		if(str == null) {
			marshaller.writeInt(-1);
		} else {
            byte[] byteArray = str.getBytes(utf8Charset);
            marshaller.writeInt(byteArray.length);
            marshaller.write(byteArray);
    	}
    }

    public void readKeysData(ObjectInputStream dis) {

		synchronized(commonByteArrayLock_USCOMM_SUNSHINE_RPT_QA_BEACON_EXTRACT_SNOWFLAKE) {

        	try {

        		int length = 0;
		
					this.BEACONCRM = readString(dis);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);

		

        }

		

      }


    }
    
    public void readKeysData(org.jboss.marshalling.Unmarshaller dis) {

		synchronized(commonByteArrayLock_USCOMM_SUNSHINE_RPT_QA_BEACON_EXTRACT_SNOWFLAKE) {

        	try {

        		int length = 0;
		
					this.BEACONCRM = readString(dis);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);

		

        }

		

      }


    }

    public void writeKeysData(ObjectOutputStream dos) {
        try {

		
					// String
				
						writeString(this.BEACONCRM,dos);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);
        }


    }
    
    public void writeKeysData(org.jboss.marshalling.Marshaller dos) {
        try {

		
					// String
				
						writeString(this.BEACONCRM,dos);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);
        }


    }



    /**
     * Fill Values data by reading ObjectInputStream.
     */
    public void readValuesData(DataInputStream dis, ObjectInputStream ois) {
        try {

			int length = 0;
		
						this.MANUAL_TEMPLATE = readString(dis,ois);
					
						this.CONCUR = readString(dis,ois);
					
						this.SAP = readString(dis,ois);
					
						this.FINAL_OUTPUT = readString(dis,ois);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);

		

        }

		

    }
    
    public void readValuesData(DataInputStream dis, org.jboss.marshalling.Unmarshaller objectIn) {
        try {
			int length = 0;
		
						this.MANUAL_TEMPLATE = readString(dis,objectIn);
					
						this.CONCUR = readString(dis,objectIn);
					
						this.SAP = readString(dis,objectIn);
					
						this.FINAL_OUTPUT = readString(dis,objectIn);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);

		

        }

		

    }

    /**
     * Return a byte array which represents Values data.
     */
    public void writeValuesData(DataOutputStream dos, ObjectOutputStream oos) {
        try {

		
						writeString(this.MANUAL_TEMPLATE, dos, oos);
					
						writeString(this.CONCUR, dos, oos);
					
						writeString(this.SAP, dos, oos);
					
						writeString(this.FINAL_OUTPUT, dos, oos);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);
        	}

    }
    
    public void writeValuesData(DataOutputStream dos, org.jboss.marshalling.Marshaller objectOut){
                try {

		
						writeString(this.MANUAL_TEMPLATE, dos, objectOut);
					
						writeString(this.CONCUR, dos, objectOut);
					
						writeString(this.SAP, dos, objectOut);
					
						writeString(this.FINAL_OUTPUT, dos, objectOut);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);
        	}
    }


    
    public boolean supportMarshaller(){
        return true;
    }


    public String toString() {

		StringBuilder sb = new StringBuilder();
		sb.append(super.toString());
		sb.append("[");
		sb.append("MANUAL_TEMPLATE="+MANUAL_TEMPLATE);
		sb.append(",CONCUR="+CONCUR);
		sb.append(",BEACONCRM="+BEACONCRM);
		sb.append(",SAP="+SAP);
		sb.append(",FINAL_OUTPUT="+FINAL_OUTPUT);
	    sb.append("]");

	    return sb.toString();
    }
        public String toLogString(){
        	StringBuilder sb = new StringBuilder();
        	
        				if(MANUAL_TEMPLATE == null){
        					sb.append("<null>");
        				}else{
            				sb.append(MANUAL_TEMPLATE);
            			}
            		
        			sb.append("|");
        		
        				if(CONCUR == null){
        					sb.append("<null>");
        				}else{
            				sb.append(CONCUR);
            			}
            		
        			sb.append("|");
        		
        				if(BEACONCRM == null){
        					sb.append("<null>");
        				}else{
            				sb.append(BEACONCRM);
            			}
            		
        			sb.append("|");
        		
        				if(SAP == null){
        					sb.append("<null>");
        				}else{
            				sb.append(SAP);
            			}
            		
        			sb.append("|");
        		
        				if(FINAL_OUTPUT == null){
        					sb.append("<null>");
        				}else{
            				sb.append(FINAL_OUTPUT);
            			}
            		
        			sb.append("|");
        		
        	return sb.toString();
        }

    /**
     * Compare keys
     */
    public int compareTo(RECIPIENT_STATEStruct other) {

		int returnValue = -1;
		
						returnValue = checkNullsAndCompare(this.BEACONCRM, other.BEACONCRM);
						if(returnValue != 0) {
							return returnValue;
						}

					
	    return returnValue;
    }


    private int checkNullsAndCompare(Object object1, Object object2) {
        int returnValue = 0;
		if (object1 instanceof Comparable && object2 instanceof Comparable) {
            returnValue = ((Comparable) object1).compareTo(object2);
        } else if (object1 != null && object2 != null) {
            returnValue = compareStrings(object1.toString(), object2.toString());
        } else if (object1 == null && object2 != null) {
            returnValue = 1;
        } else if (object1 != null && object2 == null) {
            returnValue = -1;
        } else {
            returnValue = 0;
        }

        return returnValue;
    }

    private int compareStrings(String string1, String string2) {
        return string1.compareTo(string2);
    }


}
public void tDBInput_6Process(final java.util.Map<String, Object> globalMap) throws TalendException {
	globalMap.put("tDBInput_6_SUBPROCESS_STATE", 0);

 final boolean execStat = this.execStat;
	
		String iterateId = "";
	
	
	String currentComponent = "";
	java.util.Map<String, Object> resourceMap = new java.util.HashMap<String, Object>();

	try {
			// TDI-39566 avoid throwing an useless Exception
			boolean resumeIt = true;
			if (globalResumeTicket == false && resumeEntryMethodName != null) {
				String currentMethodName = new java.lang.Exception().getStackTrace()[0].getMethodName();
				resumeIt = resumeEntryMethodName.equals(currentMethodName);
			}
			if (resumeIt || globalResumeTicket) { //start the resume
				globalResumeTicket = true;



		RECIPIENT_STATEStruct RECIPIENT_STATE = new RECIPIENT_STATEStruct();




	
	/**
	 * [tAdvancedHash_RECIPIENT_STATE begin ] start
	 */

	

	
		
		ok_Hash.put("tAdvancedHash_RECIPIENT_STATE", false);
		start_Hash.put("tAdvancedHash_RECIPIENT_STATE", System.currentTimeMillis());
		
	
	currentComponent="tAdvancedHash_RECIPIENT_STATE";

	
			runStat.updateStatAndLog(execStat,enableLogStash,resourceMap,iterateId,0,0,"RECIPIENT_STATE");
			
		int tos_count_tAdvancedHash_RECIPIENT_STATE = 0;
		
			if(enableLogStash) {
				talendJobLog.addCM("tAdvancedHash_RECIPIENT_STATE", "tAdvancedHash_RECIPIENT_STATE", "tAdvancedHash");
				talendJobLogProcess(globalMap);
			}
			

			   		// connection name:RECIPIENT_STATE
			   		// source node:tDBInput_6 - inputs:(after_tDBInput_1) outputs:(RECIPIENT_STATE,RECIPIENT_STATE) | target node:tAdvancedHash_RECIPIENT_STATE - inputs:(RECIPIENT_STATE) outputs:()
			   		// linked node: tMap_1 - inputs:(HCPS,HCPTOINTERACTIONCOM,INTERACTIONSCOM,HCPADDRESSES,PRODUCT,RECIPIENT_STATE,RECIPIENT_COUNTRY,RECIPIENT_TYPE) outputs:(OUTPUT)
			   
			   		org.talend.designer.components.lookup.common.ICommonLookup.MATCHING_MODE matchingModeEnum_RECIPIENT_STATE = 
			   			org.talend.designer.components.lookup.common.ICommonLookup.MATCHING_MODE.UNIQUE_MATCH;
			   			
			   
	   			org.talend.designer.components.lookup.memory.AdvancedMemoryLookup<RECIPIENT_STATEStruct> tHash_Lookup_RECIPIENT_STATE =org.talend.designer.components.lookup.memory.AdvancedMemoryLookup.
	   						<RECIPIENT_STATEStruct>getLookup(matchingModeEnum_RECIPIENT_STATE);
	   						   
		   	   	   globalMap.put("tHash_Lookup_RECIPIENT_STATE", tHash_Lookup_RECIPIENT_STATE);
		   	   	   
				
           

 



/**
 * [tAdvancedHash_RECIPIENT_STATE begin ] stop
 */



	
	/**
	 * [tDBInput_6 begin ] start
	 */

	

	
		
		ok_Hash.put("tDBInput_6", false);
		start_Hash.put("tDBInput_6", System.currentTimeMillis());
		
	
	currentComponent="tDBInput_6";

	
		int tos_count_tDBInput_6 = 0;
		
			if(enableLogStash) {
				talendJobLog.addCM("tDBInput_6", "RECIPIENT_STATE", "tSnowflakeInput");
				talendJobLogProcess(globalMap);
			}
			

boolean doesNodeBelongToRequest_tDBInput_6 = 0 == 0;
@SuppressWarnings("unchecked")
java.util.Map<String, Object> restRequest_tDBInput_6 = (java.util.Map<String, Object>)globalMap.get("restRequest");
String currentTRestRequestOperation_tDBInput_6 = (String)(restRequest_tDBInput_6 != null ? restRequest_tDBInput_6.get("OPERATION") : null);

org.talend.components.api.component.ComponentDefinition def_tDBInput_6 =
        new org.talend.components.snowflake.tsnowflakeinput.TSnowflakeInputDefinition();

org.talend.components.api.component.runtime.Writer writer_tDBInput_6 = null;
org.talend.components.api.component.runtime.Reader reader_tDBInput_6 = null;


org.talend.components.snowflake.tsnowflakeinput.TSnowflakeInputProperties props_tDBInput_6 =
        (org.talend.components.snowflake.tsnowflakeinput.TSnowflakeInputProperties) def_tDBInput_6.createRuntimeProperties();
 		                    props_tDBInput_6.setValue("condition",
 		                    "");
 		                    
 		                    props_tDBInput_6.setValue("manualQuery",
 		                    false);
 		                    
 		                    props_tDBInput_6.setValue("convertColumnsAndTableToUppercase",
 		                    true);
 		                    
 		                    props_tDBInput_6.connection.setValue("useCustomRegion",
 		                    false);
 		                    
 		                    props_tDBInput_6.connection.userPassword.setValue("useAuth",
 		                    false);
 		                    
 		                    props_tDBInput_6.connection.referencedComponent.setValue("referenceType",
 		                        org.talend.components.api.properties.ComponentReferenceProperties.ReferenceType.COMPONENT_INSTANCE);
 		                    
 		                    props_tDBInput_6.connection.referencedComponent.setValue("componentInstanceId",
 		                    "tDBConnection_2");
 		                    
 		                    props_tDBInput_6.connection.referencedComponent.setValue("referenceDefinitionName",
 		                    "tSnowflakeConnection");
 		                    
 		                    props_tDBInput_6.table.setValue("tableName",
 		                    "RECIPIENT_STATE");
 		                    
 		                    props_tDBInput_6.table.connection.setValue("useCustomRegion",
 		                    false);
 		                    
 		                    props_tDBInput_6.table.connection.userPassword.setValue("useAuth",
 		                    false);
 		                    
 		                    props_tDBInput_6.table.connection.referencedComponent.setValue("referenceType",
 		                        org.talend.components.api.properties.ComponentReferenceProperties.ReferenceType.COMPONENT_INSTANCE);
 		                    
 		                    props_tDBInput_6.table.connection.referencedComponent.setValue("componentInstanceId",
 		                    "tDBConnection_2");
 		                    
 		                    props_tDBInput_6.table.connection.referencedComponent.setValue("referenceDefinitionName",
 		                    "tSnowflakeConnection");
 		                    
 		                    class SchemaSettingTool_tDBInput_6_1_fisrt {
 		                    		
 		                    		String getSchemaValue() {
 		                    				
 		                    						StringBuilder s = new StringBuilder();
                    						
     		                    						a("{\"type\":\"record\",",s);
     		                    						
     		                    						a("\"name\":\"RECIPIENT_STATE\",\"fields\":[{",s);
     		                    						
     		                    						a("\"name\":\"MANUAL_TEMPLATE\",\"type\":[\"string\",\"null\"],\"talend.field.length\":\"500\",\"talend.field.dbType\":12,\"talend.field.dbColumnName\":\"MANUAL_TEMPLATE\"},{",s);
     		                    						
     		                    						a("\"name\":\"CONCUR\",\"type\":[\"string\",\"null\"],\"talend.field.length\":\"500\",\"talend.field.dbType\":12,\"talend.field.dbColumnName\":\"CONCUR\"},{",s);
     		                    						
     		                    						a("\"name\":\"BEACONCRM\",\"type\":[\"string\",\"null\"],\"talend.field.length\":\"500\",\"talend.field.dbType\":12,\"talend.field.dbColumnName\":\"BEACONCRM\"},{",s);
     		                    						
     		                    						a("\"name\":\"SAP\",\"type\":[\"string\",\"null\"],\"talend.field.length\":\"500\",\"talend.field.dbType\":12,\"talend.field.dbColumnName\":\"SAP\"},{",s);
     		                    						
     		                    						a("\"name\":\"FINAL_OUTPUT\",\"type\":[\"string\",\"null\"],\"talend.field.length\":\"500\",\"talend.field.dbType\":12,\"talend.field.dbColumnName\":\"FINAL_OUTPUT\"}]}",s);
     		                    						
     		                    				return s.toString();
     		                    		
 		                    		}
 		                    		
 		                    		void a(String part, StringBuilder strB) {
 		                    				strB.append(part);
 		                    		}
 		                    		
 		                    }
 		                    
 		                    SchemaSettingTool_tDBInput_6_1_fisrt sst_tDBInput_6_1_fisrt = new SchemaSettingTool_tDBInput_6_1_fisrt();
 		                    
 		                    props_tDBInput_6.table.main.setValue("schema",
 		                        new org.apache.avro.Schema.Parser().parse(sst_tDBInput_6_1_fisrt.getSchemaValue()));
 		                    
    if (org.talend.components.api.properties.ComponentReferenceProperties.ReferenceType.COMPONENT_INSTANCE == props_tDBInput_6.connection.referencedComponent.referenceType.getValue()) {
        final String referencedComponentInstanceId_tDBInput_6 = props_tDBInput_6.connection.referencedComponent.componentInstanceId.getStringValue();
        if (referencedComponentInstanceId_tDBInput_6 != null) {
            org.talend.daikon.properties.Properties referencedComponentProperties_tDBInput_6 = (org.talend.daikon.properties.Properties) globalMap.get(
                referencedComponentInstanceId_tDBInput_6 + "_COMPONENT_RUNTIME_PROPERTIES");
            props_tDBInput_6.connection.referencedComponent.setReference(referencedComponentProperties_tDBInput_6);
        }
    }
    if (org.talend.components.api.properties.ComponentReferenceProperties.ReferenceType.COMPONENT_INSTANCE == props_tDBInput_6.table.connection.referencedComponent.referenceType.getValue()) {
        final String referencedComponentInstanceId_tDBInput_6 = props_tDBInput_6.table.connection.referencedComponent.componentInstanceId.getStringValue();
        if (referencedComponentInstanceId_tDBInput_6 != null) {
            org.talend.daikon.properties.Properties referencedComponentProperties_tDBInput_6 = (org.talend.daikon.properties.Properties) globalMap.get(
                referencedComponentInstanceId_tDBInput_6 + "_COMPONENT_RUNTIME_PROPERTIES");
            props_tDBInput_6.table.connection.referencedComponent.setReference(referencedComponentProperties_tDBInput_6);
        }
    }
globalMap.put("tDBInput_6_COMPONENT_RUNTIME_PROPERTIES", props_tDBInput_6);
globalMap.putIfAbsent("TALEND_PRODUCT_VERSION", "8.0");
globalMap.put("TALEND_COMPONENTS_VERSION", "0.37.4");
java.net.URL mappings_url_tDBInput_6= this.getClass().getResource("/xmlMappings");
globalMap.put("tDBInput_6_MAPPINGS_URL", mappings_url_tDBInput_6);

org.talend.components.api.container.RuntimeContainer container_tDBInput_6 = new org.talend.components.api.container.RuntimeContainer() {
    public Object getComponentData(String componentId, String key) {
        return globalMap.get(componentId + "_" + key);
    }

    public void setComponentData(String componentId, String key, Object data) {
        globalMap.put(componentId + "_" + key, data);
    }

    public String getCurrentComponentId() {
        return "tDBInput_6";
    }

    public Object getGlobalData(String key) {
    	return globalMap.get(key);
    }
};

int nb_line_tDBInput_6 = 0;

org.talend.components.api.component.ConnectorTopology topology_tDBInput_6 = null;
topology_tDBInput_6 = org.talend.components.api.component.ConnectorTopology.OUTGOING;

org.talend.daikon.runtime.RuntimeInfo runtime_info_tDBInput_6 = def_tDBInput_6.getRuntimeInfo(
    org.talend.components.api.component.runtime.ExecutionEngine.DI, props_tDBInput_6, topology_tDBInput_6);
java.util.Set<org.talend.components.api.component.ConnectorTopology> supported_connector_topologies_tDBInput_6 = def_tDBInput_6.getSupportedConnectorTopologies();

org.talend.components.api.component.runtime.RuntimableRuntime componentRuntime_tDBInput_6 = (org.talend.components.api.component.runtime.RuntimableRuntime)(Class.forName(runtime_info_tDBInput_6.getRuntimeClassName()).newInstance());
org.talend.daikon.properties.ValidationResult initVr_tDBInput_6 = componentRuntime_tDBInput_6.initialize(container_tDBInput_6, props_tDBInput_6);

if (initVr_tDBInput_6.getStatus() == org.talend.daikon.properties.ValidationResult.Result.ERROR ) {
    throw new RuntimeException(initVr_tDBInput_6.getMessage());
}

if(componentRuntime_tDBInput_6 instanceof org.talend.components.api.component.runtime.ComponentDriverInitialization) {
	org.talend.components.api.component.runtime.ComponentDriverInitialization compDriverInitialization_tDBInput_6 = (org.talend.components.api.component.runtime.ComponentDriverInitialization)componentRuntime_tDBInput_6;
	compDriverInitialization_tDBInput_6.runAtDriver(container_tDBInput_6);
}

org.talend.components.api.component.runtime.SourceOrSink sourceOrSink_tDBInput_6 = null;
if(componentRuntime_tDBInput_6 instanceof org.talend.components.api.component.runtime.SourceOrSink) {
	sourceOrSink_tDBInput_6 = (org.talend.components.api.component.runtime.SourceOrSink)componentRuntime_tDBInput_6;
	if (doesNodeBelongToRequest_tDBInput_6) {
        org.talend.daikon.properties.ValidationResult vr_tDBInput_6 = sourceOrSink_tDBInput_6.validate(container_tDBInput_6);
        if (vr_tDBInput_6.getStatus() == org.talend.daikon.properties.ValidationResult.Result.ERROR ) {
            throw new RuntimeException(vr_tDBInput_6.getMessage());
        }
	}
}

    if (sourceOrSink_tDBInput_6 instanceof org.talend.components.api.component.runtime.Source) {
        org.talend.components.api.component.runtime.Source source_tDBInput_6 =
                (org.talend.components.api.component.runtime.Source)sourceOrSink_tDBInput_6;
        reader_tDBInput_6 = source_tDBInput_6.createReader(container_tDBInput_6);
	    reader_tDBInput_6 = new org.talend.codegen.flowvariables.runtime.FlowVariablesReader(reader_tDBInput_6, container_tDBInput_6);

            boolean multi_output_is_allowed_tDBInput_6 = false;
            org.talend.components.api.component.Connector c_tDBInput_6 = null;
            for (org.talend.components.api.component.Connector currentConnector : props_tDBInput_6.getAvailableConnectors(null, true)) {
                if (currentConnector.getName().equals("MAIN")) {
                    c_tDBInput_6 = currentConnector;
                }

                if (currentConnector.getName().equals("REJECT")) {//it's better to move the code to javajet
                    multi_output_is_allowed_tDBInput_6 = true;
                }
            }
            org.apache.avro.Schema schema_tDBInput_6 = props_tDBInput_6.getSchema(c_tDBInput_6, true);

        org.talend.codegen.enforcer.OutgoingSchemaEnforcer outgoingEnforcer_tDBInput_6 = org.talend.codegen.enforcer.EnforcerCreator.createOutgoingEnforcer(schema_tDBInput_6, false);

        // Create a reusable factory that converts the output of the reader to an IndexedRecord.
        org.talend.daikon.avro.converter.IndexedRecordConverter<Object, ? extends org.apache.avro.generic.IndexedRecord> factory_tDBInput_6 = null;

        // Iterate through the incoming data.
        boolean available_tDBInput_6 = reader_tDBInput_6.start();

        resourceMap.put("reader_tDBInput_6", reader_tDBInput_6);

        for (; available_tDBInput_6; available_tDBInput_6 = reader_tDBInput_6.advance()) {
			nb_line_tDBInput_6++;

			
			if (multi_output_is_allowed_tDBInput_6) {
				
					RECIPIENT_STATE = null;
				

				
			}
			

			try {
				Object data_tDBInput_6 = reader_tDBInput_6.getCurrent();
				

					if(multi_output_is_allowed_tDBInput_6) {
						RECIPIENT_STATE = new RECIPIENT_STATEStruct();
					}

					
        // Construct the factory once when the first data arrives.
        if (factory_tDBInput_6 == null) {
            factory_tDBInput_6 = (org.talend.daikon.avro.converter.IndexedRecordConverter<Object, ? extends org.apache.avro.generic.IndexedRecord>)
                    new org.talend.daikon.avro.AvroRegistry()
                            .createIndexedRecordConverter(data_tDBInput_6.getClass());
        }

        // Enforce the outgoing schema on the input.
        outgoingEnforcer_tDBInput_6.setWrapped(factory_tDBInput_6.convertToAvro(data_tDBInput_6));
                Object columnValue_0_tDBInput_6 = outgoingEnforcer_tDBInput_6.get(0);
                        RECIPIENT_STATE.MANUAL_TEMPLATE = (String) (columnValue_0_tDBInput_6);
                Object columnValue_1_tDBInput_6 = outgoingEnforcer_tDBInput_6.get(1);
                        RECIPIENT_STATE.CONCUR = (String) (columnValue_1_tDBInput_6);
                Object columnValue_2_tDBInput_6 = outgoingEnforcer_tDBInput_6.get(2);
                        RECIPIENT_STATE.BEACONCRM = (String) (columnValue_2_tDBInput_6);
                Object columnValue_3_tDBInput_6 = outgoingEnforcer_tDBInput_6.get(3);
                        RECIPIENT_STATE.SAP = (String) (columnValue_3_tDBInput_6);
                Object columnValue_4_tDBInput_6 = outgoingEnforcer_tDBInput_6.get(4);
                        RECIPIENT_STATE.FINAL_OUTPUT = (String) (columnValue_4_tDBInput_6);
			} catch (org.talend.components.api.exception.DataRejectException e_tDBInput_6) {
				java.util.Map<String,Object> info_tDBInput_6 = e_tDBInput_6.getRejectInfo();
				
					//TODO use a method instead of getting method by the special key "error/errorMessage"
					Object errorMessage_tDBInput_6 = null;
					if(info_tDBInput_6.containsKey("error")){
						errorMessage_tDBInput_6 = info_tDBInput_6.get("error");
					}else if(info_tDBInput_6.containsKey("errorMessage")){
						errorMessage_tDBInput_6 = info_tDBInput_6.get("errorMessage");
					}else{
						errorMessage_tDBInput_6 = "Rejected but error message missing";
					}
					errorMessage_tDBInput_6 = "Row "+ nb_line_tDBInput_6 + ": "+errorMessage_tDBInput_6;
					System.err.println(errorMessage_tDBInput_6);
				
					// If the record is reject, the main line record should put NULL
					RECIPIENT_STATE = null;
				
			} // end of catch

                java.lang.Iterable<?> outgoingMainRecordsList_tDBInput_6 = new java.util.ArrayList<Object>();
                java.util.Iterator outgoingMainRecordsIt_tDBInput_6 = null;


 



/**
 * [tDBInput_6 begin ] stop
 */
	
	/**
	 * [tDBInput_6 main ] start
	 */

	

	
	
	currentComponent="tDBInput_6";

	


 


	tos_count_tDBInput_6++;

/**
 * [tDBInput_6 main ] stop
 */
	
	/**
	 * [tDBInput_6 process_data_begin ] start
	 */

	

	
	
	currentComponent="tDBInput_6";

	


 



/**
 * [tDBInput_6 process_data_begin ] stop
 */

	
	/**
	 * [tAdvancedHash_RECIPIENT_STATE main ] start
	 */

	

	
	
	currentComponent="tAdvancedHash_RECIPIENT_STATE";

	
			if(runStat.update(execStat,enableLogStash,iterateId,1,1
				
					,"RECIPIENT_STATE","tDBInput_6","RECIPIENT_STATE","tSnowflakeInput","tAdvancedHash_RECIPIENT_STATE","tAdvancedHash_RECIPIENT_STATE","tAdvancedHash"
				
			)) {
				talendJobLogProcess(globalMap);
			}
			
    			if(log.isTraceEnabled()){
    				log.trace("RECIPIENT_STATE - " + (RECIPIENT_STATE==null? "": RECIPIENT_STATE.toLogString()));
    			}
    		


			   
			   

					RECIPIENT_STATEStruct RECIPIENT_STATE_HashRow = new RECIPIENT_STATEStruct();
		   	   	   
				
				RECIPIENT_STATE_HashRow.MANUAL_TEMPLATE = RECIPIENT_STATE.MANUAL_TEMPLATE;
				
				RECIPIENT_STATE_HashRow.CONCUR = RECIPIENT_STATE.CONCUR;
				
				RECIPIENT_STATE_HashRow.BEACONCRM = RECIPIENT_STATE.BEACONCRM;
				
				RECIPIENT_STATE_HashRow.SAP = RECIPIENT_STATE.SAP;
				
				RECIPIENT_STATE_HashRow.FINAL_OUTPUT = RECIPIENT_STATE.FINAL_OUTPUT;
				
			tHash_Lookup_RECIPIENT_STATE.put(RECIPIENT_STATE_HashRow);
			
            




 


	tos_count_tAdvancedHash_RECIPIENT_STATE++;

/**
 * [tAdvancedHash_RECIPIENT_STATE main ] stop
 */
	
	/**
	 * [tAdvancedHash_RECIPIENT_STATE process_data_begin ] start
	 */

	

	
	
	currentComponent="tAdvancedHash_RECIPIENT_STATE";

	

 



/**
 * [tAdvancedHash_RECIPIENT_STATE process_data_begin ] stop
 */
	
	/**
	 * [tAdvancedHash_RECIPIENT_STATE process_data_end ] start
	 */

	

	
	
	currentComponent="tAdvancedHash_RECIPIENT_STATE";

	

 



/**
 * [tAdvancedHash_RECIPIENT_STATE process_data_end ] stop
 */



	
	/**
	 * [tDBInput_6 process_data_end ] start
	 */

	

	
	
	currentComponent="tDBInput_6";

	


 



/**
 * [tDBInput_6 process_data_end ] stop
 */
	
	/**
	 * [tDBInput_6 end ] start
	 */

	

	
	
	currentComponent="tDBInput_6";

	
// end of generic


resourceMap.put("finish_tDBInput_6", Boolean.TRUE);

    } // while  
    } // end of "if (sourceOrSink_tDBInput_6 instanceof ...Source)"
    java.util.Map<String, Object> resultMap_tDBInput_6 = null;
    if (reader_tDBInput_6 != null) {
        reader_tDBInput_6.close();
        resultMap_tDBInput_6 = reader_tDBInput_6.getReturnValues();
    }
if(resultMap_tDBInput_6!=null) {
	for(java.util.Map.Entry<String,Object> entry_tDBInput_6 : resultMap_tDBInput_6.entrySet()) {
		switch(entry_tDBInput_6.getKey()) {
		case org.talend.components.api.component.ComponentDefinition.RETURN_ERROR_MESSAGE :
			container_tDBInput_6.setComponentData("tDBInput_6", "ERROR_MESSAGE", entry_tDBInput_6.getValue());
			break;
		case org.talend.components.api.component.ComponentDefinition.RETURN_TOTAL_RECORD_COUNT :
			container_tDBInput_6.setComponentData("tDBInput_6", "NB_LINE", entry_tDBInput_6.getValue());
			break;
		case org.talend.components.api.component.ComponentDefinition.RETURN_SUCCESS_RECORD_COUNT :
			container_tDBInput_6.setComponentData("tDBInput_6", "NB_SUCCESS", entry_tDBInput_6.getValue());
			break;
		case org.talend.components.api.component.ComponentDefinition.RETURN_REJECT_RECORD_COUNT :
			container_tDBInput_6.setComponentData("tDBInput_6", "NB_REJECT", entry_tDBInput_6.getValue());
			break;
		default :
            StringBuilder studio_key_tDBInput_6 = new StringBuilder();
            for (int i_tDBInput_6 = 0; i_tDBInput_6 < entry_tDBInput_6.getKey().length(); i_tDBInput_6++) {
                char ch_tDBInput_6 = entry_tDBInput_6.getKey().charAt(i_tDBInput_6);
                if(Character.isUpperCase(ch_tDBInput_6) && i_tDBInput_6> 0) {
                	studio_key_tDBInput_6.append('_');
                }
                studio_key_tDBInput_6.append(ch_tDBInput_6);
            }
			container_tDBInput_6.setComponentData("tDBInput_6", studio_key_tDBInput_6.toString().toUpperCase(java.util.Locale.ENGLISH), entry_tDBInput_6.getValue());
			break;
		}
	}
}

 

ok_Hash.put("tDBInput_6", true);
end_Hash.put("tDBInput_6", System.currentTimeMillis());




/**
 * [tDBInput_6 end ] stop
 */

	
	/**
	 * [tAdvancedHash_RECIPIENT_STATE end ] start
	 */

	

	
	
	currentComponent="tAdvancedHash_RECIPIENT_STATE";

	

tHash_Lookup_RECIPIENT_STATE.endPut();

			 		if(runStat.updateStatAndLog(execStat,enableLogStash,resourceMap,iterateId,"RECIPIENT_STATE",2,0,
			 			"tDBInput_6","RECIPIENT_STATE","tSnowflakeInput","tAdvancedHash_RECIPIENT_STATE","tAdvancedHash_RECIPIENT_STATE","tAdvancedHash","output")) {
						talendJobLogProcess(globalMap);
					}
				
 

ok_Hash.put("tAdvancedHash_RECIPIENT_STATE", true);
end_Hash.put("tAdvancedHash_RECIPIENT_STATE", System.currentTimeMillis());




/**
 * [tAdvancedHash_RECIPIENT_STATE end ] stop
 */



				}//end the resume

				



	
			}catch(java.lang.Exception e){	
				
				    if(!(e instanceof TalendException)){
					   log.fatal(currentComponent + " " + e.getMessage(),e);
					}
				
				TalendException te = new TalendException(e, currentComponent, globalMap);
				
				throw te;
			}catch(java.lang.Error error){	
				
					runStat.stopThreadStat();
				
				throw error;
			}finally{
				
				try{
					
	
	/**
	 * [tDBInput_6 finally ] start
	 */

	

	
	
	currentComponent="tDBInput_6";

	
// finally of generic


if(resourceMap.get("finish_tDBInput_6")==null){
    if(resourceMap.get("reader_tDBInput_6")!=null){
		try {
			((org.talend.components.api.component.runtime.Reader)resourceMap.get("reader_tDBInput_6")).close();
		} catch (java.io.IOException e_tDBInput_6) {
			String errorMessage_tDBInput_6 = "failed to release the resource in tDBInput_6 :" + e_tDBInput_6.getMessage();
			System.err.println(errorMessage_tDBInput_6);
		}
	}
}
 



/**
 * [tDBInput_6 finally ] stop
 */

	
	/**
	 * [tAdvancedHash_RECIPIENT_STATE finally ] start
	 */

	

	
	
	currentComponent="tAdvancedHash_RECIPIENT_STATE";

	

 



/**
 * [tAdvancedHash_RECIPIENT_STATE finally ] stop
 */



				}catch(java.lang.Exception e){	
					//ignore
				}catch(java.lang.Error error){
					//ignore
				}
				resourceMap = null;
			}
		

		globalMap.put("tDBInput_6_SUBPROCESS_STATE", 1);
	}
	


public static class RECIPIENT_COUNTRYStruct implements routines.system.IPersistableComparableLookupRow<RECIPIENT_COUNTRYStruct> {
    final static byte[] commonByteArrayLock_USCOMM_SUNSHINE_RPT_QA_BEACON_EXTRACT_SNOWFLAKE = new byte[0];
    static byte[] commonByteArray_USCOMM_SUNSHINE_RPT_QA_BEACON_EXTRACT_SNOWFLAKE = new byte[0];
	protected static final int DEFAULT_HASHCODE = 1;
    protected static final int PRIME = 31;
    protected int hashCode = DEFAULT_HASHCODE;
    public boolean hashCodeDirty = true;

    public String loopKey;



	
			    public String MANUAL_TEMPLATE;

				public String getMANUAL_TEMPLATE () {
					return this.MANUAL_TEMPLATE;
				}

				public Boolean MANUAL_TEMPLATEIsNullable(){
				    return true;
				}
				public Boolean MANUAL_TEMPLATEIsKey(){
				    return false;
				}
				public Integer MANUAL_TEMPLATELength(){
				    return 500;
				}
				public Integer MANUAL_TEMPLATEPrecision(){
				    return null;
				}
				public String MANUAL_TEMPLATEDefault(){
				
					return null;
				
				}
				public String MANUAL_TEMPLATEComment(){
				
				    return "";
				
				}
				public String MANUAL_TEMPLATEPattern(){
				
					return "";
				
				}
				public String MANUAL_TEMPLATEOriginalDbColumnName(){
				
					return "MANUAL_TEMPLATE";
				
				}

				
			    public String CONCUR;

				public String getCONCUR () {
					return this.CONCUR;
				}

				public Boolean CONCURIsNullable(){
				    return true;
				}
				public Boolean CONCURIsKey(){
				    return false;
				}
				public Integer CONCURLength(){
				    return 500;
				}
				public Integer CONCURPrecision(){
				    return null;
				}
				public String CONCURDefault(){
				
					return null;
				
				}
				public String CONCURComment(){
				
				    return "";
				
				}
				public String CONCURPattern(){
				
					return "";
				
				}
				public String CONCUROriginalDbColumnName(){
				
					return "CONCUR";
				
				}

				
			    public String BEACONCRM;

				public String getBEACONCRM () {
					return this.BEACONCRM;
				}

				public Boolean BEACONCRMIsNullable(){
				    return true;
				}
				public Boolean BEACONCRMIsKey(){
				    return false;
				}
				public Integer BEACONCRMLength(){
				    return 500;
				}
				public Integer BEACONCRMPrecision(){
				    return null;
				}
				public String BEACONCRMDefault(){
				
					return null;
				
				}
				public String BEACONCRMComment(){
				
				    return "";
				
				}
				public String BEACONCRMPattern(){
				
					return "";
				
				}
				public String BEACONCRMOriginalDbColumnName(){
				
					return "BEACONCRM";
				
				}

				
			    public String SAP;

				public String getSAP () {
					return this.SAP;
				}

				public Boolean SAPIsNullable(){
				    return true;
				}
				public Boolean SAPIsKey(){
				    return false;
				}
				public Integer SAPLength(){
				    return 500;
				}
				public Integer SAPPrecision(){
				    return null;
				}
				public String SAPDefault(){
				
					return null;
				
				}
				public String SAPComment(){
				
				    return "";
				
				}
				public String SAPPattern(){
				
					return "";
				
				}
				public String SAPOriginalDbColumnName(){
				
					return "SAP";
				
				}

				
			    public String FINAL_OUTPUT;

				public String getFINAL_OUTPUT () {
					return this.FINAL_OUTPUT;
				}

				public Boolean FINAL_OUTPUTIsNullable(){
				    return true;
				}
				public Boolean FINAL_OUTPUTIsKey(){
				    return false;
				}
				public Integer FINAL_OUTPUTLength(){
				    return 500;
				}
				public Integer FINAL_OUTPUTPrecision(){
				    return null;
				}
				public String FINAL_OUTPUTDefault(){
				
					return null;
				
				}
				public String FINAL_OUTPUTComment(){
				
				    return "";
				
				}
				public String FINAL_OUTPUTPattern(){
				
					return "";
				
				}
				public String FINAL_OUTPUTOriginalDbColumnName(){
				
					return "FINAL_OUTPUT";
				
				}

				


	@Override
	public int hashCode() {
		if (this.hashCodeDirty) {
			final int prime = PRIME;
			int result = DEFAULT_HASHCODE;
	
						result = prime * result + ((this.BEACONCRM == null) ? 0 : this.BEACONCRM.hashCode());
					
    		this.hashCode = result;
    		this.hashCodeDirty = false;
		}
		return this.hashCode;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) return true;
		if (obj == null) return false;
		if (getClass() != obj.getClass()) return false;
		final RECIPIENT_COUNTRYStruct other = (RECIPIENT_COUNTRYStruct) obj;
		
						if (this.BEACONCRM == null) {
							if (other.BEACONCRM != null)
								return false;
						
						} else if (!this.BEACONCRM.equals(other.BEACONCRM))
						
							return false;
					

		return true;
    }

	public void copyDataTo(RECIPIENT_COUNTRYStruct other) {

		other.MANUAL_TEMPLATE = this.MANUAL_TEMPLATE;
	            other.CONCUR = this.CONCUR;
	            other.BEACONCRM = this.BEACONCRM;
	            other.SAP = this.SAP;
	            other.FINAL_OUTPUT = this.FINAL_OUTPUT;
	            
	}

	public void copyKeysDataTo(RECIPIENT_COUNTRYStruct other) {

		other.BEACONCRM = this.BEACONCRM;
	            	
	}



	
	private String readString(DataInputStream dis, ObjectInputStream ois) throws IOException{
		String strReturn = null;
		int length = 0;
        length = dis.readInt();
		if (length == -1) {
			strReturn = null;
		} else {
			byte[] byteArray = new byte[length];
			dis.read(byteArray);
			strReturn = new String(byteArray, utf8Charset);
		}
		return strReturn;
	}
	
	private String readString(DataInputStream dis, org.jboss.marshalling.Unmarshaller unmarshaller) throws IOException{
		String strReturn = null;
		int length = 0;
        length = unmarshaller.readInt();
		if (length == -1) {
			strReturn = null;
		} else {
			byte[] byteArray = new byte[length];
			unmarshaller.read(byteArray);
			strReturn = new String(byteArray, utf8Charset);
		}
		return strReturn;
	}
	
	private void writeString(String str, DataOutputStream dos, org.jboss.marshalling.Marshaller marshaller) throws IOException{
		if(str == null) {
			marshaller.writeInt(-1);
		} else {
            byte[] byteArray = str.getBytes(utf8Charset);
            marshaller.writeInt(byteArray.length);
            marshaller.write(byteArray);
    	}
	}

	private void writeString(String str, DataOutputStream dos, ObjectOutputStream oos) throws IOException{
		if(str == null) {
            dos.writeInt(-1);
		} else {
            byte[] byteArray = str.getBytes(utf8Charset);
	    	dos.writeInt(byteArray.length);
			dos.write(byteArray);
    	}
	}

	private String readString(ObjectInputStream dis) throws IOException{
		String strReturn = null;
		int length = 0;
        length = dis.readInt();
		if (length == -1) {
			strReturn = null;
		} else {
			if(length > commonByteArray_USCOMM_SUNSHINE_RPT_QA_BEACON_EXTRACT_SNOWFLAKE.length) {
				if(length < 1024 && commonByteArray_USCOMM_SUNSHINE_RPT_QA_BEACON_EXTRACT_SNOWFLAKE.length == 0) {
   					commonByteArray_USCOMM_SUNSHINE_RPT_QA_BEACON_EXTRACT_SNOWFLAKE = new byte[1024];
				} else {
   					commonByteArray_USCOMM_SUNSHINE_RPT_QA_BEACON_EXTRACT_SNOWFLAKE = new byte[2 * length];
   				}
			}
			dis.readFully(commonByteArray_USCOMM_SUNSHINE_RPT_QA_BEACON_EXTRACT_SNOWFLAKE, 0, length);
			strReturn = new String(commonByteArray_USCOMM_SUNSHINE_RPT_QA_BEACON_EXTRACT_SNOWFLAKE, 0, length, utf8Charset);
		}
		return strReturn;
	}
	
	private String readString(org.jboss.marshalling.Unmarshaller unmarshaller) throws IOException{
		String strReturn = null;
		int length = 0;
        length = unmarshaller.readInt();
		if (length == -1) {
			strReturn = null;
		} else {
			if(length > commonByteArray_USCOMM_SUNSHINE_RPT_QA_BEACON_EXTRACT_SNOWFLAKE.length) {
				if(length < 1024 && commonByteArray_USCOMM_SUNSHINE_RPT_QA_BEACON_EXTRACT_SNOWFLAKE.length == 0) {
   					commonByteArray_USCOMM_SUNSHINE_RPT_QA_BEACON_EXTRACT_SNOWFLAKE = new byte[1024];
				} else {
   					commonByteArray_USCOMM_SUNSHINE_RPT_QA_BEACON_EXTRACT_SNOWFLAKE = new byte[2 * length];
   				}
			}
			unmarshaller.readFully(commonByteArray_USCOMM_SUNSHINE_RPT_QA_BEACON_EXTRACT_SNOWFLAKE, 0, length);
			strReturn = new String(commonByteArray_USCOMM_SUNSHINE_RPT_QA_BEACON_EXTRACT_SNOWFLAKE, 0, length, utf8Charset);
		}
		return strReturn;
	}

    private void writeString(String str, ObjectOutputStream dos) throws IOException{
		if(str == null) {
            dos.writeInt(-1);
		} else {
            byte[] byteArray = str.getBytes(utf8Charset);
	    	dos.writeInt(byteArray.length);
			dos.write(byteArray);
    	}
    }
    
    private void writeString(String str, org.jboss.marshalling.Marshaller marshaller) throws IOException{
		if(str == null) {
			marshaller.writeInt(-1);
		} else {
            byte[] byteArray = str.getBytes(utf8Charset);
            marshaller.writeInt(byteArray.length);
            marshaller.write(byteArray);
    	}
    }

    public void readKeysData(ObjectInputStream dis) {

		synchronized(commonByteArrayLock_USCOMM_SUNSHINE_RPT_QA_BEACON_EXTRACT_SNOWFLAKE) {

        	try {

        		int length = 0;
		
					this.BEACONCRM = readString(dis);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);

		

        }

		

      }


    }
    
    public void readKeysData(org.jboss.marshalling.Unmarshaller dis) {

		synchronized(commonByteArrayLock_USCOMM_SUNSHINE_RPT_QA_BEACON_EXTRACT_SNOWFLAKE) {

        	try {

        		int length = 0;
		
					this.BEACONCRM = readString(dis);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);

		

        }

		

      }


    }

    public void writeKeysData(ObjectOutputStream dos) {
        try {

		
					// String
				
						writeString(this.BEACONCRM,dos);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);
        }


    }
    
    public void writeKeysData(org.jboss.marshalling.Marshaller dos) {
        try {

		
					// String
				
						writeString(this.BEACONCRM,dos);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);
        }


    }



    /**
     * Fill Values data by reading ObjectInputStream.
     */
    public void readValuesData(DataInputStream dis, ObjectInputStream ois) {
        try {

			int length = 0;
		
						this.MANUAL_TEMPLATE = readString(dis,ois);
					
						this.CONCUR = readString(dis,ois);
					
						this.SAP = readString(dis,ois);
					
						this.FINAL_OUTPUT = readString(dis,ois);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);

		

        }

		

    }
    
    public void readValuesData(DataInputStream dis, org.jboss.marshalling.Unmarshaller objectIn) {
        try {
			int length = 0;
		
						this.MANUAL_TEMPLATE = readString(dis,objectIn);
					
						this.CONCUR = readString(dis,objectIn);
					
						this.SAP = readString(dis,objectIn);
					
						this.FINAL_OUTPUT = readString(dis,objectIn);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);

		

        }

		

    }

    /**
     * Return a byte array which represents Values data.
     */
    public void writeValuesData(DataOutputStream dos, ObjectOutputStream oos) {
        try {

		
						writeString(this.MANUAL_TEMPLATE, dos, oos);
					
						writeString(this.CONCUR, dos, oos);
					
						writeString(this.SAP, dos, oos);
					
						writeString(this.FINAL_OUTPUT, dos, oos);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);
        	}

    }
    
    public void writeValuesData(DataOutputStream dos, org.jboss.marshalling.Marshaller objectOut){
                try {

		
						writeString(this.MANUAL_TEMPLATE, dos, objectOut);
					
						writeString(this.CONCUR, dos, objectOut);
					
						writeString(this.SAP, dos, objectOut);
					
						writeString(this.FINAL_OUTPUT, dos, objectOut);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);
        	}
    }


    
    public boolean supportMarshaller(){
        return true;
    }


    public String toString() {

		StringBuilder sb = new StringBuilder();
		sb.append(super.toString());
		sb.append("[");
		sb.append("MANUAL_TEMPLATE="+MANUAL_TEMPLATE);
		sb.append(",CONCUR="+CONCUR);
		sb.append(",BEACONCRM="+BEACONCRM);
		sb.append(",SAP="+SAP);
		sb.append(",FINAL_OUTPUT="+FINAL_OUTPUT);
	    sb.append("]");

	    return sb.toString();
    }
        public String toLogString(){
        	StringBuilder sb = new StringBuilder();
        	
        				if(MANUAL_TEMPLATE == null){
        					sb.append("<null>");
        				}else{
            				sb.append(MANUAL_TEMPLATE);
            			}
            		
        			sb.append("|");
        		
        				if(CONCUR == null){
        					sb.append("<null>");
        				}else{
            				sb.append(CONCUR);
            			}
            		
        			sb.append("|");
        		
        				if(BEACONCRM == null){
        					sb.append("<null>");
        				}else{
            				sb.append(BEACONCRM);
            			}
            		
        			sb.append("|");
        		
        				if(SAP == null){
        					sb.append("<null>");
        				}else{
            				sb.append(SAP);
            			}
            		
        			sb.append("|");
        		
        				if(FINAL_OUTPUT == null){
        					sb.append("<null>");
        				}else{
            				sb.append(FINAL_OUTPUT);
            			}
            		
        			sb.append("|");
        		
        	return sb.toString();
        }

    /**
     * Compare keys
     */
    public int compareTo(RECIPIENT_COUNTRYStruct other) {

		int returnValue = -1;
		
						returnValue = checkNullsAndCompare(this.BEACONCRM, other.BEACONCRM);
						if(returnValue != 0) {
							return returnValue;
						}

					
	    return returnValue;
    }


    private int checkNullsAndCompare(Object object1, Object object2) {
        int returnValue = 0;
		if (object1 instanceof Comparable && object2 instanceof Comparable) {
            returnValue = ((Comparable) object1).compareTo(object2);
        } else if (object1 != null && object2 != null) {
            returnValue = compareStrings(object1.toString(), object2.toString());
        } else if (object1 == null && object2 != null) {
            returnValue = 1;
        } else if (object1 != null && object2 == null) {
            returnValue = -1;
        } else {
            returnValue = 0;
        }

        return returnValue;
    }

    private int compareStrings(String string1, String string2) {
        return string1.compareTo(string2);
    }


}
public void tDBInput_7Process(final java.util.Map<String, Object> globalMap) throws TalendException {
	globalMap.put("tDBInput_7_SUBPROCESS_STATE", 0);

 final boolean execStat = this.execStat;
	
		String iterateId = "";
	
	
	String currentComponent = "";
	java.util.Map<String, Object> resourceMap = new java.util.HashMap<String, Object>();

	try {
			// TDI-39566 avoid throwing an useless Exception
			boolean resumeIt = true;
			if (globalResumeTicket == false && resumeEntryMethodName != null) {
				String currentMethodName = new java.lang.Exception().getStackTrace()[0].getMethodName();
				resumeIt = resumeEntryMethodName.equals(currentMethodName);
			}
			if (resumeIt || globalResumeTicket) { //start the resume
				globalResumeTicket = true;



		RECIPIENT_COUNTRYStruct RECIPIENT_COUNTRY = new RECIPIENT_COUNTRYStruct();




	
	/**
	 * [tAdvancedHash_RECIPIENT_COUNTRY begin ] start
	 */

	

	
		
		ok_Hash.put("tAdvancedHash_RECIPIENT_COUNTRY", false);
		start_Hash.put("tAdvancedHash_RECIPIENT_COUNTRY", System.currentTimeMillis());
		
	
	currentComponent="tAdvancedHash_RECIPIENT_COUNTRY";

	
			runStat.updateStatAndLog(execStat,enableLogStash,resourceMap,iterateId,0,0,"RECIPIENT_COUNTRY");
			
		int tos_count_tAdvancedHash_RECIPIENT_COUNTRY = 0;
		
			if(enableLogStash) {
				talendJobLog.addCM("tAdvancedHash_RECIPIENT_COUNTRY", "tAdvancedHash_RECIPIENT_COUNTRY", "tAdvancedHash");
				talendJobLogProcess(globalMap);
			}
			

			   		// connection name:RECIPIENT_COUNTRY
			   		// source node:tDBInput_7 - inputs:(after_tDBInput_1) outputs:(RECIPIENT_COUNTRY,RECIPIENT_COUNTRY) | target node:tAdvancedHash_RECIPIENT_COUNTRY - inputs:(RECIPIENT_COUNTRY) outputs:()
			   		// linked node: tMap_1 - inputs:(HCPS,HCPTOINTERACTIONCOM,INTERACTIONSCOM,HCPADDRESSES,PRODUCT,RECIPIENT_STATE,RECIPIENT_COUNTRY,RECIPIENT_TYPE) outputs:(OUTPUT)
			   
			   		org.talend.designer.components.lookup.common.ICommonLookup.MATCHING_MODE matchingModeEnum_RECIPIENT_COUNTRY = 
			   			org.talend.designer.components.lookup.common.ICommonLookup.MATCHING_MODE.UNIQUE_MATCH;
			   			
			   
	   			org.talend.designer.components.lookup.memory.AdvancedMemoryLookup<RECIPIENT_COUNTRYStruct> tHash_Lookup_RECIPIENT_COUNTRY =org.talend.designer.components.lookup.memory.AdvancedMemoryLookup.
	   						<RECIPIENT_COUNTRYStruct>getLookup(matchingModeEnum_RECIPIENT_COUNTRY);
	   						   
		   	   	   globalMap.put("tHash_Lookup_RECIPIENT_COUNTRY", tHash_Lookup_RECIPIENT_COUNTRY);
		   	   	   
				
           

 



/**
 * [tAdvancedHash_RECIPIENT_COUNTRY begin ] stop
 */



	
	/**
	 * [tDBInput_7 begin ] start
	 */

	

	
		
		ok_Hash.put("tDBInput_7", false);
		start_Hash.put("tDBInput_7", System.currentTimeMillis());
		
	
	currentComponent="tDBInput_7";

	
		int tos_count_tDBInput_7 = 0;
		
			if(enableLogStash) {
				talendJobLog.addCM("tDBInput_7", "RECIPIENT_COUNTRY", "tSnowflakeInput");
				talendJobLogProcess(globalMap);
			}
			

boolean doesNodeBelongToRequest_tDBInput_7 = 0 == 0;
@SuppressWarnings("unchecked")
java.util.Map<String, Object> restRequest_tDBInput_7 = (java.util.Map<String, Object>)globalMap.get("restRequest");
String currentTRestRequestOperation_tDBInput_7 = (String)(restRequest_tDBInput_7 != null ? restRequest_tDBInput_7.get("OPERATION") : null);

org.talend.components.api.component.ComponentDefinition def_tDBInput_7 =
        new org.talend.components.snowflake.tsnowflakeinput.TSnowflakeInputDefinition();

org.talend.components.api.component.runtime.Writer writer_tDBInput_7 = null;
org.talend.components.api.component.runtime.Reader reader_tDBInput_7 = null;


org.talend.components.snowflake.tsnowflakeinput.TSnowflakeInputProperties props_tDBInput_7 =
        (org.talend.components.snowflake.tsnowflakeinput.TSnowflakeInputProperties) def_tDBInput_7.createRuntimeProperties();
 		                    props_tDBInput_7.setValue("condition",
 		                    "");
 		                    
 		                    props_tDBInput_7.setValue("manualQuery",
 		                    false);
 		                    
 		                    props_tDBInput_7.setValue("convertColumnsAndTableToUppercase",
 		                    true);
 		                    
 		                    props_tDBInput_7.connection.setValue("useCustomRegion",
 		                    false);
 		                    
 		                    props_tDBInput_7.connection.userPassword.setValue("useAuth",
 		                    false);
 		                    
 		                    props_tDBInput_7.connection.referencedComponent.setValue("referenceType",
 		                        org.talend.components.api.properties.ComponentReferenceProperties.ReferenceType.COMPONENT_INSTANCE);
 		                    
 		                    props_tDBInput_7.connection.referencedComponent.setValue("componentInstanceId",
 		                    "tDBConnection_2");
 		                    
 		                    props_tDBInput_7.connection.referencedComponent.setValue("referenceDefinitionName",
 		                    "tSnowflakeConnection");
 		                    
 		                    props_tDBInput_7.table.setValue("tableName",
 		                    "RECIPIENT_COUNTRY");
 		                    
 		                    props_tDBInput_7.table.connection.setValue("useCustomRegion",
 		                    false);
 		                    
 		                    props_tDBInput_7.table.connection.userPassword.setValue("useAuth",
 		                    false);
 		                    
 		                    props_tDBInput_7.table.connection.referencedComponent.setValue("referenceType",
 		                        org.talend.components.api.properties.ComponentReferenceProperties.ReferenceType.COMPONENT_INSTANCE);
 		                    
 		                    props_tDBInput_7.table.connection.referencedComponent.setValue("componentInstanceId",
 		                    "tDBConnection_2");
 		                    
 		                    props_tDBInput_7.table.connection.referencedComponent.setValue("referenceDefinitionName",
 		                    "tSnowflakeConnection");
 		                    
 		                    class SchemaSettingTool_tDBInput_7_1_fisrt {
 		                    		
 		                    		String getSchemaValue() {
 		                    				
 		                    						StringBuilder s = new StringBuilder();
                    						
     		                    						a("{\"type\":\"record\",",s);
     		                    						
     		                    						a("\"name\":\"RECIPIENT_COUNTRY\",\"fields\":[{",s);
     		                    						
     		                    						a("\"name\":\"MANUAL_TEMPLATE\",\"type\":[\"string\",\"null\"],\"talend.field.length\":\"500\",\"talend.field.dbType\":12,\"talend.field.dbColumnName\":\"MANUAL_TEMPLATE\"},{",s);
     		                    						
     		                    						a("\"name\":\"CONCUR\",\"type\":[\"string\",\"null\"],\"talend.field.length\":\"500\",\"talend.field.dbType\":12,\"talend.field.dbColumnName\":\"CONCUR\"},{",s);
     		                    						
     		                    						a("\"name\":\"BEACONCRM\",\"type\":[\"string\",\"null\"],\"talend.field.length\":\"500\",\"talend.field.dbType\":12,\"talend.field.dbColumnName\":\"BEACONCRM\"},{",s);
     		                    						
     		                    						a("\"name\":\"SAP\",\"type\":[\"string\",\"null\"],\"talend.field.length\":\"500\",\"talend.field.dbType\":12,\"talend.field.dbColumnName\":\"SAP\"},{",s);
     		                    						
     		                    						a("\"name\":\"FINAL_OUTPUT\",\"type\":[\"string\",\"null\"],\"talend.field.length\":\"500\",\"talend.field.dbType\":12,\"talend.field.dbColumnName\":\"FINAL_OUTPUT\"}]}",s);
     		                    						
     		                    				return s.toString();
     		                    		
 		                    		}
 		                    		
 		                    		void a(String part, StringBuilder strB) {
 		                    				strB.append(part);
 		                    		}
 		                    		
 		                    }
 		                    
 		                    SchemaSettingTool_tDBInput_7_1_fisrt sst_tDBInput_7_1_fisrt = new SchemaSettingTool_tDBInput_7_1_fisrt();
 		                    
 		                    props_tDBInput_7.table.main.setValue("schema",
 		                        new org.apache.avro.Schema.Parser().parse(sst_tDBInput_7_1_fisrt.getSchemaValue()));
 		                    
    if (org.talend.components.api.properties.ComponentReferenceProperties.ReferenceType.COMPONENT_INSTANCE == props_tDBInput_7.connection.referencedComponent.referenceType.getValue()) {
        final String referencedComponentInstanceId_tDBInput_7 = props_tDBInput_7.connection.referencedComponent.componentInstanceId.getStringValue();
        if (referencedComponentInstanceId_tDBInput_7 != null) {
            org.talend.daikon.properties.Properties referencedComponentProperties_tDBInput_7 = (org.talend.daikon.properties.Properties) globalMap.get(
                referencedComponentInstanceId_tDBInput_7 + "_COMPONENT_RUNTIME_PROPERTIES");
            props_tDBInput_7.connection.referencedComponent.setReference(referencedComponentProperties_tDBInput_7);
        }
    }
    if (org.talend.components.api.properties.ComponentReferenceProperties.ReferenceType.COMPONENT_INSTANCE == props_tDBInput_7.table.connection.referencedComponent.referenceType.getValue()) {
        final String referencedComponentInstanceId_tDBInput_7 = props_tDBInput_7.table.connection.referencedComponent.componentInstanceId.getStringValue();
        if (referencedComponentInstanceId_tDBInput_7 != null) {
            org.talend.daikon.properties.Properties referencedComponentProperties_tDBInput_7 = (org.talend.daikon.properties.Properties) globalMap.get(
                referencedComponentInstanceId_tDBInput_7 + "_COMPONENT_RUNTIME_PROPERTIES");
            props_tDBInput_7.table.connection.referencedComponent.setReference(referencedComponentProperties_tDBInput_7);
        }
    }
globalMap.put("tDBInput_7_COMPONENT_RUNTIME_PROPERTIES", props_tDBInput_7);
globalMap.putIfAbsent("TALEND_PRODUCT_VERSION", "8.0");
globalMap.put("TALEND_COMPONENTS_VERSION", "0.37.4");
java.net.URL mappings_url_tDBInput_7= this.getClass().getResource("/xmlMappings");
globalMap.put("tDBInput_7_MAPPINGS_URL", mappings_url_tDBInput_7);

org.talend.components.api.container.RuntimeContainer container_tDBInput_7 = new org.talend.components.api.container.RuntimeContainer() {
    public Object getComponentData(String componentId, String key) {
        return globalMap.get(componentId + "_" + key);
    }

    public void setComponentData(String componentId, String key, Object data) {
        globalMap.put(componentId + "_" + key, data);
    }

    public String getCurrentComponentId() {
        return "tDBInput_7";
    }

    public Object getGlobalData(String key) {
    	return globalMap.get(key);
    }
};

int nb_line_tDBInput_7 = 0;

org.talend.components.api.component.ConnectorTopology topology_tDBInput_7 = null;
topology_tDBInput_7 = org.talend.components.api.component.ConnectorTopology.OUTGOING;

org.talend.daikon.runtime.RuntimeInfo runtime_info_tDBInput_7 = def_tDBInput_7.getRuntimeInfo(
    org.talend.components.api.component.runtime.ExecutionEngine.DI, props_tDBInput_7, topology_tDBInput_7);
java.util.Set<org.talend.components.api.component.ConnectorTopology> supported_connector_topologies_tDBInput_7 = def_tDBInput_7.getSupportedConnectorTopologies();

org.talend.components.api.component.runtime.RuntimableRuntime componentRuntime_tDBInput_7 = (org.talend.components.api.component.runtime.RuntimableRuntime)(Class.forName(runtime_info_tDBInput_7.getRuntimeClassName()).newInstance());
org.talend.daikon.properties.ValidationResult initVr_tDBInput_7 = componentRuntime_tDBInput_7.initialize(container_tDBInput_7, props_tDBInput_7);

if (initVr_tDBInput_7.getStatus() == org.talend.daikon.properties.ValidationResult.Result.ERROR ) {
    throw new RuntimeException(initVr_tDBInput_7.getMessage());
}

if(componentRuntime_tDBInput_7 instanceof org.talend.components.api.component.runtime.ComponentDriverInitialization) {
	org.talend.components.api.component.runtime.ComponentDriverInitialization compDriverInitialization_tDBInput_7 = (org.talend.components.api.component.runtime.ComponentDriverInitialization)componentRuntime_tDBInput_7;
	compDriverInitialization_tDBInput_7.runAtDriver(container_tDBInput_7);
}

org.talend.components.api.component.runtime.SourceOrSink sourceOrSink_tDBInput_7 = null;
if(componentRuntime_tDBInput_7 instanceof org.talend.components.api.component.runtime.SourceOrSink) {
	sourceOrSink_tDBInput_7 = (org.talend.components.api.component.runtime.SourceOrSink)componentRuntime_tDBInput_7;
	if (doesNodeBelongToRequest_tDBInput_7) {
        org.talend.daikon.properties.ValidationResult vr_tDBInput_7 = sourceOrSink_tDBInput_7.validate(container_tDBInput_7);
        if (vr_tDBInput_7.getStatus() == org.talend.daikon.properties.ValidationResult.Result.ERROR ) {
            throw new RuntimeException(vr_tDBInput_7.getMessage());
        }
	}
}

    if (sourceOrSink_tDBInput_7 instanceof org.talend.components.api.component.runtime.Source) {
        org.talend.components.api.component.runtime.Source source_tDBInput_7 =
                (org.talend.components.api.component.runtime.Source)sourceOrSink_tDBInput_7;
        reader_tDBInput_7 = source_tDBInput_7.createReader(container_tDBInput_7);
	    reader_tDBInput_7 = new org.talend.codegen.flowvariables.runtime.FlowVariablesReader(reader_tDBInput_7, container_tDBInput_7);

            boolean multi_output_is_allowed_tDBInput_7 = false;
            org.talend.components.api.component.Connector c_tDBInput_7 = null;
            for (org.talend.components.api.component.Connector currentConnector : props_tDBInput_7.getAvailableConnectors(null, true)) {
                if (currentConnector.getName().equals("MAIN")) {
                    c_tDBInput_7 = currentConnector;
                }

                if (currentConnector.getName().equals("REJECT")) {//it's better to move the code to javajet
                    multi_output_is_allowed_tDBInput_7 = true;
                }
            }
            org.apache.avro.Schema schema_tDBInput_7 = props_tDBInput_7.getSchema(c_tDBInput_7, true);

        org.talend.codegen.enforcer.OutgoingSchemaEnforcer outgoingEnforcer_tDBInput_7 = org.talend.codegen.enforcer.EnforcerCreator.createOutgoingEnforcer(schema_tDBInput_7, false);

        // Create a reusable factory that converts the output of the reader to an IndexedRecord.
        org.talend.daikon.avro.converter.IndexedRecordConverter<Object, ? extends org.apache.avro.generic.IndexedRecord> factory_tDBInput_7 = null;

        // Iterate through the incoming data.
        boolean available_tDBInput_7 = reader_tDBInput_7.start();

        resourceMap.put("reader_tDBInput_7", reader_tDBInput_7);

        for (; available_tDBInput_7; available_tDBInput_7 = reader_tDBInput_7.advance()) {
			nb_line_tDBInput_7++;

			
			if (multi_output_is_allowed_tDBInput_7) {
				
					RECIPIENT_COUNTRY = null;
				

				
			}
			

			try {
				Object data_tDBInput_7 = reader_tDBInput_7.getCurrent();
				

					if(multi_output_is_allowed_tDBInput_7) {
						RECIPIENT_COUNTRY = new RECIPIENT_COUNTRYStruct();
					}

					
        // Construct the factory once when the first data arrives.
        if (factory_tDBInput_7 == null) {
            factory_tDBInput_7 = (org.talend.daikon.avro.converter.IndexedRecordConverter<Object, ? extends org.apache.avro.generic.IndexedRecord>)
                    new org.talend.daikon.avro.AvroRegistry()
                            .createIndexedRecordConverter(data_tDBInput_7.getClass());
        }

        // Enforce the outgoing schema on the input.
        outgoingEnforcer_tDBInput_7.setWrapped(factory_tDBInput_7.convertToAvro(data_tDBInput_7));
                Object columnValue_0_tDBInput_7 = outgoingEnforcer_tDBInput_7.get(0);
                        RECIPIENT_COUNTRY.MANUAL_TEMPLATE = (String) (columnValue_0_tDBInput_7);
                Object columnValue_1_tDBInput_7 = outgoingEnforcer_tDBInput_7.get(1);
                        RECIPIENT_COUNTRY.CONCUR = (String) (columnValue_1_tDBInput_7);
                Object columnValue_2_tDBInput_7 = outgoingEnforcer_tDBInput_7.get(2);
                        RECIPIENT_COUNTRY.BEACONCRM = (String) (columnValue_2_tDBInput_7);
                Object columnValue_3_tDBInput_7 = outgoingEnforcer_tDBInput_7.get(3);
                        RECIPIENT_COUNTRY.SAP = (String) (columnValue_3_tDBInput_7);
                Object columnValue_4_tDBInput_7 = outgoingEnforcer_tDBInput_7.get(4);
                        RECIPIENT_COUNTRY.FINAL_OUTPUT = (String) (columnValue_4_tDBInput_7);
			} catch (org.talend.components.api.exception.DataRejectException e_tDBInput_7) {
				java.util.Map<String,Object> info_tDBInput_7 = e_tDBInput_7.getRejectInfo();
				
					//TODO use a method instead of getting method by the special key "error/errorMessage"
					Object errorMessage_tDBInput_7 = null;
					if(info_tDBInput_7.containsKey("error")){
						errorMessage_tDBInput_7 = info_tDBInput_7.get("error");
					}else if(info_tDBInput_7.containsKey("errorMessage")){
						errorMessage_tDBInput_7 = info_tDBInput_7.get("errorMessage");
					}else{
						errorMessage_tDBInput_7 = "Rejected but error message missing";
					}
					errorMessage_tDBInput_7 = "Row "+ nb_line_tDBInput_7 + ": "+errorMessage_tDBInput_7;
					System.err.println(errorMessage_tDBInput_7);
				
					// If the record is reject, the main line record should put NULL
					RECIPIENT_COUNTRY = null;
				
			} // end of catch

                java.lang.Iterable<?> outgoingMainRecordsList_tDBInput_7 = new java.util.ArrayList<Object>();
                java.util.Iterator outgoingMainRecordsIt_tDBInput_7 = null;


 



/**
 * [tDBInput_7 begin ] stop
 */
	
	/**
	 * [tDBInput_7 main ] start
	 */

	

	
	
	currentComponent="tDBInput_7";

	


 


	tos_count_tDBInput_7++;

/**
 * [tDBInput_7 main ] stop
 */
	
	/**
	 * [tDBInput_7 process_data_begin ] start
	 */

	

	
	
	currentComponent="tDBInput_7";

	


 



/**
 * [tDBInput_7 process_data_begin ] stop
 */

	
	/**
	 * [tAdvancedHash_RECIPIENT_COUNTRY main ] start
	 */

	

	
	
	currentComponent="tAdvancedHash_RECIPIENT_COUNTRY";

	
			if(runStat.update(execStat,enableLogStash,iterateId,1,1
				
					,"RECIPIENT_COUNTRY","tDBInput_7","RECIPIENT_COUNTRY","tSnowflakeInput","tAdvancedHash_RECIPIENT_COUNTRY","tAdvancedHash_RECIPIENT_COUNTRY","tAdvancedHash"
				
			)) {
				talendJobLogProcess(globalMap);
			}
			
    			if(log.isTraceEnabled()){
    				log.trace("RECIPIENT_COUNTRY - " + (RECIPIENT_COUNTRY==null? "": RECIPIENT_COUNTRY.toLogString()));
    			}
    		


			   
			   

					RECIPIENT_COUNTRYStruct RECIPIENT_COUNTRY_HashRow = new RECIPIENT_COUNTRYStruct();
		   	   	   
				
				RECIPIENT_COUNTRY_HashRow.MANUAL_TEMPLATE = RECIPIENT_COUNTRY.MANUAL_TEMPLATE;
				
				RECIPIENT_COUNTRY_HashRow.CONCUR = RECIPIENT_COUNTRY.CONCUR;
				
				RECIPIENT_COUNTRY_HashRow.BEACONCRM = RECIPIENT_COUNTRY.BEACONCRM;
				
				RECIPIENT_COUNTRY_HashRow.SAP = RECIPIENT_COUNTRY.SAP;
				
				RECIPIENT_COUNTRY_HashRow.FINAL_OUTPUT = RECIPIENT_COUNTRY.FINAL_OUTPUT;
				
			tHash_Lookup_RECIPIENT_COUNTRY.put(RECIPIENT_COUNTRY_HashRow);
			
            




 


	tos_count_tAdvancedHash_RECIPIENT_COUNTRY++;

/**
 * [tAdvancedHash_RECIPIENT_COUNTRY main ] stop
 */
	
	/**
	 * [tAdvancedHash_RECIPIENT_COUNTRY process_data_begin ] start
	 */

	

	
	
	currentComponent="tAdvancedHash_RECIPIENT_COUNTRY";

	

 



/**
 * [tAdvancedHash_RECIPIENT_COUNTRY process_data_begin ] stop
 */
	
	/**
	 * [tAdvancedHash_RECIPIENT_COUNTRY process_data_end ] start
	 */

	

	
	
	currentComponent="tAdvancedHash_RECIPIENT_COUNTRY";

	

 



/**
 * [tAdvancedHash_RECIPIENT_COUNTRY process_data_end ] stop
 */



	
	/**
	 * [tDBInput_7 process_data_end ] start
	 */

	

	
	
	currentComponent="tDBInput_7";

	


 



/**
 * [tDBInput_7 process_data_end ] stop
 */
	
	/**
	 * [tDBInput_7 end ] start
	 */

	

	
	
	currentComponent="tDBInput_7";

	
// end of generic


resourceMap.put("finish_tDBInput_7", Boolean.TRUE);

    } // while  
    } // end of "if (sourceOrSink_tDBInput_7 instanceof ...Source)"
    java.util.Map<String, Object> resultMap_tDBInput_7 = null;
    if (reader_tDBInput_7 != null) {
        reader_tDBInput_7.close();
        resultMap_tDBInput_7 = reader_tDBInput_7.getReturnValues();
    }
if(resultMap_tDBInput_7!=null) {
	for(java.util.Map.Entry<String,Object> entry_tDBInput_7 : resultMap_tDBInput_7.entrySet()) {
		switch(entry_tDBInput_7.getKey()) {
		case org.talend.components.api.component.ComponentDefinition.RETURN_ERROR_MESSAGE :
			container_tDBInput_7.setComponentData("tDBInput_7", "ERROR_MESSAGE", entry_tDBInput_7.getValue());
			break;
		case org.talend.components.api.component.ComponentDefinition.RETURN_TOTAL_RECORD_COUNT :
			container_tDBInput_7.setComponentData("tDBInput_7", "NB_LINE", entry_tDBInput_7.getValue());
			break;
		case org.talend.components.api.component.ComponentDefinition.RETURN_SUCCESS_RECORD_COUNT :
			container_tDBInput_7.setComponentData("tDBInput_7", "NB_SUCCESS", entry_tDBInput_7.getValue());
			break;
		case org.talend.components.api.component.ComponentDefinition.RETURN_REJECT_RECORD_COUNT :
			container_tDBInput_7.setComponentData("tDBInput_7", "NB_REJECT", entry_tDBInput_7.getValue());
			break;
		default :
            StringBuilder studio_key_tDBInput_7 = new StringBuilder();
            for (int i_tDBInput_7 = 0; i_tDBInput_7 < entry_tDBInput_7.getKey().length(); i_tDBInput_7++) {
                char ch_tDBInput_7 = entry_tDBInput_7.getKey().charAt(i_tDBInput_7);
                if(Character.isUpperCase(ch_tDBInput_7) && i_tDBInput_7> 0) {
                	studio_key_tDBInput_7.append('_');
                }
                studio_key_tDBInput_7.append(ch_tDBInput_7);
            }
			container_tDBInput_7.setComponentData("tDBInput_7", studio_key_tDBInput_7.toString().toUpperCase(java.util.Locale.ENGLISH), entry_tDBInput_7.getValue());
			break;
		}
	}
}

 

ok_Hash.put("tDBInput_7", true);
end_Hash.put("tDBInput_7", System.currentTimeMillis());




/**
 * [tDBInput_7 end ] stop
 */

	
	/**
	 * [tAdvancedHash_RECIPIENT_COUNTRY end ] start
	 */

	

	
	
	currentComponent="tAdvancedHash_RECIPIENT_COUNTRY";

	

tHash_Lookup_RECIPIENT_COUNTRY.endPut();

			 		if(runStat.updateStatAndLog(execStat,enableLogStash,resourceMap,iterateId,"RECIPIENT_COUNTRY",2,0,
			 			"tDBInput_7","RECIPIENT_COUNTRY","tSnowflakeInput","tAdvancedHash_RECIPIENT_COUNTRY","tAdvancedHash_RECIPIENT_COUNTRY","tAdvancedHash","output")) {
						talendJobLogProcess(globalMap);
					}
				
 

ok_Hash.put("tAdvancedHash_RECIPIENT_COUNTRY", true);
end_Hash.put("tAdvancedHash_RECIPIENT_COUNTRY", System.currentTimeMillis());




/**
 * [tAdvancedHash_RECIPIENT_COUNTRY end ] stop
 */



				}//end the resume

				



	
			}catch(java.lang.Exception e){	
				
				    if(!(e instanceof TalendException)){
					   log.fatal(currentComponent + " " + e.getMessage(),e);
					}
				
				TalendException te = new TalendException(e, currentComponent, globalMap);
				
				throw te;
			}catch(java.lang.Error error){	
				
					runStat.stopThreadStat();
				
				throw error;
			}finally{
				
				try{
					
	
	/**
	 * [tDBInput_7 finally ] start
	 */

	

	
	
	currentComponent="tDBInput_7";

	
// finally of generic


if(resourceMap.get("finish_tDBInput_7")==null){
    if(resourceMap.get("reader_tDBInput_7")!=null){
		try {
			((org.talend.components.api.component.runtime.Reader)resourceMap.get("reader_tDBInput_7")).close();
		} catch (java.io.IOException e_tDBInput_7) {
			String errorMessage_tDBInput_7 = "failed to release the resource in tDBInput_7 :" + e_tDBInput_7.getMessage();
			System.err.println(errorMessage_tDBInput_7);
		}
	}
}
 



/**
 * [tDBInput_7 finally ] stop
 */

	
	/**
	 * [tAdvancedHash_RECIPIENT_COUNTRY finally ] start
	 */

	

	
	
	currentComponent="tAdvancedHash_RECIPIENT_COUNTRY";

	

 



/**
 * [tAdvancedHash_RECIPIENT_COUNTRY finally ] stop
 */



				}catch(java.lang.Exception e){	
					//ignore
				}catch(java.lang.Error error){
					//ignore
				}
				resourceMap = null;
			}
		

		globalMap.put("tDBInput_7_SUBPROCESS_STATE", 1);
	}
	


public static class RECIPIENT_TYPEStruct implements routines.system.IPersistableComparableLookupRow<RECIPIENT_TYPEStruct> {
    final static byte[] commonByteArrayLock_USCOMM_SUNSHINE_RPT_QA_BEACON_EXTRACT_SNOWFLAKE = new byte[0];
    static byte[] commonByteArray_USCOMM_SUNSHINE_RPT_QA_BEACON_EXTRACT_SNOWFLAKE = new byte[0];
	protected static final int DEFAULT_HASHCODE = 1;
    protected static final int PRIME = 31;
    protected int hashCode = DEFAULT_HASHCODE;
    public boolean hashCodeDirty = true;

    public String loopKey;



	
			    public String MANUAL_TEMPLATE;

				public String getMANUAL_TEMPLATE () {
					return this.MANUAL_TEMPLATE;
				}

				public Boolean MANUAL_TEMPLATEIsNullable(){
				    return true;
				}
				public Boolean MANUAL_TEMPLATEIsKey(){
				    return false;
				}
				public Integer MANUAL_TEMPLATELength(){
				    return 500;
				}
				public Integer MANUAL_TEMPLATEPrecision(){
				    return null;
				}
				public String MANUAL_TEMPLATEDefault(){
				
					return null;
				
				}
				public String MANUAL_TEMPLATEComment(){
				
				    return "";
				
				}
				public String MANUAL_TEMPLATEPattern(){
				
					return "";
				
				}
				public String MANUAL_TEMPLATEOriginalDbColumnName(){
				
					return "MANUAL_TEMPLATE";
				
				}

				
			    public String CONCUR;

				public String getCONCUR () {
					return this.CONCUR;
				}

				public Boolean CONCURIsNullable(){
				    return true;
				}
				public Boolean CONCURIsKey(){
				    return false;
				}
				public Integer CONCURLength(){
				    return 500;
				}
				public Integer CONCURPrecision(){
				    return null;
				}
				public String CONCURDefault(){
				
					return null;
				
				}
				public String CONCURComment(){
				
				    return "";
				
				}
				public String CONCURPattern(){
				
					return "";
				
				}
				public String CONCUROriginalDbColumnName(){
				
					return "CONCUR";
				
				}

				
			    public String BEACONCRM;

				public String getBEACONCRM () {
					return this.BEACONCRM;
				}

				public Boolean BEACONCRMIsNullable(){
				    return true;
				}
				public Boolean BEACONCRMIsKey(){
				    return false;
				}
				public Integer BEACONCRMLength(){
				    return 500;
				}
				public Integer BEACONCRMPrecision(){
				    return null;
				}
				public String BEACONCRMDefault(){
				
					return null;
				
				}
				public String BEACONCRMComment(){
				
				    return "";
				
				}
				public String BEACONCRMPattern(){
				
					return "";
				
				}
				public String BEACONCRMOriginalDbColumnName(){
				
					return "BEACONCRM";
				
				}

				
			    public String SAP;

				public String getSAP () {
					return this.SAP;
				}

				public Boolean SAPIsNullable(){
				    return true;
				}
				public Boolean SAPIsKey(){
				    return false;
				}
				public Integer SAPLength(){
				    return 500;
				}
				public Integer SAPPrecision(){
				    return null;
				}
				public String SAPDefault(){
				
					return null;
				
				}
				public String SAPComment(){
				
				    return "";
				
				}
				public String SAPPattern(){
				
					return "";
				
				}
				public String SAPOriginalDbColumnName(){
				
					return "SAP";
				
				}

				
			    public String FINAL_OUTPUT;

				public String getFINAL_OUTPUT () {
					return this.FINAL_OUTPUT;
				}

				public Boolean FINAL_OUTPUTIsNullable(){
				    return true;
				}
				public Boolean FINAL_OUTPUTIsKey(){
				    return false;
				}
				public Integer FINAL_OUTPUTLength(){
				    return 500;
				}
				public Integer FINAL_OUTPUTPrecision(){
				    return null;
				}
				public String FINAL_OUTPUTDefault(){
				
					return null;
				
				}
				public String FINAL_OUTPUTComment(){
				
				    return "";
				
				}
				public String FINAL_OUTPUTPattern(){
				
					return "";
				
				}
				public String FINAL_OUTPUTOriginalDbColumnName(){
				
					return "FINAL_OUTPUT";
				
				}

				


	@Override
	public int hashCode() {
		if (this.hashCodeDirty) {
			final int prime = PRIME;
			int result = DEFAULT_HASHCODE;
	
						result = prime * result + ((this.BEACONCRM == null) ? 0 : this.BEACONCRM.hashCode());
					
    		this.hashCode = result;
    		this.hashCodeDirty = false;
		}
		return this.hashCode;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) return true;
		if (obj == null) return false;
		if (getClass() != obj.getClass()) return false;
		final RECIPIENT_TYPEStruct other = (RECIPIENT_TYPEStruct) obj;
		
						if (this.BEACONCRM == null) {
							if (other.BEACONCRM != null)
								return false;
						
						} else if (!this.BEACONCRM.equals(other.BEACONCRM))
						
							return false;
					

		return true;
    }

	public void copyDataTo(RECIPIENT_TYPEStruct other) {

		other.MANUAL_TEMPLATE = this.MANUAL_TEMPLATE;
	            other.CONCUR = this.CONCUR;
	            other.BEACONCRM = this.BEACONCRM;
	            other.SAP = this.SAP;
	            other.FINAL_OUTPUT = this.FINAL_OUTPUT;
	            
	}

	public void copyKeysDataTo(RECIPIENT_TYPEStruct other) {

		other.BEACONCRM = this.BEACONCRM;
	            	
	}



	
	private String readString(DataInputStream dis, ObjectInputStream ois) throws IOException{
		String strReturn = null;
		int length = 0;
        length = dis.readInt();
		if (length == -1) {
			strReturn = null;
		} else {
			byte[] byteArray = new byte[length];
			dis.read(byteArray);
			strReturn = new String(byteArray, utf8Charset);
		}
		return strReturn;
	}
	
	private String readString(DataInputStream dis, org.jboss.marshalling.Unmarshaller unmarshaller) throws IOException{
		String strReturn = null;
		int length = 0;
        length = unmarshaller.readInt();
		if (length == -1) {
			strReturn = null;
		} else {
			byte[] byteArray = new byte[length];
			unmarshaller.read(byteArray);
			strReturn = new String(byteArray, utf8Charset);
		}
		return strReturn;
	}
	
	private void writeString(String str, DataOutputStream dos, org.jboss.marshalling.Marshaller marshaller) throws IOException{
		if(str == null) {
			marshaller.writeInt(-1);
		} else {
            byte[] byteArray = str.getBytes(utf8Charset);
            marshaller.writeInt(byteArray.length);
            marshaller.write(byteArray);
    	}
	}

	private void writeString(String str, DataOutputStream dos, ObjectOutputStream oos) throws IOException{
		if(str == null) {
            dos.writeInt(-1);
		} else {
            byte[] byteArray = str.getBytes(utf8Charset);
	    	dos.writeInt(byteArray.length);
			dos.write(byteArray);
    	}
	}

	private String readString(ObjectInputStream dis) throws IOException{
		String strReturn = null;
		int length = 0;
        length = dis.readInt();
		if (length == -1) {
			strReturn = null;
		} else {
			if(length > commonByteArray_USCOMM_SUNSHINE_RPT_QA_BEACON_EXTRACT_SNOWFLAKE.length) {
				if(length < 1024 && commonByteArray_USCOMM_SUNSHINE_RPT_QA_BEACON_EXTRACT_SNOWFLAKE.length == 0) {
   					commonByteArray_USCOMM_SUNSHINE_RPT_QA_BEACON_EXTRACT_SNOWFLAKE = new byte[1024];
				} else {
   					commonByteArray_USCOMM_SUNSHINE_RPT_QA_BEACON_EXTRACT_SNOWFLAKE = new byte[2 * length];
   				}
			}
			dis.readFully(commonByteArray_USCOMM_SUNSHINE_RPT_QA_BEACON_EXTRACT_SNOWFLAKE, 0, length);
			strReturn = new String(commonByteArray_USCOMM_SUNSHINE_RPT_QA_BEACON_EXTRACT_SNOWFLAKE, 0, length, utf8Charset);
		}
		return strReturn;
	}
	
	private String readString(org.jboss.marshalling.Unmarshaller unmarshaller) throws IOException{
		String strReturn = null;
		int length = 0;
        length = unmarshaller.readInt();
		if (length == -1) {
			strReturn = null;
		} else {
			if(length > commonByteArray_USCOMM_SUNSHINE_RPT_QA_BEACON_EXTRACT_SNOWFLAKE.length) {
				if(length < 1024 && commonByteArray_USCOMM_SUNSHINE_RPT_QA_BEACON_EXTRACT_SNOWFLAKE.length == 0) {
   					commonByteArray_USCOMM_SUNSHINE_RPT_QA_BEACON_EXTRACT_SNOWFLAKE = new byte[1024];
				} else {
   					commonByteArray_USCOMM_SUNSHINE_RPT_QA_BEACON_EXTRACT_SNOWFLAKE = new byte[2 * length];
   				}
			}
			unmarshaller.readFully(commonByteArray_USCOMM_SUNSHINE_RPT_QA_BEACON_EXTRACT_SNOWFLAKE, 0, length);
			strReturn = new String(commonByteArray_USCOMM_SUNSHINE_RPT_QA_BEACON_EXTRACT_SNOWFLAKE, 0, length, utf8Charset);
		}
		return strReturn;
	}

    private void writeString(String str, ObjectOutputStream dos) throws IOException{
		if(str == null) {
            dos.writeInt(-1);
		} else {
            byte[] byteArray = str.getBytes(utf8Charset);
	    	dos.writeInt(byteArray.length);
			dos.write(byteArray);
    	}
    }
    
    private void writeString(String str, org.jboss.marshalling.Marshaller marshaller) throws IOException{
		if(str == null) {
			marshaller.writeInt(-1);
		} else {
            byte[] byteArray = str.getBytes(utf8Charset);
            marshaller.writeInt(byteArray.length);
            marshaller.write(byteArray);
    	}
    }

    public void readKeysData(ObjectInputStream dis) {

		synchronized(commonByteArrayLock_USCOMM_SUNSHINE_RPT_QA_BEACON_EXTRACT_SNOWFLAKE) {

        	try {

        		int length = 0;
		
					this.BEACONCRM = readString(dis);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);

		

        }

		

      }


    }
    
    public void readKeysData(org.jboss.marshalling.Unmarshaller dis) {

		synchronized(commonByteArrayLock_USCOMM_SUNSHINE_RPT_QA_BEACON_EXTRACT_SNOWFLAKE) {

        	try {

        		int length = 0;
		
					this.BEACONCRM = readString(dis);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);

		

        }

		

      }


    }

    public void writeKeysData(ObjectOutputStream dos) {
        try {

		
					// String
				
						writeString(this.BEACONCRM,dos);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);
        }


    }
    
    public void writeKeysData(org.jboss.marshalling.Marshaller dos) {
        try {

		
					// String
				
						writeString(this.BEACONCRM,dos);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);
        }


    }



    /**
     * Fill Values data by reading ObjectInputStream.
     */
    public void readValuesData(DataInputStream dis, ObjectInputStream ois) {
        try {

			int length = 0;
		
						this.MANUAL_TEMPLATE = readString(dis,ois);
					
						this.CONCUR = readString(dis,ois);
					
						this.SAP = readString(dis,ois);
					
						this.FINAL_OUTPUT = readString(dis,ois);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);

		

        }

		

    }
    
    public void readValuesData(DataInputStream dis, org.jboss.marshalling.Unmarshaller objectIn) {
        try {
			int length = 0;
		
						this.MANUAL_TEMPLATE = readString(dis,objectIn);
					
						this.CONCUR = readString(dis,objectIn);
					
						this.SAP = readString(dis,objectIn);
					
						this.FINAL_OUTPUT = readString(dis,objectIn);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);

		

        }

		

    }

    /**
     * Return a byte array which represents Values data.
     */
    public void writeValuesData(DataOutputStream dos, ObjectOutputStream oos) {
        try {

		
						writeString(this.MANUAL_TEMPLATE, dos, oos);
					
						writeString(this.CONCUR, dos, oos);
					
						writeString(this.SAP, dos, oos);
					
						writeString(this.FINAL_OUTPUT, dos, oos);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);
        	}

    }
    
    public void writeValuesData(DataOutputStream dos, org.jboss.marshalling.Marshaller objectOut){
                try {

		
						writeString(this.MANUAL_TEMPLATE, dos, objectOut);
					
						writeString(this.CONCUR, dos, objectOut);
					
						writeString(this.SAP, dos, objectOut);
					
						writeString(this.FINAL_OUTPUT, dos, objectOut);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);
        	}
    }


    
    public boolean supportMarshaller(){
        return true;
    }


    public String toString() {

		StringBuilder sb = new StringBuilder();
		sb.append(super.toString());
		sb.append("[");
		sb.append("MANUAL_TEMPLATE="+MANUAL_TEMPLATE);
		sb.append(",CONCUR="+CONCUR);
		sb.append(",BEACONCRM="+BEACONCRM);
		sb.append(",SAP="+SAP);
		sb.append(",FINAL_OUTPUT="+FINAL_OUTPUT);
	    sb.append("]");

	    return sb.toString();
    }
        public String toLogString(){
        	StringBuilder sb = new StringBuilder();
        	
        				if(MANUAL_TEMPLATE == null){
        					sb.append("<null>");
        				}else{
            				sb.append(MANUAL_TEMPLATE);
            			}
            		
        			sb.append("|");
        		
        				if(CONCUR == null){
        					sb.append("<null>");
        				}else{
            				sb.append(CONCUR);
            			}
            		
        			sb.append("|");
        		
        				if(BEACONCRM == null){
        					sb.append("<null>");
        				}else{
            				sb.append(BEACONCRM);
            			}
            		
        			sb.append("|");
        		
        				if(SAP == null){
        					sb.append("<null>");
        				}else{
            				sb.append(SAP);
            			}
            		
        			sb.append("|");
        		
        				if(FINAL_OUTPUT == null){
        					sb.append("<null>");
        				}else{
            				sb.append(FINAL_OUTPUT);
            			}
            		
        			sb.append("|");
        		
        	return sb.toString();
        }

    /**
     * Compare keys
     */
    public int compareTo(RECIPIENT_TYPEStruct other) {

		int returnValue = -1;
		
						returnValue = checkNullsAndCompare(this.BEACONCRM, other.BEACONCRM);
						if(returnValue != 0) {
							return returnValue;
						}

					
	    return returnValue;
    }


    private int checkNullsAndCompare(Object object1, Object object2) {
        int returnValue = 0;
		if (object1 instanceof Comparable && object2 instanceof Comparable) {
            returnValue = ((Comparable) object1).compareTo(object2);
        } else if (object1 != null && object2 != null) {
            returnValue = compareStrings(object1.toString(), object2.toString());
        } else if (object1 == null && object2 != null) {
            returnValue = 1;
        } else if (object1 != null && object2 == null) {
            returnValue = -1;
        } else {
            returnValue = 0;
        }

        return returnValue;
    }

    private int compareStrings(String string1, String string2) {
        return string1.compareTo(string2);
    }


}
public void tDBInput_8Process(final java.util.Map<String, Object> globalMap) throws TalendException {
	globalMap.put("tDBInput_8_SUBPROCESS_STATE", 0);

 final boolean execStat = this.execStat;
	
		String iterateId = "";
	
	
	String currentComponent = "";
	java.util.Map<String, Object> resourceMap = new java.util.HashMap<String, Object>();

	try {
			// TDI-39566 avoid throwing an useless Exception
			boolean resumeIt = true;
			if (globalResumeTicket == false && resumeEntryMethodName != null) {
				String currentMethodName = new java.lang.Exception().getStackTrace()[0].getMethodName();
				resumeIt = resumeEntryMethodName.equals(currentMethodName);
			}
			if (resumeIt || globalResumeTicket) { //start the resume
				globalResumeTicket = true;



		RECIPIENT_TYPEStruct RECIPIENT_TYPE = new RECIPIENT_TYPEStruct();




	
	/**
	 * [tAdvancedHash_RECIPIENT_TYPE begin ] start
	 */

	

	
		
		ok_Hash.put("tAdvancedHash_RECIPIENT_TYPE", false);
		start_Hash.put("tAdvancedHash_RECIPIENT_TYPE", System.currentTimeMillis());
		
	
	currentComponent="tAdvancedHash_RECIPIENT_TYPE";

	
			runStat.updateStatAndLog(execStat,enableLogStash,resourceMap,iterateId,0,0,"RECIPIENT_TYPE");
			
		int tos_count_tAdvancedHash_RECIPIENT_TYPE = 0;
		
			if(enableLogStash) {
				talendJobLog.addCM("tAdvancedHash_RECIPIENT_TYPE", "tAdvancedHash_RECIPIENT_TYPE", "tAdvancedHash");
				talendJobLogProcess(globalMap);
			}
			

			   		// connection name:RECIPIENT_TYPE
			   		// source node:tDBInput_8 - inputs:(after_tDBInput_1) outputs:(RECIPIENT_TYPE,RECIPIENT_TYPE) | target node:tAdvancedHash_RECIPIENT_TYPE - inputs:(RECIPIENT_TYPE) outputs:()
			   		// linked node: tMap_1 - inputs:(HCPS,HCPTOINTERACTIONCOM,INTERACTIONSCOM,HCPADDRESSES,PRODUCT,RECIPIENT_STATE,RECIPIENT_COUNTRY,RECIPIENT_TYPE) outputs:(OUTPUT)
			   
			   		org.talend.designer.components.lookup.common.ICommonLookup.MATCHING_MODE matchingModeEnum_RECIPIENT_TYPE = 
			   			org.talend.designer.components.lookup.common.ICommonLookup.MATCHING_MODE.UNIQUE_MATCH;
			   			
			   
	   			org.talend.designer.components.lookup.memory.AdvancedMemoryLookup<RECIPIENT_TYPEStruct> tHash_Lookup_RECIPIENT_TYPE =org.talend.designer.components.lookup.memory.AdvancedMemoryLookup.
	   						<RECIPIENT_TYPEStruct>getLookup(matchingModeEnum_RECIPIENT_TYPE);
	   						   
		   	   	   globalMap.put("tHash_Lookup_RECIPIENT_TYPE", tHash_Lookup_RECIPIENT_TYPE);
		   	   	   
				
           

 



/**
 * [tAdvancedHash_RECIPIENT_TYPE begin ] stop
 */



	
	/**
	 * [tDBInput_8 begin ] start
	 */

	

	
		
		ok_Hash.put("tDBInput_8", false);
		start_Hash.put("tDBInput_8", System.currentTimeMillis());
		
	
	currentComponent="tDBInput_8";

	
		int tos_count_tDBInput_8 = 0;
		
			if(enableLogStash) {
				talendJobLog.addCM("tDBInput_8", "RECIPIENT_TYPE", "tSnowflakeInput");
				talendJobLogProcess(globalMap);
			}
			

boolean doesNodeBelongToRequest_tDBInput_8 = 0 == 0;
@SuppressWarnings("unchecked")
java.util.Map<String, Object> restRequest_tDBInput_8 = (java.util.Map<String, Object>)globalMap.get("restRequest");
String currentTRestRequestOperation_tDBInput_8 = (String)(restRequest_tDBInput_8 != null ? restRequest_tDBInput_8.get("OPERATION") : null);

org.talend.components.api.component.ComponentDefinition def_tDBInput_8 =
        new org.talend.components.snowflake.tsnowflakeinput.TSnowflakeInputDefinition();

org.talend.components.api.component.runtime.Writer writer_tDBInput_8 = null;
org.talend.components.api.component.runtime.Reader reader_tDBInput_8 = null;


org.talend.components.snowflake.tsnowflakeinput.TSnowflakeInputProperties props_tDBInput_8 =
        (org.talend.components.snowflake.tsnowflakeinput.TSnowflakeInputProperties) def_tDBInput_8.createRuntimeProperties();
 		                    props_tDBInput_8.setValue("condition",
 		                    "");
 		                    
 		                    props_tDBInput_8.setValue("manualQuery",
 		                    false);
 		                    
 		                    props_tDBInput_8.setValue("convertColumnsAndTableToUppercase",
 		                    true);
 		                    
 		                    props_tDBInput_8.connection.setValue("useCustomRegion",
 		                    false);
 		                    
 		                    props_tDBInput_8.connection.userPassword.setValue("useAuth",
 		                    false);
 		                    
 		                    props_tDBInput_8.connection.referencedComponent.setValue("referenceType",
 		                        org.talend.components.api.properties.ComponentReferenceProperties.ReferenceType.COMPONENT_INSTANCE);
 		                    
 		                    props_tDBInput_8.connection.referencedComponent.setValue("componentInstanceId",
 		                    "tDBConnection_2");
 		                    
 		                    props_tDBInput_8.connection.referencedComponent.setValue("referenceDefinitionName",
 		                    "tSnowflakeConnection");
 		                    
 		                    props_tDBInput_8.table.setValue("tableName",
 		                    "RECIPIENT_TYPE");
 		                    
 		                    props_tDBInput_8.table.connection.setValue("useCustomRegion",
 		                    false);
 		                    
 		                    props_tDBInput_8.table.connection.userPassword.setValue("useAuth",
 		                    false);
 		                    
 		                    props_tDBInput_8.table.connection.referencedComponent.setValue("referenceType",
 		                        org.talend.components.api.properties.ComponentReferenceProperties.ReferenceType.COMPONENT_INSTANCE);
 		                    
 		                    props_tDBInput_8.table.connection.referencedComponent.setValue("componentInstanceId",
 		                    "tDBConnection_2");
 		                    
 		                    props_tDBInput_8.table.connection.referencedComponent.setValue("referenceDefinitionName",
 		                    "tSnowflakeConnection");
 		                    
 		                    class SchemaSettingTool_tDBInput_8_1_fisrt {
 		                    		
 		                    		String getSchemaValue() {
 		                    				
 		                    						StringBuilder s = new StringBuilder();
                    						
     		                    						a("{\"type\":\"record\",",s);
     		                    						
     		                    						a("\"name\":\"RECIPIENT_TYPE\",\"fields\":[{",s);
     		                    						
     		                    						a("\"name\":\"MANUAL_TEMPLATE\",\"type\":[\"string\",\"null\"],\"talend.field.length\":\"500\",\"talend.field.dbType\":12,\"talend.field.dbColumnName\":\"MANUAL_TEMPLATE\"},{",s);
     		                    						
     		                    						a("\"name\":\"CONCUR\",\"type\":[\"string\",\"null\"],\"talend.field.length\":\"500\",\"talend.field.dbType\":12,\"talend.field.dbColumnName\":\"CONCUR\"},{",s);
     		                    						
     		                    						a("\"name\":\"BEACONCRM\",\"type\":[\"string\",\"null\"],\"talend.field.length\":\"500\",\"talend.field.dbType\":12,\"talend.field.dbColumnName\":\"BEACONCRM\"},{",s);
     		                    						
     		                    						a("\"name\":\"SAP\",\"type\":[\"string\",\"null\"],\"talend.field.length\":\"500\",\"talend.field.dbType\":12,\"talend.field.dbColumnName\":\"SAP\"},{",s);
     		                    						
     		                    						a("\"name\":\"FINAL_OUTPUT\",\"type\":[\"string\",\"null\"],\"talend.field.length\":\"500\",\"talend.field.dbType\":12,\"talend.field.dbColumnName\":\"FINAL_OUTPUT\"}]}",s);
     		                    						
     		                    				return s.toString();
     		                    		
 		                    		}
 		                    		
 		                    		void a(String part, StringBuilder strB) {
 		                    				strB.append(part);
 		                    		}
 		                    		
 		                    }
 		                    
 		                    SchemaSettingTool_tDBInput_8_1_fisrt sst_tDBInput_8_1_fisrt = new SchemaSettingTool_tDBInput_8_1_fisrt();
 		                    
 		                    props_tDBInput_8.table.main.setValue("schema",
 		                        new org.apache.avro.Schema.Parser().parse(sst_tDBInput_8_1_fisrt.getSchemaValue()));
 		                    
    if (org.talend.components.api.properties.ComponentReferenceProperties.ReferenceType.COMPONENT_INSTANCE == props_tDBInput_8.connection.referencedComponent.referenceType.getValue()) {
        final String referencedComponentInstanceId_tDBInput_8 = props_tDBInput_8.connection.referencedComponent.componentInstanceId.getStringValue();
        if (referencedComponentInstanceId_tDBInput_8 != null) {
            org.talend.daikon.properties.Properties referencedComponentProperties_tDBInput_8 = (org.talend.daikon.properties.Properties) globalMap.get(
                referencedComponentInstanceId_tDBInput_8 + "_COMPONENT_RUNTIME_PROPERTIES");
            props_tDBInput_8.connection.referencedComponent.setReference(referencedComponentProperties_tDBInput_8);
        }
    }
    if (org.talend.components.api.properties.ComponentReferenceProperties.ReferenceType.COMPONENT_INSTANCE == props_tDBInput_8.table.connection.referencedComponent.referenceType.getValue()) {
        final String referencedComponentInstanceId_tDBInput_8 = props_tDBInput_8.table.connection.referencedComponent.componentInstanceId.getStringValue();
        if (referencedComponentInstanceId_tDBInput_8 != null) {
            org.talend.daikon.properties.Properties referencedComponentProperties_tDBInput_8 = (org.talend.daikon.properties.Properties) globalMap.get(
                referencedComponentInstanceId_tDBInput_8 + "_COMPONENT_RUNTIME_PROPERTIES");
            props_tDBInput_8.table.connection.referencedComponent.setReference(referencedComponentProperties_tDBInput_8);
        }
    }
globalMap.put("tDBInput_8_COMPONENT_RUNTIME_PROPERTIES", props_tDBInput_8);
globalMap.putIfAbsent("TALEND_PRODUCT_VERSION", "8.0");
globalMap.put("TALEND_COMPONENTS_VERSION", "0.37.4");
java.net.URL mappings_url_tDBInput_8= this.getClass().getResource("/xmlMappings");
globalMap.put("tDBInput_8_MAPPINGS_URL", mappings_url_tDBInput_8);

org.talend.components.api.container.RuntimeContainer container_tDBInput_8 = new org.talend.components.api.container.RuntimeContainer() {
    public Object getComponentData(String componentId, String key) {
        return globalMap.get(componentId + "_" + key);
    }

    public void setComponentData(String componentId, String key, Object data) {
        globalMap.put(componentId + "_" + key, data);
    }

    public String getCurrentComponentId() {
        return "tDBInput_8";
    }

    public Object getGlobalData(String key) {
    	return globalMap.get(key);
    }
};

int nb_line_tDBInput_8 = 0;

org.talend.components.api.component.ConnectorTopology topology_tDBInput_8 = null;
topology_tDBInput_8 = org.talend.components.api.component.ConnectorTopology.OUTGOING;

org.talend.daikon.runtime.RuntimeInfo runtime_info_tDBInput_8 = def_tDBInput_8.getRuntimeInfo(
    org.talend.components.api.component.runtime.ExecutionEngine.DI, props_tDBInput_8, topology_tDBInput_8);
java.util.Set<org.talend.components.api.component.ConnectorTopology> supported_connector_topologies_tDBInput_8 = def_tDBInput_8.getSupportedConnectorTopologies();

org.talend.components.api.component.runtime.RuntimableRuntime componentRuntime_tDBInput_8 = (org.talend.components.api.component.runtime.RuntimableRuntime)(Class.forName(runtime_info_tDBInput_8.getRuntimeClassName()).newInstance());
org.talend.daikon.properties.ValidationResult initVr_tDBInput_8 = componentRuntime_tDBInput_8.initialize(container_tDBInput_8, props_tDBInput_8);

if (initVr_tDBInput_8.getStatus() == org.talend.daikon.properties.ValidationResult.Result.ERROR ) {
    throw new RuntimeException(initVr_tDBInput_8.getMessage());
}

if(componentRuntime_tDBInput_8 instanceof org.talend.components.api.component.runtime.ComponentDriverInitialization) {
	org.talend.components.api.component.runtime.ComponentDriverInitialization compDriverInitialization_tDBInput_8 = (org.talend.components.api.component.runtime.ComponentDriverInitialization)componentRuntime_tDBInput_8;
	compDriverInitialization_tDBInput_8.runAtDriver(container_tDBInput_8);
}

org.talend.components.api.component.runtime.SourceOrSink sourceOrSink_tDBInput_8 = null;
if(componentRuntime_tDBInput_8 instanceof org.talend.components.api.component.runtime.SourceOrSink) {
	sourceOrSink_tDBInput_8 = (org.talend.components.api.component.runtime.SourceOrSink)componentRuntime_tDBInput_8;
	if (doesNodeBelongToRequest_tDBInput_8) {
        org.talend.daikon.properties.ValidationResult vr_tDBInput_8 = sourceOrSink_tDBInput_8.validate(container_tDBInput_8);
        if (vr_tDBInput_8.getStatus() == org.talend.daikon.properties.ValidationResult.Result.ERROR ) {
            throw new RuntimeException(vr_tDBInput_8.getMessage());
        }
	}
}

    if (sourceOrSink_tDBInput_8 instanceof org.talend.components.api.component.runtime.Source) {
        org.talend.components.api.component.runtime.Source source_tDBInput_8 =
                (org.talend.components.api.component.runtime.Source)sourceOrSink_tDBInput_8;
        reader_tDBInput_8 = source_tDBInput_8.createReader(container_tDBInput_8);
	    reader_tDBInput_8 = new org.talend.codegen.flowvariables.runtime.FlowVariablesReader(reader_tDBInput_8, container_tDBInput_8);

            boolean multi_output_is_allowed_tDBInput_8 = false;
            org.talend.components.api.component.Connector c_tDBInput_8 = null;
            for (org.talend.components.api.component.Connector currentConnector : props_tDBInput_8.getAvailableConnectors(null, true)) {
                if (currentConnector.getName().equals("MAIN")) {
                    c_tDBInput_8 = currentConnector;
                }

                if (currentConnector.getName().equals("REJECT")) {//it's better to move the code to javajet
                    multi_output_is_allowed_tDBInput_8 = true;
                }
            }
            org.apache.avro.Schema schema_tDBInput_8 = props_tDBInput_8.getSchema(c_tDBInput_8, true);

        org.talend.codegen.enforcer.OutgoingSchemaEnforcer outgoingEnforcer_tDBInput_8 = org.talend.codegen.enforcer.EnforcerCreator.createOutgoingEnforcer(schema_tDBInput_8, false);

        // Create a reusable factory that converts the output of the reader to an IndexedRecord.
        org.talend.daikon.avro.converter.IndexedRecordConverter<Object, ? extends org.apache.avro.generic.IndexedRecord> factory_tDBInput_8 = null;

        // Iterate through the incoming data.
        boolean available_tDBInput_8 = reader_tDBInput_8.start();

        resourceMap.put("reader_tDBInput_8", reader_tDBInput_8);

        for (; available_tDBInput_8; available_tDBInput_8 = reader_tDBInput_8.advance()) {
			nb_line_tDBInput_8++;

			
			if (multi_output_is_allowed_tDBInput_8) {
				
					RECIPIENT_TYPE = null;
				

				
			}
			

			try {
				Object data_tDBInput_8 = reader_tDBInput_8.getCurrent();
				

					if(multi_output_is_allowed_tDBInput_8) {
						RECIPIENT_TYPE = new RECIPIENT_TYPEStruct();
					}

					
        // Construct the factory once when the first data arrives.
        if (factory_tDBInput_8 == null) {
            factory_tDBInput_8 = (org.talend.daikon.avro.converter.IndexedRecordConverter<Object, ? extends org.apache.avro.generic.IndexedRecord>)
                    new org.talend.daikon.avro.AvroRegistry()
                            .createIndexedRecordConverter(data_tDBInput_8.getClass());
        }

        // Enforce the outgoing schema on the input.
        outgoingEnforcer_tDBInput_8.setWrapped(factory_tDBInput_8.convertToAvro(data_tDBInput_8));
                Object columnValue_0_tDBInput_8 = outgoingEnforcer_tDBInput_8.get(0);
                        RECIPIENT_TYPE.MANUAL_TEMPLATE = (String) (columnValue_0_tDBInput_8);
                Object columnValue_1_tDBInput_8 = outgoingEnforcer_tDBInput_8.get(1);
                        RECIPIENT_TYPE.CONCUR = (String) (columnValue_1_tDBInput_8);
                Object columnValue_2_tDBInput_8 = outgoingEnforcer_tDBInput_8.get(2);
                        RECIPIENT_TYPE.BEACONCRM = (String) (columnValue_2_tDBInput_8);
                Object columnValue_3_tDBInput_8 = outgoingEnforcer_tDBInput_8.get(3);
                        RECIPIENT_TYPE.SAP = (String) (columnValue_3_tDBInput_8);
                Object columnValue_4_tDBInput_8 = outgoingEnforcer_tDBInput_8.get(4);
                        RECIPIENT_TYPE.FINAL_OUTPUT = (String) (columnValue_4_tDBInput_8);
			} catch (org.talend.components.api.exception.DataRejectException e_tDBInput_8) {
				java.util.Map<String,Object> info_tDBInput_8 = e_tDBInput_8.getRejectInfo();
				
					//TODO use a method instead of getting method by the special key "error/errorMessage"
					Object errorMessage_tDBInput_8 = null;
					if(info_tDBInput_8.containsKey("error")){
						errorMessage_tDBInput_8 = info_tDBInput_8.get("error");
					}else if(info_tDBInput_8.containsKey("errorMessage")){
						errorMessage_tDBInput_8 = info_tDBInput_8.get("errorMessage");
					}else{
						errorMessage_tDBInput_8 = "Rejected but error message missing";
					}
					errorMessage_tDBInput_8 = "Row "+ nb_line_tDBInput_8 + ": "+errorMessage_tDBInput_8;
					System.err.println(errorMessage_tDBInput_8);
				
					// If the record is reject, the main line record should put NULL
					RECIPIENT_TYPE = null;
				
			} // end of catch

                java.lang.Iterable<?> outgoingMainRecordsList_tDBInput_8 = new java.util.ArrayList<Object>();
                java.util.Iterator outgoingMainRecordsIt_tDBInput_8 = null;


 



/**
 * [tDBInput_8 begin ] stop
 */
	
	/**
	 * [tDBInput_8 main ] start
	 */

	

	
	
	currentComponent="tDBInput_8";

	


 


	tos_count_tDBInput_8++;

/**
 * [tDBInput_8 main ] stop
 */
	
	/**
	 * [tDBInput_8 process_data_begin ] start
	 */

	

	
	
	currentComponent="tDBInput_8";

	


 



/**
 * [tDBInput_8 process_data_begin ] stop
 */

	
	/**
	 * [tAdvancedHash_RECIPIENT_TYPE main ] start
	 */

	

	
	
	currentComponent="tAdvancedHash_RECIPIENT_TYPE";

	
			if(runStat.update(execStat,enableLogStash,iterateId,1,1
				
					,"RECIPIENT_TYPE","tDBInput_8","RECIPIENT_TYPE","tSnowflakeInput","tAdvancedHash_RECIPIENT_TYPE","tAdvancedHash_RECIPIENT_TYPE","tAdvancedHash"
				
			)) {
				talendJobLogProcess(globalMap);
			}
			
    			if(log.isTraceEnabled()){
    				log.trace("RECIPIENT_TYPE - " + (RECIPIENT_TYPE==null? "": RECIPIENT_TYPE.toLogString()));
    			}
    		


			   
			   

					RECIPIENT_TYPEStruct RECIPIENT_TYPE_HashRow = new RECIPIENT_TYPEStruct();
		   	   	   
				
				RECIPIENT_TYPE_HashRow.MANUAL_TEMPLATE = RECIPIENT_TYPE.MANUAL_TEMPLATE;
				
				RECIPIENT_TYPE_HashRow.CONCUR = RECIPIENT_TYPE.CONCUR;
				
				RECIPIENT_TYPE_HashRow.BEACONCRM = RECIPIENT_TYPE.BEACONCRM;
				
				RECIPIENT_TYPE_HashRow.SAP = RECIPIENT_TYPE.SAP;
				
				RECIPIENT_TYPE_HashRow.FINAL_OUTPUT = RECIPIENT_TYPE.FINAL_OUTPUT;
				
			tHash_Lookup_RECIPIENT_TYPE.put(RECIPIENT_TYPE_HashRow);
			
            




 


	tos_count_tAdvancedHash_RECIPIENT_TYPE++;

/**
 * [tAdvancedHash_RECIPIENT_TYPE main ] stop
 */
	
	/**
	 * [tAdvancedHash_RECIPIENT_TYPE process_data_begin ] start
	 */

	

	
	
	currentComponent="tAdvancedHash_RECIPIENT_TYPE";

	

 



/**
 * [tAdvancedHash_RECIPIENT_TYPE process_data_begin ] stop
 */
	
	/**
	 * [tAdvancedHash_RECIPIENT_TYPE process_data_end ] start
	 */

	

	
	
	currentComponent="tAdvancedHash_RECIPIENT_TYPE";

	

 



/**
 * [tAdvancedHash_RECIPIENT_TYPE process_data_end ] stop
 */



	
	/**
	 * [tDBInput_8 process_data_end ] start
	 */

	

	
	
	currentComponent="tDBInput_8";

	


 



/**
 * [tDBInput_8 process_data_end ] stop
 */
	
	/**
	 * [tDBInput_8 end ] start
	 */

	

	
	
	currentComponent="tDBInput_8";

	
// end of generic


resourceMap.put("finish_tDBInput_8", Boolean.TRUE);

    } // while  
    } // end of "if (sourceOrSink_tDBInput_8 instanceof ...Source)"
    java.util.Map<String, Object> resultMap_tDBInput_8 = null;
    if (reader_tDBInput_8 != null) {
        reader_tDBInput_8.close();
        resultMap_tDBInput_8 = reader_tDBInput_8.getReturnValues();
    }
if(resultMap_tDBInput_8!=null) {
	for(java.util.Map.Entry<String,Object> entry_tDBInput_8 : resultMap_tDBInput_8.entrySet()) {
		switch(entry_tDBInput_8.getKey()) {
		case org.talend.components.api.component.ComponentDefinition.RETURN_ERROR_MESSAGE :
			container_tDBInput_8.setComponentData("tDBInput_8", "ERROR_MESSAGE", entry_tDBInput_8.getValue());
			break;
		case org.talend.components.api.component.ComponentDefinition.RETURN_TOTAL_RECORD_COUNT :
			container_tDBInput_8.setComponentData("tDBInput_8", "NB_LINE", entry_tDBInput_8.getValue());
			break;
		case org.talend.components.api.component.ComponentDefinition.RETURN_SUCCESS_RECORD_COUNT :
			container_tDBInput_8.setComponentData("tDBInput_8", "NB_SUCCESS", entry_tDBInput_8.getValue());
			break;
		case org.talend.components.api.component.ComponentDefinition.RETURN_REJECT_RECORD_COUNT :
			container_tDBInput_8.setComponentData("tDBInput_8", "NB_REJECT", entry_tDBInput_8.getValue());
			break;
		default :
            StringBuilder studio_key_tDBInput_8 = new StringBuilder();
            for (int i_tDBInput_8 = 0; i_tDBInput_8 < entry_tDBInput_8.getKey().length(); i_tDBInput_8++) {
                char ch_tDBInput_8 = entry_tDBInput_8.getKey().charAt(i_tDBInput_8);
                if(Character.isUpperCase(ch_tDBInput_8) && i_tDBInput_8> 0) {
                	studio_key_tDBInput_8.append('_');
                }
                studio_key_tDBInput_8.append(ch_tDBInput_8);
            }
			container_tDBInput_8.setComponentData("tDBInput_8", studio_key_tDBInput_8.toString().toUpperCase(java.util.Locale.ENGLISH), entry_tDBInput_8.getValue());
			break;
		}
	}
}

 

ok_Hash.put("tDBInput_8", true);
end_Hash.put("tDBInput_8", System.currentTimeMillis());




/**
 * [tDBInput_8 end ] stop
 */

	
	/**
	 * [tAdvancedHash_RECIPIENT_TYPE end ] start
	 */

	

	
	
	currentComponent="tAdvancedHash_RECIPIENT_TYPE";

	

tHash_Lookup_RECIPIENT_TYPE.endPut();

			 		if(runStat.updateStatAndLog(execStat,enableLogStash,resourceMap,iterateId,"RECIPIENT_TYPE",2,0,
			 			"tDBInput_8","RECIPIENT_TYPE","tSnowflakeInput","tAdvancedHash_RECIPIENT_TYPE","tAdvancedHash_RECIPIENT_TYPE","tAdvancedHash","output")) {
						talendJobLogProcess(globalMap);
					}
				
 

ok_Hash.put("tAdvancedHash_RECIPIENT_TYPE", true);
end_Hash.put("tAdvancedHash_RECIPIENT_TYPE", System.currentTimeMillis());




/**
 * [tAdvancedHash_RECIPIENT_TYPE end ] stop
 */



				}//end the resume

				



	
			}catch(java.lang.Exception e){	
				
				    if(!(e instanceof TalendException)){
					   log.fatal(currentComponent + " " + e.getMessage(),e);
					}
				
				TalendException te = new TalendException(e, currentComponent, globalMap);
				
				throw te;
			}catch(java.lang.Error error){	
				
					runStat.stopThreadStat();
				
				throw error;
			}finally{
				
				try{
					
	
	/**
	 * [tDBInput_8 finally ] start
	 */

	

	
	
	currentComponent="tDBInput_8";

	
// finally of generic


if(resourceMap.get("finish_tDBInput_8")==null){
    if(resourceMap.get("reader_tDBInput_8")!=null){
		try {
			((org.talend.components.api.component.runtime.Reader)resourceMap.get("reader_tDBInput_8")).close();
		} catch (java.io.IOException e_tDBInput_8) {
			String errorMessage_tDBInput_8 = "failed to release the resource in tDBInput_8 :" + e_tDBInput_8.getMessage();
			System.err.println(errorMessage_tDBInput_8);
		}
	}
}
 



/**
 * [tDBInput_8 finally ] stop
 */

	
	/**
	 * [tAdvancedHash_RECIPIENT_TYPE finally ] start
	 */

	

	
	
	currentComponent="tAdvancedHash_RECIPIENT_TYPE";

	

 



/**
 * [tAdvancedHash_RECIPIENT_TYPE finally ] stop
 */



				}catch(java.lang.Exception e){	
					//ignore
				}catch(java.lang.Error error){
					//ignore
				}
				resourceMap = null;
			}
		

		globalMap.put("tDBInput_8_SUBPROCESS_STATE", 1);
	}
	

public void tPostjob_1Process(final java.util.Map<String, Object> globalMap) throws TalendException {
	globalMap.put("tPostjob_1_SUBPROCESS_STATE", 0);

 final boolean execStat = this.execStat;
	
		String iterateId = "";
	
	
	String currentComponent = "";
	java.util.Map<String, Object> resourceMap = new java.util.HashMap<String, Object>();

	try {
			// TDI-39566 avoid throwing an useless Exception
			boolean resumeIt = true;
			if (globalResumeTicket == false && resumeEntryMethodName != null) {
				String currentMethodName = new java.lang.Exception().getStackTrace()[0].getMethodName();
				resumeIt = resumeEntryMethodName.equals(currentMethodName);
			}
			if (resumeIt || globalResumeTicket) { //start the resume
				globalResumeTicket = true;



		


	
	/**
	 * [tPostjob_1 begin ] start
	 */

	

	
		
		ok_Hash.put("tPostjob_1", false);
		start_Hash.put("tPostjob_1", System.currentTimeMillis());
		
	
	currentComponent="tPostjob_1";

	
		int tos_count_tPostjob_1 = 0;
		
			if(enableLogStash) {
				talendJobLog.addCM("tPostjob_1", "tPostjob_1", "tPostjob");
				talendJobLogProcess(globalMap);
			}
			

 



/**
 * [tPostjob_1 begin ] stop
 */
	
	/**
	 * [tPostjob_1 main ] start
	 */

	

	
	
	currentComponent="tPostjob_1";

	

 


	tos_count_tPostjob_1++;

/**
 * [tPostjob_1 main ] stop
 */
	
	/**
	 * [tPostjob_1 process_data_begin ] start
	 */

	

	
	
	currentComponent="tPostjob_1";

	

 



/**
 * [tPostjob_1 process_data_begin ] stop
 */
	
	/**
	 * [tPostjob_1 process_data_end ] start
	 */

	

	
	
	currentComponent="tPostjob_1";

	

 



/**
 * [tPostjob_1 process_data_end ] stop
 */
	
	/**
	 * [tPostjob_1 end ] start
	 */

	

	
	
	currentComponent="tPostjob_1";

	

 

ok_Hash.put("tPostjob_1", true);
end_Hash.put("tPostjob_1", System.currentTimeMillis());

				if(execStat){   
   	 				runStat.updateStatOnConnection("OnComponentOk2", 0, "ok");
				}
				tDBClose_1Process(globalMap);



/**
 * [tPostjob_1 end ] stop
 */
				}//end the resume

				



	
			}catch(java.lang.Exception e){	
				
				    if(!(e instanceof TalendException)){
					   log.fatal(currentComponent + " " + e.getMessage(),e);
					}
				
				TalendException te = new TalendException(e, currentComponent, globalMap);
				
				throw te;
			}catch(java.lang.Error error){	
				
					runStat.stopThreadStat();
				
				throw error;
			}finally{
				
				try{
					
	
	/**
	 * [tPostjob_1 finally ] start
	 */

	

	
	
	currentComponent="tPostjob_1";

	

 



/**
 * [tPostjob_1 finally ] stop
 */
				}catch(java.lang.Exception e){	
					//ignore
				}catch(java.lang.Error error){
					//ignore
				}
				resourceMap = null;
			}
		

		globalMap.put("tPostjob_1_SUBPROCESS_STATE", 1);
	}
	

public void tDBClose_1Process(final java.util.Map<String, Object> globalMap) throws TalendException {
	globalMap.put("tDBClose_1_SUBPROCESS_STATE", 0);

 final boolean execStat = this.execStat;
	
		String iterateId = "";
	
	
	String currentComponent = "";
	java.util.Map<String, Object> resourceMap = new java.util.HashMap<String, Object>();

	try {
			// TDI-39566 avoid throwing an useless Exception
			boolean resumeIt = true;
			if (globalResumeTicket == false && resumeEntryMethodName != null) {
				String currentMethodName = new java.lang.Exception().getStackTrace()[0].getMethodName();
				resumeIt = resumeEntryMethodName.equals(currentMethodName);
			}
			if (resumeIt || globalResumeTicket) { //start the resume
				globalResumeTicket = true;



		


	
	/**
	 * [tDBClose_1 begin ] start
	 */

	

	
		
		ok_Hash.put("tDBClose_1", false);
		start_Hash.put("tDBClose_1", System.currentTimeMillis());
		
	
	currentComponent="tDBClose_1";

	
		int tos_count_tDBClose_1 = 0;
		
			if(enableLogStash) {
				talendJobLog.addCM("tDBClose_1", "tDBClose_1", "tSnowflakeClose");
				talendJobLogProcess(globalMap);
			}
			

boolean doesNodeBelongToRequest_tDBClose_1 = 0 == 0;
@SuppressWarnings("unchecked")
java.util.Map<String, Object> restRequest_tDBClose_1 = (java.util.Map<String, Object>)globalMap.get("restRequest");
String currentTRestRequestOperation_tDBClose_1 = (String)(restRequest_tDBClose_1 != null ? restRequest_tDBClose_1.get("OPERATION") : null);

org.talend.components.api.component.ComponentDefinition def_tDBClose_1 =
        new org.talend.components.snowflake.tsnowflakeclose.TSnowflakeCloseDefinition();

org.talend.components.api.component.runtime.Writer writer_tDBClose_1 = null;
org.talend.components.api.component.runtime.Reader reader_tDBClose_1 = null;


org.talend.components.snowflake.tsnowflakeclose.TSnowflakeCloseProperties props_tDBClose_1 =
        (org.talend.components.snowflake.tsnowflakeclose.TSnowflakeCloseProperties) def_tDBClose_1.createRuntimeProperties();
 		                    props_tDBClose_1.referencedComponent.setValue("referenceType",
 		                        org.talend.components.api.properties.ComponentReferenceProperties.ReferenceType.COMPONENT_INSTANCE);
 		                    
 		                    props_tDBClose_1.referencedComponent.setValue("componentInstanceId",
 		                    "tDBConnection_1");
 		                    
 		                    props_tDBClose_1.referencedComponent.setValue("referenceDefinitionName",
 		                    "tSnowflakeConnection");
 		                    
    if (org.talend.components.api.properties.ComponentReferenceProperties.ReferenceType.COMPONENT_INSTANCE == props_tDBClose_1.referencedComponent.referenceType.getValue()) {
        final String referencedComponentInstanceId_tDBClose_1 = props_tDBClose_1.referencedComponent.componentInstanceId.getStringValue();
        if (referencedComponentInstanceId_tDBClose_1 != null) {
            org.talend.daikon.properties.Properties referencedComponentProperties_tDBClose_1 = (org.talend.daikon.properties.Properties) globalMap.get(
                referencedComponentInstanceId_tDBClose_1 + "_COMPONENT_RUNTIME_PROPERTIES");
            props_tDBClose_1.referencedComponent.setReference(referencedComponentProperties_tDBClose_1);
        }
    }
globalMap.put("tDBClose_1_COMPONENT_RUNTIME_PROPERTIES", props_tDBClose_1);
globalMap.putIfAbsent("TALEND_PRODUCT_VERSION", "8.0");
globalMap.put("TALEND_COMPONENTS_VERSION", "0.37.4");
java.net.URL mappings_url_tDBClose_1= this.getClass().getResource("/xmlMappings");
globalMap.put("tDBClose_1_MAPPINGS_URL", mappings_url_tDBClose_1);

org.talend.components.api.container.RuntimeContainer container_tDBClose_1 = new org.talend.components.api.container.RuntimeContainer() {
    public Object getComponentData(String componentId, String key) {
        return globalMap.get(componentId + "_" + key);
    }

    public void setComponentData(String componentId, String key, Object data) {
        globalMap.put(componentId + "_" + key, data);
    }

    public String getCurrentComponentId() {
        return "tDBClose_1";
    }

    public Object getGlobalData(String key) {
    	return globalMap.get(key);
    }
};

int nb_line_tDBClose_1 = 0;

org.talend.components.api.component.ConnectorTopology topology_tDBClose_1 = null;
topology_tDBClose_1 = org.talend.components.api.component.ConnectorTopology.NONE;

org.talend.daikon.runtime.RuntimeInfo runtime_info_tDBClose_1 = def_tDBClose_1.getRuntimeInfo(
    org.talend.components.api.component.runtime.ExecutionEngine.DI, props_tDBClose_1, topology_tDBClose_1);
java.util.Set<org.talend.components.api.component.ConnectorTopology> supported_connector_topologies_tDBClose_1 = def_tDBClose_1.getSupportedConnectorTopologies();

org.talend.components.api.component.runtime.RuntimableRuntime componentRuntime_tDBClose_1 = (org.talend.components.api.component.runtime.RuntimableRuntime)(Class.forName(runtime_info_tDBClose_1.getRuntimeClassName()).newInstance());
org.talend.daikon.properties.ValidationResult initVr_tDBClose_1 = componentRuntime_tDBClose_1.initialize(container_tDBClose_1, props_tDBClose_1);

if (initVr_tDBClose_1.getStatus() == org.talend.daikon.properties.ValidationResult.Result.ERROR ) {
    throw new RuntimeException(initVr_tDBClose_1.getMessage());
}

if(componentRuntime_tDBClose_1 instanceof org.talend.components.api.component.runtime.ComponentDriverInitialization) {
	org.talend.components.api.component.runtime.ComponentDriverInitialization compDriverInitialization_tDBClose_1 = (org.talend.components.api.component.runtime.ComponentDriverInitialization)componentRuntime_tDBClose_1;
	compDriverInitialization_tDBClose_1.runAtDriver(container_tDBClose_1);
}

org.talend.components.api.component.runtime.SourceOrSink sourceOrSink_tDBClose_1 = null;
if(componentRuntime_tDBClose_1 instanceof org.talend.components.api.component.runtime.SourceOrSink) {
	sourceOrSink_tDBClose_1 = (org.talend.components.api.component.runtime.SourceOrSink)componentRuntime_tDBClose_1;
	if (doesNodeBelongToRequest_tDBClose_1) {
        org.talend.daikon.properties.ValidationResult vr_tDBClose_1 = sourceOrSink_tDBClose_1.validate(container_tDBClose_1);
        if (vr_tDBClose_1.getStatus() == org.talend.daikon.properties.ValidationResult.Result.ERROR ) {
            throw new RuntimeException(vr_tDBClose_1.getMessage());
        }
	}
}

 



/**
 * [tDBClose_1 begin ] stop
 */
	
	/**
	 * [tDBClose_1 main ] start
	 */

	

	
	
	currentComponent="tDBClose_1";

	


 


	tos_count_tDBClose_1++;

/**
 * [tDBClose_1 main ] stop
 */
	
	/**
	 * [tDBClose_1 process_data_begin ] start
	 */

	

	
	
	currentComponent="tDBClose_1";

	


 



/**
 * [tDBClose_1 process_data_begin ] stop
 */
	
	/**
	 * [tDBClose_1 process_data_end ] start
	 */

	

	
	
	currentComponent="tDBClose_1";

	


 



/**
 * [tDBClose_1 process_data_end ] stop
 */
	
	/**
	 * [tDBClose_1 end ] start
	 */

	

	
	
	currentComponent="tDBClose_1";

	
// end of generic

 

ok_Hash.put("tDBClose_1", true);
end_Hash.put("tDBClose_1", System.currentTimeMillis());




/**
 * [tDBClose_1 end ] stop
 */
				}//end the resume

				



	
			}catch(java.lang.Exception e){	
				
				    if(!(e instanceof TalendException)){
					   log.fatal(currentComponent + " " + e.getMessage(),e);
					}
				
				TalendException te = new TalendException(e, currentComponent, globalMap);
				
				throw te;
			}catch(java.lang.Error error){	
				
					runStat.stopThreadStat();
				
				throw error;
			}finally{
				
				try{
					
	
	/**
	 * [tDBClose_1 finally ] start
	 */

	

	
	
	currentComponent="tDBClose_1";

	
// finally of generic

 



/**
 * [tDBClose_1 finally ] stop
 */
				}catch(java.lang.Exception e){	
					//ignore
				}catch(java.lang.Error error){
					//ignore
				}
				resourceMap = null;
			}
		

		globalMap.put("tDBClose_1_SUBPROCESS_STATE", 1);
	}
	

public void tWarn_1Process(final java.util.Map<String, Object> globalMap) throws TalendException {
	globalMap.put("tWarn_1_SUBPROCESS_STATE", 0);

 final boolean execStat = this.execStat;
	
		String iterateId = "";
	
	
	String currentComponent = "";
	java.util.Map<String, Object> resourceMap = new java.util.HashMap<String, Object>();

	try {
			// TDI-39566 avoid throwing an useless Exception
			boolean resumeIt = true;
			if (globalResumeTicket == false && resumeEntryMethodName != null) {
				String currentMethodName = new java.lang.Exception().getStackTrace()[0].getMethodName();
				resumeIt = resumeEntryMethodName.equals(currentMethodName);
			}
			if (resumeIt || globalResumeTicket) { //start the resume
				globalResumeTicket = true;





	
	/**
	 * [tWarn_1 begin ] start
	 */

	

	
		
		ok_Hash.put("tWarn_1", false);
		start_Hash.put("tWarn_1", System.currentTimeMillis());
		
	
	currentComponent="tWarn_1";

	
		int tos_count_tWarn_1 = 0;
		
                if(log.isDebugEnabled())
            log.debug("tWarn_1 - "  + ("Start to work.") );
            if (log.isDebugEnabled()) {
                class BytesLimit65535_tWarn_1{
                    public void limitLog4jByte() throws Exception{
                    StringBuilder log4jParamters_tWarn_1 = new StringBuilder();
                    log4jParamters_tWarn_1.append("Parameters:");
                            log4jParamters_tWarn_1.append("MESSAGE" + " = " + "\"this is a warning\"");
                        log4jParamters_tWarn_1.append(" | ");
                            log4jParamters_tWarn_1.append("CODE" + " = " + "42");
                        log4jParamters_tWarn_1.append(" | ");
                            log4jParamters_tWarn_1.append("PRIORITY" + " = " + "4");
                        log4jParamters_tWarn_1.append(" | ");
                if(log.isDebugEnabled())
            log.debug("tWarn_1 - "  + (log4jParamters_tWarn_1) );
                    } 
                } 
            new BytesLimit65535_tWarn_1().limitLog4jByte();
            }
			if(enableLogStash) {
				talendJobLog.addCM("tWarn_1", "tWarn_1", "tWarn");
				talendJobLogProcess(globalMap);
			}
			

 



/**
 * [tWarn_1 begin ] stop
 */
	
	/**
	 * [tWarn_1 main ] start
	 */

	

	
	
	currentComponent="tWarn_1";

	

		
try {
	
	resumeUtil.addLog("USER_DEF_LOG", "NODE:tWarn_1", "", Thread.currentThread().getId() + "", "WARN","","this is a warning","", "");
            log.warn("tWarn_1 - "  + ("Message: ")  + ("this is a warning")  + (". Code: ")  + (42) );
	globalMap.put("tWarn_1_WARN_MESSAGES", "this is a warning"); 
	globalMap.put("tWarn_1_WARN_PRIORITY", 4);
	globalMap.put("tWarn_1_WARN_CODE", 42);
	
} catch (Exception e_tWarn_1) {
globalMap.put("tWarn_1_ERROR_MESSAGE",e_tWarn_1.getMessage());
	logIgnoredError(String.format("tWarn_1 - tWarn failed to log message due to internal error: %s", e_tWarn_1), e_tWarn_1);
}


 


	tos_count_tWarn_1++;

/**
 * [tWarn_1 main ] stop
 */
	
	/**
	 * [tWarn_1 process_data_begin ] start
	 */

	

	
	
	currentComponent="tWarn_1";

	

 



/**
 * [tWarn_1 process_data_begin ] stop
 */
	
	/**
	 * [tWarn_1 process_data_end ] start
	 */

	

	
	
	currentComponent="tWarn_1";

	

 



/**
 * [tWarn_1 process_data_end ] stop
 */
	
	/**
	 * [tWarn_1 end ] start
	 */

	

	
	
	currentComponent="tWarn_1";

	

 
                if(log.isDebugEnabled())
            log.debug("tWarn_1 - "  + ("Done.") );

ok_Hash.put("tWarn_1", true);
end_Hash.put("tWarn_1", System.currentTimeMillis());




/**
 * [tWarn_1 end ] stop
 */
				}//end the resume

				



	
			}catch(java.lang.Exception e){	
				
				    if(!(e instanceof TalendException)){
					   log.fatal(currentComponent + " " + e.getMessage(),e);
					}
				
				TalendException te = new TalendException(e, currentComponent, globalMap);
				
				throw te;
			}catch(java.lang.Error error){	
				
					runStat.stopThreadStat();
				
				throw error;
			}finally{
				
				try{
					
	
	/**
	 * [tWarn_1 finally ] start
	 */

	

	
	
	currentComponent="tWarn_1";

	

 



/**
 * [tWarn_1 finally ] stop
 */
				}catch(java.lang.Exception e){	
					//ignore
				}catch(java.lang.Error error){
					//ignore
				}
				resourceMap = null;
			}
		

		globalMap.put("tWarn_1_SUBPROCESS_STATE", 1);
	}
	

public void tDBConnection_2Process(final java.util.Map<String, Object> globalMap) throws TalendException {
	globalMap.put("tDBConnection_2_SUBPROCESS_STATE", 0);

 final boolean execStat = this.execStat;
	
		String iterateId = "";
	
	
	String currentComponent = "";
	java.util.Map<String, Object> resourceMap = new java.util.HashMap<String, Object>();

	try {
			// TDI-39566 avoid throwing an useless Exception
			boolean resumeIt = true;
			if (globalResumeTicket == false && resumeEntryMethodName != null) {
				String currentMethodName = new java.lang.Exception().getStackTrace()[0].getMethodName();
				resumeIt = resumeEntryMethodName.equals(currentMethodName);
			}
			if (resumeIt || globalResumeTicket) { //start the resume
				globalResumeTicket = true;





	
	/**
	 * [tDBConnection_2 begin ] start
	 */

	

	
		
		ok_Hash.put("tDBConnection_2", false);
		start_Hash.put("tDBConnection_2", System.currentTimeMillis());
		
	
	currentComponent="tDBConnection_2";

	
		int tos_count_tDBConnection_2 = 0;
		
			if(enableLogStash) {
				talendJobLog.addCM("tDBConnection_2", "tDBConnection_2", "tSnowflakeConnection");
				talendJobLogProcess(globalMap);
			}
			

boolean doesNodeBelongToRequest_tDBConnection_2 = 0 == 0;
@SuppressWarnings("unchecked")
java.util.Map<String, Object> restRequest_tDBConnection_2 = (java.util.Map<String, Object>)globalMap.get("restRequest");
String currentTRestRequestOperation_tDBConnection_2 = (String)(restRequest_tDBConnection_2 != null ? restRequest_tDBConnection_2.get("OPERATION") : null);

org.talend.components.api.component.ComponentDefinition def_tDBConnection_2 =
        new org.talend.components.snowflake.tsnowflakeconnection.TSnowflakeConnectionDefinition();

org.talend.components.api.component.runtime.Writer writer_tDBConnection_2 = null;
org.talend.components.api.component.runtime.Reader reader_tDBConnection_2 = null;


org.talend.components.snowflake.SnowflakeConnectionProperties props_tDBConnection_2 =
        (org.talend.components.snowflake.SnowflakeConnectionProperties) def_tDBConnection_2.createRuntimeProperties();
 		                    props_tDBConnection_2.setValue("loginTimeout",
 		                    15);
 		                    
 		                    props_tDBConnection_2.setValue("account",
 		                    "LEGENDBIOTECH.east-us-2.azure");
 		                    
 		                    props_tDBConnection_2.setValue("regionID",
 		                    "");
 		                    
 		                    props_tDBConnection_2.setValue("useCustomRegion",
 		                    false);
 		                    
 		                    props_tDBConnection_2.setValue("authenticationType",
 		                        org.talend.components.snowflake.tsnowflakeconnection.AuthenticationType.BASIC);
 		                    
 		                    props_tDBConnection_2.setValue("warehouse",
 		                    "USCOMM_SHARED_DW");
 		                    
 		                    props_tDBConnection_2.setValue("db",
 		                    "USSUNSHINE_RPT_DEV");
 		                    
 		                    props_tDBConnection_2.setValue("schemaName",
 		                    "USSUNSHINE_RPT_SCHEMA");
 		                    
 		                    props_tDBConnection_2.setValue("role",
 		                    "");
 		                    
 		                    props_tDBConnection_2.setValue("jdbcParameters",
 		                    "");
 		                    
 		                    props_tDBConnection_2.setValue("autoCommit",
 		                    true);
 		                    
 		                    props_tDBConnection_2.userPassword.setValue("useAuth",
 		                    false);
 		                    
 		                    props_tDBConnection_2.userPassword.setValue("userId",
 		                    "SUNSHINE_RPT");
 		                    
 		                        props_tDBConnection_2.userPassword.setValue("password",
 		                        routines.system.PasswordEncryptUtil.decryptPassword("enc:routine.encryption.key.v1:e5kBbJxdhnOznrWnm70pLGAWfKke6/cBVSX0mHj72jfSfqAt5g=="));
 		                        
 		                    props_tDBConnection_2.referencedComponent.setValue("referenceDefinitionName",
 		                    "tSnowflakeConnection");
 		                    
    if (org.talend.components.api.properties.ComponentReferenceProperties.ReferenceType.COMPONENT_INSTANCE == props_tDBConnection_2.referencedComponent.referenceType.getValue()) {
        final String referencedComponentInstanceId_tDBConnection_2 = props_tDBConnection_2.referencedComponent.componentInstanceId.getStringValue();
        if (referencedComponentInstanceId_tDBConnection_2 != null) {
            org.talend.daikon.properties.Properties referencedComponentProperties_tDBConnection_2 = (org.talend.daikon.properties.Properties) globalMap.get(
                referencedComponentInstanceId_tDBConnection_2 + "_COMPONENT_RUNTIME_PROPERTIES");
            props_tDBConnection_2.referencedComponent.setReference(referencedComponentProperties_tDBConnection_2);
        }
    }
globalMap.put("tDBConnection_2_COMPONENT_RUNTIME_PROPERTIES", props_tDBConnection_2);
globalMap.putIfAbsent("TALEND_PRODUCT_VERSION", "8.0");
globalMap.put("TALEND_COMPONENTS_VERSION", "0.37.4");
java.net.URL mappings_url_tDBConnection_2= this.getClass().getResource("/xmlMappings");
globalMap.put("tDBConnection_2_MAPPINGS_URL", mappings_url_tDBConnection_2);

org.talend.components.api.container.RuntimeContainer container_tDBConnection_2 = new org.talend.components.api.container.RuntimeContainer() {
    public Object getComponentData(String componentId, String key) {
        return globalMap.get(componentId + "_" + key);
    }

    public void setComponentData(String componentId, String key, Object data) {
        globalMap.put(componentId + "_" + key, data);
    }

    public String getCurrentComponentId() {
        return "tDBConnection_2";
    }

    public Object getGlobalData(String key) {
    	return globalMap.get(key);
    }
};

int nb_line_tDBConnection_2 = 0;

org.talend.components.api.component.ConnectorTopology topology_tDBConnection_2 = null;
topology_tDBConnection_2 = org.talend.components.api.component.ConnectorTopology.NONE;

org.talend.daikon.runtime.RuntimeInfo runtime_info_tDBConnection_2 = def_tDBConnection_2.getRuntimeInfo(
    org.talend.components.api.component.runtime.ExecutionEngine.DI, props_tDBConnection_2, topology_tDBConnection_2);
java.util.Set<org.talend.components.api.component.ConnectorTopology> supported_connector_topologies_tDBConnection_2 = def_tDBConnection_2.getSupportedConnectorTopologies();

org.talend.components.api.component.runtime.RuntimableRuntime componentRuntime_tDBConnection_2 = (org.talend.components.api.component.runtime.RuntimableRuntime)(Class.forName(runtime_info_tDBConnection_2.getRuntimeClassName()).newInstance());
org.talend.daikon.properties.ValidationResult initVr_tDBConnection_2 = componentRuntime_tDBConnection_2.initialize(container_tDBConnection_2, props_tDBConnection_2);

if (initVr_tDBConnection_2.getStatus() == org.talend.daikon.properties.ValidationResult.Result.ERROR ) {
    throw new RuntimeException(initVr_tDBConnection_2.getMessage());
}

if(componentRuntime_tDBConnection_2 instanceof org.talend.components.api.component.runtime.ComponentDriverInitialization) {
	org.talend.components.api.component.runtime.ComponentDriverInitialization compDriverInitialization_tDBConnection_2 = (org.talend.components.api.component.runtime.ComponentDriverInitialization)componentRuntime_tDBConnection_2;
	compDriverInitialization_tDBConnection_2.runAtDriver(container_tDBConnection_2);
}

org.talend.components.api.component.runtime.SourceOrSink sourceOrSink_tDBConnection_2 = null;
if(componentRuntime_tDBConnection_2 instanceof org.talend.components.api.component.runtime.SourceOrSink) {
	sourceOrSink_tDBConnection_2 = (org.talend.components.api.component.runtime.SourceOrSink)componentRuntime_tDBConnection_2;
	if (doesNodeBelongToRequest_tDBConnection_2) {
        org.talend.daikon.properties.ValidationResult vr_tDBConnection_2 = sourceOrSink_tDBConnection_2.validate(container_tDBConnection_2);
        if (vr_tDBConnection_2.getStatus() == org.talend.daikon.properties.ValidationResult.Result.ERROR ) {
            throw new RuntimeException(vr_tDBConnection_2.getMessage());
        }
	}
}

 



/**
 * [tDBConnection_2 begin ] stop
 */
	
	/**
	 * [tDBConnection_2 main ] start
	 */

	

	
	
	currentComponent="tDBConnection_2";

	


 


	tos_count_tDBConnection_2++;

/**
 * [tDBConnection_2 main ] stop
 */
	
	/**
	 * [tDBConnection_2 process_data_begin ] start
	 */

	

	
	
	currentComponent="tDBConnection_2";

	


 



/**
 * [tDBConnection_2 process_data_begin ] stop
 */
	
	/**
	 * [tDBConnection_2 process_data_end ] start
	 */

	

	
	
	currentComponent="tDBConnection_2";

	


 



/**
 * [tDBConnection_2 process_data_end ] stop
 */
	
	/**
	 * [tDBConnection_2 end ] start
	 */

	

	
	
	currentComponent="tDBConnection_2";

	
// end of generic

 

ok_Hash.put("tDBConnection_2", true);
end_Hash.put("tDBConnection_2", System.currentTimeMillis());




/**
 * [tDBConnection_2 end ] stop
 */
				}//end the resume

				



	
			}catch(java.lang.Exception e){	
				
				    if(!(e instanceof TalendException)){
					   log.fatal(currentComponent + " " + e.getMessage(),e);
					}
				
				TalendException te = new TalendException(e, currentComponent, globalMap);
				
				throw te;
			}catch(java.lang.Error error){	
				
					runStat.stopThreadStat();
				
				throw error;
			}finally{
				
				try{
					
	
	/**
	 * [tDBConnection_2 finally ] start
	 */

	

	
	
	currentComponent="tDBConnection_2";

	
// finally of generic

 



/**
 * [tDBConnection_2 finally ] stop
 */
				}catch(java.lang.Exception e){	
					//ignore
				}catch(java.lang.Error error){
					//ignore
				}
				resourceMap = null;
			}
		

		globalMap.put("tDBConnection_2_SUBPROCESS_STATE", 1);
	}
	

public void talendJobLogProcess(final java.util.Map<String, Object> globalMap) throws TalendException {
	globalMap.put("talendJobLog_SUBPROCESS_STATE", 0);

 final boolean execStat = this.execStat;
	
		String iterateId = "";
	
	
	String currentComponent = "";
	java.util.Map<String, Object> resourceMap = new java.util.HashMap<String, Object>();

	try {
			// TDI-39566 avoid throwing an useless Exception
			boolean resumeIt = true;
			if (globalResumeTicket == false && resumeEntryMethodName != null) {
				String currentMethodName = new java.lang.Exception().getStackTrace()[0].getMethodName();
				resumeIt = resumeEntryMethodName.equals(currentMethodName);
			}
			if (resumeIt || globalResumeTicket) { //start the resume
				globalResumeTicket = true;





	
	/**
	 * [talendJobLog begin ] start
	 */

	

	
		
		ok_Hash.put("talendJobLog", false);
		start_Hash.put("talendJobLog", System.currentTimeMillis());
		
	
	currentComponent="talendJobLog";

	
		int tos_count_talendJobLog = 0;
		

	for (JobStructureCatcherUtils.JobStructureCatcherMessage jcm : talendJobLog.getMessages()) {
		org.talend.job.audit.JobContextBuilder builder_talendJobLog = org.talend.job.audit.JobContextBuilder.create().jobName(jcm.job_name).jobId(jcm.job_id).jobVersion(jcm.job_version)
			.custom("process_id", jcm.pid).custom("thread_id", jcm.tid).custom("pid", pid).custom("father_pid", fatherPid).custom("root_pid", rootPid);
		org.talend.logging.audit.Context log_context_talendJobLog = null;
		
		
		if(jcm.log_type == JobStructureCatcherUtils.LogType.PERFORMANCE){
			long timeMS = jcm.end_time - jcm.start_time;
			String duration = String.valueOf(timeMS);
			
			log_context_talendJobLog = builder_talendJobLog
				.sourceId(jcm.sourceId).sourceLabel(jcm.sourceLabel).sourceConnectorType(jcm.sourceComponentName)
				.targetId(jcm.targetId).targetLabel(jcm.targetLabel).targetConnectorType(jcm.targetComponentName)
				.connectionName(jcm.current_connector).rows(jcm.row_count).duration(duration).build();
			auditLogger_talendJobLog.flowExecution(log_context_talendJobLog);
		} else if(jcm.log_type == JobStructureCatcherUtils.LogType.JOBSTART) {
			log_context_talendJobLog = builder_talendJobLog.timestamp(jcm.moment).build();
			auditLogger_talendJobLog.jobstart(log_context_talendJobLog);
		} else if(jcm.log_type == JobStructureCatcherUtils.LogType.JOBEND) {
			long timeMS = jcm.end_time - jcm.start_time;
			String duration = String.valueOf(timeMS);
		
			log_context_talendJobLog = builder_talendJobLog
				.timestamp(jcm.moment).duration(duration).status(jcm.status).build();
			auditLogger_talendJobLog.jobstop(log_context_talendJobLog);
		} else if(jcm.log_type == JobStructureCatcherUtils.LogType.RUNCOMPONENT) {
			log_context_talendJobLog = builder_talendJobLog.timestamp(jcm.moment)
				.connectorType(jcm.component_name).connectorId(jcm.component_id).connectorLabel(jcm.component_label).build();
			auditLogger_talendJobLog.runcomponent(log_context_talendJobLog);
		} else if(jcm.log_type == JobStructureCatcherUtils.LogType.FLOWINPUT) {//log current component input line
			long timeMS = jcm.end_time - jcm.start_time;
			String duration = String.valueOf(timeMS);
			
			log_context_talendJobLog = builder_talendJobLog
				.connectorType(jcm.component_name).connectorId(jcm.component_id).connectorLabel(jcm.component_label)
				.connectionName(jcm.current_connector).connectionType(jcm.current_connector_type)
				.rows(jcm.total_row_number).duration(duration).build();
			auditLogger_talendJobLog.flowInput(log_context_talendJobLog);
		} else if(jcm.log_type == JobStructureCatcherUtils.LogType.FLOWOUTPUT) {//log current component output/reject line
			long timeMS = jcm.end_time - jcm.start_time;
			String duration = String.valueOf(timeMS);
			
			log_context_talendJobLog = builder_talendJobLog
				.connectorType(jcm.component_name).connectorId(jcm.component_id).connectorLabel(jcm.component_label)
				.connectionName(jcm.current_connector).connectionType(jcm.current_connector_type)
				.rows(jcm.total_row_number).duration(duration).build();
			auditLogger_talendJobLog.flowOutput(log_context_talendJobLog);
		}
		
		
		
	}

 



/**
 * [talendJobLog begin ] stop
 */
	
	/**
	 * [talendJobLog main ] start
	 */

	

	
	
	currentComponent="talendJobLog";

	

 


	tos_count_talendJobLog++;

/**
 * [talendJobLog main ] stop
 */
	
	/**
	 * [talendJobLog process_data_begin ] start
	 */

	

	
	
	currentComponent="talendJobLog";

	

 



/**
 * [talendJobLog process_data_begin ] stop
 */
	
	/**
	 * [talendJobLog process_data_end ] start
	 */

	

	
	
	currentComponent="talendJobLog";

	

 



/**
 * [talendJobLog process_data_end ] stop
 */
	
	/**
	 * [talendJobLog end ] start
	 */

	

	
	
	currentComponent="talendJobLog";

	

 

ok_Hash.put("talendJobLog", true);
end_Hash.put("talendJobLog", System.currentTimeMillis());




/**
 * [talendJobLog end ] stop
 */
				}//end the resume

				



	
			}catch(java.lang.Exception e){	
				
				    if(!(e instanceof TalendException)){
					   log.fatal(currentComponent + " " + e.getMessage(),e);
					}
				
				TalendException te = new TalendException(e, currentComponent, globalMap);
				
				throw te;
			}catch(java.lang.Error error){	
				
					runStat.stopThreadStat();
				
				throw error;
			}finally{
				
				try{
					
	
	/**
	 * [talendJobLog finally ] start
	 */

	

	
	
	currentComponent="talendJobLog";

	

 



/**
 * [talendJobLog finally ] stop
 */
				}catch(java.lang.Exception e){	
					//ignore
				}catch(java.lang.Error error){
					//ignore
				}
				resourceMap = null;
			}
		

		globalMap.put("talendJobLog_SUBPROCESS_STATE", 1);
	}
	
    public String resuming_logs_dir_path = null;
    public String resuming_checkpoint_path = null;
    public String parent_part_launcher = null;
    private String resumeEntryMethodName = null;
    private boolean globalResumeTicket = false;

    public boolean watch = false;
    // portStats is null, it means don't execute the statistics
    public Integer portStats = null;
    public int portTraces = 4334;
    public String clientHost;
    public String defaultClientHost = "localhost";
    public String contextStr = "Default";
    public boolean isDefaultContext = true;
    public String pid = "0";
    public String rootPid = null;
    public String fatherPid = null;
    public String fatherNode = null;
    public long startTime = 0;
    public boolean isChildJob = false;
    public String log4jLevel = "";
    
    private boolean enableLogStash;

    private boolean execStat = true;

    private ThreadLocal<java.util.Map<String, String>> threadLocal = new ThreadLocal<java.util.Map<String, String>>() {
        protected java.util.Map<String, String> initialValue() {
            java.util.Map<String,String> threadRunResultMap = new java.util.HashMap<String, String>();
            threadRunResultMap.put("errorCode", null);
            threadRunResultMap.put("status", "");
            return threadRunResultMap;
        };
    };


    protected PropertiesWithType context_param = new PropertiesWithType();
    public java.util.Map<String, Object> parentContextMap = new java.util.HashMap<String, Object>();

    public String status= "";
    
    private final org.talend.components.common.runtime.SharedConnectionsPool connectionPool = new org.talend.components.common.runtime.SharedConnectionsPool() {
    	public java.sql.Connection getDBConnection(String dbDriver, String url, String userName, String password, String dbConnectionName)
            throws ClassNotFoundException, java.sql.SQLException {
            return SharedDBConnection.getDBConnection(dbDriver, url, userName, password, dbConnectionName);
        }

    	public java.sql.Connection getDBConnection(String dbDriver, String url, String dbConnectionName)
            throws ClassNotFoundException, java.sql.SQLException {
            return SharedDBConnection.getDBConnection(dbDriver, url, dbConnectionName);
        }
    };
    
    private static final String GLOBAL_CONNECTION_POOL_KEY = "GLOBAL_CONNECTION_POOL";
    
    {
    	globalMap.put(GLOBAL_CONNECTION_POOL_KEY, connectionPool);
    }

    public static void main(String[] args){
        final BEACON_EXTRACT_SNOWFLAKE BEACON_EXTRACT_SNOWFLAKEClass = new BEACON_EXTRACT_SNOWFLAKE();

        int exitCode = BEACON_EXTRACT_SNOWFLAKEClass.runJobInTOS(args);
	        if(exitCode==0){
		        log.info("TalendJob: 'BEACON_EXTRACT_SNOWFLAKE' - Done.");
	        }

        System.exit(exitCode);
    }


    public String[][] runJob(String[] args) {

        int exitCode = runJobInTOS(args);
        String[][] bufferValue = new String[][] { { Integer.toString(exitCode) } };

        return bufferValue;
    }

    public boolean hastBufferOutputComponent() {
		boolean hastBufferOutput = false;
    	
        return hastBufferOutput;
    }

    public int runJobInTOS(String[] args) {
	   	// reset status
	   	status = "";
	   	
        String lastStr = "";
        for (String arg : args) {
            if (arg.equalsIgnoreCase("--context_param")) {
                lastStr = arg;
            } else if (lastStr.equals("")) {
                evalParam(arg);
            } else {
                evalParam(lastStr + " " + arg);
                lastStr = "";
            }
        }
        enableLogStash = "true".equalsIgnoreCase(System.getProperty("audit.enabled"));

	        if(!"".equals(log4jLevel)){
	        	
				
				
				if("trace".equalsIgnoreCase(log4jLevel)){
					org.apache.logging.log4j.core.config.Configurator.setLevel(log.getName(), org.apache.logging.log4j.Level.TRACE);
				}else if("debug".equalsIgnoreCase(log4jLevel)){
					org.apache.logging.log4j.core.config.Configurator.setLevel(log.getName(), org.apache.logging.log4j.Level.DEBUG);
				}else if("info".equalsIgnoreCase(log4jLevel)){
					org.apache.logging.log4j.core.config.Configurator.setLevel(log.getName(), org.apache.logging.log4j.Level.INFO);
				}else if("warn".equalsIgnoreCase(log4jLevel)){
					org.apache.logging.log4j.core.config.Configurator.setLevel(log.getName(), org.apache.logging.log4j.Level.WARN);
				}else if("error".equalsIgnoreCase(log4jLevel)){
					org.apache.logging.log4j.core.config.Configurator.setLevel(log.getName(), org.apache.logging.log4j.Level.ERROR);
				}else if("fatal".equalsIgnoreCase(log4jLevel)){
					org.apache.logging.log4j.core.config.Configurator.setLevel(log.getName(), org.apache.logging.log4j.Level.FATAL);
				}else if ("off".equalsIgnoreCase(log4jLevel)){
					org.apache.logging.log4j.core.config.Configurator.setLevel(log.getName(), org.apache.logging.log4j.Level.OFF);
				}
				org.apache.logging.log4j.core.config.Configurator.setLevel(org.apache.logging.log4j.LogManager.getRootLogger().getName(), log.getLevel());
				
    	    }
        	log.info("TalendJob: 'BEACON_EXTRACT_SNOWFLAKE' - Start.");
    	
    	
    	
			if(enableLogStash) {
				java.util.Properties properties_talendJobLog = new java.util.Properties();
				properties_talendJobLog.setProperty("root.logger", "audit");
				properties_talendJobLog.setProperty("encoding", "UTF-8");
				properties_talendJobLog.setProperty("application.name", "Talend Studio");
				properties_talendJobLog.setProperty("service.name", "Talend Studio Job");
				properties_talendJobLog.setProperty("instance.name", "Talend Studio Job Instance");
				properties_talendJobLog.setProperty("propagate.appender.exceptions", "none");
				properties_talendJobLog.setProperty("log.appender", "file");
				properties_talendJobLog.setProperty("appender.file.path", "audit.json");
				properties_talendJobLog.setProperty("appender.file.maxsize", "52428800");
				properties_talendJobLog.setProperty("appender.file.maxbackup", "20");
				properties_talendJobLog.setProperty("host", "false");

				System.getProperties().stringPropertyNames().stream()
					.filter(it -> it.startsWith("audit.logger."))
					.forEach(key -> properties_talendJobLog.setProperty(key.substring("audit.logger.".length()), System.getProperty(key)));

				
				
				
				org.apache.logging.log4j.core.config.Configurator.setLevel(properties_talendJobLog.getProperty("root.logger"), org.apache.logging.log4j.Level.DEBUG);
				
				auditLogger_talendJobLog = org.talend.job.audit.JobEventAuditLoggerFactory.createJobAuditLogger(properties_talendJobLog);
			}
		

        if(clientHost == null) {
            clientHost = defaultClientHost;
        }

        if(pid == null || "0".equals(pid)) {
            pid = TalendString.getAsciiRandomString(6);
        }

        if (rootPid==null) {
            rootPid = pid;
        }
        if (fatherPid==null) {
            fatherPid = pid;
        }else{
            isChildJob = true;
        }

        if (portStats != null) {
            // portStats = -1; //for testing
            if (portStats < 0 || portStats > 65535) {
                // issue:10869, the portStats is invalid, so this client socket can't open
                System.err.println("The statistics socket port " + portStats + " is invalid.");
                execStat = false;
            }
        } else {
            execStat = false;
        }
        boolean inOSGi = routines.system.BundleUtils.inOSGi();

        try {
            java.util.Dictionary<String, Object> jobProperties = null;
            if (inOSGi) {
                jobProperties = routines.system.BundleUtils.getJobProperties(jobName);
    
                if (jobProperties != null && jobProperties.get("context") != null) {
                    contextStr = (String)jobProperties.get("context");
                }
            }
            //call job/subjob with an existing context, like: --context=production. if without this parameter, there will use the default context instead.
            java.io.InputStream inContext = BEACON_EXTRACT_SNOWFLAKE.class.getClassLoader().getResourceAsStream("uscomm_sunshine_rpt_qa/beacon_extract_snowflake_0_1/contexts/" + contextStr + ".properties");
            if (inContext == null) {
                inContext = BEACON_EXTRACT_SNOWFLAKE.class.getClassLoader().getResourceAsStream("config/contexts/" + contextStr + ".properties");
            }
            if (inContext != null) {
                try {
                    //defaultProps is in order to keep the original context value
                    if(context != null && context.isEmpty()) {
    	                defaultProps.load(inContext);
    	                if (inOSGi && jobProperties != null) {
                             java.util.Enumeration<String> keys = jobProperties.keys();
                             while (keys.hasMoreElements()) {
                                 String propKey = keys.nextElement();
                                 if (defaultProps.containsKey(propKey)) {
                                     defaultProps.put(propKey, (String) jobProperties.get(propKey));
                                 }
                             }
    	                }
    	                context = new ContextProperties(defaultProps);
                    }
                } finally {
                    inContext.close();
                }
            } else if (!isDefaultContext) {
                //print info and job continue to run, for case: context_param is not empty.
                System.err.println("Could not find the context " + contextStr);
            }

            if(!context_param.isEmpty()) {
                context.putAll(context_param);
				//set types for params from parentJobs
				for (Object key: context_param.keySet()){
					String context_key = key.toString();
					String context_type = context_param.getContextType(context_key);
					context.setContextType(context_key, context_type);

				}
            }
            class ContextProcessing {
                private void processContext_0() {
                        context.setContextType("USSUNSHINE_RPT_DEV_CONN_oauthProperties_oauthPassword", "id_Password");
                        if(context.getStringValue("USSUNSHINE_RPT_DEV_CONN_oauthProperties_oauthPassword") == null) {
                            context.USSUNSHINE_RPT_DEV_CONN_oauthProperties_oauthPassword = null;
                        } else {
                            String pwd_USSUNSHINE_RPT_DEV_CONN_oauthProperties_oauthPassword_value = context.getProperty("USSUNSHINE_RPT_DEV_CONN_oauthProperties_oauthPassword");
                            context.USSUNSHINE_RPT_DEV_CONN_oauthProperties_oauthPassword = null;
                            if(pwd_USSUNSHINE_RPT_DEV_CONN_oauthProperties_oauthPassword_value!=null) {
                                if(context_param.containsKey("USSUNSHINE_RPT_DEV_CONN_oauthProperties_oauthPassword")) {//no need to decrypt if it come from program argument or parent job runtime
                                    context.USSUNSHINE_RPT_DEV_CONN_oauthProperties_oauthPassword = pwd_USSUNSHINE_RPT_DEV_CONN_oauthProperties_oauthPassword_value;
                                } else if (!pwd_USSUNSHINE_RPT_DEV_CONN_oauthProperties_oauthPassword_value.isEmpty()) {
                                    try {
                                        context.USSUNSHINE_RPT_DEV_CONN_oauthProperties_oauthPassword = routines.system.PasswordEncryptUtil.decryptPassword(pwd_USSUNSHINE_RPT_DEV_CONN_oauthProperties_oauthPassword_value);
                                        context.put("USSUNSHINE_RPT_DEV_CONN_oauthProperties_oauthPassword",context.USSUNSHINE_RPT_DEV_CONN_oauthProperties_oauthPassword);
                                    } catch (java.lang.RuntimeException e) {
                                        //do nothing
                                    }
                                }
                            }
                        }
                        context.setContextType("USSUNSHINE_RPT_DEV_CONN_jdbcParameters", "id_String");
                        if(context.getStringValue("USSUNSHINE_RPT_DEV_CONN_jdbcParameters") == null) {
                            context.USSUNSHINE_RPT_DEV_CONN_jdbcParameters = null;
                        } else {
                            context.USSUNSHINE_RPT_DEV_CONN_jdbcParameters=(String) context.getProperty("USSUNSHINE_RPT_DEV_CONN_jdbcParameters");
                        }
                        context.setContextType("USSUNSHINE_RPT_DEV_CONN_regionID", "id_String");
                        if(context.getStringValue("USSUNSHINE_RPT_DEV_CONN_regionID") == null) {
                            context.USSUNSHINE_RPT_DEV_CONN_regionID = null;
                        } else {
                            context.USSUNSHINE_RPT_DEV_CONN_regionID=(String) context.getProperty("USSUNSHINE_RPT_DEV_CONN_regionID");
                        }
                        context.setContextType("USSUNSHINE_RPT_DEV_CONN_warehouse", "id_String");
                        if(context.getStringValue("USSUNSHINE_RPT_DEV_CONN_warehouse") == null) {
                            context.USSUNSHINE_RPT_DEV_CONN_warehouse = null;
                        } else {
                            context.USSUNSHINE_RPT_DEV_CONN_warehouse=(String) context.getProperty("USSUNSHINE_RPT_DEV_CONN_warehouse");
                        }
                        context.setContextType("USSUNSHINE_RPT_DEV_CONN_account", "id_String");
                        if(context.getStringValue("USSUNSHINE_RPT_DEV_CONN_account") == null) {
                            context.USSUNSHINE_RPT_DEV_CONN_account = null;
                        } else {
                            context.USSUNSHINE_RPT_DEV_CONN_account=(String) context.getProperty("USSUNSHINE_RPT_DEV_CONN_account");
                        }
                        context.setContextType("USSUNSHINE_RPT_DEV_CONN_userPassword_password", "id_Password");
                        if(context.getStringValue("USSUNSHINE_RPT_DEV_CONN_userPassword_password") == null) {
                            context.USSUNSHINE_RPT_DEV_CONN_userPassword_password = null;
                        } else {
                            String pwd_USSUNSHINE_RPT_DEV_CONN_userPassword_password_value = context.getProperty("USSUNSHINE_RPT_DEV_CONN_userPassword_password");
                            context.USSUNSHINE_RPT_DEV_CONN_userPassword_password = null;
                            if(pwd_USSUNSHINE_RPT_DEV_CONN_userPassword_password_value!=null) {
                                if(context_param.containsKey("USSUNSHINE_RPT_DEV_CONN_userPassword_password")) {//no need to decrypt if it come from program argument or parent job runtime
                                    context.USSUNSHINE_RPT_DEV_CONN_userPassword_password = pwd_USSUNSHINE_RPT_DEV_CONN_userPassword_password_value;
                                } else if (!pwd_USSUNSHINE_RPT_DEV_CONN_userPassword_password_value.isEmpty()) {
                                    try {
                                        context.USSUNSHINE_RPT_DEV_CONN_userPassword_password = routines.system.PasswordEncryptUtil.decryptPassword(pwd_USSUNSHINE_RPT_DEV_CONN_userPassword_password_value);
                                        context.put("USSUNSHINE_RPT_DEV_CONN_userPassword_password",context.USSUNSHINE_RPT_DEV_CONN_userPassword_password);
                                    } catch (java.lang.RuntimeException e) {
                                        //do nothing
                                    }
                                }
                            }
                        }
                        context.setContextType("USSUNSHINE_RPT_DEV_CONN_db", "id_String");
                        if(context.getStringValue("USSUNSHINE_RPT_DEV_CONN_db") == null) {
                            context.USSUNSHINE_RPT_DEV_CONN_db = null;
                        } else {
                            context.USSUNSHINE_RPT_DEV_CONN_db=(String) context.getProperty("USSUNSHINE_RPT_DEV_CONN_db");
                        }
                        context.setContextType("USSUNSHINE_RPT_DEV_CONN_loginTimeout", "id_Integer");
                        if(context.getStringValue("USSUNSHINE_RPT_DEV_CONN_loginTimeout") == null) {
                            context.USSUNSHINE_RPT_DEV_CONN_loginTimeout = null;
                        } else {
                            try{
                                context.USSUNSHINE_RPT_DEV_CONN_loginTimeout=routines.system.ParserUtils.parseTo_Integer (context.getProperty("USSUNSHINE_RPT_DEV_CONN_loginTimeout"));
                            } catch(NumberFormatException e){
                                log.warn(String.format("Null value will be used for context parameter %s: %s", "USSUNSHINE_RPT_DEV_CONN_loginTimeout", e.getMessage()));
                                context.USSUNSHINE_RPT_DEV_CONN_loginTimeout=null;
                            }
                        }
                        context.setContextType("USSUNSHINE_RPT_DEV_CONN_oauthProperties_scope", "id_String");
                        if(context.getStringValue("USSUNSHINE_RPT_DEV_CONN_oauthProperties_scope") == null) {
                            context.USSUNSHINE_RPT_DEV_CONN_oauthProperties_scope = null;
                        } else {
                            context.USSUNSHINE_RPT_DEV_CONN_oauthProperties_scope=(String) context.getProperty("USSUNSHINE_RPT_DEV_CONN_oauthProperties_scope");
                        }
                        context.setContextType("USSUNSHINE_RPT_DEV_CONN_oauthProperties_oauthUserName", "id_String");
                        if(context.getStringValue("USSUNSHINE_RPT_DEV_CONN_oauthProperties_oauthUserName") == null) {
                            context.USSUNSHINE_RPT_DEV_CONN_oauthProperties_oauthUserName = null;
                        } else {
                            context.USSUNSHINE_RPT_DEV_CONN_oauthProperties_oauthUserName=(String) context.getProperty("USSUNSHINE_RPT_DEV_CONN_oauthProperties_oauthUserName");
                        }
                        context.setContextType("USSUNSHINE_RPT_DEV_CONN_userPassword_userId", "id_String");
                        if(context.getStringValue("USSUNSHINE_RPT_DEV_CONN_userPassword_userId") == null) {
                            context.USSUNSHINE_RPT_DEV_CONN_userPassword_userId = null;
                        } else {
                            context.USSUNSHINE_RPT_DEV_CONN_userPassword_userId=(String) context.getProperty("USSUNSHINE_RPT_DEV_CONN_userPassword_userId");
                        }
                        context.setContextType("USSUNSHINE_RPT_DEV_CONN_role", "id_String");
                        if(context.getStringValue("USSUNSHINE_RPT_DEV_CONN_role") == null) {
                            context.USSUNSHINE_RPT_DEV_CONN_role = null;
                        } else {
                            context.USSUNSHINE_RPT_DEV_CONN_role=(String) context.getProperty("USSUNSHINE_RPT_DEV_CONN_role");
                        }
                        context.setContextType("USSUNSHINE_RPT_DEV_CONN_schemaName", "id_String");
                        if(context.getStringValue("USSUNSHINE_RPT_DEV_CONN_schemaName") == null) {
                            context.USSUNSHINE_RPT_DEV_CONN_schemaName = null;
                        } else {
                            context.USSUNSHINE_RPT_DEV_CONN_schemaName=(String) context.getProperty("USSUNSHINE_RPT_DEV_CONN_schemaName");
                        }
                        context.setContextType("USSUNSHINE_RPT_DEV_CONN_oauthProperties_clientSecret", "id_Password");
                        if(context.getStringValue("USSUNSHINE_RPT_DEV_CONN_oauthProperties_clientSecret") == null) {
                            context.USSUNSHINE_RPT_DEV_CONN_oauthProperties_clientSecret = null;
                        } else {
                            String pwd_USSUNSHINE_RPT_DEV_CONN_oauthProperties_clientSecret_value = context.getProperty("USSUNSHINE_RPT_DEV_CONN_oauthProperties_clientSecret");
                            context.USSUNSHINE_RPT_DEV_CONN_oauthProperties_clientSecret = null;
                            if(pwd_USSUNSHINE_RPT_DEV_CONN_oauthProperties_clientSecret_value!=null) {
                                if(context_param.containsKey("USSUNSHINE_RPT_DEV_CONN_oauthProperties_clientSecret")) {//no need to decrypt if it come from program argument or parent job runtime
                                    context.USSUNSHINE_RPT_DEV_CONN_oauthProperties_clientSecret = pwd_USSUNSHINE_RPT_DEV_CONN_oauthProperties_clientSecret_value;
                                } else if (!pwd_USSUNSHINE_RPT_DEV_CONN_oauthProperties_clientSecret_value.isEmpty()) {
                                    try {
                                        context.USSUNSHINE_RPT_DEV_CONN_oauthProperties_clientSecret = routines.system.PasswordEncryptUtil.decryptPassword(pwd_USSUNSHINE_RPT_DEV_CONN_oauthProperties_clientSecret_value);
                                        context.put("USSUNSHINE_RPT_DEV_CONN_oauthProperties_clientSecret",context.USSUNSHINE_RPT_DEV_CONN_oauthProperties_clientSecret);
                                    } catch (java.lang.RuntimeException e) {
                                        //do nothing
                                    }
                                }
                            }
                        }
                        context.setContextType("USSUNSHINE_RPT_DEV_CONN_oauthProperties_clientId", "id_String");
                        if(context.getStringValue("USSUNSHINE_RPT_DEV_CONN_oauthProperties_clientId") == null) {
                            context.USSUNSHINE_RPT_DEV_CONN_oauthProperties_clientId = null;
                        } else {
                            context.USSUNSHINE_RPT_DEV_CONN_oauthProperties_clientId=(String) context.getProperty("USSUNSHINE_RPT_DEV_CONN_oauthProperties_clientId");
                        }
                        context.setContextType("USSUNSHINE_RPT_DEV_CONN_keyAlias", "id_String");
                        if(context.getStringValue("USSUNSHINE_RPT_DEV_CONN_keyAlias") == null) {
                            context.USSUNSHINE_RPT_DEV_CONN_keyAlias = null;
                        } else {
                            context.USSUNSHINE_RPT_DEV_CONN_keyAlias=(String) context.getProperty("USSUNSHINE_RPT_DEV_CONN_keyAlias");
                        }
                        context.setContextType("USSUNSHINE_RPT_DEV_CONN_oauthProperties_oauthTokenEndpoint", "id_String");
                        if(context.getStringValue("USSUNSHINE_RPT_DEV_CONN_oauthProperties_oauthTokenEndpoint") == null) {
                            context.USSUNSHINE_RPT_DEV_CONN_oauthProperties_oauthTokenEndpoint = null;
                        } else {
                            context.USSUNSHINE_RPT_DEV_CONN_oauthProperties_oauthTokenEndpoint=(String) context.getProperty("USSUNSHINE_RPT_DEV_CONN_oauthProperties_oauthTokenEndpoint");
                        }
                } 
                public void processAllContext() {
                        processContext_0();
                }
            }

            new ContextProcessing().processAllContext();
        } catch (java.io.IOException ie) {
            System.err.println("Could not load context "+contextStr);
            ie.printStackTrace();
        }

        // get context value from parent directly
        if (parentContextMap != null && !parentContextMap.isEmpty()) {if (parentContextMap.containsKey("USSUNSHINE_RPT_DEV_CONN_oauthProperties_oauthPassword")) {
                context.USSUNSHINE_RPT_DEV_CONN_oauthProperties_oauthPassword = (java.lang.String) parentContextMap.get("USSUNSHINE_RPT_DEV_CONN_oauthProperties_oauthPassword");
            }if (parentContextMap.containsKey("USSUNSHINE_RPT_DEV_CONN_jdbcParameters")) {
                context.USSUNSHINE_RPT_DEV_CONN_jdbcParameters = (String) parentContextMap.get("USSUNSHINE_RPT_DEV_CONN_jdbcParameters");
            }if (parentContextMap.containsKey("USSUNSHINE_RPT_DEV_CONN_regionID")) {
                context.USSUNSHINE_RPT_DEV_CONN_regionID = (String) parentContextMap.get("USSUNSHINE_RPT_DEV_CONN_regionID");
            }if (parentContextMap.containsKey("USSUNSHINE_RPT_DEV_CONN_warehouse")) {
                context.USSUNSHINE_RPT_DEV_CONN_warehouse = (String) parentContextMap.get("USSUNSHINE_RPT_DEV_CONN_warehouse");
            }if (parentContextMap.containsKey("USSUNSHINE_RPT_DEV_CONN_account")) {
                context.USSUNSHINE_RPT_DEV_CONN_account = (String) parentContextMap.get("USSUNSHINE_RPT_DEV_CONN_account");
            }if (parentContextMap.containsKey("USSUNSHINE_RPT_DEV_CONN_userPassword_password")) {
                context.USSUNSHINE_RPT_DEV_CONN_userPassword_password = (java.lang.String) parentContextMap.get("USSUNSHINE_RPT_DEV_CONN_userPassword_password");
            }if (parentContextMap.containsKey("USSUNSHINE_RPT_DEV_CONN_db")) {
                context.USSUNSHINE_RPT_DEV_CONN_db = (String) parentContextMap.get("USSUNSHINE_RPT_DEV_CONN_db");
            }if (parentContextMap.containsKey("USSUNSHINE_RPT_DEV_CONN_loginTimeout")) {
                context.USSUNSHINE_RPT_DEV_CONN_loginTimeout = (Integer) parentContextMap.get("USSUNSHINE_RPT_DEV_CONN_loginTimeout");
            }if (parentContextMap.containsKey("USSUNSHINE_RPT_DEV_CONN_oauthProperties_scope")) {
                context.USSUNSHINE_RPT_DEV_CONN_oauthProperties_scope = (String) parentContextMap.get("USSUNSHINE_RPT_DEV_CONN_oauthProperties_scope");
            }if (parentContextMap.containsKey("USSUNSHINE_RPT_DEV_CONN_oauthProperties_oauthUserName")) {
                context.USSUNSHINE_RPT_DEV_CONN_oauthProperties_oauthUserName = (String) parentContextMap.get("USSUNSHINE_RPT_DEV_CONN_oauthProperties_oauthUserName");
            }if (parentContextMap.containsKey("USSUNSHINE_RPT_DEV_CONN_userPassword_userId")) {
                context.USSUNSHINE_RPT_DEV_CONN_userPassword_userId = (String) parentContextMap.get("USSUNSHINE_RPT_DEV_CONN_userPassword_userId");
            }if (parentContextMap.containsKey("USSUNSHINE_RPT_DEV_CONN_role")) {
                context.USSUNSHINE_RPT_DEV_CONN_role = (String) parentContextMap.get("USSUNSHINE_RPT_DEV_CONN_role");
            }if (parentContextMap.containsKey("USSUNSHINE_RPT_DEV_CONN_schemaName")) {
                context.USSUNSHINE_RPT_DEV_CONN_schemaName = (String) parentContextMap.get("USSUNSHINE_RPT_DEV_CONN_schemaName");
            }if (parentContextMap.containsKey("USSUNSHINE_RPT_DEV_CONN_oauthProperties_clientSecret")) {
                context.USSUNSHINE_RPT_DEV_CONN_oauthProperties_clientSecret = (java.lang.String) parentContextMap.get("USSUNSHINE_RPT_DEV_CONN_oauthProperties_clientSecret");
            }if (parentContextMap.containsKey("USSUNSHINE_RPT_DEV_CONN_oauthProperties_clientId")) {
                context.USSUNSHINE_RPT_DEV_CONN_oauthProperties_clientId = (String) parentContextMap.get("USSUNSHINE_RPT_DEV_CONN_oauthProperties_clientId");
            }if (parentContextMap.containsKey("USSUNSHINE_RPT_DEV_CONN_keyAlias")) {
                context.USSUNSHINE_RPT_DEV_CONN_keyAlias = (String) parentContextMap.get("USSUNSHINE_RPT_DEV_CONN_keyAlias");
            }if (parentContextMap.containsKey("USSUNSHINE_RPT_DEV_CONN_oauthProperties_oauthTokenEndpoint")) {
                context.USSUNSHINE_RPT_DEV_CONN_oauthProperties_oauthTokenEndpoint = (String) parentContextMap.get("USSUNSHINE_RPT_DEV_CONN_oauthProperties_oauthTokenEndpoint");
            }
        }

        //Resume: init the resumeUtil
        resumeEntryMethodName = ResumeUtil.getResumeEntryMethodName(resuming_checkpoint_path);
        resumeUtil = new ResumeUtil(resuming_logs_dir_path, isChildJob, rootPid);
        resumeUtil.initCommonInfo(pid, rootPid, fatherPid, projectName, jobName, contextStr, jobVersion);

		List<String> parametersToEncrypt = new java.util.ArrayList<String>();
			parametersToEncrypt.add("USSUNSHINE_RPT_DEV_CONN_oauthProperties_oauthPassword");
			parametersToEncrypt.add("USSUNSHINE_RPT_DEV_CONN_userPassword_password");
			parametersToEncrypt.add("USSUNSHINE_RPT_DEV_CONN_oauthProperties_clientSecret");
        //Resume: jobStart
        resumeUtil.addLog("JOB_STARTED", "JOB:" + jobName, parent_part_launcher, Thread.currentThread().getId() + "", "","","","",resumeUtil.convertToJsonText(context,parametersToEncrypt));

if(execStat) {
    try {
        runStat.openSocket(!isChildJob);
        runStat.setAllPID(rootPid, fatherPid, pid, jobName);
        runStat.startThreadStat(clientHost, portStats);
        runStat.updateStatOnJob(RunStat.JOBSTART, fatherNode);
    } catch (java.io.IOException ioException) {
        ioException.printStackTrace();
    }
}



	
	    java.util.concurrent.ConcurrentHashMap<Object, Object> concurrentHashMap = new java.util.concurrent.ConcurrentHashMap<Object, Object>();
	    globalMap.put("concurrentHashMap", concurrentHashMap);
	

    long startUsedMemory = Runtime.getRuntime().totalMemory() - Runtime.getRuntime().freeMemory();
    long endUsedMemory = 0;
    long end = 0;

    startTime = System.currentTimeMillis();


this.globalResumeTicket = true;//to run tPreJob

try {
errorCode = null;tPrejob_1Process(globalMap);
if(!"failure".equals(status)) { status = "end"; }
}catch (TalendException e_tPrejob_1) {
globalMap.put("tPrejob_1_SUBPROCESS_STATE", -1);

e_tPrejob_1.printStackTrace();

}



		if(enableLogStash) {
	        talendJobLog.addJobStartMessage();
	        try {
	            talendJobLogProcess(globalMap);
	        } catch (java.lang.Exception e) {
	            e.printStackTrace();
	        }
        }

this.globalResumeTicket = false;//to run others jobs

try {
errorCode = null;tDBInput_1Process(globalMap);
if(!"failure".equals(status)) { status = "end"; }
}catch (TalendException e_tDBInput_1) {
globalMap.put("tDBInput_1_SUBPROCESS_STATE", -1);

e_tDBInput_1.printStackTrace();

}
try {
errorCode = null;tDBConnection_2Process(globalMap);
if(!"failure".equals(status)) { status = "end"; }
}catch (TalendException e_tDBConnection_2) {
globalMap.put("tDBConnection_2_SUBPROCESS_STATE", -1);

e_tDBConnection_2.printStackTrace();

}

this.globalResumeTicket = true;//to run tPostJob

try {
errorCode = null;tPostjob_1Process(globalMap);
if(!"failure".equals(status)) { status = "end"; }
}catch (TalendException e_tPostjob_1) {
globalMap.put("tPostjob_1_SUBPROCESS_STATE", -1);

e_tPostjob_1.printStackTrace();

}



        end = System.currentTimeMillis();

        if (watch) {
            System.out.println((end-startTime)+" milliseconds");
        }

        endUsedMemory = Runtime.getRuntime().totalMemory() - Runtime.getRuntime().freeMemory();
        if (false) {
            System.out.println((endUsedMemory - startUsedMemory) + " bytes memory increase when running : BEACON_EXTRACT_SNOWFLAKE");
        }
		if(enableLogStash) {
	        talendJobLog.addJobEndMessage(startTime, end, status);
	        try {
	            talendJobLogProcess(globalMap);
	        } catch (java.lang.Exception e) {
	            e.printStackTrace();
	        }
        }



if (execStat) {
    runStat.updateStatOnJob(RunStat.JOBEND, fatherNode);
    runStat.stopThreadStat();
}
    int returnCode = 0;


    if(errorCode == null) {
         returnCode = status != null && status.equals("failure") ? 1 : 0;
    } else {
         returnCode = errorCode.intValue();
    }
    resumeUtil.addLog("JOB_ENDED", "JOB:" + jobName, parent_part_launcher, Thread.currentThread().getId() + "", "","" + returnCode,"","","");

    return returnCode;

  }

    // only for OSGi env
    public void destroy() {


    }














    private java.util.Map<String, Object> getSharedConnections4REST() {
        java.util.Map<String, Object> connections = new java.util.HashMap<String, Object>();




            connections.put("tDBConnection_1_connection", globalMap.get("tDBConnection_1_connection"));
            connections.put("tDBConnection_1_COMPONENT_RUNTIME_PROPERTIES", globalMap.get("tDBConnection_1_COMPONENT_RUNTIME_PROPERTIES"));
            connections.put("tDBConnection_2_connection", globalMap.get("tDBConnection_2_connection"));
            connections.put("tDBConnection_2_COMPONENT_RUNTIME_PROPERTIES", globalMap.get("tDBConnection_2_COMPONENT_RUNTIME_PROPERTIES"));


        return connections;
    }

    private void evalParam(String arg) {
        if (arg.startsWith("--resuming_logs_dir_path")) {
            resuming_logs_dir_path = arg.substring(25);
        } else if (arg.startsWith("--resuming_checkpoint_path")) {
            resuming_checkpoint_path = arg.substring(27);
        } else if (arg.startsWith("--parent_part_launcher")) {
            parent_part_launcher = arg.substring(23);
        } else if (arg.startsWith("--watch")) {
            watch = true;
        } else if (arg.startsWith("--stat_port=")) {
            String portStatsStr = arg.substring(12);
            if (portStatsStr != null && !portStatsStr.equals("null")) {
                portStats = Integer.parseInt(portStatsStr);
            }
        } else if (arg.startsWith("--trace_port=")) {
            portTraces = Integer.parseInt(arg.substring(13));
        } else if (arg.startsWith("--client_host=")) {
            clientHost = arg.substring(14);
        } else if (arg.startsWith("--context=")) {
            contextStr = arg.substring(10);
            isDefaultContext = false;
        } else if (arg.startsWith("--father_pid=")) {
            fatherPid = arg.substring(13);
        } else if (arg.startsWith("--root_pid=")) {
            rootPid = arg.substring(11);
        } else if (arg.startsWith("--father_node=")) {
            fatherNode = arg.substring(14);
        } else if (arg.startsWith("--pid=")) {
            pid = arg.substring(6);
        } else if (arg.startsWith("--context_type")) {
            String keyValue = arg.substring(15);
			int index = -1;
            if (keyValue != null && (index = keyValue.indexOf('=')) > -1) {
                if (fatherPid==null) {
                    context_param.setContextType(keyValue.substring(0, index), replaceEscapeChars(keyValue.substring(index + 1)));
                } else { // the subjob won't escape the especial chars
                    context_param.setContextType(keyValue.substring(0, index), keyValue.substring(index + 1) );
                }

            }

		} else if (arg.startsWith("--context_param")) {
            String keyValue = arg.substring(16);
            int index = -1;
            if (keyValue != null && (index = keyValue.indexOf('=')) > -1) {
                if (fatherPid==null) {
                    context_param.put(keyValue.substring(0, index), replaceEscapeChars(keyValue.substring(index + 1)));
                } else { // the subjob won't escape the especial chars
                    context_param.put(keyValue.substring(0, index), keyValue.substring(index + 1) );
                }
            }
        } else if (arg.startsWith("--log4jLevel=")) {
            log4jLevel = arg.substring(13);
		} else if (arg.startsWith("--audit.enabled") && arg.contains("=")) {//for trunjob call
		    final int equal = arg.indexOf('=');
			final String key = arg.substring("--".length(), equal);
			System.setProperty(key, arg.substring(equal + 1));
		}
    }
    
    private static final String NULL_VALUE_EXPRESSION_IN_COMMAND_STRING_FOR_CHILD_JOB_ONLY = "<TALEND_NULL>";

    private final String[][] escapeChars = {
        {"\\\\","\\"},{"\\n","\n"},{"\\'","\'"},{"\\r","\r"},
        {"\\f","\f"},{"\\b","\b"},{"\\t","\t"}
        };
    private String replaceEscapeChars (String keyValue) {

		if (keyValue == null || ("").equals(keyValue.trim())) {
			return keyValue;
		}

		StringBuilder result = new StringBuilder();
		int currIndex = 0;
		while (currIndex < keyValue.length()) {
			int index = -1;
			// judege if the left string includes escape chars
			for (String[] strArray : escapeChars) {
				index = keyValue.indexOf(strArray[0],currIndex);
				if (index>=0) {

					result.append(keyValue.substring(currIndex, index + strArray[0].length()).replace(strArray[0], strArray[1]));
					currIndex = index + strArray[0].length();
					break;
				}
			}
			// if the left string doesn't include escape chars, append the left into the result
			if (index < 0) {
				result.append(keyValue.substring(currIndex));
				currIndex = currIndex + keyValue.length();
			}
		}

		return result.toString();
    }

    public Integer getErrorCode() {
        return errorCode;
    }


    public String getStatus() {
        return status;
    }

    ResumeUtil resumeUtil = null;
}
/************************************************************************************************
 *     726532 characters generated by Talend Cloud Data Management Platform 
 *     on the March 11, 2022 at 2:10:20 AM CST
 ************************************************************************************************/