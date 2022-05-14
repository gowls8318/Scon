package com.scon.project.classfile.dto;

import lombok.Data;

@Data
public class ClassFileDTO {
	
	/*
	 	FILE_ID	NUMBER	No		1	첨부파일아이디
		CLS_ID	NUMBER	No		2	강의아이디
		CLF_NAME	VARCHAR2(500 BYTE)	No		3	강의참고자료명
		CLF_STATUS	VARCHAR2(2 BYTE)	Yes	"'Y'	"	4	강의첨부자료 게시 유무
		
		FILE_ORGNAME	VARCHAR2(255 BYTE)	No		2	파일 원본명
		FILE_SAVENAME	VARCHAR2(255 BYTE)	No		3	저장 파일명
		FILE_PATH	VARCHAR2(1000 BYTE)	No		4	파일저장경로
		FILE_TYPE	VARCHAR2(10 BYTE)	No		5	파일타입
	 */
	
	private int fileId;
	private int clsId;
	private String clfName;
	private String clfStatus;
	
	private String fileOrgName;
	private String fileSaveName;
	private String filePath;
	private String fileType;

}
