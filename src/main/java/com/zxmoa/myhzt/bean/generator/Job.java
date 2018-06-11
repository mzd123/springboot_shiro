package com.zxmoa.myhzt.bean.generator;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Job extends JobKey {

    public static final String JOB_PARAM_KEY = "JOB_PARAM_KEY";


    public enum ScheduleStatus {
        /**
         * 正常
         */
        NORMAL("0"),
        /**
         * 暂停
         */
        PAUSE("1");

        private String value;

        private ScheduleStatus(String value) {
            this.value = value;
        }

        public String getValue() {
            return value;
        }
    }


    private String jobname;

    private String jobcron;

    private String beanname;

    private String method;

    private String status = "1";

    private String createtime = new SimpleDateFormat("YYYY-MM-dd").format(new Date());

    private String modifytime = new SimpleDateFormat("YYYY-MM-dd").format(new Date());

    public String getJobname() {
        return jobname;
    }

    public void setJobname(String jobname) {
        this.jobname = jobname == null ? null : jobname.trim();
    }

    public String getJobcron() {
        return jobcron;
    }

    public void setJobcron(String jobcron) {
        this.jobcron = jobcron == null ? null : jobcron.trim();
    }

    public String getBeanname() {
        return beanname;
    }

    public void setBeanname(String beanname) {
        this.beanname = beanname == null ? null : beanname.trim();
    }

    public String getMethod() {
        return method;
    }

    public void setMethod(String method) {
        this.method = method == null ? null : method.trim();
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status == null ? null : status.trim();
    }

    public String getCreatetime() {
        return createtime;
    }

    public void setCreatetime(String createtime) {
        this.createtime = createtime == null ? null : createtime.trim();
    }

    public String getModifytime() {
        return modifytime;
    }

    public void setModifytime(String modifytime) {
        this.modifytime = modifytime == null ? null : modifytime.trim();
    }
}