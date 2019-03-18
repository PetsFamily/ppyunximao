package com.petsfamily.yunximao.momentsService.service;

import com.alibaba.fastjson.JSONObject;
import com.petsfamily.yunximao.common.model.ResponseEntity;

public interface MomentsService {
	/**
	 * 查询精彩瞬间
	 * @param
	 * dataSize 已经返回的数据条数 第一页传0
	 * seach 查询条件
	 * tag 广场 关注 （一期不实现）
	 * @return
	 */
	public ResponseEntity queryMomentList(JSONObject dataJson);
	/**
	 * 查询精彩瞬间
	 * @param
	 * dataSize 已经返回的数据条数 第一页传0
	 * momentNumber
	 * @return
	 */
	public ResponseEntity queryCommentsList(JSONObject dataJson);
	/**
	 * 查询热门关键字
	 * @param dataJson
	 * @return
	 */
	public ResponseEntity queryHotKeyWord(JSONObject dataJson);
	/**
	 * 查询精彩瞬间详情
	 * @param
	 * momentNumber
	 * token 非必填
	 * @return
	 */
	public ResponseEntity queryMomentInfo(JSONObject dataJson);
	/**
	 * 记录阅读瞬间
	 * @param
	 * momentNumber
	 * token 非必填
	 * @return
	 */
	public ResponseEntity readMoment(JSONObject dataJson);
	/**
	 * 点赞
	 * @param
	 * momentNumber
	 * token
	 * @return
	 */
	public ResponseEntity likeMoment(JSONObject dataJson);
	/**
	 * 评论
	 * @param
	 * momentNumber
	 * token
	 * comments 评论内容
	 * @return
	 */
	public ResponseEntity submitComments(JSONObject dataJson);
	
	/**
	 * 发布图片
	 * @param 
	 * token 用户token
	 * file  图片文件 MultipartFile
	 * title 标题
	 * keyWord 关键字 #***#
	 * @return
	 */
	public ResponseEntity submitPic(JSONObject dataJson);
	/**
	 * 上传视频封面
	 * @param
	 * token 用户token
	 * file  图片文件 MultipartFile
	 * @return 封面地址
	 */
	public ResponseEntity submitVideoPic(JSONObject dataJson);
	/**
	 * 发布小视频
	 * @param
	 * token 用户token
	 * file  小视频文件 MultipartFile
	 * videoPic 封面地址
	 * title 标题
	 * keyWord 关键字 #***#
	 * @return
	 */
	public ResponseEntity submitVideo(JSONObject dataJson);
	/**
	 * 补偿查询 视频审核结果
	 * @param dataJson
	 * @return
	 */
	public ResponseEntity reAuditVideo(JSONObject dataJson);
	
}