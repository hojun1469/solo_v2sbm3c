package dev.mvc.cate;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

// Controller가 사용하는 이름
@Component("dev.mvc.cate.CateProc")
public class CateProc implements CateProcInter {
  @Autowired // CateDAOInter interface를 구현한 클래스의 객체를 만들어 자동으로 할당해라.
  private CateDAOInter cateDAO;
  
  @Override
  public int create(CateVO cateVO) {
    int cnt = this.cateDAO.create(cateVO);

    return cnt;
  }

  @Override
  public ArrayList<CateVO> list_all() {
    ArrayList<CateVO> list = this.cateDAO.list_all();
    
    return list;
  }

  @Override
  public CateVO read(int cateno) {
    CateVO  cateVO  = this.cateDAO.read(cateno);
    
    return cateVO;
  }

  @Override
  public int update(CateVO cateVO) {
    int cnt = this.cateDAO.update(cateVO);
    
    return cnt;
  }

  @Override
  public int delete(int cateno) {
    int cnt = this.cateDAO.delete(cateno);
    
    return cnt;
  }

  @Override
  public int update_seqno_forward(int cateno) {
    int cnt = this.cateDAO.update_seqno_forward(cateno);
    return cnt;
  }

  @Override
  public int update_seqno_backward(int cateno) {
    int cnt = this.cateDAO.update_seqno_backward(cateno);
    return cnt;
  }

  @Override
  public int update_visible_y(int cateno) {
    int cnt = this.cateDAO.update_visible_y(cateno);
    return cnt;
  }

  @Override
  public int update_visible_n(int cateno) {
    int cnt = this.cateDAO.update_visible_n(cateno);
    return cnt;
  }

  @Override
  public ArrayList<CateVO> list_all_y() {
    ArrayList<CateVO> list = this.cateDAO.list_all_y();
    return list;
  }

}





