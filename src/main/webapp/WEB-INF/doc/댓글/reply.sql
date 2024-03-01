/**********************************/
/* Table Name: 댓글 */
/**********************************/
DROP TABLE REPLY;

CREATE TABLE REPLY(
		REPLYNO                	NUMBER(10)		 NOT NULL,
		CONTENTSNO        		NUMBER(10)		 NULL ,
		MEMBERNO           		NUMBER(10)		 NULL ,
        CONTENT                 VARCHAR2(1000)   NULL, -- 예시: 댓글 내용은 최대 1000자
        RDATE                    DATE             NULL,
        PRIMARY KEY (REPLYNO),
        FOREIGN KEY (CONTENTSNO) REFERENCES CONTENTS (CONTENTSNO),
        FOREIGN KEY (MEMBERNO) REFERENCES MEMBER (MEMBERNO)
);


COMMENT ON TABLE REPLY is '댓글';
COMMENT ON COLUMN REPLY.REPLYNO is '댓글 번호';
COMMENT ON COLUMN REPLY.CONTENTSNO is '컨텐츠 번호';
COMMENT ON COLUMN REPLY.MEMBERNO is '회원 번호';
COMMENT ON COLUMN REPLY.CONTENT is '내용';
COMMENT ON COLUMN REPLY.RDATE is '댓글 작성일';

COMMIT;

DROP SEQUENCE REPLY_seq;

CREATE SEQUENCE REPLY_seq
  START WITH 1         -- 시작 번호
  INCREMENT BY 1       -- 증가값
  MAXVALUE 9999999999  -- 최대값: 9999999999 --> NUMBER(10) 대응
  CACHE 2              -- 2번은 메모리에서만 계산
  NOCYCLE;             -- 다시 1부터 생성되는 것을 방지