/*
 Navicat Premium Data Transfer

 Source Server         : .
 Source Server Type    : MySQL
 Source Server Version : 80023
 Source Host           : localhost:3306
 Source Schema         : equipmentmanage

 Target Server Type    : MySQL
 Target Server Version : 80023
 File Encoding         : 65001

 Date: 28/05/2021 00:47:41
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for damage
-- ----------------------------
DROP TABLE IF EXISTS `damage`;
CREATE TABLE `damage`  (
  `reason` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL,
  `agreeman` int NULL DEFAULT NULL,
  `handleman` int NULL DEFAULT NULL,
  `way` varchar(20) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL,
  `equid` int NULL DEFAULT NULL,
  `damageid` int NOT NULL AUTO_INCREMENT,
  PRIMARY KEY (`damageid`) USING BTREE,
  INDEX `agreeman`(`agreeman`) USING BTREE,
  INDEX `handleman`(`handleman`) USING BTREE,
  CONSTRAINT `damage_ibfk_1` FOREIGN KEY (`agreeman`) REFERENCES `useraccount` (`userid`) ON DELETE RESTRICT ON UPDATE RESTRICT,
  CONSTRAINT `damage_ibfk_2` FOREIGN KEY (`handleman`) REFERENCES `useraccount` (`userid`) ON DELETE RESTRICT ON UPDATE RESTRICT
) ENGINE = InnoDB CHARACTER SET = utf8mb4 COLLATE = utf8mb4_0900_ai_ci ROW_FORMAT = DYNAMIC;

-- ----------------------------
-- Records of damage
-- ----------------------------

-- ----------------------------
-- Table structure for depart
-- ----------------------------
DROP TABLE IF EXISTS `depart`;
CREATE TABLE `depart`  (
  `depid` int NOT NULL AUTO_INCREMENT,
  `depname` varchar(20) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL,
  PRIMARY KEY (`depid`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 3 CHARACTER SET = utf8mb4 COLLATE = utf8mb4_0900_ai_ci ROW_FORMAT = DYNAMIC;

-- ----------------------------
-- Records of depart
-- ----------------------------
INSERT INTO `depart` VALUES (1, '管理部');
INSERT INTO `depart` VALUES (2, '其他部');

-- ----------------------------
-- Table structure for equbuy
-- ----------------------------
DROP TABLE IF EXISTS `equbuy`;
CREATE TABLE `equbuy`  (
  `equid` int NOT NULL AUTO_INCREMENT,
  `euqname` varchar(20) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL,
  `equkind` varchar(16) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL,
  `type` varchar(10) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL,
  `buytime` datetime NULL DEFAULT NULL,
  `departmentid` int NULL DEFAULT NULL,
  `position` varchar(10) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL,
  `amount` int NULL DEFAULT NULL,
  PRIMARY KEY (`equid`) USING BTREE,
  INDEX `departmentid`(`departmentid`) USING BTREE,
  CONSTRAINT `equbuy_ibfk_1` FOREIGN KEY (`departmentid`) REFERENCES `depart` (`depid`) ON DELETE RESTRICT ON UPDATE RESTRICT
) ENGINE = InnoDB AUTO_INCREMENT = 24 CHARACTER SET = utf8mb4 COLLATE = utf8mb4_0900_ai_ci ROW_FORMAT = DYNAMIC;

-- ----------------------------
-- Records of equbuy
-- ----------------------------
INSERT INTO `equbuy` VALUES (22, '设备十三', '种类1', '型号1', '2021-05-29 00:21:05', 1, '仓库一', 50);
INSERT INTO `equbuy` VALUES (23, '设备十', '种类1', '型号1', '2021-05-19 00:43:04', 2, '仓库一', 49);

-- ----------------------------
-- Table structure for rent
-- ----------------------------
DROP TABLE IF EXISTS `rent`;
CREATE TABLE `rent`  (
  `rentdepid` int NOT NULL,
  `rentmanid` int NULL DEFAULT NULL,
  `rentuse` varchar(20) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL,
  `returntime` datetime NULL DEFAULT NULL,
  INDEX `rentmanid`(`rentmanid`) USING BTREE,
  CONSTRAINT `rent_ibfk_1` FOREIGN KEY (`rentmanid`) REFERENCES `useraccount` (`userid`) ON DELETE RESTRICT ON UPDATE RESTRICT
) ENGINE = InnoDB CHARACTER SET = utf8mb4 COLLATE = utf8mb4_0900_ai_ci ROW_FORMAT = DYNAMIC;

-- ----------------------------
-- Records of rent
-- ----------------------------

-- ----------------------------
-- Table structure for repair
-- ----------------------------
DROP TABLE IF EXISTS `repair`;
CREATE TABLE `repair`  (
  `reason` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL,
  `repairtime` datetime NULL DEFAULT NULL,
  `repairmanid` int NOT NULL,
  `result` tinyint(1) NULL DEFAULT NULL,
  `equid` int NOT NULL,
  `repairid` int NOT NULL AUTO_INCREMENT,
  PRIMARY KEY (`repairid`) USING BTREE,
  INDEX `repairmanid`(`repairmanid`) USING BTREE,
  CONSTRAINT `repair_ibfk_1` FOREIGN KEY (`repairmanid`) REFERENCES `useraccount` (`userid`) ON DELETE RESTRICT ON UPDATE RESTRICT
) ENGINE = InnoDB CHARACTER SET = utf8mb4 COLLATE = utf8mb4_0900_ai_ci ROW_FORMAT = DYNAMIC;

-- ----------------------------
-- Records of repair
-- ----------------------------
INSERT INTO `repair` VALUES ('坏了', '2021-05-27 20:35:42', 1, 1, 23, 1);

-- ----------------------------
-- Table structure for useraccount
-- ----------------------------
DROP TABLE IF EXISTS `useraccount`;
CREATE TABLE `useraccount`  (
  `userid` int NOT NULL AUTO_INCREMENT,
  `username` varchar(20) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL,
  `password` varchar(20) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL,
  `phonenum` char(11) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL,
  `email` varchar(20) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL,
  `departid` int NULL DEFAULT 2,
  `equid` int NULL DEFAULT NULL,
  `prebacktime` datetime NULL DEFAULT NULL,
  PRIMARY KEY (`userid`) USING BTREE,
  INDEX `departid`(`departid`) USING BTREE,
  INDEX `equid`(`equid`) USING BTREE,
  CONSTRAINT `useraccount_ibfk_1` FOREIGN KEY (`departid`) REFERENCES `depart` (`depid`) ON DELETE RESTRICT ON UPDATE RESTRICT,
  CONSTRAINT `useraccount_ibfk_2` FOREIGN KEY (`equid`) REFERENCES `equbuy` (`equid`) ON DELETE RESTRICT ON UPDATE RESTRICT
) ENGINE = InnoDB AUTO_INCREMENT = 3 CHARACTER SET = utf8mb4 COLLATE = utf8mb4_0900_ai_ci ROW_FORMAT = DYNAMIC;

-- ----------------------------
-- Records of useraccount
-- ----------------------------
INSERT INTO `useraccount` VALUES (1, '王一', '123456', '123456', '123456@qq.com', 1, NULL, NULL);
INSERT INTO `useraccount` VALUES (2, '小土匪', '123456', '18828364968', '654321@qq.com', 2, NULL, NULL);

SET FOREIGN_KEY_CHECKS = 1;
