package com.zxmoa.myhzt.bean.generator;

public class PdfWithBLOBs extends Pdf {
    private String pdfname;

    private String pdfexplain;

    private String pdfpath;

    public String getPdfname() {
        return pdfname;
    }

    public void setPdfname(String pdfname) {
        this.pdfname = pdfname == null ? null : pdfname.trim();
    }

    public String getPdfexplain() {
        return pdfexplain;
    }

    public void setPdfexplain(String pdfexplain) {
        this.pdfexplain = pdfexplain == null ? null : pdfexplain.trim();
    }

    public String getPdfpath() {
        return pdfpath;
    }

    public void setPdfpath(String pdfpath) {
        this.pdfpath = pdfpath == null ? null : pdfpath.trim();
    }
}