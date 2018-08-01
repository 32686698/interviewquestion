# Host: 127.0.0.1  (Version 5.7.23)
# Date: 2018-08-01 17:51:46
# Generator: MySQL-Front 6.0  (Build 2.20)


#
# Structure for table "question_topic"
#

DROP TABLE IF EXISTS `question_topic`;
CREATE TABLE `question_topic` (
  `Id` int(11) NOT NULL AUTO_INCREMENT,
  `topic_code` varchar(50) NOT NULL DEFAULT '' COMMENT '主题代码',
  `topic_name` varchar(255) DEFAULT '' COMMENT '主题名',
  `parent_code` varchar(50) DEFAULT NULL COMMENT '父主题代码',
  `remark` varchar(1000) DEFAULT NULL COMMENT '描述',
  `create_user_id` int(11) DEFAULT NULL COMMENT '创建人id',
  `create_date` time DEFAULT NULL COMMENT '创建时间',
  `modify_user_id` int(11) DEFAULT NULL COMMENT '最近修改人',
  `modify_date` time DEFAULT NULL COMMENT '最近修改时间',
  `del` char(1) NOT NULL DEFAULT '0' COMMENT '删除标识',
  PRIMARY KEY (`Id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

#
# Data for table "question_topic"
#

