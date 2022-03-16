
package uscomm_sunshine_rpt_qa.test_0_1;

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
 * Job: Test Purpose: <br>
 * Description: <br>
 * 
 * @author Reddi Anki, Nanda Kishore
 * @version 8.0.1.20220218_1542-patch
 * @status
 */
public class Test implements TalendJob {
	static {
		System.setProperty("TalendJob.log", "Test.log");
	}

	private static org.apache.logging.log4j.Logger log = org.apache.logging.log4j.LogManager.getLogger(Test.class);

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

	// contains type for every context property
	public class PropertiesWithType extends java.util.Properties {
		private static final long serialVersionUID = 1L;
		private java.util.Map<String, String> propertyTypes = new java.util.HashMap<>();

		public PropertiesWithType(java.util.Properties properties) {
			super(properties);
		}

		public PropertiesWithType() {
			super();
		}

		public void setContextType(String key, String type) {
			propertyTypes.put(key, type);
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

		public ContextProperties(java.util.Properties properties) {
			super(properties);
		}

		public ContextProperties() {
			super();
		}

		public void synchronizeContext() {

			if (USSUNSHINE_RPT_DEV_CONN_oauthProperties_oauthPassword != null) {

				this.setProperty("USSUNSHINE_RPT_DEV_CONN_oauthProperties_oauthPassword",
						USSUNSHINE_RPT_DEV_CONN_oauthProperties_oauthPassword.toString());

			}

			if (USSUNSHINE_RPT_DEV_CONN_jdbcParameters != null) {

				this.setProperty("USSUNSHINE_RPT_DEV_CONN_jdbcParameters",
						USSUNSHINE_RPT_DEV_CONN_jdbcParameters.toString());

			}

			if (USSUNSHINE_RPT_DEV_CONN_regionID != null) {

				this.setProperty("USSUNSHINE_RPT_DEV_CONN_regionID", USSUNSHINE_RPT_DEV_CONN_regionID.toString());

			}

			if (USSUNSHINE_RPT_DEV_CONN_warehouse != null) {

				this.setProperty("USSUNSHINE_RPT_DEV_CONN_warehouse", USSUNSHINE_RPT_DEV_CONN_warehouse.toString());

			}

			if (USSUNSHINE_RPT_DEV_CONN_account != null) {

				this.setProperty("USSUNSHINE_RPT_DEV_CONN_account", USSUNSHINE_RPT_DEV_CONN_account.toString());

			}

			if (USSUNSHINE_RPT_DEV_CONN_userPassword_password != null) {

				this.setProperty("USSUNSHINE_RPT_DEV_CONN_userPassword_password",
						USSUNSHINE_RPT_DEV_CONN_userPassword_password.toString());

			}

			if (USSUNSHINE_RPT_DEV_CONN_db != null) {

				this.setProperty("USSUNSHINE_RPT_DEV_CONN_db", USSUNSHINE_RPT_DEV_CONN_db.toString());

			}

			if (USSUNSHINE_RPT_DEV_CONN_loginTimeout != null) {

				this.setProperty("USSUNSHINE_RPT_DEV_CONN_loginTimeout",
						USSUNSHINE_RPT_DEV_CONN_loginTimeout.toString());

			}

			if (USSUNSHINE_RPT_DEV_CONN_oauthProperties_scope != null) {

				this.setProperty("USSUNSHINE_RPT_DEV_CONN_oauthProperties_scope",
						USSUNSHINE_RPT_DEV_CONN_oauthProperties_scope.toString());

			}

			if (USSUNSHINE_RPT_DEV_CONN_oauthProperties_oauthUserName != null) {

				this.setProperty("USSUNSHINE_RPT_DEV_CONN_oauthProperties_oauthUserName",
						USSUNSHINE_RPT_DEV_CONN_oauthProperties_oauthUserName.toString());

			}

			if (USSUNSHINE_RPT_DEV_CONN_userPassword_userId != null) {

				this.setProperty("USSUNSHINE_RPT_DEV_CONN_userPassword_userId",
						USSUNSHINE_RPT_DEV_CONN_userPassword_userId.toString());

			}

			if (USSUNSHINE_RPT_DEV_CONN_role != null) {

				this.setProperty("USSUNSHINE_RPT_DEV_CONN_role", USSUNSHINE_RPT_DEV_CONN_role.toString());

			}

			if (USSUNSHINE_RPT_DEV_CONN_schemaName != null) {

				this.setProperty("USSUNSHINE_RPT_DEV_CONN_schemaName", USSUNSHINE_RPT_DEV_CONN_schemaName.toString());

			}

			if (USSUNSHINE_RPT_DEV_CONN_oauthProperties_clientSecret != null) {

				this.setProperty("USSUNSHINE_RPT_DEV_CONN_oauthProperties_clientSecret",
						USSUNSHINE_RPT_DEV_CONN_oauthProperties_clientSecret.toString());

			}

			if (USSUNSHINE_RPT_DEV_CONN_oauthProperties_clientId != null) {

				this.setProperty("USSUNSHINE_RPT_DEV_CONN_oauthProperties_clientId",
						USSUNSHINE_RPT_DEV_CONN_oauthProperties_clientId.toString());

			}

			if (USSUNSHINE_RPT_DEV_CONN_keyAlias != null) {

				this.setProperty("USSUNSHINE_RPT_DEV_CONN_keyAlias", USSUNSHINE_RPT_DEV_CONN_keyAlias.toString());

			}

			if (USSUNSHINE_RPT_DEV_CONN_oauthProperties_oauthTokenEndpoint != null) {

				this.setProperty("USSUNSHINE_RPT_DEV_CONN_oauthProperties_oauthTokenEndpoint",
						USSUNSHINE_RPT_DEV_CONN_oauthProperties_oauthTokenEndpoint.toString());

			}

		}

		// if the stored or passed value is "<TALEND_NULL>" string, it mean null
		public String getStringValue(String key) {
			String origin_value = this.getProperty(key);
			if (NULL_VALUE_EXPRESSION_IN_COMMAND_STRING_FOR_CHILD_JOB_ONLY.equals(origin_value)) {
				return null;
			}
			return origin_value;
		}

		public java.lang.String USSUNSHINE_RPT_DEV_CONN_oauthProperties_oauthPassword;

		public java.lang.String getUSSUNSHINE_RPT_DEV_CONN_oauthProperties_oauthPassword() {
			return this.USSUNSHINE_RPT_DEV_CONN_oauthProperties_oauthPassword;
		}

		public String USSUNSHINE_RPT_DEV_CONN_jdbcParameters;

		public String getUSSUNSHINE_RPT_DEV_CONN_jdbcParameters() {
			return this.USSUNSHINE_RPT_DEV_CONN_jdbcParameters;
		}

		public String USSUNSHINE_RPT_DEV_CONN_regionID;

		public String getUSSUNSHINE_RPT_DEV_CONN_regionID() {
			return this.USSUNSHINE_RPT_DEV_CONN_regionID;
		}

		public String USSUNSHINE_RPT_DEV_CONN_warehouse;

		public String getUSSUNSHINE_RPT_DEV_CONN_warehouse() {
			return this.USSUNSHINE_RPT_DEV_CONN_warehouse;
		}

		public String USSUNSHINE_RPT_DEV_CONN_account;

		public String getUSSUNSHINE_RPT_DEV_CONN_account() {
			return this.USSUNSHINE_RPT_DEV_CONN_account;
		}

		public java.lang.String USSUNSHINE_RPT_DEV_CONN_userPassword_password;

		public java.lang.String getUSSUNSHINE_RPT_DEV_CONN_userPassword_password() {
			return this.USSUNSHINE_RPT_DEV_CONN_userPassword_password;
		}

		public String USSUNSHINE_RPT_DEV_CONN_db;

		public String getUSSUNSHINE_RPT_DEV_CONN_db() {
			return this.USSUNSHINE_RPT_DEV_CONN_db;
		}

		public Integer USSUNSHINE_RPT_DEV_CONN_loginTimeout;

		public Integer getUSSUNSHINE_RPT_DEV_CONN_loginTimeout() {
			return this.USSUNSHINE_RPT_DEV_CONN_loginTimeout;
		}

		public String USSUNSHINE_RPT_DEV_CONN_oauthProperties_scope;

		public String getUSSUNSHINE_RPT_DEV_CONN_oauthProperties_scope() {
			return this.USSUNSHINE_RPT_DEV_CONN_oauthProperties_scope;
		}

		public String USSUNSHINE_RPT_DEV_CONN_oauthProperties_oauthUserName;

		public String getUSSUNSHINE_RPT_DEV_CONN_oauthProperties_oauthUserName() {
			return this.USSUNSHINE_RPT_DEV_CONN_oauthProperties_oauthUserName;
		}

		public String USSUNSHINE_RPT_DEV_CONN_userPassword_userId;

		public String getUSSUNSHINE_RPT_DEV_CONN_userPassword_userId() {
			return this.USSUNSHINE_RPT_DEV_CONN_userPassword_userId;
		}

		public String USSUNSHINE_RPT_DEV_CONN_role;

		public String getUSSUNSHINE_RPT_DEV_CONN_role() {
			return this.USSUNSHINE_RPT_DEV_CONN_role;
		}

		public String USSUNSHINE_RPT_DEV_CONN_schemaName;

		public String getUSSUNSHINE_RPT_DEV_CONN_schemaName() {
			return this.USSUNSHINE_RPT_DEV_CONN_schemaName;
		}

		public java.lang.String USSUNSHINE_RPT_DEV_CONN_oauthProperties_clientSecret;

		public java.lang.String getUSSUNSHINE_RPT_DEV_CONN_oauthProperties_clientSecret() {
			return this.USSUNSHINE_RPT_DEV_CONN_oauthProperties_clientSecret;
		}

		public String USSUNSHINE_RPT_DEV_CONN_oauthProperties_clientId;

		public String getUSSUNSHINE_RPT_DEV_CONN_oauthProperties_clientId() {
			return this.USSUNSHINE_RPT_DEV_CONN_oauthProperties_clientId;
		}

		public String USSUNSHINE_RPT_DEV_CONN_keyAlias;

		public String getUSSUNSHINE_RPT_DEV_CONN_keyAlias() {
			return this.USSUNSHINE_RPT_DEV_CONN_keyAlias;
		}

		public String USSUNSHINE_RPT_DEV_CONN_oauthProperties_oauthTokenEndpoint;

		public String getUSSUNSHINE_RPT_DEV_CONN_oauthProperties_oauthTokenEndpoint() {
			return this.USSUNSHINE_RPT_DEV_CONN_oauthProperties_oauthTokenEndpoint;
		}
	}

	protected ContextProperties context = new ContextProperties(); // will be instanciated by MS.

	public ContextProperties getContext() {
		return this.context;
	}

	private final String jobVersion = "0.1";
	private final String jobName = "Test";
	private final String projectName = "USCOMM_SUNSHINE_RPT_QA";
	public Integer errorCode = null;
	private String currentComponent = "";

	private final java.util.Map<String, Object> globalMap = new java.util.HashMap<String, Object>();
	private final static java.util.Map<String, Object> junitGlobalMap = new java.util.HashMap<String, Object>();

	private final java.util.Map<String, Long> start_Hash = new java.util.HashMap<String, Long>();
	private final java.util.Map<String, Long> end_Hash = new java.util.HashMap<String, Long>();
	private final java.util.Map<String, Boolean> ok_Hash = new java.util.HashMap<String, Boolean>();
	public final java.util.List<String[]> globalBuffer = new java.util.ArrayList<String[]>();

	private final JobStructureCatcherUtils talendJobLog = new JobStructureCatcherUtils(jobName,
			"_RJSIwJ2xEeyl8fTbPMWyWA", "0.1");
	private org.talend.job.audit.JobAuditLogger auditLogger_talendJobLog = null;

	private RunStat runStat = new RunStat(talendJobLog, System.getProperty("audit.interval"));

	// OSGi DataSource
	private final static String KEY_DB_DATASOURCES = "KEY_DB_DATASOURCES";

	private final static String KEY_DB_DATASOURCES_RAW = "KEY_DB_DATASOURCES_RAW";

	public void setDataSources(java.util.Map<String, javax.sql.DataSource> dataSources) {
		java.util.Map<String, routines.system.TalendDataSource> talendDataSources = new java.util.HashMap<String, routines.system.TalendDataSource>();
		for (java.util.Map.Entry<String, javax.sql.DataSource> dataSourceEntry : dataSources.entrySet()) {
			talendDataSources.put(dataSourceEntry.getKey(),
					new routines.system.TalendDataSource(dataSourceEntry.getValue()));
		}
		globalMap.put(KEY_DB_DATASOURCES, talendDataSources);
		globalMap.put(KEY_DB_DATASOURCES_RAW, new java.util.HashMap<String, javax.sql.DataSource>(dataSources));
	}

