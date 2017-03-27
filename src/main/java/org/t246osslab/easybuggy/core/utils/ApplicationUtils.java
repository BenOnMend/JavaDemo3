package org.t246osslab.easybuggy.core.utils;

import java.util.MissingResourceException;
import java.util.ResourceBundle;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Utility class to provide application properties.
 */
public final class ApplicationUtils {

    private static final Logger log = LoggerFactory.getLogger(ApplicationUtils.class);

    // default database url: derby in-memory
    private static String databaseURL = "jdbc:derby:memory:demo;create=true";

    // default database url: org.apache.derby.jdbc.EmbeddedDriver
    private static String databaseDriver = "org.apache.derby.jdbc.EmbeddedDriver";

    // default account lock time: 3600000 (1 hour)
    private static long accountLockTime = 3600000;

    // default account lock limit count: 10
    private static int accountLockCount = 10;

    // default SMTP host: null
    private static String smtpHost = null;

    // default SMTP port: null
    private static String smtpPort = null;

    // default SMTP auth: false
    private static String smtpAuth = "false";

    // default SMTP starttls enable: false
    private static String smtpStarttlsEnable = "false";

    // default SMTP user: null
    private static String smtpUser = null;

    // default SMTP password: null
    private static String smtpPass = null;

    // default administrator's mail address: null
    private static String adminAddress = null;

    static {
        ResourceBundle bundle = null;
        try {
            bundle = ResourceBundle.getBundle("application");
        } catch (MissingResourceException e) {
            log.error("Exception occurs: ", e);
        }
        if (bundle != null) {
            try {
                databaseURL = bundle.getString("database.url");
            } catch (Exception e) {
                log.error("Exception occurs: ", e);
            }
            try {
                databaseDriver = bundle.getString("database.driver");
            } catch (Exception e) {
                log.error("Exception occurs: ", e);
            }
            try {
                accountLockTime = Long.parseLong(bundle.getString("account.lock.time"));
            } catch (Exception e) {
                log.error("Exception occurs: ", e);
            }
            try {
                accountLockCount = Integer.parseInt(bundle.getString("account.lock.count"));
            } catch (Exception e) {
                log.error("Exception occurs: ", e);
            }
            try {
                smtpHost = bundle.getString("mail.smtp.host");
            } catch (Exception e) {
                log.error("Exception occurs: ", e);
            }
            try {
                smtpPort = bundle.getString("mail.smtp.port");
            } catch (Exception e) {
                log.error("Exception occurs: ", e);
            }
            try {
                smtpAuth = bundle.getString("mail.smtp.auth");
            } catch (Exception e) {
                log.error("Exception occurs: ", e);
            }
            try {
                smtpStarttlsEnable = bundle.getString("mail.smtp.starttls.enable");
            } catch (Exception e) {
                log.error("Exception occurs: ", e);
            }
            try {
                smtpUser = bundle.getString("mail.user");
            } catch (Exception e) {
                log.error("Exception occurs: ", e);
            }
            try {
                smtpPass = bundle.getString("mail.password");
            } catch (Exception e) {
                log.error("Exception occurs: ", e);
            }
            
            try {
                adminAddress = bundle.getString("mail.admin.address");
            } catch (Exception e) {
                log.error("Exception occurs: ", e);
            }
        }
    }

    // squid:S1118: Utility classes should not have public constructors
    private ApplicationUtils() {
        throw new IllegalAccessError("Utility class");
    }

    /**
     * Return a Database URL of EasyBuggy.
     * 
     * @return Database URL of EasyBuggy
     */
    public static String getDatabaseURL() {
        return databaseURL;
    }

    /**
     * Return a Database driver of EasyBuggy.
     * 
     * @return Database driver of EasyBuggy
     */
    public static String getDatabaseDriver() {
        return databaseDriver;
    }

    /**
     * Return the account lock time.
     * 
     * @return Account lock time
     */
    public static long getAccountLockTime() {
        return accountLockTime;
    }

    /**
     * Return the account lock count.
     * 
     * @return Account lock count
     */
    public static int getAccountLockCount() {
        return accountLockCount;
    }

    /**
     * Return the SMTP host.
     * 
     * @return SMTP host
     */
    public static String getSmtpHost() {
        return smtpHost;
    }

    /**
     * Return the SMTP port.
     * 
     * @return SMTP port
     */
    public static String getSmtpPort() {
        return smtpPort;
    }

    /**
     * Return the SMTP auth.
     * 
     * @return SMTP auth
     */
    public static String getSmtpAuth() {
        return smtpAuth;
    }

    /**
     * Return the SMTP start TLS enable.
     * 
     * @return SMTP start TLS enable
     */
    public static String getSmtpStarttlsEnable() {
        return smtpStarttlsEnable;
    }

    /**
     * Return the SMTP user.
     * 
     * @return SMTP user
     */
    public static String getSmtpUser() {
        return smtpUser;
    }

    /**
     * Return the SMTP password.
     * 
     * @return SMTP password
     */
    public static String getSmtpPass() {
        return smtpPass;
    }

    /**
     * Return the Administrator's mail address
     * 
     * @return Administrator's mail address
     */
    public static String getAdminAddress() {
        return adminAddress;
    }
}
