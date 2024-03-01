package dev.mvc.reply;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component("dev.mvc.reply.ReplyProc")
@Primary
public class ReplyProc implements ReplyProcInter {

    @Autowired
    private ReplyDAOInter replyDAO;

    @Override
    public int createReply(ReplyVO replyVO) {
        // 댓글 등록 로직
        return replyDAO.createReply(replyVO);
    }

    @Override
    public List<ReplyVO> getReplyList(int contentsNo) {
        // 댓글 조회 로직
        return replyDAO.getReplyList(contentsNo);
    }

    @Override
    public int updateReply(ReplyVO replyVO) {
        // 댓글 수정 로직
        return replyDAO.updateReply(replyVO);
    }

    @Override
    public int deleteReply(int replyNo) {
        // 댓글 삭제 로직
        return replyDAO.deleteReply(replyNo);
    }
    @Override
    public ReplyVO read(int replyno) {
      ReplyVO replyVO = this.replyDAO.read(replyno);
      return replyVO;
    }
}