	public void setDataSourceReferences(List serviceReferences) throws Exception {

		java.util.Map<String, routines.system.TalendDataSource> talendDataSources = new java.util.HashMap<String, routines.system.TalendDataSource>();
		java.util.Map<String, javax.sql.DataSource> dataSources = new java.util.HashMap<String, javax.sql.DataSource>();

		for (java.util.Map.Entry<String, javax.sql.DataSource> entry : BundleUtils
				.getServices(serviceReferences, javax.sql.DataSource.class).entrySet()) {
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

		public void setVirtualComponentName(String virtualComponentName) {
			this.virtualComponentName = virtualComponentName;
		}

		private TalendException(Exception e, String errorComponent, final java.util.Map<String, Object> globalMap) {
			this.currentComponent = errorComponent;
			this.globalMap = globalMap;
			this.e = e;
		}

		public Exception getException() {
			return this.e;
		}

		public String getCurrentComponent() {
			return this.currentComponent;
		}

		public String getExceptionCauseMessage(Exception e) {
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
				if (virtualComponentName != null && currentComponent.indexOf(virtualComponentName + "_") == 0) {
					globalMap.put(virtualComponentName + "_ERROR_MESSAGE", getExceptionCauseMessage(e));
				}
				globalMap.put(currentComponent + "_ERROR_MESSAGE", getExceptionCauseMessage(e));
				System.err.println("Exception in component " + currentComponent + " (" + jobName + ")");
			}
			if (!(e instanceof TDieException)) {
				if (e instanceof TalendException) {
					e.printStackTrace();
				} else {
					e.printStackTrace();
					e.printStackTrace(errorMessagePS);
					Test.this.exception = e;
				}
			}
			if (!(e instanceof TalendException)) {
				try {
					for (java.lang.reflect.Method m : this.getClass().getEnclosingClass().getMethods()) {
						if (m.getName().compareTo(currentComponent + "_error") == 0) {
							m.invoke(Test.this, new Object[] { e, currentComponent, globalMap });
							break;
						}
					}

					if (!(e instanceof TDieException)) {
					}
				} catch (Exception e) {
					this.e.printStackTrace();
				}
			}
		}
	}

	public void tDBInput_1_error(Exception exception, String errorComponent,
			final java.util.Map<String, Object> globalMap) throws TalendException {

		end_Hash.put(errorComponent, System.currentTimeMillis());

		status = "failure";

		tDBInput_1_onSubJobError(exception, errorComponent, globalMap);
	}

	public void tLogRow_1_error(Exception exception, String errorComponent,
			final java.util.Map<String, Object> globalMap) throws TalendException {

		end_Hash.put(errorComponent, System.currentTimeMillis());

		status = "failure";

		tDBInput_1_onSubJobError(exception, errorComponent, globalMap);
	}

	public void tPrejob_1_error(Exception exception, String errorComponent,
			final java.util.Map<String, Object> globalMap) throws TalendException {

		end_Hash.put(errorComponent, System.currentTimeMillis());

		status = "failure";

		tPrejob_1_onSubJobError(exception, errorComponent, globalMap);
	}

