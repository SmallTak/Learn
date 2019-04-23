/*
Navicat MySQL Data Transfer

Source Server         : host
Source Server Version : 50537
Source Host           : localhost:3306
Source Database       : spring-mybatis

Target Server Type    : MYSQL
Target Server Version : 50537
File Encoding         : 65001

Date: 2019-04-23 15:21:13
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for t_account
-- ----------------------------
DROP TABLE IF EXISTS `t_account`;
CREATE TABLE `t_account` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `username` varchar(255) COLLATE utf8_bin NOT NULL,
  `password` varchar(255) COLLATE utf8_bin NOT NULL,
  `mobile` varchar(255) COLLATE utf8_bin NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8 COLLATE=utf8_bin;

-- ----------------------------
-- Records of t_account
-- ----------------------------
INSERT INTO `t_account` VALUES ('1', 'stak', '48598cb4ec41da559ba127b8e5d33667', 'stak');
INSERT INTO `t_account` VALUES ('2', 'ss', '48598cb4ec41da559ba127b8e5d33667', 'ss');
SET FOREIGN_KEY_CHECKS=1;
