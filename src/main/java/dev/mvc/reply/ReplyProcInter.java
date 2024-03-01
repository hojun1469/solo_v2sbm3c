package dev.mvc.reply;

import java.util.List;

public interface ReplyProcInter {

  int createReply(ReplyVO replyVO); // 댓글 등록
    
    
  List<ReplyVO> getReplyList(int contentsno); // 댓글 조회
    
    
  int updateReply(ReplyVO replyVO); // 댓글 수정
    
    
  int deleteReply(int replyno); // 댓글 삭제


  public ReplyVO read(int replyno);
  

}