	public void tDBConnection_1_error(Exception exception, String errorComponent,
			final java.util.Map<String, Object> globalMap) throws TalendException {

		end_Hash.put(errorComponent, System.currentTimeMillis());

		try {

			if (this.execStat) {
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

	public void tDie_1_error(Exception exception, String errorComponent, final java.util.Map<String, Object> globalMap)
			throws TalendException {

		end_Hash.put(errorComponent, System.currentTimeMillis());

		status = "failure";

		tDie_1_onSubJobError(exception, errorComponent, globalMap);
	}

	public void talendJobLog_error(Exception exception, String errorComponent,
			final java.util.Map<String, Object> globalMap) throws TalendException {

		end_Hash.put(errorComponent, System.currentTimeMillis());

		status = "failure";

		talendJobLog_onSubJobError(exception, errorComponent, globalMap);
	}

	public void tDBInput_1_onSubJobError(Exception exception, String errorComponent,
			final java.util.Map<String, Object> globalMap) throws TalendException {

		resumeUtil.addLog("SYSTEM_LOG", "NODE:" + errorComponent, "", Thread.currentThread().getId() + "", "FATAL", "",
				exception.getMessage(), ResumeUtil.getExceptionStackTrace(exception), "");

	}

	public void tPrejob_1_onSubJobError(Exception exception, String errorComponent,
			final java.util.Map<String, Object> globalMap) throws TalendException {

		resumeUtil.addLog("SYSTEM_LOG", "NODE:" + errorComponent, "", Thread.currentThread().getId() + "", "FATAL", "",
				exception.getMessage(), ResumeUtil.getExceptionStackTrace(exception), "");

	}

	public void tDBConnection_1_onSubJobError(Exception exception, String errorComponent,
			final java.util.Map<String, Object> globalMap) throws TalendException {

		resumeUtil.addLog("SYSTEM_LOG", "NODE:" + errorComponent, "", Thread.currentThread().getId() + "", "FATAL", "",
				exception.getMessage(), ResumeUtil.getExceptionStackTrace(exception), "");

	}

	public void tDie_1_onSubJobError(Exception exception, String errorComponent,
			final java.util.Map<String, Object> globalMap) throws TalendException {

		resumeUtil.addLog("SYSTEM_LOG", "NODE:" + errorComponent, "", Thread.currentThread().getId() + "", "FATAL", "",
				exception.getMessage(), ResumeUtil.getExceptionStackTrace(exception), "");

	}

	public void talendJobLog_onSubJobError(Exception exception, String errorComponent,
			final java.util.Map<String, Object> globalMap) throws TalendException {

		resumeUtil.addLog("SYSTEM_LOG", "NODE:" + errorComponent, "", Thread.currentThread().getId() + "", "FATAL", "",
				exception.getMessage(), ResumeUtil.getExceptionStackTrace(exception), "");

	}

	public static class row1Struct implements routines.system.IPersistableRow<row1Struct> {
		final static byte[] commonByteArrayLock_USCOMM_SUNSHINE_RPT_QA_Test = new byte[0];
		static byte[] commonByteArray_USCOMM_SUNSHINE_RPT_QA_Test = new byte[0];

		public String MANUAL_TEMPLATE;

		public String getMANUAL_TEMPLATE() {
			return this.MANUAL_TEMPLATE;
		}

		public Boolean MANUAL_TEMPLATEIsNullable() {
			return true;
		}

		public Boolean MANUAL_TEMPLATEIsKey() {
			return false;
		}

		public Integer MANUAL_TEMPLATELength() {
			return 500;
		}

		public Integer MANUAL_TEMPLATEPrecision() {
			return null;
		}

		public String MANUAL_TEMPLATEDefault() {

			return null;

		}

		public String MANUAL_TEMPLATEComment() {

			return "";

		}

		public String MANUAL_TEMPLATEPattern() {

			return "";

		}

		public String MANUAL_TEMPLATEOriginalDbColumnName() {

			return "MANUAL_TEMPLATE";

		}

		public String CONCUR;

		public String getCONCUR() {
			return this.CONCUR;
		}

		public Boolean CONCURIsNullable() {
			return true;
		}

		public Boolean CONCURIsKey() {
			return false;
		}

		public Integer CONCURLength() {
			return 500;
		}

		public Integer CONCURPrecision() {
			return null;
		}

		public String CONCURDefault() {

			return null;

		}

		public String CONCURComment() {

			return "";

		}

		public String CONCURPattern() {

			return "";

		}

		public String CONCUROriginalDbColumnName() {

			return "CONCUR";

		}

		public String BEACONCRM;

		public String getBEACONCRM() {
			return this.BEACONCRM;
		}

		public Boolean BEACONCRMIsNullable() {
			return true;
		}

		public Boolean BEACONCRMIsKey() {
			return false;
		}

		public Integer BEACONCRMLength() {
			return 500;
		}

		public Integer BEACONCRMPrecision() {
			return null;
		}

		public String BEACONCRMDefault() {

			return null;

		}

		public String BEACONCRMComment() {

			return "";

		}

		public String BEACONCRMPattern() {

			return "";

		}

		public String BEACONCRMOriginalDbColumnName() {

			return "BEACONCRM";

		}

		public String SAP;

		public String getSAP() {
			return this.SAP;
		}

		public Boolean SAPIsNullable() {
			return true;
		}

		public Boolean SAPIsKey() {
			return false;
		}

		public Integer SAPLength() {
			return 500;
		}

		public Integer SAPPrecision() {
			return null;
		}

		public String SAPDefault() {

			return null;

		}

		public String SAPComment() {

			return "";

		}

		public String SAPPattern() {

			return "";

		}

		public String SAPOriginalDbColumnName() {

			return "SAP";

		}

		public String FINAL_OUTPUT;

		public String getFINAL_OUTPUT() {
			return this.FINAL_OUTPUT;
		}

		public Boolean FINAL_OUTPUTIsNullable() {
			return true;
		}

		public Boolean FINAL_OUTPUTIsKey() {
			return false;
		}

		public Integer FINAL_OUTPUTLength() {
			return 500;
		}

		public Integer FINAL_OUTPUTPrecision() {
			return null;
		}

		public String FINAL_OUTPUTDefault() {

			return null;

		}

		public String FINAL_OUTPUTComment() {

			return "";

		}

		public String FINAL_OUTPUTPattern() {

			return "";

		}

		public String FINAL_OUTPUTOriginalDbColumnName() {

			return "FINAL_OUTPUT";

		}

		private String readString(ObjectInputStream dis) throws IOException {
			String strReturn = null;
			int length = 0;
			length = dis.readInt();
			if (length == -1) {
				strReturn = null;
			} else {
				if (length > commonByteArray_USCOMM_SUNSHINE_RPT_QA_Test.length) {
					if (length < 1024 && commonByteArray_USCOMM_SUNSHINE_RPT_QA_Test.length == 0) {
						commonByteArray_USCOMM_SUNSHINE_RPT_QA_Test = new byte[1024];
					} else {
						commonByteArray_USCOMM_SUNSHINE_RPT_QA_Test = new byte[2 * length];
					}
				}
				dis.readFully(commonByteArray_USCOMM_SUNSHINE_RPT_QA_Test, 0, length);
				strReturn = new String(commonByteArray_USCOMM_SUNSHINE_RPT_QA_Test, 0, length, utf8Charset);
			}
			return strReturn;
		}

		private String readString(org.jboss.marshalling.Unmarshaller unmarshaller) throws IOException {
			String strReturn = null;
			int length = 0;
			length = unmarshaller.readInt();
			if (length == -1) {
				strReturn = null;
			} else {
				if (length > commonByteArray_USCOMM_SUNSHINE_RPT_QA_Test.length) {
					if (length < 1024 && commonByteArray_USCOMM_SUNSHINE_RPT_QA_Test.length == 0) {
						commonByteArray_USCOMM_SUNSHINE_RPT_QA_Test = new byte[1024];
					} else {
						commonByteArray_USCOMM_SUNSHINE_RPT_QA_Test = new byte[2 * length];
					}
				}
				unmarshaller.readFully(commonByteArray_USCOMM_SUNSHINE_RPT_QA_Test, 0, length);
				strReturn = new String(commonByteArray_USCOMM_SUNSHINE_RPT_QA_Test, 0, length, utf8Charset);
			}
			return strReturn;
		}

		private void writeString(String str, ObjectOutputStream dos) throws IOException {
			if (str == null) {
				dos.writeInt(-1);
			} else {
				byte[] byteArray = str.getBytes(utf8Charset);
				dos.writeInt(byteArray.length);
				dos.write(byteArray);
			}
		}

		private void writeString(String str, org.jboss.marshalling.Marshaller marshaller) throws IOException {
			if (str == null) {
				marshaller.writeInt(-1);
			} else {
				byte[] byteArray = str.getBytes(utf8Charset);
				marshaller.writeInt(byteArray.length);
				marshaller.write(byteArray);
			}
		}

		public void readData(ObjectInputStream dis) {

			synchronized (commonByteArrayLock_USCOMM_SUNSHINE_RPT_QA_Test) {

				try {

					int length = 0;

					this.MANUAL_TEMPLATE = readString(dis);

					this.CONCUR = readString(dis);

					this.BEACONCRM = readString(dis);

					this.SAP = readString(dis);

					this.FINAL_OUTPUT = readString(dis);

				} catch (IOException e) {
					throw new RuntimeException(e);

				}

			}

		}

		public void readData(org.jboss.marshalling.Unmarshaller dis) {

			synchronized (commonByteArrayLock_USCOMM_SUNSHINE_RPT_QA_Test) {

				try {

					int length = 0;

					this.MANUAL_TEMPLATE = readString(dis);

					this.CONCUR = readString(dis);

					this.BEACONCRM = readString(dis);

					this.SAP = readString(dis);

					this.FINAL_OUTPUT = readString(dis);

				} catch (IOException e) {
					throw new RuntimeException(e);

				}

			}

		}

		public void writeData(ObjectOutputStream dos) {
			try {

				// String

				writeString(this.MANUAL_TEMPLATE, dos);

				// String

				writeString(this.CONCUR, dos);

				// String

				writeString(this.BEACONCRM, dos);

				// String

				writeString(this.SAP, dos);

				// String

				writeString(this.FINAL_OUTPUT, dos);

			} catch (IOException e) {
				throw new RuntimeException(e);
			}

		}

		public void writeData(org.jboss.marshalling.Marshaller dos) {
			try {

				// String

				writeString(this.MANUAL_TEMPLATE, dos);

				// String

				writeString(this.CONCUR, dos);

				// String

				writeString(this.BEACONCRM, dos);

				// String

				writeString(this.SAP, dos);

				// String

				writeString(this.FINAL_OUTPUT, dos);

			} catch (IOException e) {
				throw new RuntimeException(e);
			}

		}

		public String toString() {

			StringBuilder sb = new StringBuilder();
			sb.append(super.toString());
			sb.append("[");
			sb.append("MANUAL_TEMPLATE=" + MANUAL_TEMPLATE);
			sb.append(",CONCUR=" + CONCUR);
			sb.append(",BEACONCRM=" + BEACONCRM);
			sb.append(",SAP=" + SAP);
			sb.append(",FINAL_OUTPUT=" + FINAL_OUTPUT);
			sb.append("]");

			return sb.toString();
		}

		public String toLogString() {
			StringBuilder sb = new StringBuilder();

			if (MANUAL_TEMPLATE == null) {
				sb.append("<null>");
			} else {
				sb.append(MANUAL_TEMPLATE);
			}

			sb.append("|");

			if (CONCUR == null) {
				sb.append("<null>");
			} else {
				sb.append(CONCUR);
			}

			sb.append("|");

			if (BEACONCRM == null) {
				sb.append("<null>");
			} else {
				sb.append(BEACONCRM);
			}

			sb.append("|");

			if (SAP == null) {
				sb.append("<null>");
			} else {
				sb.append(SAP);
			}

			sb.append("|");

			if (FINAL_OUTPUT == null) {
				sb.append("<null>");
			} else {
				sb.append(FINAL_OUTPUT);
			}

			sb.append("|");

			return sb.toString();
		}

		/**
		 * Compare keys
		 */
		public int compareTo(row1Struct other) {

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
			if (resumeIt || globalResumeTicket) { // start the resume
				globalResumeTicket = true;

				row1Struct row1 = new row1Struct();

				/**
				 * [tLogRow_1 begin ] start
				 */

				ok_Hash.put("tLogRow_1", false);
				start_Hash.put("tLogRow_1", System.currentTimeMillis());

				currentComponent = "tLogRow_1";

				runStat.updateStatAndLog(execStat, enableLogStash, resourceMap, iterateId, 0, 0, "row1");

				int tos_count_tLogRow_1 = 0;

				if (log.isDebugEnabled())
					log.debug("tLogRow_1 - " + ("Start to work."));
				if (log.isDebugEnabled()) {
					class BytesLimit65535_tLogRow_1 {
						public void limitLog4jByte() throws Exception {
							StringBuilder log4jParamters_tLogRow_1 = new StringBuilder();
							log4jParamters_tLogRow_1.append("Parameters:");
							log4jParamters_tLogRow_1.append("BASIC_MODE" + " = " + "false");
							log4jParamters_tLogRow_1.append(" | ");
							log4jParamters_tLogRow_1.append("TABLE_PRINT" + " = " + "true");
							log4jParamters_tLogRow_1.append(" | ");
							log4jParamters_tLogRow_1.append("VERTICAL" + " = " + "false");
							log4jParamters_tLogRow_1.append(" | ");
							log4jParamters_tLogRow_1.append("PRINT_CONTENT_WITH_LOG4J" + " = " + "true");
							log4jParamters_tLogRow_1.append(" | ");
							if (log.isDebugEnabled())
								log.debug("tLogRow_1 - " + (log4jParamters_tLogRow_1));
						}
					}
					new BytesLimit65535_tLogRow_1().limitLog4jByte();
				}
				if (enableLogStash) {
					talendJobLog.addCM("tLogRow_1", "tLogRow_1", "tLogRow");
					talendJobLogProcess(globalMap);
				}

				///////////////////////

				class Util_tLogRow_1 {

					String[] des_top = { ".", ".", "-", "+" };

					String[] des_head = { "|=", "=|", "-", "+" };

					String[] des_bottom = { "'", "'", "-", "+" };

					String name = "";

					java.util.List<String[]> list = new java.util.ArrayList<String[]>();

					int[] colLengths = new int[5];

					public void addRow(String[] row) {

						for (int i = 0; i < 5; i++) {
							if (row[i] != null) {
								colLengths[i] = Math.max(colLengths[i], row[i].length());
							}
						}
						list.add(row);
					}

					public void setTableName(String name) {

						this.name = name;
					}

					public StringBuilder format() {

						StringBuilder sb = new StringBuilder();

						sb.append(print(des_top));

						int totals = 0;
						for (int i = 0; i < colLengths.length; i++) {
							totals = totals + colLengths[i];
						}

						// name
						sb.append("|");
						int k = 0;
						for (k = 0; k < (totals + 4 - name.length()) / 2; k++) {
							sb.append(' ');
						}
						sb.append(name);
						for (int i = 0; i < totals + 4 - name.length() - k; i++) {
							sb.append(' ');
						}
						sb.append("|\n");

						// head and rows
						sb.append(print(des_head));
						for (int i = 0; i < list.size(); i++) {

							String[] row = list.get(i);

							java.util.Formatter formatter = new java.util.Formatter(new StringBuilder());

							StringBuilder sbformat = new StringBuilder();
							sbformat.append("|%1$-");
							sbformat.append(colLengths[0]);
							sbformat.append("s");

							sbformat.append("|%2$-");
							sbformat.append(colLengths[1]);
							sbformat.append("s");

							sbformat.append("|%3$-");
							sbformat.append(colLengths[2]);
							sbformat.append("s");

							sbformat.append("|%4$-");
							sbformat.append(colLengths[3]);
							sbformat.append("s");

							sbformat.append("|%5$-");
							sbformat.append(colLengths[4]);
							sbformat.append("s");

							sbformat.append("|\n");

							formatter.format(sbformat.toString(), (Object[]) row);

							sb.append(formatter.toString());
							if (i == 0)
								sb.append(print(des_head)); // print the head
						}

						// end
						sb.append(print(des_bottom));
						return sb;
					}

					private StringBuilder print(String[] fillChars) {
						StringBuilder sb = new StringBuilder();
						// first column
						sb.append(fillChars[0]);
						for (int i = 0; i < colLengths[0] - fillChars[0].length() + 1; i++) {
							sb.append(fillChars[2]);
						}
						sb.append(fillChars[3]);

						for (int i = 0; i < colLengths[1] - fillChars[3].length() + 1; i++) {
							sb.append(fillChars[2]);
						}
						sb.append(fillChars[3]);
						for (int i = 0; i < colLengths[2] - fillChars[3].length() + 1; i++) {
							sb.append(fillChars[2]);
						}
						sb.append(fillChars[3]);
						for (int i = 0; i < colLengths[3] - fillChars[3].length() + 1; i++) {
							sb.append(fillChars[2]);
						}
						sb.append(fillChars[3]);

						// last column
						for (int i = 0; i < colLengths[4] - fillChars[1].length() + 1; i++) {
							sb.append(fillChars[2]);
						}
						sb.append(fillChars[1]);
						sb.append("\n");
						return sb;
					}

					public boolean isTableEmpty() {
						if (list.size() > 1)
							return false;
						return true;
					}
				}
				Util_tLogRow_1 util_tLogRow_1 = new Util_tLogRow_1();
				util_tLogRow_1.setTableName("tLogRow_1");
				util_tLogRow_1
						.addRow(new String[] { "MANUAL_TEMPLATE", "CONCUR", "BEACONCRM", "SAP", "FINAL_OUTPUT", });
				StringBuilder strBuffer_tLogRow_1 = null;
				int nb_line_tLogRow_1 = 0;
///////////////////////    			

				/**
				 * [tLogRow_1 begin ] stop
				 */

				/**
				 * [tDBInput_1 begin ] start
				 */

				ok_Hash.put("tDBInput_1", false);
				start_Hash.put("tDBInput_1", System.currentTimeMillis());

				currentComponent = "tDBInput_1";

				int tos_count_tDBInput_1 = 0;

				if (enableLogStash) {
					talendJobLog.addCM("tDBInput_1", "tDBInput_1", "tSnowflakeInput");
					talendJobLogProcess(globalMap);
				}

				boolean doesNodeBelongToRequest_tDBInput_1 = 0 == 0;
				@SuppressWarnings("unchecked")
				java.util.Map<String, Object> restRequest_tDBInput_1 = (java.util.Map<String, Object>) globalMap
						.get("restRequest");
				String currentTRestRequestOperation_tDBInput_1 = (String) (restRequest_tDBInput_1 != null
						? restRequest_tDBInput_1.get("OPERATION")
						: null);

				org.talend.components.api.component.ComponentDefinition def_tDBInput_1 = new org.talend.components.snowflake.tsnowflakeinput.TSnowflakeInputDefinition();

				org.talend.components.api.component.runtime.Writer writer_tDBInput_1 = null;
				org.talend.components.api.component.runtime.Reader reader_tDBInput_1 = null;

				org.talend.components.snowflake.tsnowflakeinput.TSnowflakeInputProperties props_tDBInput_1 = (org.talend.components.snowflake.tsnowflakeinput.TSnowflakeInputProperties) def_tDBInput_1
						.createRuntimeProperties();
				props_tDBInput_1.setValue("condition", "");

				props_tDBInput_1.setValue("manualQuery", false);

				props_tDBInput_1.setValue("convertColumnsAndTableToUppercase", true);

				props_tDBInput_1.connection.setValue("useCustomRegion", false);

				props_tDBInput_1.connection.userPassword.setValue("useAuth", false);

				props_tDBInput_1.connection.referencedComponent.setValue("referenceType",
						org.talend.components.api.properties.ComponentReferenceProperties.ReferenceType.COMPONENT_INSTANCE);

				props_tDBInput_1.connection.referencedComponent.setValue("componentInstanceId", "tDBConnection_1");

				props_tDBInput_1.connection.referencedComponent.setValue("referenceDefinitionName",
						"tSnowflakeConnection");

				props_tDBInput_1.table.setValue("tableName", "ACTIVITY_STATE");

				props_tDBInput_1.table.connection.setValue("useCustomRegion", false);

				props_tDBInput_1.table.connection.userPassword.setValue("useAuth", false);

				props_tDBInput_1.table.connection.referencedComponent.setValue("referenceType",
						org.talend.components.api.properties.ComponentReferenceProperties.ReferenceType.COMPONENT_INSTANCE);

				props_tDBInput_1.table.connection.referencedComponent.setValue("componentInstanceId",
						"tDBConnection_1");

				props_tDBInput_1.table.connection.referencedComponent.setValue("referenceDefinitionName",
						"tSnowflakeConnection");

				class SchemaSettingTool_tDBInput_1_1_fisrt {

					String getSchemaValue() {

						StringBuilder s = new StringBuilder();

						a("{\"type\":\"record\",", s);

						a("\"name\":\"ACTIVITY_STATE\",\"fields\":[{", s);

						a("\"name\":\"MANUAL_TEMPLATE\",\"type\":[\"string\",\"null\"],\"talend.field.length\":\"500\",\"talend.field.dbType\":12,\"talend.field.dbColumnName\":\"MANUAL_TEMPLATE\"},{",
								s);

						a("\"name\":\"CONCUR\",\"type\":[\"string\",\"null\"],\"talend.field.length\":\"500\",\"talend.field.dbType\":12,\"talend.field.dbColumnName\":\"CONCUR\"},{",
								s);

						a("\"name\":\"BEACONCRM\",\"type\":[\"string\",\"null\"],\"talend.field.length\":\"500\",\"talend.field.dbType\":12,\"talend.field.dbColumnName\":\"BEACONCRM\"},{",
								s);

						a("\"name\":\"SAP\",\"type\":[\"string\",\"null\"],\"talend.field.length\":\"500\",\"talend.field.dbType\":12,\"talend.field.dbColumnName\":\"SAP\"},{",
								s);

						a("\"name\":\"FINAL_OUTPUT\",\"type\":[\"string\",\"null\"],\"talend.field.length\":\"500\",\"talend.field.dbType\":12,\"talend.field.dbColumnName\":\"FINAL_OUTPUT\"}]}",
								s);

						return s.toString();

					}

					void a(String part, StringBuilder strB) {
						strB.append(part);
					}

				}

				SchemaSettingTool_tDBInput_1_1_fisrt sst_tDBInput_1_1_fisrt = new SchemaSettingTool_tDBInput_1_1_fisrt();

				props_tDBInput_1.table.main.setValue("schema",
						new org.apache.avro.Schema.Parser().parse(sst_tDBInput_1_1_fisrt.getSchemaValue()));

				if (org.talend.components.api.properties.ComponentReferenceProperties.ReferenceType.COMPONENT_INSTANCE == props_tDBInput_1.connection.referencedComponent.referenceType
						.getValue()) {
					final String referencedComponentInstanceId_tDBInput_1 = props_tDBInput_1.connection.referencedComponent.componentInstanceId
							.getStringValue();
					if (referencedComponentInstanceId_tDBInput_1 != null) {
						org.talend.daikon.properties.Properties referencedComponentProperties_tDBInput_1 = (org.talend.daikon.properties.Properties) globalMap
								.get(referencedComponentInstanceId_tDBInput_1 + "_COMPONENT_RUNTIME_PROPERTIES");
						props_tDBInput_1.connection.referencedComponent
								.setReference(referencedComponentProperties_tDBInput_1);
					}
				}
				if (org.talend.components.api.properties.ComponentReferenceProperties.ReferenceType.COMPONENT_INSTANCE == props_tDBInput_1.table.connection.referencedComponent.referenceType
						.getValue()) {
					final String referencedComponentInstanceId_tDBInput_1 = props_tDBInput_1.table.connection.referencedComponent.componentInstanceId
							.getStringValue();
					if (referencedComponentInstanceId_tDBInput_1 != null) {
						org.talend.daikon.properties.Properties referencedComponentProperties_tDBInput_1 = (org.talend.daikon.properties.Properties) globalMap
								.get(referencedComponentInstanceId_tDBInput_1 + "_COMPONENT_RUNTIME_PROPERTIES");
						props_tDBInput_1.table.connection.referencedComponent
								.setReference(referencedComponentProperties_tDBInput_1);
					}
				}
				globalMap.put("tDBInput_1_COMPONENT_RUNTIME_PROPERTIES", props_tDBInput_1);
				globalMap.putIfAbsent("TALEND_PRODUCT_VERSION", "8.0");
				globalMap.put("TALEND_COMPONENTS_VERSION", "0.37.4");
				java.net.URL mappings_url_tDBInput_1 = this.getClass().getResource("/xmlMappings");
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
						org.talend.components.api.component.runtime.ExecutionEngine.DI, props_tDBInput_1,
						topology_tDBInput_1);
				java.util.Set<org.talend.components.api.component.ConnectorTopology> supported_connector_topologies_tDBInput_1 = def_tDBInput_1
						.getSupportedConnectorTopologies();

				org.talend.components.api.component.runtime.RuntimableRuntime componentRuntime_tDBInput_1 = (org.talend.components.api.component.runtime.RuntimableRuntime) (Class
						.forName(runtime_info_tDBInput_1.getRuntimeClassName()).newInstance());
				org.talend.daikon.properties.ValidationResult initVr_tDBInput_1 = componentRuntime_tDBInput_1
						.initialize(container_tDBInput_1, props_tDBInput_1);

				if (initVr_tDBInput_1.getStatus() == org.talend.daikon.properties.ValidationResult.Result.ERROR) {
					throw new RuntimeException(initVr_tDBInput_1.getMessage());
				}

				if (componentRuntime_tDBInput_1 instanceof org.talend.components.api.component.runtime.ComponentDriverInitialization) {
					org.talend.components.api.component.runtime.ComponentDriverInitialization compDriverInitialization_tDBInput_1 = (org.talend.components.api.component.runtime.ComponentDriverInitialization) componentRuntime_tDBInput_1;
					compDriverInitialization_tDBInput_1.runAtDriver(container_tDBInput_1);
				}

				org.talend.components.api.component.runtime.SourceOrSink sourceOrSink_tDBInput_1 = null;
				if (componentRuntime_tDBInput_1 instanceof org.talend.components.api.component.runtime.SourceOrSink) {
					sourceOrSink_tDBInput_1 = (org.talend.components.api.component.runtime.SourceOrSink) componentRuntime_tDBInput_1;
					if (doesNodeBelongToRequest_tDBInput_1) {
						org.talend.daikon.properties.ValidationResult vr_tDBInput_1 = sourceOrSink_tDBInput_1
								.validate(container_tDBInput_1);
						if (vr_tDBInput_1.getStatus() == org.talend.daikon.properties.ValidationResult.Result.ERROR) {
							throw new RuntimeException(vr_tDBInput_1.getMessage());
						}
					}
				}

				if (sourceOrSink_tDBInput_1 instanceof org.talend.components.api.component.runtime.Source) {
					org.talend.components.api.component.runtime.Source source_tDBInput_1 = (org.talend.components.api.component.runtime.Source) sourceOrSink_tDBInput_1;
					reader_tDBInput_1 = source_tDBInput_1.createReader(container_tDBInput_1);
					reader_tDBInput_1 = new org.talend.codegen.flowvariables.runtime.FlowVariablesReader(
							reader_tDBInput_1, container_tDBInput_1);

					boolean multi_output_is_allowed_tDBInput_1 = false;
					org.talend.components.api.component.Connector c_tDBInput_1 = null;
					for (org.talend.components.api.component.Connector currentConnector : props_tDBInput_1
							.getAvailableConnectors(null, true)) {
						if (currentConnector.getName().equals("MAIN")) {
							c_tDBInput_1 = currentConnector;
						}

						if (currentConnector.getName().equals("REJECT")) {// it's better to move the code to javajet
							multi_output_is_allowed_tDBInput_1 = true;
						}
					}
					org.apache.avro.Schema schema_tDBInput_1 = props_tDBInput_1.getSchema(c_tDBInput_1, true);

					org.talend.codegen.enforcer.OutgoingSchemaEnforcer outgoingEnforcer_tDBInput_1 = org.talend.codegen.enforcer.EnforcerCreator
							.createOutgoingEnforcer(schema_tDBInput_1, false);

					// Create a reusable factory that converts the output of the reader to an
					// IndexedRecord.
					org.talend.daikon.avro.converter.IndexedRecordConverter<Object, ? extends org.apache.avro.generic.IndexedRecord> factory_tDBInput_1 = null;

					// Iterate through the incoming data.
					boolean available_tDBInput_1 = reader_tDBInput_1.start();

					resourceMap.put("reader_tDBInput_1", reader_tDBInput_1);

					for (; available_tDBInput_1; available_tDBInput_1 = reader_tDBInput_1.advance()) {
						nb_line_tDBInput_1++;

						if (multi_output_is_allowed_tDBInput_1) {

							row1 = null;

						}

						try {
							Object data_tDBInput_1 = reader_tDBInput_1.getCurrent();

							if (multi_output_is_allowed_tDBInput_1) {
								row1 = new row1Struct();
							}

							// Construct the factory once when the first data arrives.
							if (factory_tDBInput_1 == null) {
								factory_tDBInput_1 = (org.talend.daikon.avro.converter.IndexedRecordConverter<Object, ? extends org.apache.avro.generic.IndexedRecord>) new org.talend.daikon.avro.AvroRegistry()
										.createIndexedRecordConverter(data_tDBInput_1.getClass());
							}

							// Enforce the outgoing schema on the input.
							outgoingEnforcer_tDBInput_1.setWrapped(factory_tDBInput_1.convertToAvro(data_tDBInput_1));
							Object columnValue_0_tDBInput_1 = outgoingEnforcer_tDBInput_1.get(0);
							row1.MANUAL_TEMPLATE = (String) (columnValue_0_tDBInput_1);
							Object columnValue_1_tDBInput_1 = outgoingEnforcer_tDBInput_1.get(1);
							row1.CONCUR = (String) (columnValue_1_tDBInput_1);
							Object columnValue_2_tDBInput_1 = outgoingEnforcer_tDBInput_1.get(2);
							row1.BEACONCRM = (String) (columnValue_2_tDBInput_1);
							Object columnValue_3_tDBInput_1 = outgoingEnforcer_tDBInput_1.get(3);
							row1.SAP = (String) (columnValue_3_tDBInput_1);
							Object columnValue_4_tDBInput_1 = outgoingEnforcer_tDBInput_1.get(4);
							row1.FINAL_OUTPUT = (String) (columnValue_4_tDBInput_1);
						} catch (org.talend.components.api.exception.DataRejectException e_tDBInput_1) {
							java.util.Map<String, Object> info_tDBInput_1 = e_tDBInput_1.getRejectInfo();

							// TODO use a method instead of getting method by the special key
							// "error/errorMessage"
							Object errorMessage_tDBInput_1 = null;
							if (info_tDBInput_1.containsKey("error")) {
								errorMessage_tDBInput_1 = info_tDBInput_1.get("error");
							} else if (info_tDBInput_1.containsKey("errorMessage")) {
								errorMessage_tDBInput_1 = info_tDBInput_1.get("errorMessage");
							} else {
								errorMessage_tDBInput_1 = "Rejected but error message missing";
							}
							errorMessage_tDBInput_1 = "Row " + nb_line_tDBInput_1 + ": " + errorMessage_tDBInput_1;
							System.err.println(errorMessage_tDBInput_1);

							// If the record is reject, the main line record should put NULL
							row1 = null;

						} // end of catch

						java.lang.Iterable<?> outgoingMainRecordsList_tDBInput_1 = new java.util.ArrayList<Object>();
						java.util.Iterator outgoingMainRecordsIt_tDBInput_1 = null;

						/**
						 * [tDBInput_1 begin ] stop
						 */

						/**
						 * [tDBInput_1 main ] start
						 */

						currentComponent = "tDBInput_1";

						tos_count_tDBInput_1++;

						/**
						 * [tDBInput_1 main ] stop
						 */

						/**
						 * [tDBInput_1 process_data_begin ] start
						 */

						currentComponent = "tDBInput_1";

						/**
						 * [tDBInput_1 process_data_begin ] stop
						 */

						/**
						 * [tLogRow_1 main ] start
						 */

						currentComponent = "tLogRow_1";

						if (runStat.update(execStat, enableLogStash, iterateId, 1, 1

								, "row1", "tDBInput_1", "tDBInput_1", "tSnowflakeInput", "tLogRow_1", "tLogRow_1",
								"tLogRow"

						)) {
							talendJobLogProcess(globalMap);
						}

						if (log.isTraceEnabled()) {
							log.trace("row1 - " + (row1 == null ? "" : row1.toLogString()));
						}

///////////////////////		

						String[] row_tLogRow_1 = new String[5];

						if (row1.MANUAL_TEMPLATE != null) { //
							row_tLogRow_1[0] = String.valueOf(row1.MANUAL_TEMPLATE);

						} //

						if (row1.CONCUR != null) { //
							row_tLogRow_1[1] = String.valueOf(row1.CONCUR);

						} //

						if (row1.BEACONCRM != null) { //
							row_tLogRow_1[2] = String.valueOf(row1.BEACONCRM);

						} //

						if (row1.SAP != null) { //
							row_tLogRow_1[3] = String.valueOf(row1.SAP);

						} //

						if (row1.FINAL_OUTPUT != null) { //
							row_tLogRow_1[4] = String.valueOf(row1.FINAL_OUTPUT);

						} //

						util_tLogRow_1.addRow(row_tLogRow_1);
						nb_line_tLogRow_1++;
						log.info("tLogRow_1 - Content of row " + nb_line_tLogRow_1 + ": "
								+ TalendString.unionString("|", row_tLogRow_1));
//////

//////                    

///////////////////////    			

						tos_count_tLogRow_1++;

						/**
						 * [tLogRow_1 main ] stop
						 */

						/**
						 * [tLogRow_1 process_data_begin ] start
						 */

						currentComponent = "tLogRow_1";

						/**
						 * [tLogRow_1 process_data_begin ] stop
						 */

						/**
						 * [tLogRow_1 process_data_end ] start
						 */

						currentComponent = "tLogRow_1";

						/**
						 * [tLogRow_1 process_data_end ] stop
						 */

						/**
						 * [tDBInput_1 process_data_end ] start
						 */

						currentComponent = "tDBInput_1";

						/**
						 * [tDBInput_1 process_data_end ] stop
						 */

						/**
						 * [tDBInput_1 end ] start
						 */

						currentComponent = "tDBInput_1";

// end of generic

						resourceMap.put("finish_tDBInput_1", Boolean.TRUE);

					} // while
				} // end of "if (sourceOrSink_tDBInput_1 instanceof ...Source)"
				java.util.Map<String, Object> resultMap_tDBInput_1 = null;
				if (reader_tDBInput_1 != null) {
					reader_tDBInput_1.close();
					resultMap_tDBInput_1 = reader_tDBInput_1.getReturnValues();
				}
				if (resultMap_tDBInput_1 != null) {
					for (java.util.Map.Entry<String, Object> entry_tDBInput_1 : resultMap_tDBInput_1.entrySet()) {
						switch (entry_tDBInput_1.getKey()) {
						case org.talend.components.api.component.ComponentDefinition.RETURN_ERROR_MESSAGE:
							container_tDBInput_1.setComponentData("tDBInput_1", "ERROR_MESSAGE",
									entry_tDBInput_1.getValue());
							break;
						case org.talend.components.api.component.ComponentDefinition.RETURN_TOTAL_RECORD_COUNT:
							container_tDBInput_1.setComponentData("tDBInput_1", "NB_LINE", entry_tDBInput_1.getValue());
							break;
						case org.talend.components.api.component.ComponentDefinition.RETURN_SUCCESS_RECORD_COUNT:
							container_tDBInput_1.setComponentData("tDBInput_1", "NB_SUCCESS",
									entry_tDBInput_1.getValue());
							break;
						case org.talend.components.api.component.ComponentDefinition.RETURN_REJECT_RECORD_COUNT:
							container_tDBInput_1.setComponentData("tDBInput_1", "NB_REJECT",
									entry_tDBInput_1.getValue());
							break;
						default:
							StringBuilder studio_key_tDBInput_1 = new StringBuilder();
							for (int i_tDBInput_1 = 0; i_tDBInput_1 < entry_tDBInput_1.getKey()
									.length(); i_tDBInput_1++) {
								char ch_tDBInput_1 = entry_tDBInput_1.getKey().charAt(i_tDBInput_1);
								if (Character.isUpperCase(ch_tDBInput_1) && i_tDBInput_1 > 0) {
									studio_key_tDBInput_1.append('_');
								}
								studio_key_tDBInput_1.append(ch_tDBInput_1);
							}
							container_tDBInput_1.setComponentData("tDBInput_1",
									studio_key_tDBInput_1.toString().toUpperCase(java.util.Locale.ENGLISH),
									entry_tDBInput_1.getValue());
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
				 * [tLogRow_1 end ] start
				 */

				currentComponent = "tLogRow_1";

//////

				java.io.PrintStream consoleOut_tLogRow_1 = null;
				if (globalMap.get("tLogRow_CONSOLE") != null) {
					consoleOut_tLogRow_1 = (java.io.PrintStream) globalMap.get("tLogRow_CONSOLE");
				} else {
					consoleOut_tLogRow_1 = new java.io.PrintStream(new java.io.BufferedOutputStream(System.out));
					globalMap.put("tLogRow_CONSOLE", consoleOut_tLogRow_1);
				}

				consoleOut_tLogRow_1.println(util_tLogRow_1.format().toString());
				consoleOut_tLogRow_1.flush();
//////
				globalMap.put("tLogRow_1_NB_LINE", nb_line_tLogRow_1);
				if (log.isInfoEnabled())
					log.info("tLogRow_1 - " + ("Printed row count: ") + (nb_line_tLogRow_1) + ("."));

///////////////////////    			

				if (runStat.updateStatAndLog(execStat, enableLogStash, resourceMap, iterateId, "row1", 2, 0,
						"tDBInput_1", "tDBInput_1", "tSnowflakeInput", "tLogRow_1", "tLogRow_1", "tLogRow", "output")) {
					talendJobLogProcess(globalMap);
				}

				if (log.isDebugEnabled())
					log.debug("tLogRow_1 - " + ("Done."));

				ok_Hash.put("tLogRow_1", true);
				end_Hash.put("tLogRow_1", System.currentTimeMillis());

				/**
				 * [tLogRow_1 end ] stop
				 */

			} // end the resume

		} catch (java.lang.Exception e) {

			if (!(e instanceof TalendException)) {
				log.fatal(currentComponent + " " + e.getMessage(), e);
			}

			TalendException te = new TalendException(e, currentComponent, globalMap);

			throw te;
		} catch (java.lang.Error error) {

			runStat.stopThreadStat();

			throw error;
		} finally {

			try {

				/**
				 * [tDBInput_1 finally ] start
				 */

				currentComponent = "tDBInput_1";

// finally of generic

				if (resourceMap.get("finish_tDBInput_1") == null) {
					if (resourceMap.get("reader_tDBInput_1") != null) {
						try {
							((org.talend.components.api.component.runtime.Reader) resourceMap.get("reader_tDBInput_1"))
									.close();
						} catch (java.io.IOException e_tDBInput_1) {
							String errorMessage_tDBInput_1 = "failed to release the resource in tDBInput_1 :"
									+ e_tDBInput_1.getMessage();
							System.err.println(errorMessage_tDBInput_1);
						}
					}
				}

				/**
				 * [tDBInput_1 finally ] stop
				 */

				/**
				 * [tLogRow_1 finally ] start
				 */

				currentComponent = "tLogRow_1";

				/**
				 * [tLogRow_1 finally ] stop
				 */

			} catch (java.lang.Exception e) {
				// ignore
			} catch (java.lang.Error error) {
				// ignore
			}
			resourceMap = null;
		}

		globalMap.put("tDBInput_1_SUBPROCESS_STATE", 1);
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
			if (resumeIt || globalResumeTicket) { // start the resume
				globalResumeTicket = true;

				/**
				 * [tPrejob_1 begin ] start
				 */

				ok_Hash.put("tPrejob_1", false);
				start_Hash.put("tPrejob_1", System.currentTimeMillis());

				currentComponent = "tPrejob_1";

				int tos_count_tPrejob_1 = 0;

				if (enableLogStash) {
					talendJobLog.addCM("tPrejob_1", "tPrejob_1", "tPrejob");
					talendJobLogProcess(globalMap);
				}

				/**
				 * [tPrejob_1 begin ] stop
				 */

				/**
				 * [tPrejob_1 main ] start
				 */

				currentComponent = "tPrejob_1";

				tos_count_tPrejob_1++;

				/**
				 * [tPrejob_1 main ] stop
				 */

				/**
				 * [tPrejob_1 process_data_begin ] start
				 */

				currentComponent = "tPrejob_1";

				/**
				 * [tPrejob_1 process_data_begin ] stop
				 */

				/**
				 * [tPrejob_1 process_data_end ] start
				 */

				currentComponent = "tPrejob_1";

				/**
				 * [tPrejob_1 process_data_end ] stop
				 */

				/**
				 * [tPrejob_1 end ] start
				 */

				currentComponent = "tPrejob_1";

				ok_Hash.put("tPrejob_1", true);
				end_Hash.put("tPrejob_1", System.currentTimeMillis());

				if (execStat) {
					runStat.updateStatOnConnection("OnComponentOk1", 0, "ok");
				}
				tDBConnection_1Process(globalMap);

				/**
				 * [tPrejob_1 end ] stop
				 */
			} // end the resume

		} catch (java.lang.Exception e) {

			if (!(e instanceof TalendException)) {
				log.fatal(currentComponent + " " + e.getMessage(), e);
			}

			TalendException te = new TalendException(e, currentComponent, globalMap);

			throw te;
		} catch (java.lang.Error error) {

			runStat.stopThreadStat();

			throw error;
		} finally {

			try {

				/**
				 * [tPrejob_1 finally ] start
				 */

				currentComponent = "tPrejob_1";

				/**
				 * [tPrejob_1 finally ] stop
				 */
			} catch (java.lang.Exception e) {
				// ignore
			} catch (java.lang.Error error) {
				// ignore
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
			if (resumeIt || globalResumeTicket) { // start the resume
				globalResumeTicket = true;

				/**
				 * [tDBConnection_1 begin ] start
				 */

				ok_Hash.put("tDBConnection_1", false);
				start_Hash.put("tDBConnection_1", System.currentTimeMillis());

				currentComponent = "tDBConnection_1";

				int tos_count_tDBConnection_1 = 0;

				if (enableLogStash) {
					talendJobLog.addCM("tDBConnection_1", "tDBConnection_1", "tSnowflakeConnection");
					talendJobLogProcess(globalMap);
				}

				boolean doesNodeBelongToRequest_tDBConnection_1 = 0 == 0;
				@SuppressWarnings("unchecked")
				java.util.Map<String, Object> restRequest_tDBConnection_1 = (java.util.Map<String, Object>) globalMap
						.get("restRequest");
				String currentTRestRequestOperation_tDBConnection_1 = (String) (restRequest_tDBConnection_1 != null
						? restRequest_tDBConnection_1.get("OPERATION")
						: null);

				org.talend.components.api.component.ComponentDefinition def_tDBConnection_1 = new org.talend.components.snowflake.tsnowflakeconnection.TSnowflakeConnectionDefinition();

				org.talend.components.api.component.runtime.Writer writer_tDBConnection_1 = null;
				org.talend.components.api.component.runtime.Reader reader_tDBConnection_1 = null;

				org.talend.components.snowflake.SnowflakeConnectionProperties props_tDBConnection_1 = (org.talend.components.snowflake.SnowflakeConnectionProperties) def_tDBConnection_1
						.createRuntimeProperties();
				props_tDBConnection_1.setValue("loginTimeout", 15);

				props_tDBConnection_1.setValue("account", "LEGENDBIOTECH.east-us-2.azure");

				props_tDBConnection_1.setValue("regionID", "");

				props_tDBConnection_1.setValue("useCustomRegion", false);

				props_tDBConnection_1.setValue("authenticationType",
						org.talend.components.snowflake.tsnowflakeconnection.AuthenticationType.BASIC);

				props_tDBConnection_1.setValue("warehouse", "USCOMM_SHARED_DW");

				props_tDBConnection_1.setValue("db", "USSUNSHINE_RPT_DEV");

				props_tDBConnection_1.setValue("schemaName", "USSUNSHINE_RPT_SCHEMA");

				props_tDBConnection_1.setValue("role", "");

				props_tDBConnection_1.setValue("jdbcParameters", "");

				props_tDBConnection_1.setValue("autoCommit", true);

				props_tDBConnection_1.userPassword.setValue("useAuth", false);

				props_tDBConnection_1.userPassword.setValue("userId", "SUNSHINE_RPT");

				props_tDBConnection_1.userPassword.setValue("password",
						routines.system.PasswordEncryptUtil.decryptPassword(
								"enc:routine.encryption.key.v1:CRNGIXxPk3D/yeifEBkLduNGqDTeUOBiyc9InWupFcoDOWdHBQY7MjA="));

				props_tDBConnection_1.referencedComponent.setValue("referenceDefinitionName", "tSnowflakeConnection");

				if (org.talend.components.api.properties.ComponentReferenceProperties.ReferenceType.COMPONENT_INSTANCE == props_tDBConnection_1.referencedComponent.referenceType
						.getValue()) {
					final String referencedComponentInstanceId_tDBConnection_1 = props_tDBConnection_1.referencedComponent.componentInstanceId
							.getStringValue();
					if (referencedComponentInstanceId_tDBConnection_1 != null) {
						org.talend.daikon.properties.Properties referencedComponentProperties_tDBConnection_1 = (org.talend.daikon.properties.Properties) globalMap
								.get(referencedComponentInstanceId_tDBConnection_1 + "_COMPONENT_RUNTIME_PROPERTIES");
						props_tDBConnection_1.referencedComponent
								.setReference(referencedComponentProperties_tDBConnection_1);
					}
				}
				globalMap.put("tDBConnection_1_COMPONENT_RUNTIME_PROPERTIES", props_tDBConnection_1);
				globalMap.putIfAbsent("TALEND_PRODUCT_VERSION", "8.0");
				globalMap.put("TALEND_COMPONENTS_VERSION", "0.37.4");
				java.net.URL mappings_url_tDBConnection_1 = this.getClass().getResource("/xmlMappings");
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
						org.talend.components.api.component.runtime.ExecutionEngine.DI, props_tDBConnection_1,
						topology_tDBConnection_1);
				java.util.Set<org.talend.components.api.component.ConnectorTopology> supported_connector_topologies_tDBConnection_1 = def_tDBConnection_1
						.getSupportedConnectorTopologies();

				org.talend.components.api.component.runtime.RuntimableRuntime componentRuntime_tDBConnection_1 = (org.talend.components.api.component.runtime.RuntimableRuntime) (Class
						.forName(runtime_info_tDBConnection_1.getRuntimeClassName()).newInstance());
				org.talend.daikon.properties.ValidationResult initVr_tDBConnection_1 = componentRuntime_tDBConnection_1
						.initialize(container_tDBConnection_1, props_tDBConnection_1);

				if (initVr_tDBConnection_1.getStatus() == org.talend.daikon.properties.ValidationResult.Result.ERROR) {
					throw new RuntimeException(initVr_tDBConnection_1.getMessage());
				}

				if (componentRuntime_tDBConnection_1 instanceof org.talend.components.api.component.runtime.ComponentDriverInitialization) {
					org.talend.components.api.component.runtime.ComponentDriverInitialization compDriverInitialization_tDBConnection_1 = (org.talend.components.api.component.runtime.ComponentDriverInitialization) componentRuntime_tDBConnection_1;
					compDriverInitialization_tDBConnection_1.runAtDriver(container_tDBConnection_1);
				}

				org.talend.components.api.component.runtime.SourceOrSink sourceOrSink_tDBConnection_1 = null;
				if (componentRuntime_tDBConnection_1 instanceof org.talend.components.api.component.runtime.SourceOrSink) {
					sourceOrSink_tDBConnection_1 = (org.talend.components.api.component.runtime.SourceOrSink) componentRuntime_tDBConnection_1;
					if (doesNodeBelongToRequest_tDBConnection_1) {
						org.talend.daikon.properties.ValidationResult vr_tDBConnection_1 = sourceOrSink_tDBConnection_1
								.validate(container_tDBConnection_1);
						if (vr_tDBConnection_1
								.getStatus() == org.talend.daikon.properties.ValidationResult.Result.ERROR) {
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

				currentComponent = "tDBConnection_1";

				tos_count_tDBConnection_1++;

				/**
				 * [tDBConnection_1 main ] stop
				 */

				/**
				 * [tDBConnection_1 process_data_begin ] start
				 */

				currentComponent = "tDBConnection_1";

				/**
				 * [tDBConnection_1 process_data_begin ] stop
				 */

				/**
				 * [tDBConnection_1 process_data_end ] start
				 */

				currentComponent = "tDBConnection_1";

				/**
				 * [tDBConnection_1 process_data_end ] stop
				 */

				/**
				 * [tDBConnection_1 end ] start
				 */

				currentComponent = "tDBConnection_1";

// end of generic

				ok_Hash.put("tDBConnection_1", true);
				end_Hash.put("tDBConnection_1", System.currentTimeMillis());

				/**
				 * [tDBConnection_1 end ] stop
				 */
			} // end the resume

		} catch (java.lang.Exception e) {

			if (!(e instanceof TalendException)) {
				log.fatal(currentComponent + " " + e.getMessage(), e);
			}

			TalendException te = new TalendException(e, currentComponent, globalMap);

			throw te;
		} catch (java.lang.Error error) {

			runStat.stopThreadStat();

			throw error;
		} finally {

			try {

				/**
				 * [tDBConnection_1 finally ] start
				 */

				currentComponent = "tDBConnection_1";

// finally of generic

				/**
				 * [tDBConnection_1 finally ] stop
				 */
			} catch (java.lang.Exception e) {
				// ignore
			} catch (java.lang.Error error) {
				// ignore
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
			if (resumeIt || globalResumeTicket) { // start the resume
				globalResumeTicket = true;

				/**
				 * [tDie_1 begin ] start
				 */

				ok_Hash.put("tDie_1", false);
				start_Hash.put("tDie_1", System.currentTimeMillis());

				currentComponent = "tDie_1";

				int tos_count_tDie_1 = 0;

				if (log.isDebugEnabled())
					log.debug("tDie_1 - " + ("Start to work."));
				if (log.isDebugEnabled()) {
					class BytesLimit65535_tDie_1 {
						public void limitLog4jByte() throws Exception {
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
							if (log.isDebugEnabled())
								log.debug("tDie_1 - " + (log4jParamters_tDie_1));
						}
					}
					new BytesLimit65535_tDie_1().limitLog4jByte();
				}
				if (enableLogStash) {
					talendJobLog.addCM("tDie_1", "tDie_1", "tDie");
					talendJobLogProcess(globalMap);
				}

				/**
				 * [tDie_1 begin ] stop
				 */

				/**
				 * [tDie_1 main ] start
				 */

				currentComponent = "tDie_1";

				try {
					globalMap.put("tDie_1_DIE_PRIORITY", 5);
					System.err.println("SNOWFLAKE CONNECTION ERROR");

					log.error("tDie_1 - The die message: " + "SNOWFLAKE CONNECTION ERROR");

					globalMap.put("tDie_1_DIE_MESSAGE", "SNOWFLAKE CONNECTION ERROR");
					globalMap.put("tDie_1_DIE_MESSAGES", "SNOWFLAKE CONNECTION ERROR");

				} catch (Exception | Error e_tDie_1) {
					globalMap.put("tDie_1_ERROR_MESSAGE", e_tDie_1.getMessage());
					logIgnoredError(
							String.format("tDie_1 - tDie failed to log message due to internal error: %s", e_tDie_1),
							e_tDie_1);
				}

				currentComponent = "tDie_1";
				status = "failure";
				errorCode = new Integer(4);
				globalMap.put("tDie_1_DIE_CODE", errorCode);

				if (true) {
					throw new TDieException();
				}

				tos_count_tDie_1++;

				/**
				 * [tDie_1 main ] stop
				 */

				/**
				 * [tDie_1 process_data_begin ] start
				 */

				currentComponent = "tDie_1";

				/**
				 * [tDie_1 process_data_begin ] stop
				 */

				/**
				 * [tDie_1 process_data_end ] start
				 */

				currentComponent = "tDie_1";

				/**
				 * [tDie_1 process_data_end ] stop
				 */

				/**
				 * [tDie_1 end ] start
				 */

				currentComponent = "tDie_1";

				if (log.isDebugEnabled())
					log.debug("tDie_1 - " + ("Done."));

				ok_Hash.put("tDie_1", true);
				end_Hash.put("tDie_1", System.currentTimeMillis());

				/**
				 * [tDie_1 end ] stop
				 */
			} // end the resume

		} catch (java.lang.Exception e) {

			if (!(e instanceof TalendException)) {
				log.fatal(currentComponent + " " + e.getMessage(), e);
			}

			TalendException te = new TalendException(e, currentComponent, globalMap);

			throw te;
		} catch (java.lang.Error error) {

			runStat.stopThreadStat();

			throw error;
		} finally {

			try {

				/**
				 * [tDie_1 finally ] start
				 */

				currentComponent = "tDie_1";

				/**
				 * [tDie_1 finally ] stop
				 */
			} catch (java.lang.Exception e) {
				// ignore
			} catch (java.lang.Error error) {
				// ignore
			}
			resourceMap = null;
		}

		globalMap.put("tDie_1_SUBPROCESS_STATE", 1);
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
			if (resumeIt || globalResumeTicket) { // start the resume
				globalResumeTicket = true;

				/**
				 * [talendJobLog begin ] start
				 */

				ok_Hash.put("talendJobLog", false);
				start_Hash.put("talendJobLog", System.currentTimeMillis());

				currentComponent = "talendJobLog";

				int tos_count_talendJobLog = 0;

				for (JobStructureCatcherUtils.JobStructureCatcherMessage jcm : talendJobLog.getMessages()) {
					org.talend.job.audit.JobContextBuilder builder_talendJobLog = org.talend.job.audit.JobContextBuilder
							.create().jobName(jcm.job_name).jobId(jcm.job_id).jobVersion(jcm.job_version)
							.custom("process_id", jcm.pid).custom("thread_id", jcm.tid).custom("pid", pid)
							.custom("father_pid", fatherPid).custom("root_pid", rootPid);
					org.talend.logging.audit.Context log_context_talendJobLog = null;

					if (jcm.log_type == JobStructureCatcherUtils.LogType.PERFORMANCE) {
						long timeMS = jcm.end_time - jcm.start_time;
						String duration = String.valueOf(timeMS);

						log_context_talendJobLog = builder_talendJobLog.sourceId(jcm.sourceId)
								.sourceLabel(jcm.sourceLabel).sourceConnectorType(jcm.sourceComponentName)
								.targetId(jcm.targetId).targetLabel(jcm.targetLabel)
								.targetConnectorType(jcm.targetComponentName).connectionName(jcm.current_connector)
								.rows(jcm.row_count).duration(duration).build();
						auditLogger_talendJobLog.flowExecution(log_context_talendJobLog);
					} else if (jcm.log_type == JobStructureCatcherUtils.LogType.JOBSTART) {
						log_context_talendJobLog = builder_talendJobLog.timestamp(jcm.moment).build();
						auditLogger_talendJobLog.jobstart(log_context_talendJobLog);
					} else if (jcm.log_type == JobStructureCatcherUtils.LogType.JOBEND) {
						long timeMS = jcm.end_time - jcm.start_time;
						String duration = String.valueOf(timeMS);

						log_context_talendJobLog = builder_talendJobLog.timestamp(jcm.moment).duration(duration)
								.status(jcm.status).build();
						auditLogger_talendJobLog.jobstop(log_context_talendJobLog);
					} else if (jcm.log_type == JobStructureCatcherUtils.LogType.RUNCOMPONENT) {
						log_context_talendJobLog = builder_talendJobLog.timestamp(jcm.moment)
								.connectorType(jcm.component_name).connectorId(jcm.component_id)
								.connectorLabel(jcm.component_label).build();
						auditLogger_talendJobLog.runcomponent(log_context_talendJobLog);
					} else if (jcm.log_type == JobStructureCatcherUtils.LogType.FLOWINPUT) {// log current component
																							// input line
						long timeMS = jcm.end_time - jcm.start_time;
						String duration = String.valueOf(timeMS);

						log_context_talendJobLog = builder_talendJobLog.connectorType(jcm.component_name)
								.connectorId(jcm.component_id).connectorLabel(jcm.component_label)
								.connectionName(jcm.current_connector).connectionType(jcm.current_connector_type)
								.rows(jcm.total_row_number).duration(duration).build();
						auditLogger_talendJobLog.flowInput(log_context_talendJobLog);
					} else if (jcm.log_type == JobStructureCatcherUtils.LogType.FLOWOUTPUT) {// log current component
																								// output/reject line
						long timeMS = jcm.end_time - jcm.start_time;
						String duration = String.valueOf(timeMS);

						log_context_talendJobLog = builder_talendJobLog.connectorType(jcm.component_name)
								.connectorId(jcm.component_id).connectorLabel(jcm.component_label)
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

				currentComponent = "talendJobLog";

				tos_count_talendJobLog++;

				/**
				 * [talendJobLog main ] stop
				 */

				/**
				 * [talendJobLog process_data_begin ] start
				 */

				currentComponent = "talendJobLog";

				/**
				 * [talendJobLog process_data_begin ] stop
				 */

				/**
				 * [talendJobLog process_data_end ] start
				 */

				currentComponent = "talendJobLog";

				/**
				 * [talendJobLog process_data_end ] stop
				 */

				/**
				 * [talendJobLog end ] start
				 */

				currentComponent = "talendJobLog";

				ok_Hash.put("talendJobLog", true);
				end_Hash.put("talendJobLog", System.currentTimeMillis());

				/**
				 * [talendJobLog end ] stop
				 */
			} // end the resume

		} catch (java.lang.Exception e) {

			if (!(e instanceof TalendException)) {
				log.fatal(currentComponent + " " + e.getMessage(), e);
			}

			TalendException te = new TalendException(e, currentComponent, globalMap);

			throw te;
		} catch (java.lang.Error error) {

			runStat.stopThreadStat();

			throw error;
		} finally {

			try {

				/**
				 * [talendJobLog finally ] start
				 */

				currentComponent = "talendJobLog";

				/**
				 * [talendJobLog finally ] stop
				 */
			} catch (java.lang.Exception e) {
				// ignore
			} catch (java.lang.Error error) {
				// ignore
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
			java.util.Map<String, String> threadRunResultMap = new java.util.HashMap<String, String>();
			threadRunResultMap.put("errorCode", null);
			threadRunResultMap.put("status", "");
			return threadRunResultMap;
		};
	};

	protected PropertiesWithType context_param = new PropertiesWithType();
	public java.util.Map<String, Object> parentContextMap = new java.util.HashMap<String, Object>();

	public String status = "";

	private final org.talend.components.common.runtime.SharedConnectionsPool connectionPool = new org.talend.components.common.runtime.SharedConnectionsPool() {
		public java.sql.Connection getDBConnection(String dbDriver, String url, String userName, String password,
				String dbConnectionName) throws ClassNotFoundException, java.sql.SQLException {
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

	public static void main(String[] args) {
		final Test TestClass = new Test();

		int exitCode = TestClass.runJobInTOS(args);
		if (exitCode == 0) {
			log.info("TalendJob: 'Test' - Done.");
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

		if (!"".equals(log4jLevel)) {

			if ("trace".equalsIgnoreCase(log4jLevel)) {
				org.apache.logging.log4j.core.config.Configurator.setLevel(log.getName(),
						org.apache.logging.log4j.Level.TRACE);
			} else if ("debug".equalsIgnoreCase(log4jLevel)) {
				org.apache.logging.log4j.core.config.Configurator.setLevel(log.getName(),
						org.apache.logging.log4j.Level.DEBUG);
			} else if ("info".equalsIgnoreCase(log4jLevel)) {
				org.apache.logging.log4j.core.config.Configurator.setLevel(log.getName(),
						org.apache.logging.log4j.Level.INFO);
			} else if ("warn".equalsIgnoreCase(log4jLevel)) {
				org.apache.logging.log4j.core.config.Configurator.setLevel(log.getName(),
						org.apache.logging.log4j.Level.WARN);
			} else if ("error".equalsIgnoreCase(log4jLevel)) {
				org.apache.logging.log4j.core.config.Configurator.setLevel(log.getName(),
						org.apache.logging.log4j.Level.ERROR);
			} else if ("fatal".equalsIgnoreCase(log4jLevel)) {
				org.apache.logging.log4j.core.config.Configurator.setLevel(log.getName(),
						org.apache.logging.log4j.Level.FATAL);
			} else if ("off".equalsIgnoreCase(log4jLevel)) {
				org.apache.logging.log4j.core.config.Configurator.setLevel(log.getName(),
						org.apache.logging.log4j.Level.OFF);
			}
			org.apache.logging.log4j.core.config.Configurator
					.setLevel(org.apache.logging.log4j.LogManager.getRootLogger().getName(), log.getLevel());

		}
		log.info("TalendJob: 'Test' - Start.");

		if (enableLogStash) {
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

			System.getProperties().stringPropertyNames().stream().filter(it -> it.startsWith("audit.logger."))
					.forEach(key -> properties_talendJobLog.setProperty(key.substring("audit.logger.".length()),
							System.getProperty(key)));

			org.apache.logging.log4j.core.config.Configurator
					.setLevel(properties_talendJobLog.getProperty("root.logger"), org.apache.logging.log4j.Level.DEBUG);

			auditLogger_talendJobLog = org.talend.job.audit.JobEventAuditLoggerFactory
					.createJobAuditLogger(properties_talendJobLog);
		}

		if (clientHost == null) {
			clientHost = defaultClientHost;
		}

		if (pid == null || "0".equals(pid)) {
			pid = TalendString.getAsciiRandomString(6);
		}

		if (rootPid == null) {
			rootPid = pid;
		}
		if (fatherPid == null) {
			fatherPid = pid;
		} else {
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
					contextStr = (String) jobProperties.get("context");
				}
			}
			// call job/subjob with an existing context, like: --context=production. if
			// without this parameter, there will use the default context instead.
			java.io.InputStream inContext = Test.class.getClassLoader()
					.getResourceAsStream("uscomm_sunshine_rpt_qa/test_0_1/contexts/" + contextStr + ".properties");
			if (inContext == null) {
				inContext = Test.class.getClassLoader()
						.getResourceAsStream("config/contexts/" + contextStr + ".properties");
			}
			if (inContext != null) {
				try {
					// defaultProps is in order to keep the original context value
					if (context != null && context.isEmpty()) {
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
				// print info and job continue to run, for case: context_param is not empty.
				System.err.println("Could not find the context " + contextStr);
			}

			if (!context_param.isEmpty()) {
				context.putAll(context_param);
				// set types for params from parentJobs
				for (Object key : context_param.keySet()) {
					String context_key = key.toString();
					String context_type = context_param.getContextType(context_key);
					context.setContextType(context_key, context_type);

				}
			}
			class ContextProcessing {
				private void processContext_0() {
					context.setContextType("USSUNSHINE_RPT_DEV_CONN_oauthProperties_oauthPassword", "id_Password");
					if (context.getStringValue("USSUNSHINE_RPT_DEV_CONN_oauthProperties_oauthPassword") == null) {
						context.USSUNSHINE_RPT_DEV_CONN_oauthProperties_oauthPassword = null;
					} else {
						String pwd_USSUNSHINE_RPT_DEV_CONN_oauthProperties_oauthPassword_value = context
								.getProperty("USSUNSHINE_RPT_DEV_CONN_oauthProperties_oauthPassword");
						context.USSUNSHINE_RPT_DEV_CONN_oauthProperties_oauthPassword = null;
						if (pwd_USSUNSHINE_RPT_DEV_CONN_oauthProperties_oauthPassword_value != null) {
							if (context_param.containsKey("USSUNSHINE_RPT_DEV_CONN_oauthProperties_oauthPassword")) {// no
																														// need
																														// to
																														// decrypt
																														// if
																														// it
																														// come
																														// from
																														// program
																														// argument
																														// or
																														// parent
																														// job
																														// runtime
								context.USSUNSHINE_RPT_DEV_CONN_oauthProperties_oauthPassword = pwd_USSUNSHINE_RPT_DEV_CONN_oauthProperties_oauthPassword_value;
							} else if (!pwd_USSUNSHINE_RPT_DEV_CONN_oauthProperties_oauthPassword_value.isEmpty()) {
								try {
									context.USSUNSHINE_RPT_DEV_CONN_oauthProperties_oauthPassword = routines.system.PasswordEncryptUtil
											.decryptPassword(
													pwd_USSUNSHINE_RPT_DEV_CONN_oauthProperties_oauthPassword_value);
									context.put("USSUNSHINE_RPT_DEV_CONN_oauthProperties_oauthPassword",
											context.USSUNSHINE_RPT_DEV_CONN_oauthProperties_oauthPassword);
								} catch (java.lang.RuntimeException e) {
									// do nothing
								}
							}
						}
					}
					context.setContextType("USSUNSHINE_RPT_DEV_CONN_jdbcParameters", "id_String");
					if (context.getStringValue("USSUNSHINE_RPT_DEV_CONN_jdbcParameters") == null) {
						context.USSUNSHINE_RPT_DEV_CONN_jdbcParameters = null;
					} else {
						context.USSUNSHINE_RPT_DEV_CONN_jdbcParameters = (String) context
								.getProperty("USSUNSHINE_RPT_DEV_CONN_jdbcParameters");
					}
					context.setContextType("USSUNSHINE_RPT_DEV_CONN_regionID", "id_String");
					if (context.getStringValue("USSUNSHINE_RPT_DEV_CONN_regionID") == null) {
						context.USSUNSHINE_RPT_DEV_CONN_regionID = null;
					} else {
						context.USSUNSHINE_RPT_DEV_CONN_regionID = (String) context
								.getProperty("USSUNSHINE_RPT_DEV_CONN_regionID");
					}
					context.setContextType("USSUNSHINE_RPT_DEV_CONN_warehouse", "id_String");
					if (context.getStringValue("USSUNSHINE_RPT_DEV_CONN_warehouse") == null) {
						context.USSUNSHINE_RPT_DEV_CONN_warehouse = null;
					} else {
						context.USSUNSHINE_RPT_DEV_CONN_warehouse = (String) context
								.getProperty("USSUNSHINE_RPT_DEV_CONN_warehouse");
					}
					context.setContextType("USSUNSHINE_RPT_DEV_CONN_account", "id_String");
					if (context.getStringValue("USSUNSHINE_RPT_DEV_CONN_account") == null) {
						context.USSUNSHINE_RPT_DEV_CONN_account = null;
					} else {
						context.USSUNSHINE_RPT_DEV_CONN_account = (String) context
								.getProperty("USSUNSHINE_RPT_DEV_CONN_account");
					}
					context.setContextType("USSUNSHINE_RPT_DEV_CONN_userPassword_password", "id_Password");
					if (context.getStringValue("USSUNSHINE_RPT_DEV_CONN_userPassword_password") == null) {
						context.USSUNSHINE_RPT_DEV_CONN_userPassword_password = null;
					} else {
						String pwd_USSUNSHINE_RPT_DEV_CONN_userPassword_password_value = context
								.getProperty("USSUNSHINE_RPT_DEV_CONN_userPassword_password");
						context.USSUNSHINE_RPT_DEV_CONN_userPassword_password = null;
						if (pwd_USSUNSHINE_RPT_DEV_CONN_userPassword_password_value != null) {
							if (context_param.containsKey("USSUNSHINE_RPT_DEV_CONN_userPassword_password")) {// no need
																												// to
																												// decrypt
																												// if it
																												// come
																												// from
																												// program
																												// argument
																												// or
																												// parent
																												// job
																												// runtime
								context.USSUNSHINE_RPT_DEV_CONN_userPassword_password = pwd_USSUNSHINE_RPT_DEV_CONN_userPassword_password_value;
							} else if (!pwd_USSUNSHINE_RPT_DEV_CONN_userPassword_password_value.isEmpty()) {
								try {
									context.USSUNSHINE_RPT_DEV_CONN_userPassword_password = routines.system.PasswordEncryptUtil
											.decryptPassword(pwd_USSUNSHINE_RPT_DEV_CONN_userPassword_password_value);
									context.put("USSUNSHINE_RPT_DEV_CONN_userPassword_password",
											context.USSUNSHINE_RPT_DEV_CONN_userPassword_password);
								} catch (java.lang.RuntimeException e) {
									// do nothing
								}
							}
						}
					}
					context.setContextType("USSUNSHINE_RPT_DEV_CONN_db", "id_String");
					if (context.getStringValue("USSUNSHINE_RPT_DEV_CONN_db") == null) {
						context.USSUNSHINE_RPT_DEV_CONN_db = null;
					} else {
						context.USSUNSHINE_RPT_DEV_CONN_db = (String) context.getProperty("USSUNSHINE_RPT_DEV_CONN_db");
					}
					context.setContextType("USSUNSHINE_RPT_DEV_CONN_loginTimeout", "id_Integer");
					if (context.getStringValue("USSUNSHINE_RPT_DEV_CONN_loginTimeout") == null) {
						context.USSUNSHINE_RPT_DEV_CONN_loginTimeout = null;
					} else {
						try {
							context.USSUNSHINE_RPT_DEV_CONN_loginTimeout = routines.system.ParserUtils
									.parseTo_Integer(context.getProperty("USSUNSHINE_RPT_DEV_CONN_loginTimeout"));
						} catch (NumberFormatException e) {
							log.warn(String.format("Null value will be used for context parameter %s: %s",
									"USSUNSHINE_RPT_DEV_CONN_loginTimeout", e.getMessage()));
							context.USSUNSHINE_RPT_DEV_CONN_loginTimeout = null;
						}
					}
					context.setContextType("USSUNSHINE_RPT_DEV_CONN_oauthProperties_scope", "id_String");
					if (context.getStringValue("USSUNSHINE_RPT_DEV_CONN_oauthProperties_scope") == null) {
						context.USSUNSHINE_RPT_DEV_CONN_oauthProperties_scope = null;
					} else {
						context.USSUNSHINE_RPT_DEV_CONN_oauthProperties_scope = (String) context
								.getProperty("USSUNSHINE_RPT_DEV_CONN_oauthProperties_scope");
					}
					context.setContextType("USSUNSHINE_RPT_DEV_CONN_oauthProperties_oauthUserName", "id_String");
					if (context.getStringValue("USSUNSHINE_RPT_DEV_CONN_oauthProperties_oauthUserName") == null) {
						context.USSUNSHINE_RPT_DEV_CONN_oauthProperties_oauthUserName = null;
					} else {
						context.USSUNSHINE_RPT_DEV_CONN_oauthProperties_oauthUserName = (String) context
								.getProperty("USSUNSHINE_RPT_DEV_CONN_oauthProperties_oauthUserName");
					}
					context.setContextType("USSUNSHINE_RPT_DEV_CONN_userPassword_userId", "id_String");
					if (context.getStringValue("USSUNSHINE_RPT_DEV_CONN_userPassword_userId") == null) {
						context.USSUNSHINE_RPT_DEV_CONN_userPassword_userId = null;
					} else {
						context.USSUNSHINE_RPT_DEV_CONN_userPassword_userId = (String) context
								.getProperty("USSUNSHINE_RPT_DEV_CONN_userPassword_userId");
					}
					context.setContextType("USSUNSHINE_RPT_DEV_CONN_role", "id_String");
					if (context.getStringValue("USSUNSHINE_RPT_DEV_CONN_role") == null) {
						context.USSUNSHINE_RPT_DEV_CONN_role = null;
					} else {
						context.USSUNSHINE_RPT_DEV_CONN_role = (String) context
								.getProperty("USSUNSHINE_RPT_DEV_CONN_role");
					}
					context.setContextType("USSUNSHINE_RPT_DEV_CONN_schemaName", "id_String");
					if (context.getStringValue("USSUNSHINE_RPT_DEV_CONN_schemaName") == null) {
						context.USSUNSHINE_RPT_DEV_CONN_schemaName = null;
					} else {
						context.USSUNSHINE_RPT_DEV_CONN_schemaName = (String) context
								.getProperty("USSUNSHINE_RPT_DEV_CONN_schemaName");
					}
					context.setContextType("USSUNSHINE_RPT_DEV_CONN_oauthProperties_clientSecret", "id_Password");
					if (context.getStringValue("USSUNSHINE_RPT_DEV_CONN_oauthProperties_clientSecret") == null) {
						context.USSUNSHINE_RPT_DEV_CONN_oauthProperties_clientSecret = null;
					} else {
						String pwd_USSUNSHINE_RPT_DEV_CONN_oauthProperties_clientSecret_value = context
								.getProperty("USSUNSHINE_RPT_DEV_CONN_oauthProperties_clientSecret");
						context.USSUNSHINE_RPT_DEV_CONN_oauthProperties_clientSecret = null;
						if (pwd_USSUNSHINE_RPT_DEV_CONN_oauthProperties_clientSecret_value != null) {
							if (context_param.containsKey("USSUNSHINE_RPT_DEV_CONN_oauthProperties_clientSecret")) {// no
																													// need
																													// to
																													// decrypt
																													// if
																													// it
																													// come
																													// from
																													// program
																													// argument
																													// or
																													// parent
																													// job
																													// runtime
								context.USSUNSHINE_RPT_DEV_CONN_oauthProperties_clientSecret = pwd_USSUNSHINE_RPT_DEV_CONN_oauthProperties_clientSecret_value;
							} else if (!pwd_USSUNSHINE_RPT_DEV_CONN_oauthProperties_clientSecret_value.isEmpty()) {
								try {
									context.USSUNSHINE_RPT_DEV_CONN_oauthProperties_clientSecret = routines.system.PasswordEncryptUtil
											.decryptPassword(
													pwd_USSUNSHINE_RPT_DEV_CONN_oauthProperties_clientSecret_value);
									context.put("USSUNSHINE_RPT_DEV_CONN_oauthProperties_clientSecret",
											context.USSUNSHINE_RPT_DEV_CONN_oauthProperties_clientSecret);
								} catch (java.lang.RuntimeException e) {
									// do nothing
								}
							}
						}
					}
					context.setContextType("USSUNSHINE_RPT_DEV_CONN_oauthProperties_clientId", "id_String");
					if (context.getStringValue("USSUNSHINE_RPT_DEV_CONN_oauthProperties_clientId") == null) {
						context.USSUNSHINE_RPT_DEV_CONN_oauthProperties_clientId = null;
					} else {
						context.USSUNSHINE_RPT_DEV_CONN_oauthProperties_clientId = (String) context
								.getProperty("USSUNSHINE_RPT_DEV_CONN_oauthProperties_clientId");
					}
					context.setContextType("USSUNSHINE_RPT_DEV_CONN_keyAlias", "id_String");
					if (context.getStringValue("USSUNSHINE_RPT_DEV_CONN_keyAlias") == null) {
						context.USSUNSHINE_RPT_DEV_CONN_keyAlias = null;
					} else {
						context.USSUNSHINE_RPT_DEV_CONN_keyAlias = (String) context
								.getProperty("USSUNSHINE_RPT_DEV_CONN_keyAlias");
					}
					context.setContextType("USSUNSHINE_RPT_DEV_CONN_oauthProperties_oauthTokenEndpoint", "id_String");
					if (context.getStringValue("USSUNSHINE_RPT_DEV_CONN_oauthProperties_oauthTokenEndpoint") == null) {
						context.USSUNSHINE_RPT_DEV_CONN_oauthProperties_oauthTokenEndpoint = null;
					} else {
						context.USSUNSHINE_RPT_DEV_CONN_oauthProperties_oauthTokenEndpoint = (String) context
								.getProperty("USSUNSHINE_RPT_DEV_CONN_oauthProperties_oauthTokenEndpoint");
					}
				}

				public void processAllContext() {
					processContext_0();
				}
			}

			new ContextProcessing().processAllContext();
		} catch (java.io.IOException ie) {
			System.err.println("Could not load context " + contextStr);
			ie.printStackTrace();
		}

		// get context value from parent directly
		if (parentContextMap != null && !parentContextMap.isEmpty()) {
			if (parentContextMap.containsKey("USSUNSHINE_RPT_DEV_CONN_oauthProperties_oauthPassword")) {
				context.USSUNSHINE_RPT_DEV_CONN_oauthProperties_oauthPassword = (java.lang.String) parentContextMap
						.get("USSUNSHINE_RPT_DEV_CONN_oauthProperties_oauthPassword");
			}
			if (parentContextMap.containsKey("USSUNSHINE_RPT_DEV_CONN_jdbcParameters")) {
				context.USSUNSHINE_RPT_DEV_CONN_jdbcParameters = (String) parentContextMap
						.get("USSUNSHINE_RPT_DEV_CONN_jdbcParameters");
			}
			if (parentContextMap.containsKey("USSUNSHINE_RPT_DEV_CONN_regionID")) {
				context.USSUNSHINE_RPT_DEV_CONN_regionID = (String) parentContextMap
						.get("USSUNSHINE_RPT_DEV_CONN_regionID");
			}
			if (parentContextMap.containsKey("USSUNSHINE_RPT_DEV_CONN_warehouse")) {
				context.USSUNSHINE_RPT_DEV_CONN_warehouse = (String) parentContextMap
						.get("USSUNSHINE_RPT_DEV_CONN_warehouse");
			}
			if (parentContextMap.containsKey("USSUNSHINE_RPT_DEV_CONN_account")) {
				context.USSUNSHINE_RPT_DEV_CONN_account = (String) parentContextMap
						.get("USSUNSHINE_RPT_DEV_CONN_account");
			}
			if (parentContextMap.containsKey("USSUNSHINE_RPT_DEV_CONN_userPassword_password")) {
				context.USSUNSHINE_RPT_DEV_CONN_userPassword_password = (java.lang.String) parentContextMap
						.get("USSUNSHINE_RPT_DEV_CONN_userPassword_password");
			}
			if (parentContextMap.containsKey("USSUNSHINE_RPT_DEV_CONN_db")) {
				context.USSUNSHINE_RPT_DEV_CONN_db = (String) parentContextMap.get("USSUNSHINE_RPT_DEV_CONN_db");
			}
			if (parentContextMap.containsKey("USSUNSHINE_RPT_DEV_CONN_loginTimeout")) {
				context.USSUNSHINE_RPT_DEV_CONN_loginTimeout = (Integer) parentContextMap
						.get("USSUNSHINE_RPT_DEV_CONN_loginTimeout");
			}
			if (parentContextMap.containsKey("USSUNSHINE_RPT_DEV_CONN_oauthProperties_scope")) {
				context.USSUNSHINE_RPT_DEV_CONN_oauthProperties_scope = (String) parentContextMap
						.get("USSUNSHINE_RPT_DEV_CONN_oauthProperties_scope");
			}
			if (parentContextMap.containsKey("USSUNSHINE_RPT_DEV_CONN_oauthProperties_oauthUserName")) {
				context.USSUNSHINE_RPT_DEV_CONN_oauthProperties_oauthUserName = (String) parentContextMap
						.get("USSUNSHINE_RPT_DEV_CONN_oauthProperties_oauthUserName");
			}
			if (parentContextMap.containsKey("USSUNSHINE_RPT_DEV_CONN_userPassword_userId")) {
				context.USSUNSHINE_RPT_DEV_CONN_userPassword_userId = (String) parentContextMap
						.get("USSUNSHINE_RPT_DEV_CONN_userPassword_userId");
			}
			if (parentContextMap.containsKey("USSUNSHINE_RPT_DEV_CONN_role")) {
				context.USSUNSHINE_RPT_DEV_CONN_role = (String) parentContextMap.get("USSUNSHINE_RPT_DEV_CONN_role");
			}
			if (parentContextMap.containsKey("USSUNSHINE_RPT_DEV_CONN_schemaName")) {
				context.USSUNSHINE_RPT_DEV_CONN_schemaName = (String) parentContextMap
						.get("USSUNSHINE_RPT_DEV_CONN_schemaName");
			}
			if (parentContextMap.containsKey("USSUNSHINE_RPT_DEV_CONN_oauthProperties_clientSecret")) {
				context.USSUNSHINE_RPT_DEV_CONN_oauthProperties_clientSecret = (java.lang.String) parentContextMap
						.get("USSUNSHINE_RPT_DEV_CONN_oauthProperties_clientSecret");
			}
			if (parentContextMap.containsKey("USSUNSHINE_RPT_DEV_CONN_oauthProperties_clientId")) {
				context.USSUNSHINE_RPT_DEV_CONN_oauthProperties_clientId = (String) parentContextMap
						.get("USSUNSHINE_RPT_DEV_CONN_oauthProperties_clientId");
			}
			if (parentContextMap.containsKey("USSUNSHINE_RPT_DEV_CONN_keyAlias")) {
				context.USSUNSHINE_RPT_DEV_CONN_keyAlias = (String) parentContextMap
						.get("USSUNSHINE_RPT_DEV_CONN_keyAlias");
			}
			if (parentContextMap.containsKey("USSUNSHINE_RPT_DEV_CONN_oauthProperties_oauthTokenEndpoint")) {
				context.USSUNSHINE_RPT_DEV_CONN_oauthProperties_oauthTokenEndpoint = (String) parentContextMap
						.get("USSUNSHINE_RPT_DEV_CONN_oauthProperties_oauthTokenEndpoint");
			}
		}

		// Resume: init the resumeUtil
		resumeEntryMethodName = ResumeUtil.getResumeEntryMethodName(resuming_checkpoint_path);
		resumeUtil = new ResumeUtil(resuming_logs_dir_path, isChildJob, rootPid);
		resumeUtil.initCommonInfo(pid, rootPid, fatherPid, projectName, jobName, contextStr, jobVersion);

		List<String> parametersToEncrypt = new java.util.ArrayList<String>();
		parametersToEncrypt.add("USSUNSHINE_RPT_DEV_CONN_oauthProperties_oauthPassword");
		parametersToEncrypt.add("USSUNSHINE_RPT_DEV_CONN_userPassword_password");
		parametersToEncrypt.add("USSUNSHINE_RPT_DEV_CONN_oauthProperties_clientSecret");
		// Resume: jobStart
		resumeUtil.addLog("JOB_STARTED", "JOB:" + jobName, parent_part_launcher, Thread.currentThread().getId() + "",
				"", "", "", "", resumeUtil.convertToJsonText(context, parametersToEncrypt));

		if (execStat) {
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

		this.globalResumeTicket = true;// to run tPreJob

		try {
			errorCode = null;
			tPrejob_1Process(globalMap);
			if (!"failure".equals(status)) {
				status = "end";
			}
		} catch (TalendException e_tPrejob_1) {
			globalMap.put("tPrejob_1_SUBPROCESS_STATE", -1);

			e_tPrejob_1.printStackTrace();

		}

		if (enableLogStash) {
			talendJobLog.addJobStartMessage();
			try {
				talendJobLogProcess(globalMap);
			} catch (java.lang.Exception e) {
				e.printStackTrace();
			}
		}

		this.globalResumeTicket = false;// to run others jobs

		try {
			errorCode = null;
			tDBInput_1Process(globalMap);
			if (!"failure".equals(status)) {
				status = "end";
			}
		} catch (TalendException e_tDBInput_1) {
			globalMap.put("tDBInput_1_SUBPROCESS_STATE", -1);

			e_tDBInput_1.printStackTrace();

		}

		this.globalResumeTicket = true;// to run tPostJob

		end = System.currentTimeMillis();

		if (watch) {
			System.out.println((end - startTime) + " milliseconds");
		}

		endUsedMemory = Runtime.getRuntime().totalMemory() - Runtime.getRuntime().freeMemory();
		if (false) {
			System.out.println((endUsedMemory - startUsedMemory) + " bytes memory increase when running : Test");
		}
		if (enableLogStash) {
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

		if (errorCode == null) {
			returnCode = status != null && status.equals("failure") ? 1 : 0;
		} else {
			returnCode = errorCode.intValue();
		}
		resumeUtil.addLog("JOB_ENDED", "JOB:" + jobName, parent_part_launcher, Thread.currentThread().getId() + "", "",
				"" + returnCode, "", "", "");

		return returnCode;

	}

	// only for OSGi env
	public void destroy() {

	}

	private java.util.Map<String, Object> getSharedConnections4REST() {
		java.util.Map<String, Object> connections = new java.util.HashMap<String, Object>();

		connections.put("tDBConnection_1_connection", globalMap.get("tDBConnection_1_connection"));
		connections.put("tDBConnection_1_COMPONENT_RUNTIME_PROPERTIES",
				globalMap.get("tDBConnection_1_COMPONENT_RUNTIME_PROPERTIES"));

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
				if (fatherPid == null) {
					context_param.setContextType(keyValue.substring(0, index),
							replaceEscapeChars(keyValue.substring(index + 1)));
				} else { // the subjob won't escape the especial chars
					context_param.setContextType(keyValue.substring(0, index), keyValue.substring(index + 1));
				}

			}

		} else if (arg.startsWith("--context_param")) {
			String keyValue = arg.substring(16);
			int index = -1;
			if (keyValue != null && (index = keyValue.indexOf('=')) > -1) {
				if (fatherPid == null) {
					context_param.put(keyValue.substring(0, index), replaceEscapeChars(keyValue.substring(index + 1)));
				} else { // the subjob won't escape the especial chars
					context_param.put(keyValue.substring(0, index), keyValue.substring(index + 1));
				}
			}
		} else if (arg.startsWith("--log4jLevel=")) {
			log4jLevel = arg.substring(13);
		} else if (arg.startsWith("--audit.enabled") && arg.contains("=")) {// for trunjob call
			final int equal = arg.indexOf('=');
			final String key = arg.substring("--".length(), equal);
			System.setProperty(key, arg.substring(equal + 1));
		}
	}

	private static final String NULL_VALUE_EXPRESSION_IN_COMMAND_STRING_FOR_CHILD_JOB_ONLY = "<TALEND_NULL>";

	private final String[][] escapeChars = { { "\\\\", "\\" }, { "\\n", "\n" }, { "\\'", "\'" }, { "\\r", "\r" },
			{ "\\f", "\f" }, { "\\b", "\b" }, { "\\t", "\t" } };

	private String replaceEscapeChars(String keyValue) {

		if (keyValue == null || ("").equals(keyValue.trim())) {
			return keyValue;
		}

		StringBuilder result = new StringBuilder();
		int currIndex = 0;
		while (currIndex < keyValue.length()) {
			int index = -1;
			// judege if the left string includes escape chars
			for (String[] strArray : escapeChars) {
				index = keyValue.indexOf(strArray[0], currIndex);
				if (index >= 0) {

					result.append(keyValue.substring(currIndex, index + strArray[0].length()).replace(strArray[0],
							strArray[1]));
					currIndex = index + strArray[0].length();
					break;
				}
			}
			// if the left string doesn't include escape chars, append the left into the
			// result
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
 * 119070 characters generated by Talend Cloud Data Management Platform on the
 * March 16, 2022 at 11:20:48 AM CDT
 ************************************************************************************************/