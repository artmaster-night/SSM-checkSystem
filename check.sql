/*
 Navicat Premium Data Transfer

 Source Server         : root
 Source Server Type    : MySQL
 Source Server Version : 80026
 Source Host           : localhost:3306
 Source Schema         : check

 Target Server Type    : MySQL
 Target Server Version : 80026
 File Encoding         : 65001

 Date: 11/04/2022 14:27:19
*/



SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for check_student
-- ----------------------------
DROP TABLE IF EXISTS `check_student`;
CREATE TABLE `check_student`  (
  `id` int NOT NULL AUTO_INCREMENT,
  `s_id` int NULL DEFAULT NULL,
  `check_id` int NULL DEFAULT NULL,
  `check_time` datetime NULL DEFAULT NULL,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 52 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of check_student
-- ----------------------------
INSERT INTO `check_student` VALUES (43, 2, 31, '2022-04-02 15:43:33');
INSERT INTO `check_student` VALUES (44, 2, 33, '2022-04-02 15:44:43');
INSERT INTO `check_student` VALUES (45, 2, 35, '2022-04-02 15:44:54');
INSERT INTO `check_student` VALUES (46, 2, 36, '2022-04-02 15:45:09');
INSERT INTO `check_student` VALUES (47, 2, 39, '2022-04-02 15:45:20');
INSERT INTO `check_student` VALUES (48, 5, 29, '2022-04-02 15:46:33');
INSERT INTO `check_student` VALUES (49, 5, 33, '2022-04-02 15:46:41');
INSERT INTO `check_student` VALUES (50, 5, 34, '2022-04-02 15:46:47');
INSERT INTO `check_student` VALUES (51, 5, 37, '2022-04-02 15:46:55');
INSERT INTO `check_student` VALUES (52, 5, 40, '2022-04-02 15:47:03');

-- ----------------------------
-- Table structure for check_teacher
-- ----------------------------
DROP TABLE IF EXISTS `check_teacher`;
CREATE TABLE `check_teacher`  (
  `id` int NOT NULL AUTO_INCREMENT,
  `t_id` int NULL DEFAULT NULL,
  `check_time` datetime NULL DEFAULT NULL,
  `check_password` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `c_id` int NULL DEFAULT NULL,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 41 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of check_teacher
-- ----------------------------
INSERT INTO `check_teacher` VALUES (29, 1, '2022-04-02 15:34:36', 'liuhang', 1);
INSERT INTO `check_teacher` VALUES (31, 1, '2022-04-02 15:35:35', 'liuhang', 2);
INSERT INTO `check_teacher` VALUES (32, 2, '2022-04-02 15:36:40', 'yusansan', 3);
INSERT INTO `check_teacher` VALUES (33, 2, '2022-04-02 15:36:50', 'yusansan', 4);
INSERT INTO `check_teacher` VALUES (34, 3, '2022-04-02 15:38:21', 'yangyang', 5);
INSERT INTO `check_teacher` VALUES (35, 3, '2022-04-02 15:38:39', 'yangyang', 6);
INSERT INTO `check_teacher` VALUES (36, 4, '2022-04-02 15:39:30', 'zhangxin', 8);
INSERT INTO `check_teacher` VALUES (37, 4, '2022-04-02 15:39:45', 'zhangxin', 7);
INSERT INTO `check_teacher` VALUES (39, 5, '2022-04-02 15:40:40', 'hulang', 10);
INSERT INTO `check_teacher` VALUES (40, 5, '2022-04-02 15:41:33', 'hulang', 9);

-- ----------------------------
-- Table structure for course
-- ----------------------------
DROP TABLE IF EXISTS `course`;
CREATE TABLE `course`  (
  `id` int NOT NULL AUTO_INCREMENT,
  `name` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `t_id` int NULL DEFAULT NULL,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 19 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of course
-- ----------------------------
INSERT INTO `course` VALUES (1, '数学', 1);
INSERT INTO `course` VALUES (2, '体育', 1);
INSERT INTO `course` VALUES (3, '语文', 2);
INSERT INTO `course` VALUES (4, '政治', 2);
INSERT INTO `course` VALUES (5, '化学', 3);
INSERT INTO `course` VALUES (6, '物理', 3);
INSERT INTO `course` VALUES (7, '生物', 4);
INSERT INTO `course` VALUES (8, '地理', 4);
INSERT INTO `course` VALUES (9, '音乐', 5);
INSERT INTO `course` VALUES (10, '美术', 5);

-- ----------------------------
-- Table structure for course_student
-- ----------------------------
DROP TABLE IF EXISTS `course_student`;
CREATE TABLE `course_student`  (
  `id` int NOT NULL AUTO_INCREMENT,
  `c_id` int NULL DEFAULT NULL,
  `s_id` int NULL DEFAULT NULL,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 331 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of course_student
-- ----------------------------
INSERT INTO `course_student` VALUES (1, 1, 1);
INSERT INTO `course_student` VALUES (2, 3, 1);
INSERT INTO `course_student` VALUES (3, 6, 1);
INSERT INTO `course_student` VALUES (4, 7, 1);
INSERT INTO `course_student` VALUES (5, 9, 1);
INSERT INTO `course_student` VALUES (6, 2, 2);
INSERT INTO `course_student` VALUES (7, 4, 2);
INSERT INTO `course_student` VALUES (8, 6, 2);
INSERT INTO `course_student` VALUES (9, 8, 2);
INSERT INTO `course_student` VALUES (10, 10, 2);
INSERT INTO `course_student` VALUES (11, 1, 3);
INSERT INTO `course_student` VALUES (12, 3, 3);
INSERT INTO `course_student` VALUES (13, 5, 3);
INSERT INTO `course_student` VALUES (14, 7, 3);
INSERT INTO `course_student` VALUES (15, 9, 3);
INSERT INTO `course_student` VALUES (16, 2, 4);
INSERT INTO `course_student` VALUES (17, 3, 4);
INSERT INTO `course_student` VALUES (18, 6, 4);
INSERT INTO `course_student` VALUES (19, 8, 4);
INSERT INTO `course_student` VALUES (20, 10, 4);
INSERT INTO `course_student` VALUES (21, 1, 5);
INSERT INTO `course_student` VALUES (22, 4, 5);
INSERT INTO `course_student` VALUES (23, 5, 5);
INSERT INTO `course_student` VALUES (24, 7, 5);
INSERT INTO `course_student` VALUES (25, 9, 5);

-- ----------------------------
-- Table structure for student
-- ----------------------------
DROP TABLE IF EXISTS `student`;
CREATE TABLE `student`  (
  `id` int NOT NULL AUTO_INCREMENT,
  `name` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `account` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `password` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT '123456',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 15 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of student
-- ----------------------------
INSERT INTO `student` VALUES (1, '李小兰', 'lixiaolan', '123456');
INSERT INTO `student` VALUES (2, '姜立', 'jiangli', '123456');
INSERT INTO `student` VALUES (3, '徐凯', 'xukai', '123456');
INSERT INTO `student` VALUES (4, '杨燕', 'yangyan', '123456');
INSERT INTO `student` VALUES (5, '杜岚', 'dulan', '123456');

-- ----------------------------
-- Table structure for teacher
-- ----------------------------
DROP TABLE IF EXISTS `teacher`;
CREATE TABLE `teacher`  (
  `id` int NOT NULL AUTO_INCREMENT,
  `name` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `account` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `password` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 21 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of teacher
-- ----------------------------
INSERT INTO `teacher` VALUES (1, '刘航', 'liuhang', '123456');
INSERT INTO `teacher` VALUES (2, '余珊珊', 'yusansan', '123456');
INSERT INTO `teacher` VALUES (3, '杨洋', 'yangyang', '123456');
INSERT INTO `teacher` VALUES (4, '章星', 'zhangxin', '123456');
INSERT INTO `teacher` VALUES (5, '胡浪', 'hulang', '123456');

SET FOREIGN_KEY_CHECKS = 1;
