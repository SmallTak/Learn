/*
Navicat MySQL Data Transfer

Source Server         : host
Source Server Version : 50537
Source Host           : localhost:3306
Source Database       : spring-mybatis

Target Server Type    : MYSQL
Target Server Version : 50537
File Encoding         : 65001

Date: 2019-04-23 15:21:06
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for product_type
-- ----------------------------
DROP TABLE IF EXISTS `product_type`;
CREATE TABLE `product_type` (
  `id` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `type_name` varchar(255) COLLATE utf8mb4_bin DEFAULT NULL,
  `parent_id` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=30 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_bin;

-- ----------------------------
-- Records of product_type
-- ----------------------------
INSERT INTO `product_type` VALUES ('1', '数码影音', '0');
INSERT INTO `product_type` VALUES ('2', '营养保健', '0');
INSERT INTO `product_type` VALUES ('3', '美容彩妆', null);
INSERT INTO `product_type` VALUES ('4', '护肤', '3');
INSERT INTO `product_type` VALUES ('5', '彩妆', '3');
INSERT INTO `product_type` VALUES ('6', '香水/香氛', '3');
INSERT INTO `product_type` VALUES ('7', '服饰鞋包', null);
INSERT INTO `product_type` VALUES ('8', '手表配饰', '7');
INSERT INTO `product_type` VALUES ('9', '服饰内衣', '7');
INSERT INTO `product_type` VALUES ('10', '女士箱包', '7');
INSERT INTO `product_type` VALUES ('11', '数码家电', null);
INSERT INTO `product_type` VALUES ('12', '手机/配件', '11');
INSERT INTO `product_type` VALUES ('13', '数码影音', '11');
INSERT INTO `product_type` VALUES ('14', '个护健康', '11');
INSERT INTO `product_type` VALUES ('15', '办公外设', '11');
INSERT INTO `product_type` VALUES ('16', '环球美食', null);
INSERT INTO `product_type` VALUES ('17', '茶/酒/饮料', '16');
INSERT INTO `product_type` VALUES ('18', '乳品/咖啡/麦片/冲饮', '16');
INSERT INTO `product_type` VALUES ('19', '运动户外', null);
INSERT INTO `product_type` VALUES ('20', '运动鞋', '19');
INSERT INTO `product_type` VALUES ('21', '户外服装', '19');
INSERT INTO `product_type` VALUES ('22', '母婴儿童', null);
INSERT INTO `product_type` VALUES ('23', '奶粉', '22');
INSERT INTO `product_type` VALUES ('24', '纸尿裤/拉拉裤', '22');
INSERT INTO `product_type` VALUES ('25', '营养辅食', '22');
INSERT INTO `product_type` VALUES ('26', '家居个护', null);
INSERT INTO `product_type` VALUES ('27', '洗护日用', '26');
INSERT INTO `product_type` VALUES ('28', '家装家纺', '26');
INSERT INTO `product_type` VALUES ('29', '女性护理', '26');
SET FOREIGN_KEY_CHECKS=1;
