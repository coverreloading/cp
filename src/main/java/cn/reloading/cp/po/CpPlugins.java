package cn.reloading.cp.po;

public class CpPlugins {
    private Integer id;

    private String pversion;

    private String dlurl;

    private String ppic;

    private Integer readcount;

    private Integer dlcount;

    private Integer createtime;

    private Integer updatetime;

    private Byte isdel;

    private String tag1;

    private String tag2;

    private Integer pid;

    private String pcontent;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getPversion() {
        return pversion;
    }

    public void setPversion(String pversion) {
        this.pversion = pversion == null ? null : pversion.trim();
    }

    public String getDlurl() {
        return dlurl;
    }

    public void setDlurl(String dlurl) {
        this.dlurl = dlurl == null ? null : dlurl.trim();
    }

    public String getPpic() {
        return ppic;
    }

    public void setPpic(String ppic) {
        this.ppic = ppic == null ? null : ppic.trim();
    }

    public Integer getReadcount() {
        return readcount;
    }

    public void setReadcount(Integer readcount) {
        this.readcount = readcount;
    }

    public Integer getDlcount() {
        return dlcount;
    }

    public void setDlcount(Integer dlcount) {
        this.dlcount = dlcount;
    }

    public Integer getCreatetime() {
        return createtime;
    }

    public void setCreatetime(Integer createtime) {
        this.createtime = createtime;
    }

    public Integer getUpdatetime() {
        return updatetime;
    }

    public void setUpdatetime(Integer updatetime) {
        this.updatetime = updatetime;
    }

    public Byte getIsdel() {
        return isdel;
    }

    public void setIsdel(Byte isdel) {
        this.isdel = isdel;
    }

    public String getTag1() {
        return tag1;
    }

    public void setTag1(String tag1) {
        this.tag1 = tag1 == null ? null : tag1.trim();
    }

    public String getTag2() {
        return tag2;
    }

    public void setTag2(String tag2) {
        this.tag2 = tag2 == null ? null : tag2.trim();
    }

    public Integer getPid() {
        return pid;
    }

    public void setPid(Integer pid) {
        this.pid = pid;
    }

    public String getPcontent() {
        return pcontent;
    }

    public void setPcontent(String pcontent) {
        this.pcontent = pcontent == null ? null : pcontent.trim();
    }
}