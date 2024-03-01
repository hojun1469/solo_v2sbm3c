package dev.mvc.reply;

public class ReplyVO {

  private int replyno;
  private int contentsno;
  private int memberno;
  private String content = "";
  private String rdate = "";
  public int getReplyno() {
    return replyno;
  }
  public void setReplyno(int replyno) {
    this.replyno = replyno;
  }
  public int getContentsno() {
    return contentsno;
  }
  public void setContentsno(int contentsno) {
    this.contentsno = contentsno;
  }
  public int getMemberno() {
    return memberno;
  }
  public void setMemberno(int memberno) {
    this.memberno = memberno;
  }
  public String getContent() {
    return content;
  }
  public void setContent(String content) {
    this.content = content;
  }
  public String getRdate() {
    return rdate;
  }
  public void setRdate(String rdate) {
    this.rdate = rdate;
  }
  
  @Override
  public String toString() {
    return "ReplyVO [replyno=" + replyno + ", contentsno=" + contentsno + ", memberno=" + memberno + ", content="
        + content + ", rdate=" + rdate + "]";
  }

  
}
