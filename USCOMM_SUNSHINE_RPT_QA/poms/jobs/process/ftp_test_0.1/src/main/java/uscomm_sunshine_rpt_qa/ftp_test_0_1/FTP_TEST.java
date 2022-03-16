
package uscomm_sunshine_rpt_qa.ftp_test_0_1;

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
 * Job: FTP_TEST Purpose: <br>
 * Description: <br>
 * 
 * @author Reddi Anki, Nanda Kishore
 * @version 8.0.1.20220218_1542-patch
 * @status
 */
public class FTP_TEST implements TalendJob {
	static {
		System.setProperty("TalendJob.log", "FTP_TEST.log");
	}

	private static org.apache.logging.log4j.Logger log = org.apache.logging.log4j.LogManager.getLogger(FTP_TEST.class);

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

		}

		// if the stored or passed value is "<TALEND_NULL>" string, it mean null
		public String getStringValue(String key) {
			String origin_value = this.getProperty(key);
			if (NULL_VALUE_EXPRESSION_IN_COMMAND_STRING_FOR_CHILD_JOB_ONLY.equals(origin_value)) {
				return null;
			}
			return origin_value;
		}

	}

	protected ContextProperties context = new ContextProperties(); // will be instanciated by MS.

	public ContextProperties getContext() {
		return this.context;
	}

	private final String jobVersion = "0.1";
	private final String jobName = "FTP_TEST";
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
			"_5O_FcKVIEeyQcoNx4WlZnQ", "0.1");
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
					FTP_TEST.this.exception = e;
				}
			}
			if (!(e instanceof TalendException)) {
				try {
					for (java.lang.reflect.Method m : this.getClass().getEnclosingClass().getMethods()) {
						if (m.getName().compareTo(currentComponent + "_error") == 0) {
							m.invoke(FTP_TEST.this, new Object[] { e, currentComponent, globalMap });
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

	public void tFTPGet_1_error(Exception exception, String errorComponent,
			final java.util.Map<String, Object> globalMap) throws TalendException {

		end_Hash.put(errorComponent, System.currentTimeMillis());

		status = "failure";

		tFTPGet_1_onSubJobError(exception, errorComponent, globalMap);
	}

	public void tPrejob_1_error(Exception exception, String errorComponent,
			final java.util.Map<String, Object> globalMap) throws TalendException {

		end_Hash.put(errorComponent, System.currentTimeMillis());

		status = "failure";

		tPrejob_1_onSubJobError(exception, errorComponent, globalMap);
	}

	public void tFTPConnection_1_error(Exception exception, String errorComponent,
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

		tFTPConnection_1_onSubJobError(exception, errorComponent, globalMap);
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

	public void tFTPGet_1_onSubJobError(Exception exception, String errorComponent,
			final java.util.Map<String, Object> globalMap) throws TalendException {

		resumeUtil.addLog("SYSTEM_LOG", "NODE:" + errorComponent, "", Thread.currentThread().getId() + "", "FATAL", "",
				exception.getMessage(), ResumeUtil.getExceptionStackTrace(exception), "");

	}

	public void tPrejob_1_onSubJobError(Exception exception, String errorComponent,
			final java.util.Map<String, Object> globalMap) throws TalendException {

		resumeUtil.addLog("SYSTEM_LOG", "NODE:" + errorComponent, "", Thread.currentThread().getId() + "", "FATAL", "",
				exception.getMessage(), ResumeUtil.getExceptionStackTrace(exception), "");

	}

	public void tFTPConnection_1_onSubJobError(Exception exception, String errorComponent,
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

	public void tFTPGet_1Process(final java.util.Map<String, Object> globalMap) throws TalendException {
		globalMap.put("tFTPGet_1_SUBPROCESS_STATE", 0);

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
				 * [tFTPGet_1 begin ] start
				 */

				ok_Hash.put("tFTPGet_1", false);
				start_Hash.put("tFTPGet_1", System.currentTimeMillis());

				currentComponent = "tFTPGet_1";

				int tos_count_tFTPGet_1 = 0;

				if (log.isDebugEnabled())
					log.debug("tFTPGet_1 - " + ("Start to work."));
				if (log.isDebugEnabled()) {
					class BytesLimit65535_tFTPGet_1 {
						public void limitLog4jByte() throws Exception {
							StringBuilder log4jParamters_tFTPGet_1 = new StringBuilder();
							log4jParamters_tFTPGet_1.append("Parameters:");
							log4jParamters_tFTPGet_1.append("USE_EXISTING_CONNECTION" + " = " + "true");
							log4jParamters_tFTPGet_1.append(" | ");
							log4jParamters_tFTPGet_1.append("CONNECTION" + " = " + "tFTPConnection_1");
							log4jParamters_tFTPGet_1.append(" | ");
							log4jParamters_tFTPGet_1.append("LOCALDIR" + " = "
									+ "\"/Users/8kmilesinc./Desktop/LegendBiotech/SFTP/fromremote/test.txt\"");
							log4jParamters_tFTPGet_1.append(" | ");
							log4jParamters_tFTPGet_1.append("REMOTEDIR" + " = " + "\"/\"");
							log4jParamters_tFTPGet_1.append(" | ");
							log4jParamters_tFTPGet_1.append("SFTPOVERWRITE" + " = " + "overwrite");
							log4jParamters_tFTPGet_1.append(" | ");
							log4jParamters_tFTPGet_1.append("PERL5_REGEX" + " = " + "false");
							log4jParamters_tFTPGet_1.append(" | ");
							log4jParamters_tFTPGet_1.append("FILES" + " = " + "[{FILEMASK=" + ("\"*.txt\"") + "}]");
							log4jParamters_tFTPGet_1.append(" | ");
							log4jParamters_tFTPGet_1.append("DIE_ON_ERROR" + " = " + "true");
							log4jParamters_tFTPGet_1.append(" | ");
							log4jParamters_tFTPGet_1.append("PRINT_MESSAGE" + " = " + "false");
							log4jParamters_tFTPGet_1.append(" | ");
							if (log.isDebugEnabled())
								log.debug("tFTPGet_1 - " + (log4jParamters_tFTPGet_1));
						}
					}
					new BytesLimit65535_tFTPGet_1().limitLog4jByte();
				}
				if (enableLogStash) {
					talendJobLog.addCM("tFTPGet_1", "tFTPGet_1", "tFTPGet");
					talendJobLogProcess(globalMap);
				}

				int nb_file_tFTPGet_1 = 0;
				final java.util.List<String> msg_tFTPGet_1 = new java.util.ArrayList<String>();

				class MyProgressMonitor_tFTPGet_1 implements com.jcraft.jsch.SftpProgressMonitor {

					private long percent = -1;

					public void init(int op, String src, String dest, long max) {
					}

					public boolean count(long count) {
						return true;
					}

					public void end() {
					}
				}

				class SFTPGetter_tFTPGet_1 {

					private com.jcraft.jsch.ChannelSftp cnlSFTP = null;

					private com.jcraft.jsch.SftpProgressMonitor monitor = null;

					private int count = 0;

					public void getAllFiles(String remoteDirectory, String localDirectory)
							throws com.jcraft.jsch.SftpException {

						chdir(remoteDirectory);
						java.util.Vector sftpFiles = cnlSFTP.ls(".");

						for (Object sftpFile : sftpFiles) {
							com.jcraft.jsch.ChannelSftp.LsEntry lsEntry = (com.jcraft.jsch.ChannelSftp.LsEntry) sftpFile;
							com.jcraft.jsch.SftpATTRS attrs = lsEntry.getAttrs();

							if ((".").equals(lsEntry.getFilename()) || ("..").equals(lsEntry.getFilename())) {
								continue;
							}

							if (attrs.isDir()) {
								java.io.File localFile = new java.io.File(localDirectory + "/" + lsEntry.getFilename());
								if (!localFile.exists()) {
									localFile.mkdir();
								}
								getAllFiles(remoteDirectory + "/" + lsEntry.getFilename(),
										localDirectory + "/" + lsEntry.getFilename());
								chdir(remoteDirectory);
							} else if (!attrs.isLink()) {
								downloadFile(localDirectory, lsEntry.getFilename());
							}
						}
					}

					public void getFiles(String remoteDirectory, String localDirectory, String maskStr)
							throws com.jcraft.jsch.SftpException {

						chdir(remoteDirectory);
						java.util.Vector sftpFiles = cnlSFTP.ls(".");

						for (Object sftpFile : sftpFiles) {
							com.jcraft.jsch.ChannelSftp.LsEntry lsEntry = (com.jcraft.jsch.ChannelSftp.LsEntry) sftpFile;
							com.jcraft.jsch.SftpATTRS attrs = lsEntry.getAttrs();

							if ((".").equals(lsEntry.getFilename()) || ("..").equals(lsEntry.getFilename())) {
								continue;
							}

							if (!attrs.isDir() && !attrs.isLink()) {

								if (lsEntry.getFilename().matches(maskStr)) {
									downloadFile(localDirectory, lsEntry.getFilename());
								}
							}
						}
					}

					public void chdir(String path) throws com.jcraft.jsch.SftpException {
						if (!".".equals(path)) {
							cnlSFTP.cd(path);
						}
					}

					public String pwd() throws com.jcraft.jsch.SftpException {
						return cnlSFTP.pwd();
					}

					private void downloadFile(String localFileName, String remoteFileName)
							throws com.jcraft.jsch.SftpException {

						try {
							cnlSFTP.get(remoteFileName, localFileName, monitor, com.jcraft.jsch.ChannelSftp.OVERWRITE);

							log.debug("tFTPGet_1 - Downloaded file " + (count + 1) + " : '" + remoteFileName
									+ "' successfully.");

							msg_tFTPGet_1.add("file [" + remoteFileName + "] downloaded successfully.");

							globalMap.put("tFTPGet_1_CURRENT_STATUS", "File transfer OK.");
						} catch (com.jcraft.jsch.SftpException e) {
							globalMap.put("tFTPGet_1_ERROR_MESSAGE", e.getMessage());

							if (e.id == com.jcraft.jsch.ChannelSftp.SSH_FX_FAILURE
									|| e.id == com.jcraft.jsch.ChannelSftp.SSH_FX_BAD_MESSAGE) {
								msg_tFTPGet_1.add("file [" + remoteFileName + "] downloaded unsuccessfully.");
								globalMap.put("tFTPGet_1_CURRENT_STATUS", "File transfer fail.");
							}
							throw e;
						}
						count++;
					}
				}

				com.jcraft.jsch.ChannelSftp c_tFTPGet_1 = (com.jcraft.jsch.ChannelSftp) globalMap
						.get("conn_tFTPConnection_1");

				if (c_tFTPGet_1 != null && c_tFTPGet_1.getSession() != null) {
					log.info("tFTPGet_1 - Use an existing connection.Connection username: "
							+ c_tFTPGet_1.getSession().getUserName() + ", Connection hostname: "
							+ c_tFTPGet_1.getSession().getHost() + ", Connection port: "
							+ c_tFTPGet_1.getSession().getPort() + ".");
				}

				if (c_tFTPGet_1.getHome() != null && !c_tFTPGet_1.getHome().equals(c_tFTPGet_1.pwd())) {
					c_tFTPGet_1.cd(c_tFTPGet_1.getHome());
				}
				com.jcraft.jsch.SftpProgressMonitor monitor_tFTPGet_1 = new MyProgressMonitor_tFTPGet_1();
				SFTPGetter_tFTPGet_1 getter_tFTPGet_1 = new SFTPGetter_tFTPGet_1();
				getter_tFTPGet_1.cnlSFTP = c_tFTPGet_1;
				getter_tFTPGet_1.monitor = monitor_tFTPGet_1;
				String remotedir_tFTPGet_1 = "/";
				if (!".".equals(remotedir_tFTPGet_1)) {
					c_tFTPGet_1.cd(remotedir_tFTPGet_1);
				}
				java.util.List<String> maskList_tFTPGet_1 = new java.util.ArrayList<String>();

				maskList_tFTPGet_1.add("*.txt");
				String localdir_tFTPGet_1 = "/Users/8kmilesinc./Desktop/LegendBiotech/SFTP/fromremote/test.txt";
//create folder if local direcotry (assigned by property) not exists
				java.io.File dirHandle_tFTPGet_1 = new java.io.File(localdir_tFTPGet_1);

				if (!dirHandle_tFTPGet_1.exists()) {
					dirHandle_tFTPGet_1.mkdirs();
				}
				String root_tFTPGet_1 = getter_tFTPGet_1.pwd();
				if ("/".equals(root_tFTPGet_1)) {
					root_tFTPGet_1 = ".";
				}

				log.info("tFTPGet_1 - Downloading files from the server.");
				for (String maskStr_tFTPGet_1 : maskList_tFTPGet_1) {

					/**
					 * [tFTPGet_1 begin ] stop
					 */

					/**
					 * [tFTPGet_1 main ] start
					 */

					currentComponent = "tFTPGet_1";

					try {
						globalMap.put("tFTPGet_1_CURRENT_STATUS", "No file transfered.");
						String dir_tFTPGet_1 = root_tFTPGet_1;

						String mask_tFTPGet_1 = maskStr_tFTPGet_1.replaceAll("\\\\", "/");

						int i_tFTPGet_1 = mask_tFTPGet_1.lastIndexOf('/');

						if (i_tFTPGet_1 != -1) {
							dir_tFTPGet_1 = mask_tFTPGet_1.substring(0, i_tFTPGet_1);
							mask_tFTPGet_1 = mask_tFTPGet_1.substring(i_tFTPGet_1 + 1);
						}

						mask_tFTPGet_1 = org.apache.oro.text.GlobCompiler.globToPerl5(mask_tFTPGet_1.toCharArray(),
								org.apache.oro.text.GlobCompiler.DEFAULT_MASK);

						if (dir_tFTPGet_1 != null && !"".equals(dir_tFTPGet_1)) {
							if ((".*").equals(mask_tFTPGet_1)) {
								getter_tFTPGet_1.getAllFiles(dir_tFTPGet_1, localdir_tFTPGet_1);
							} else {
								getter_tFTPGet_1.getFiles(dir_tFTPGet_1, localdir_tFTPGet_1, mask_tFTPGet_1);
							}
						}
						getter_tFTPGet_1.chdir(root_tFTPGet_1);
					} catch (java.lang.Exception e) {
						globalMap.put("tFTPGet_1_ERROR_MESSAGE", e.getMessage());

						throw (e);

					}

					tos_count_tFTPGet_1++;

					/**
					 * [tFTPGet_1 main ] stop
					 */

					/**
					 * [tFTPGet_1 process_data_begin ] start
					 */

					currentComponent = "tFTPGet_1";

					/**
					 * [tFTPGet_1 process_data_begin ] stop
					 */

					/**
					 * [tFTPGet_1 process_data_end ] start
					 */

					currentComponent = "tFTPGet_1";

					/**
					 * [tFTPGet_1 process_data_end ] stop
					 */

					/**
					 * [tFTPGet_1 end ] start
					 */

					currentComponent = "tFTPGet_1";

				}
				nb_file_tFTPGet_1 = getter_tFTPGet_1.count;

				msg_tFTPGet_1.add(getter_tFTPGet_1.count + " files have been downloaded.");
				StringBuffer sb_tFTPGet_1 = new StringBuffer();

				for (String item_tFTPGet_1 : msg_tFTPGet_1) {
					sb_tFTPGet_1.append(item_tFTPGet_1).append("\n");
				}
				globalMap.put("tFTPGet_1_TRANSFER_MESSAGES", sb_tFTPGet_1.toString());

				globalMap.put("tFTPGet_1_NB_FILE", nb_file_tFTPGet_1);
				log.info("tFTPGet_1 - Downloaded files count: " + nb_file_tFTPGet_1 + ".");

				if (log.isDebugEnabled())
					log.debug("tFTPGet_1 - " + ("Done."));

				ok_Hash.put("tFTPGet_1", true);
				end_Hash.put("tFTPGet_1", System.currentTimeMillis());

				/**
				 * [tFTPGet_1 end ] stop
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
				 * [tFTPGet_1 finally ] start
				 */

				currentComponent = "tFTPGet_1";

				/**
				 * [tFTPGet_1 finally ] stop
				 */
			} catch (java.lang.Exception e) {
				// ignore
			} catch (java.lang.Error error) {
				// ignore
			}
			resourceMap = null;
		}

		globalMap.put("tFTPGet_1_SUBPROCESS_STATE", 1);
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
				tFTPConnection_1Process(globalMap);

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

	public void tFTPConnection_1Process(final java.util.Map<String, Object> globalMap) throws TalendException {
		globalMap.put("tFTPConnection_1_SUBPROCESS_STATE", 0);

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
				 * [tFTPConnection_1 begin ] start
				 */

				ok_Hash.put("tFTPConnection_1", false);
				start_Hash.put("tFTPConnection_1", System.currentTimeMillis());

				currentComponent = "tFTPConnection_1";

				int tos_count_tFTPConnection_1 = 0;

				if (log.isDebugEnabled())
					log.debug("tFTPConnection_1 - " + ("Start to work."));
				if (log.isDebugEnabled()) {
					class BytesLimit65535_tFTPConnection_1 {
						public void limitLog4jByte() throws Exception {
							StringBuilder log4jParamters_tFTPConnection_1 = new StringBuilder();
							log4jParamters_tFTPConnection_1.append("Parameters:");
							log4jParamters_tFTPConnection_1.append(
									"HOST" + " = " + "\"s-c75d54d4dd2c4b21a.server.transfer.us-east-1.amazonaws.com\"");
							log4jParamters_tFTPConnection_1.append(" | ");
							log4jParamters_tFTPConnection_1.append("PORT" + " = " + "22");
							log4jParamters_tFTPConnection_1.append(" | ");
							log4jParamters_tFTPConnection_1.append("USER" + " = " + "\"sunshine_rpt\"");
							log4jParamters_tFTPConnection_1.append(" | ");
							log4jParamters_tFTPConnection_1.append("SFTP" + " = " + "true");
							log4jParamters_tFTPConnection_1.append(" | ");
							log4jParamters_tFTPConnection_1.append("AUTH_METHOD" + " = " + "PUBLICKEY");
							log4jParamters_tFTPConnection_1.append(" | ");
							log4jParamters_tFTPConnection_1.append("PRIVATEKEY" + " = "
									+ "\"/Users/8kmilesinc./Desktop/LegendBiotech/SFTP/privatekey.pem\"");
							log4jParamters_tFTPConnection_1.append(" | ");
							log4jParamters_tFTPConnection_1.append("PASSPHRASE" + " = "
									+ String.valueOf(
											"enc:routine.encryption.key.v1:EREGJdubd/VB1NVOseqZtPae7Gfnx6PDW6YHVQ==")
											.substring(0, 4)
									+ "...");
							log4jParamters_tFTPConnection_1.append(" | ");
							log4jParamters_tFTPConnection_1.append("USE_ENCODING" + " = " + "false");
							log4jParamters_tFTPConnection_1.append(" | ");
							log4jParamters_tFTPConnection_1.append("USE_PROXY" + " = " + "false");
							log4jParamters_tFTPConnection_1.append(" | ");
							log4jParamters_tFTPConnection_1.append("CONNECTION_TIMEOUT" + " = " + "0");
							log4jParamters_tFTPConnection_1.append(" | ");
							log4jParamters_tFTPConnection_1.append("USE_STRICT_REPLY_PARSING" + " = " + "true");
							log4jParamters_tFTPConnection_1.append(" | ");
							if (log.isDebugEnabled())
								log.debug("tFTPConnection_1 - " + (log4jParamters_tFTPConnection_1));
						}
					}
					new BytesLimit65535_tFTPConnection_1().limitLog4jByte();
				}
				if (enableLogStash) {
					talendJobLog.addCM("tFTPConnection_1", "tFTPConnection_1", "tFTPConnection");
					talendJobLogProcess(globalMap);
				}

				int connectionTimeout_tFTPConnection_1 = Integer.valueOf(0);
				class MyUserInfo implements com.jcraft.jsch.UserInfo, com.jcraft.jsch.UIKeyboardInteractive {

					String decryptedPassphrase_tFTPConnection_1 = routines.system.PasswordEncryptUtil
							.decryptPassword("enc:routine.encryption.key.v1:rW+P67JFhv280iFL/EzzhoCKVc7CZrP9oqSvNA==");

					String passphrase_tFTPConnection_1 = decryptedPassphrase_tFTPConnection_1;

					public String getPassphrase() {
						return passphrase_tFTPConnection_1;
					}

					public boolean promptPassword(String arg0) {
						return true;
					}

					public boolean promptPassphrase(String arg0) {
						return true;
					}

					public boolean promptYesNo(String arg0) {
						return true;
					}

					public void showMessage(String arg0) {
					}

					public String[] promptKeyboardInteractive(String destination, String name, String instruction,
							String[] prompt, boolean[] echo) {
						return new String[] { getPassword() };
					}

					public String getPassword() {

						return null;

					}
				}
				;
				final com.jcraft.jsch.UserInfo defaultUserInfo_tFTPConnection_1 = new MyUserInfo();

				boolean retry_tFTPConnection_1 = false;
				int retry_count_tFTPConnection_1 = 0;
				int retry_max_tFTPConnection_1 = 5;

				com.jcraft.jsch.Session session_tFTPConnection_1 = null;
				com.jcraft.jsch.Channel channel_tFTPConnection_1 = null;
				do {
					retry_tFTPConnection_1 = false;

					com.jcraft.jsch.JSch jsch_tFTPConnection_1 = new com.jcraft.jsch.JSch();

					log.info("tFTPConnection_1 - SFTP authentication using a public key.");
					log.debug("tFTPConnection_1 - Private key: '"
							+ "/Users/8kmilesinc./Desktop/LegendBiotech/SFTP/privatekey.pem" + "'.");
					jsch_tFTPConnection_1.addIdentity("/Users/8kmilesinc./Desktop/LegendBiotech/SFTP/privatekey.pem",
							defaultUserInfo_tFTPConnection_1.getPassphrase());

					session_tFTPConnection_1 = jsch_tFTPConnection_1.getSession("sunshine_rpt",
							"s-c75d54d4dd2c4b21a.server.transfer.us-east-1.amazonaws.com", 22);
					session_tFTPConnection_1.setConfig("PreferredAuthentications",
							"publickey,password,keyboard-interactive,gssapi-with-mic");

					session_tFTPConnection_1.setUserInfo(defaultUserInfo_tFTPConnection_1);
					if (("true").equals(System.getProperty("http.proxySet"))) {

//check if the host is in the excludes for proxy
						boolean isHostIgnored_tFTPConnection_1 = false;
						String nonProxyHostsString_tFTPConnection_1 = System.getProperty("http.nonProxyHosts");
						String[] nonProxyHosts_tFTPConnection_1 = (nonProxyHostsString_tFTPConnection_1 == null)
								? new String[0]
								: nonProxyHostsString_tFTPConnection_1.split("\\|");
						for (String nonProxyHost : nonProxyHosts_tFTPConnection_1) {
							if (("s-c75d54d4dd2c4b21a.server.transfer.us-east-1.amazonaws.com")
									.matches(nonProxyHost.trim())) {
								isHostIgnored_tFTPConnection_1 = true;
								break;
							}
						}
						if (!isHostIgnored_tFTPConnection_1) {
							com.jcraft.jsch.ProxyHTTP proxy_tFTPConnection_1 = new com.jcraft.jsch.ProxyHTTP(
									System.getProperty("http.proxyHost"),
									Integer.parseInt(System.getProperty("http.proxyPort")));
							if (!"".equals(System.getProperty("http.proxyUser"))) {
								proxy_tFTPConnection_1.setUserPasswd(System.getProperty("http.proxyUser"),
										System.getProperty("http.proxyPassword"));
							}
							session_tFTPConnection_1.setProxy(proxy_tFTPConnection_1);
						}
					} else if ("local".equals(System.getProperty("http.proxySet"))) {
						String uriString = "s-c75d54d4dd2c4b21a.server.transfer.us-east-1.amazonaws.com" + ":" + 22;
						java.net.Proxy proxyToUse = org.talend.proxy.TalendProxySelector.getInstance()
								.getProxyForUriString(uriString);

						if (!proxyToUse.equals(java.net.Proxy.NO_PROXY)) {
							java.net.InetSocketAddress proxyAddress = (java.net.InetSocketAddress) proxyToUse.address();
							String proxyHost = proxyAddress.getAddress().getHostAddress();
							int proxyPort = proxyAddress.getPort();

							com.jcraft.jsch.ProxyHTTP proxy_tFTPConnection_1 = new com.jcraft.jsch.ProxyHTTP(proxyHost,
									proxyPort);

							org.talend.proxy.ProxyCreds proxyCreds = org.talend.proxy.TalendProxyAuthenticator
									.getInstance().getCredsForProxyURI(proxyHost + ":" + proxyPort);
							if (proxyCreds != null) {
								proxy_tFTPConnection_1.setUserPasswd(proxyCreds.getUser(), proxyCreds.getPass());
							}

							session_tFTPConnection_1.setProxy(proxy_tFTPConnection_1);
						}
					}

					log.info("tFTPConnection_1 - Attempt to connect to  '"
							+ "s-c75d54d4dd2c4b21a.server.transfer.us-east-1.amazonaws.com" + "' with username '"
							+ "sunshine_rpt" + "'.");

					channel_tFTPConnection_1 = null;
					try {
						if (connectionTimeout_tFTPConnection_1 > 0) {
							session_tFTPConnection_1.connect(connectionTimeout_tFTPConnection_1);
						} else {
							session_tFTPConnection_1.connect();
						}
						channel_tFTPConnection_1 = session_tFTPConnection_1.openChannel("sftp");
						if (connectionTimeout_tFTPConnection_1 > 0) {
							channel_tFTPConnection_1.connect(connectionTimeout_tFTPConnection_1);
						} else {
							channel_tFTPConnection_1.connect();
						}
						log.info("tFTPConnection_1 - Connect to '"
								+ "s-c75d54d4dd2c4b21a.server.transfer.us-east-1.amazonaws.com" + "' has succeeded.");
					} catch (com.jcraft.jsch.JSchException e_tFTPConnection_1) {
						try {
							if (channel_tFTPConnection_1 != null) {
								channel_tFTPConnection_1.disconnect();
							}

							if (session_tFTPConnection_1 != null) {
								session_tFTPConnection_1.disconnect();
							}
						} catch (java.lang.Exception ce_tFTPConnection_1) {
							log.warn("tFTPConnection_1 - close sftp connection failed : "
									+ ce_tFTPConnection_1.getClass() + " : " + ce_tFTPConnection_1.getMessage());
						}

						String message_tFTPConnection_1 = new TalendException(null, null, null)
								.getExceptionCauseMessage(e_tFTPConnection_1);
						if (message_tFTPConnection_1.contains("Signature length not correct")
								|| message_tFTPConnection_1.contains("connection is closed by foreign host")) {
							retry_tFTPConnection_1 = true;
							retry_count_tFTPConnection_1++;
							log.info(
									"tFTPConnection_1 - connect: Signature length not correct or connection is closed by foreign host, so retry, retry time : "
											+ retry_count_tFTPConnection_1);
						} else {
							throw e_tFTPConnection_1;
						}
					}
				} while (retry_tFTPConnection_1 && (retry_count_tFTPConnection_1 < retry_max_tFTPConnection_1));

				com.jcraft.jsch.ChannelSftp c_tFTPConnection_1 = (com.jcraft.jsch.ChannelSftp) channel_tFTPConnection_1;

				globalMap.put("conn_tFTPConnection_1", c_tFTPConnection_1);

				/**
				 * [tFTPConnection_1 begin ] stop
				 */

				/**
				 * [tFTPConnection_1 main ] start
				 */

				currentComponent = "tFTPConnection_1";

				tos_count_tFTPConnection_1++;

				/**
				 * [tFTPConnection_1 main ] stop
				 */

				/**
				 * [tFTPConnection_1 process_data_begin ] start
				 */

				currentComponent = "tFTPConnection_1";

				/**
				 * [tFTPConnection_1 process_data_begin ] stop
				 */

				/**
				 * [tFTPConnection_1 process_data_end ] start
				 */

				currentComponent = "tFTPConnection_1";

				/**
				 * [tFTPConnection_1 process_data_end ] stop
				 */

				/**
				 * [tFTPConnection_1 end ] start
				 */

				currentComponent = "tFTPConnection_1";

				if (log.isDebugEnabled())
					log.debug("tFTPConnection_1 - " + ("Done."));

				ok_Hash.put("tFTPConnection_1", true);
				end_Hash.put("tFTPConnection_1", System.currentTimeMillis());

				/**
				 * [tFTPConnection_1 end ] stop
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
				 * [tFTPConnection_1 finally ] start
				 */

				currentComponent = "tFTPConnection_1";

				/**
				 * [tFTPConnection_1 finally ] stop
				 */
			} catch (java.lang.Exception e) {
				// ignore
			} catch (java.lang.Error error) {
				// ignore
			}
			resourceMap = null;
		}

		globalMap.put("tFTPConnection_1_SUBPROCESS_STATE", 1);
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
							log4jParamters_tDie_1.append("MESSAGE" + " = " + "\"the end is near\"");
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
					System.err.println("the end is near");

					log.error("tDie_1 - The die message: " + "the end is near");

					globalMap.put("tDie_1_DIE_MESSAGE", "the end is near");
					globalMap.put("tDie_1_DIE_MESSAGES", "the end is near");

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

	public static void main(String[] args) {
		final FTP_TEST FTP_TESTClass = new FTP_TEST();

		int exitCode = FTP_TESTClass.runJobInTOS(args);
		if (exitCode == 0) {
			log.info("TalendJob: 'FTP_TEST' - Done.");
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
		log.info("TalendJob: 'FTP_TEST' - Start.");

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
			java.io.InputStream inContext = FTP_TEST.class.getClassLoader()
					.getResourceAsStream("uscomm_sunshine_rpt_qa/ftp_test_0_1/contexts/" + contextStr + ".properties");
			if (inContext == null) {
				inContext = FTP_TEST.class.getClassLoader()
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
		}

		// Resume: init the resumeUtil
		resumeEntryMethodName = ResumeUtil.getResumeEntryMethodName(resuming_checkpoint_path);
		resumeUtil = new ResumeUtil(resuming_logs_dir_path, isChildJob, rootPid);
		resumeUtil.initCommonInfo(pid, rootPid, fatherPid, projectName, jobName, contextStr, jobVersion);

		List<String> parametersToEncrypt = new java.util.ArrayList<String>();
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
			tFTPGet_1Process(globalMap);
			if (!"failure".equals(status)) {
				status = "end";
			}
		} catch (TalendException e_tFTPGet_1) {
			globalMap.put("tFTPGet_1_SUBPROCESS_STATE", -1);

			e_tFTPGet_1.printStackTrace();

		}

		this.globalResumeTicket = true;// to run tPostJob

		end = System.currentTimeMillis();

		if (watch) {
			System.out.println((end - startTime) + " milliseconds");
		}

		endUsedMemory = Runtime.getRuntime().totalMemory() - Runtime.getRuntime().freeMemory();
		if (false) {
			System.out.println((endUsedMemory - startUsedMemory) + " bytes memory increase when running : FTP_TEST");
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
		closeFtpConnections();

	}

	private void closeFtpConnections() {
		try {
			Object obj_conn;
			obj_conn = globalMap.remove("conn_tFTPConnection_1");
			if (obj_conn != null) {
				((com.jcraft.jsch.ChannelSftp) obj_conn).quit();
			}
		} catch (java.lang.Exception e) {
		}
	}

	private java.util.Map<String, Object> getSharedConnections4REST() {
		java.util.Map<String, Object> connections = new java.util.HashMap<String, Object>();

		connections.put("conn_tFTPConnection_1", globalMap.get("conn_tFTPConnection_1"));

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
 * 67328 characters generated by Talend Cloud Data Management Platform on the
 * March 16, 2022 at 12:02:39 PM CDT
 ************************************************************************************************/