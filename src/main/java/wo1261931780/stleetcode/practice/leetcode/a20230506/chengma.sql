/*
Navicat MySQL Data Transfer

Source Server         : localhost
Source Server Version : 50643
Source Host           : localhost:3306
Source Database       : chengma

Target Server Type    : MYSQL
Target Server Version : 50643
File Encoding         : 65001

Date: 2022-07-19 22:50:30
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for `tb_comment`
-- ----------------------------
DROP TABLE IF EXISTS `tb_comment`;
CREATE TABLE `tb_comment` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `comment` int(11) NOT NULL COMMENT '评论，关联tb_editor_data',
  `question_id` varchar(128) NOT NULL COMMENT '评论的question',
  `reply_id` int(11) NOT NULL DEFAULT '0' COMMENT '回复的评论ID，为0则为问题的首评',
  `create_time` datetime DEFAULT NULL COMMENT '创建时间',
  `create_user` varchar(255) DEFAULT NULL COMMENT '创建用户',
  PRIMARY KEY (`id`),
  KEY `question_id_index` (`question_id`) USING BTREE
) ENGINE=InnoDB AUTO_INCREMENT=24 DEFAULT CHARSET=utf8mb4 COMMENT='评论表';

-- ----------------------------
-- Records of tb_comment
-- ----------------------------
INSERT INTO `tb_comment` VALUES ('1', '18', '14', '0', '2022-06-10 02:37:59', 'zhaoda');
INSERT INTO `tb_comment` VALUES ('2', '19', '14', '0', '2022-06-10 02:39:14', 'zhaoda');
INSERT INTO `tb_comment` VALUES ('3', '22', '15', '0', '2022-06-12 09:37:21', 'wanger');
INSERT INTO `tb_comment` VALUES ('4', '36', '14', '0', '2022-06-16 05:13:07', 'zhaoda');
INSERT INTO `tb_comment` VALUES ('5', '37', '14', '1', '2022-06-20 02:16:27', 'zhaoda');
INSERT INTO `tb_comment` VALUES ('6', '38', '14', '0', '2022-06-22 05:34:45', 'zhangsan');
INSERT INTO `tb_comment` VALUES ('21', '159', '14', '1', '2022-07-12 03:01:16', 'zhangsan');

-- ----------------------------
-- Table structure for `tb_editor_data`
-- ----------------------------
DROP TABLE IF EXISTS `tb_editor_data`;
CREATE TABLE `tb_editor_data` (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT 'ID',
  `html` longtext COMMENT 'html渲染数据',
  `raw` longtext COMMENT '编辑器渲染数据',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=192 DEFAULT CHARSET=utf8mb4 COMMENT='富文本表';

-- ----------------------------
-- Records of tb_editor_data
-- ----------------------------
INSERT INTO `tb_editor_data` VALUES ('5', '<p>蚂蚁金服设计平台 design.alipay.com，用最小的工作量，无缝接入蚂蚁金服生态，提供跨越设计与开发的体验解决方案。蚂蚁金服设计平台 design.alipay.com，用最小的工作量，无缝接入蚂蚁金服生态，提供跨越设计与开发的体验解决方案。</p>', '{\"blocks\":[{\"key\":\"9d3u7\",\"text\":\"蚂蚁金服设计平台 design.alipay.com，用最小的工作量，无缝接入蚂蚁金服生态，提供跨越设计与开发的体验解决方案。蚂蚁金服设计平台 design.alipay.com，用最小的工作量，无缝接入蚂蚁金服生态，提供跨越设计与开发的体验解决方案。\",\"type\":\"unstyled\",\"depth\":0,\"inlineStyleRanges\":[],\"entityRanges\":[],\"data\":{}}],\"entityMap\":{}}');
INSERT INTO `tb_editor_data` VALUES ('18', '<p>测试评论</p>', '{\"blocks\":[{\"key\":\"6mfj\",\"text\":\"测试评论\",\"type\":\"unstyled\",\"depth\":0,\"inlineStyleRanges\":[],\"entityRanges\":[],\"data\":{}}],\"entityMap\":{}}');
INSERT INTO `tb_editor_data` VALUES ('19', '<p><span style=\"color:#000000\"><span style=\"font-size:14px\"><span style=\"background-color:#ffffff\">你这个问题问的不咋地，如何查找期权挂接关系？</span></span></span></p>', '{\"blocks\":[{\"key\":\"et80c\",\"text\":\"你这个问题问的不咋地？\",\"type\":\"unstyled\",\"depth\":0,\"inlineStyleRanges\":[{\"offset\":0,\"length\":22,\"style\":\"COLOR-000000\"},{\"offset\":0,\"length\":22,\"style\":\"FONTSIZE-14\"},{\"offset\":0,\"length\":22,\"style\":\"BGCOLOR-FFFFFF\"}],\"entityRanges\":[],\"data\":{}}],\"entityMap\":{}}');
INSERT INTO `tb_editor_data` VALUES ('22', '<p>good</p>', '{\"blocks\":[{\"key\":\"215p5\",\"text\":\"good\",\"type\":\"unstyled\",\"depth\":0,\"inlineStyleRanges\":[],\"entityRanges\":[],\"data\":{}}],\"entityMap\":{}}');
INSERT INTO `tb_editor_data` VALUES ('28', '<p>测试问题描述</p>', '{\"blocks\":[{\"key\":\"4ch1q\",\"text\":\"测试问题描述\",\"type\":\"unstyled\",\"depth\":0,\"inlineStyleRanges\":[],\"entityRanges\":[],\"data\":{}}],\"entityMap\":{}}');
INSERT INTO `tb_editor_data` VALUES ('29', '<p>测试问题描述</p>', '{\"blocks\":[{\"key\":\"4ch1q\",\"text\":\"测试问题描述\",\"type\":\"unstyled\",\"depth\":0,\"inlineStyleRanges\":[],\"entityRanges\":[],\"data\":{}}],\"entityMap\":{}}');
INSERT INTO `tb_editor_data` VALUES ('30', '<p>测试问题描述</p>', '{\"blocks\":[{\"key\":\"f27k9\",\"text\":\"测试问题描述\",\"type\":\"unstyled\",\"depth\":0,\"inlineStyleRanges\":[],\"entityRanges\":[],\"data\":{}}],\"entityMap\":{}}');
INSERT INTO `tb_editor_data` VALUES ('31', '<p>测试问题描述</p>', '{\"blocks\":[{\"key\":\"f27k9\",\"text\":\"测试问题描述\",\"type\":\"unstyled\",\"depth\":0,\"inlineStyleRanges\":[],\"entityRanges\":[],\"data\":{}}],\"entityMap\":{}}');
INSERT INTO `tb_editor_data` VALUES ('32', '<p>测试问题描述</p>', '{\"blocks\":[{\"key\":\"f27k9\",\"text\":\"测试问题描述\",\"type\":\"unstyled\",\"depth\":0,\"inlineStyleRanges\":[],\"entityRanges\":[],\"data\":{}}],\"entityMap\":{}}');
INSERT INTO `tb_editor_data` VALUES ('33', '<p>测试问题答案</p>', '{\"blocks\":[{\"key\":\"7h03i\",\"text\":\"测试问题答案\",\"type\":\"unstyled\",\"depth\":0,\"inlineStyleRanges\":[],\"entityRanges\":[],\"data\":{\"nodeAttributes\":{}}}],\"entityMap\":{}}');
INSERT INTO `tb_editor_data` VALUES ('36', '<p>测试评论3</p>', '{\"blocks\":[{\"key\":\"1q0u1\",\"text\":\"测试评论3\",\"type\":\"unstyled\",\"depth\":0,\"inlineStyleRanges\":[],\"entityRanges\":[],\"data\":{}}],\"entityMap\":{}}');
INSERT INTO `tb_editor_data` VALUES ('37', '<p>测试</p>', '{\"blocks\":[{\"key\":\"a37po\",\"text\":\"测试\",\"type\":\"unstyled\",\"depth\":0,\"inlineStyleRanges\":[],\"entityRanges\":[],\"data\":{}}],\"entityMap\":{}}');
INSERT INTO `tb_editor_data` VALUES ('38', '<p></p><div class=\"media-wrap image-wrap\"><img src=\"http://10.187.129.145:8015/knowledge/file/download/20220622/4a80182657a24afaa7970b51ca2a9f7e.png\"/></div><p></p>', '{\"blocks\":[{\"key\":\"8qilr\",\"text\":\"\",\"type\":\"unstyled\",\"depth\":0,\"inlineStyleRanges\":[],\"entityRanges\":[],\"data\":{}},{\"key\":\"bers2\",\"text\":\" \",\"type\":\"atomic\",\"depth\":0,\"inlineStyleRanges\":[],\"entityRanges\":[{\"offset\":0,\"length\":1,\"key\":0}],\"data\":{}},{\"key\":\"elmim\",\"text\":\"\",\"type\":\"unstyled\",\"depth\":0,\"inlineStyleRanges\":[],\"entityRanges\":[],\"data\":{}}],\"entityMap\":{\"0\":{\"type\":\"IMAGE\",\"mutability\":\"IMMUTABLE\",\"data\":{\"url\":\"http://10.187.129.145:8015/knowledge/file/download/20220622/4a80182657a24afaa7970b51ca2a9f7e.png\",\"type\":\"IMAGE\"}}}}');
INSERT INTO `tb_editor_data` VALUES ('47', '<p>测试问题</p>', '{\"blocks\":[{\"key\":\"e68av\",\"text\":\"测试问题\",\"type\":\"unstyled\",\"depth\":0,\"inlineStyleRanges\":[],\"entityRanges\":[],\"data\":{}}],\"entityMap\":{}}');
INSERT INTO `tb_editor_data` VALUES ('48', '<p></p><div class=\"media-wrap image-wrap\"><img src=\"http://10.176.179.70:8080/knowledge/file/download/20220623/e5fd239b69c34eb685cbf7f8d12c6717.png\"/></div><p>111</p>', '{\"blocks\":[{\"key\":\"9jvtf\",\"text\":\"\",\"type\":\"unstyled\",\"depth\":0,\"inlineStyleRanges\":[],\"entityRanges\":[],\"data\":{}},{\"key\":\"308fv\",\"text\":\" \",\"type\":\"atomic\",\"depth\":0,\"inlineStyleRanges\":[],\"entityRanges\":[{\"offset\":0,\"length\":1,\"key\":0}],\"data\":{}},{\"key\":\"aktv0\",\"text\":\"111\",\"type\":\"unstyled\",\"depth\":0,\"inlineStyleRanges\":[],\"entityRanges\":[],\"data\":{}}],\"entityMap\":{\"0\":{\"type\":\"IMAGE\",\"mutability\":\"IMMUTABLE\",\"data\":{\"url\":\"http://10.176.179.70:8080/knowledge/file/download/20220623/e5fd239b69c34eb685cbf7f8d12c6717.png\",\"type\":\"IMAGE\"}}}}');
INSERT INTO `tb_editor_data` VALUES ('49', '<p></p><div class=\"media-wrap image-wrap\"><img src=\"http://10.176.179.70:8080/knowledge/file/download/20220623/0a8c4d3a555747fcb2cc24dcfd8de1a7.jpg\" width=\"328.328125\" height=\"184\" style=\"width:328.328125px;height:184px\"/></div><p></p>', '{\"blocks\":[{\"key\":\"3emur\",\"text\":\"\",\"type\":\"unstyled\",\"depth\":0,\"inlineStyleRanges\":[],\"entityRanges\":[],\"data\":{}},{\"key\":\"7bsr3\",\"text\":\" \",\"type\":\"atomic\",\"depth\":0,\"inlineStyleRanges\":[],\"entityRanges\":[{\"offset\":0,\"length\":1,\"key\":0}],\"data\":{}},{\"key\":\"ap7m2\",\"text\":\"\",\"type\":\"unstyled\",\"depth\":0,\"inlineStyleRanges\":[],\"entityRanges\":[],\"data\":{}}],\"entityMap\":{\"0\":{\"type\":\"IMAGE\",\"mutability\":\"IMMUTABLE\",\"data\":{\"url\":\"http://10.176.179.70:8080/knowledge/file/download/20220623/0a8c4d3a555747fcb2cc24dcfd8de1a7.jpg\",\"type\":\"IMAGE\",\"width\":328.328125,\"height\":184}}}}');
INSERT INTO `tb_editor_data` VALUES ('149', '<p>测试问题测试问题测试问题</p>', '{\"blocks\":[{\"key\":\"972tm\",\"text\":\"测试问题测试问题测试问题\",\"type\":\"unstyled\",\"depth\":0,\"inlineStyleRanges\":[],\"entityRanges\":[],\"data\":{\"nodeAttributes\":{}}}],\"entityMap\":{}}');
INSERT INTO `tb_editor_data` VALUES ('159', '<p>回复zhaoda</p>', '{\"blocks\":[{\"key\":\"6v9a2\",\"text\":\"回复zhaoda\",\"type\":\"unstyled\",\"depth\":0,\"inlineStyleRanges\":[],\"entityRanges\":[],\"data\":{}}],\"entityMap\":{}}');

-- ----------------------------
-- Table structure for `tb_question`
-- ----------------------------
DROP TABLE IF EXISTS `tb_question`;
CREATE TABLE `tb_question` (
  `id` varchar(128) NOT NULL,
  `title` varchar(255) NOT NULL COMMENT '提问标题',
  `tags` varchar(255) NOT NULL COMMENT '标签，多个逗号分隔',
  `question` int(11) DEFAULT NULL COMMENT '问题(关联tb_editor_data表)',
  `answer` int(11) DEFAULT '0' COMMENT '答案(关联tb_editor_data表),未回答为0',
  `status` tinyint(1) DEFAULT '0' COMMENT '状态：1.已上架 0已下架',
  `answerer` varchar(128) DEFAULT NULL COMMENT '问题回复人',
  `classic` tinyint(1) NOT NULL DEFAULT '0' COMMENT '是否精品',
  `create_user` varchar(255) DEFAULT NULL COMMENT '创建者',
  `create_time` datetime DEFAULT NULL COMMENT '创建时间',
  `update_user` varchar(255) DEFAULT NULL COMMENT '更新者',
  `update_time` datetime DEFAULT NULL,
  `delete_flag` tinyint(1) NOT NULL DEFAULT '0' COMMENT '是否删除，1为是，0为否',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COMMENT='问题表';

-- ----------------------------
-- Records of tb_question
-- ----------------------------
INSERT INTO `tb_question` VALUES ('14', '与其等待与能力匹配的机会，不如培养与机会匹配的能力', '9,10', '5', '0', '1', null, '1', 'admin', '2022-05-26 00:43:41', 'zhaoda', '2022-06-07 06:12:02', '0');
INSERT INTO `tb_question` VALUES ('18', '测试', '9,10', '28', '29', '1', null, '0', 'zhaoda', '2022-06-13 01:53:54', 'zhaoda', '2022-06-13 01:53:54', '1');
INSERT INTO `tb_question` VALUES ('19', '测试2', '10,11', '30', '31', '1', null, '0', 'zhaoda', '2022-06-13 05:41:10', 'zhaoda', '2022-06-13 05:41:10', '0');
INSERT INTO `tb_question` VALUES ('20', '测试3', '9,10', '32', '33', '1', null, '0', 'zhaoda', '2022-06-13 05:41:54', 'zhaoda', '2022-06-13 05:41:54', '0');
INSERT INTO `tb_question` VALUES ('22', '测试', '9', '47', '149', '1', null, '0', 'zhaoda', '2022-06-23 06:08:48', 'wanger', '2022-07-08 09:06:41', '0');
INSERT INTO `tb_question` VALUES ('26', 'ss', '9', '49', '0', '1', null, '0', 'zhaoda', '2022-06-23 06:43:31', 'zhaoda', '2022-06-24 01:07:17', '0');

-- ----------------------------
-- Table structure for `tb_question_tag`
-- ----------------------------
DROP TABLE IF EXISTS `tb_question_tag`;
CREATE TABLE `tb_question_tag` (
  `tag_id` int(11) NOT NULL COMMENT '标签ID',
  `question_id` varchar(128) NOT NULL COMMENT '问题ID',
  PRIMARY KEY (`tag_id`,`question_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COMMENT='问题标签关联表';

-- ----------------------------
-- Records of tb_question_tag
-- ----------------------------
INSERT INTO `tb_question_tag` VALUES ('9', '13');
INSERT INTO `tb_question_tag` VALUES ('9', '14');
INSERT INTO `tb_question_tag` VALUES ('9', '15');
INSERT INTO `tb_question_tag` VALUES ('9', '1543801558016331776');
INSERT INTO `tb_question_tag` VALUES ('9', '1543802166324629504');
INSERT INTO `tb_question_tag` VALUES ('9', '16');
INSERT INTO `tb_question_tag` VALUES ('9', '17');
INSERT INTO `tb_question_tag` VALUES ('9', '18');
INSERT INTO `tb_question_tag` VALUES ('9', '20');
INSERT INTO `tb_question_tag` VALUES ('9', '21');
INSERT INTO `tb_question_tag` VALUES ('9', '22');
INSERT INTO `tb_question_tag` VALUES ('9', '24');
INSERT INTO `tb_question_tag` VALUES ('9', '26');
INSERT INTO `tb_question_tag` VALUES ('9', '27');
INSERT INTO `tb_question_tag` VALUES ('9', '28');
INSERT INTO `tb_question_tag` VALUES ('9', '29');
INSERT INTO `tb_question_tag` VALUES ('9', '31');
INSERT INTO `tb_question_tag` VALUES ('9', '32');
INSERT INTO `tb_question_tag` VALUES ('9', 'G-20220704-0007');
INSERT INTO `tb_question_tag` VALUES ('9', 'G-20220707-0001');
INSERT INTO `tb_question_tag` VALUES ('9', 'G-20220707-0002');
INSERT INTO `tb_question_tag` VALUES ('9', 'G-20220712-0002');
INSERT INTO `tb_question_tag` VALUES ('9', 'G-20220712-0003');
INSERT INTO `tb_question_tag` VALUES ('10', '13');
INSERT INTO `tb_question_tag` VALUES ('10', '14');
INSERT INTO `tb_question_tag` VALUES ('10', '1543801558016331776');
INSERT INTO `tb_question_tag` VALUES ('10', '1543802166324629504');
INSERT INTO `tb_question_tag` VALUES ('10', '18');
INSERT INTO `tb_question_tag` VALUES ('10', '19');
INSERT INTO `tb_question_tag` VALUES ('10', '20');
INSERT INTO `tb_question_tag` VALUES ('10', '23');
INSERT INTO `tb_question_tag` VALUES ('10', '30');
INSERT INTO `tb_question_tag` VALUES ('10', '32');
INSERT INTO `tb_question_tag` VALUES ('10', 'G-20220704-0008');
INSERT INTO `tb_question_tag` VALUES ('10', 'G-20220707-0004');
INSERT INTO `tb_question_tag` VALUES ('10', 'G-20220707-0005');
INSERT INTO `tb_question_tag` VALUES ('10', 'G-20220707-0006');
INSERT INTO `tb_question_tag` VALUES ('10', 'G-20220712-0004');
INSERT INTO `tb_question_tag` VALUES ('10', 'G-20220712-0005');
INSERT INTO `tb_question_tag` VALUES ('11', '13');
INSERT INTO `tb_question_tag` VALUES ('11', '17');
INSERT INTO `tb_question_tag` VALUES ('11', '19');
INSERT INTO `tb_question_tag` VALUES ('11', '32');
INSERT INTO `tb_question_tag` VALUES ('12', '13');
INSERT INTO `tb_question_tag` VALUES ('12', '25');
INSERT INTO `tb_question_tag` VALUES ('12', 'G-20220706-0001');
INSERT INTO `tb_question_tag` VALUES ('12', 'G-20220719-0001');
INSERT INTO `tb_question_tag` VALUES ('13', 'G-20220706-0001');
INSERT INTO `tb_question_tag` VALUES ('13', 'G-20220713-0003');
INSERT INTO `tb_question_tag` VALUES ('58', 'G-20220707-0003');
INSERT INTO `tb_question_tag` VALUES ('58', 'G-20220707-0007');
INSERT INTO `tb_question_tag` VALUES ('58', 'G-20220712-0001');
INSERT INTO `tb_question_tag` VALUES ('58', 'G-20220712-0007');
INSERT INTO `tb_question_tag` VALUES ('58', 'G-20220713-0001');
INSERT INTO `tb_question_tag` VALUES ('58', 'G-20220713-0002');
INSERT INTO `tb_question_tag` VALUES ('58', 'G-20220714-0001');
INSERT INTO `tb_question_tag` VALUES ('58', 'G-20220714-0002');
INSERT INTO `tb_question_tag` VALUES ('58', 'G-20220718-0001');
INSERT INTO `tb_question_tag` VALUES ('58', 'G-20220719-0002');
INSERT INTO `tb_question_tag` VALUES ('59', 'G-20220712-0006');

-- ----------------------------
-- Table structure for `tb_tag`
-- ----------------------------
DROP TABLE IF EXISTS `tb_tag`;
CREATE TABLE `tb_tag` (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT 'ID',
  `label` varchar(128) NOT NULL COMMENT '标签值',
  `count` int(11) NOT NULL DEFAULT '0' COMMENT '点击次数',
  `category` varchar(128) NOT NULL COMMENT '分类',
  PRIMARY KEY (`id`),
  KEY `label_index` (`label`) USING BTREE
) ENGINE=InnoDB AUTO_INCREMENT=71 DEFAULT CHARSET=utf8mb4 COMMENT='标签表';

-- ----------------------------
-- Records of tb_tag
-- ----------------------------
INSERT INTO `tb_tag` VALUES ('9', '数据', '55', 'knowledge');
INSERT INTO `tb_tag` VALUES ('10', '功能', '37', 'knowledge');
INSERT INTO `tb_tag` VALUES ('11', 'sql', '16', 'knowledge');
INSERT INTO `tb_tag` VALUES ('13', '权限', '5', 'knowledge');
INSERT INTO `tb_tag` VALUES ('14', '精品', '0', 'custom');

-- ----------------------------
-- Table structure for `tb_user_collected_comment`
-- ----------------------------
DROP TABLE IF EXISTS `tb_user_collected_comment`;
CREATE TABLE `tb_user_collected_comment` (
  `username` varchar(128) NOT NULL COMMENT '用户',
  `comment_id` int(11) NOT NULL COMMENT '评论ID',
  PRIMARY KEY (`username`,`comment_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COMMENT='用户收藏评论记录表';

-- ----------------------------
-- Records of tb_user_collected_comment
-- ----------------------------

-- ----------------------------
-- Table structure for `tb_user_collected_question`
-- ----------------------------
DROP TABLE IF EXISTS `tb_user_collected_question`;
CREATE TABLE `tb_user_collected_question` (
  `username` varchar(128) NOT NULL COMMENT '用户',
  `question_id` varchar(128) NOT NULL COMMENT '问题ID',
  `create_time` datetime DEFAULT NULL,
  PRIMARY KEY (`username`,`question_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COMMENT='用户收藏问题记录表';

-- ----------------------------
-- Records of tb_user_collected_question
-- ----------------------------
INSERT INTO `tb_user_collected_question` VALUES ('wanger', '28', '2022-07-04 07:56:43');
INSERT INTO `tb_user_collected_question` VALUES ('zhangsan', '13', '2022-07-01 15:58:15');
INSERT INTO `tb_user_collected_question` VALUES ('zhangsan', '14', '2022-07-18 06:52:42');
INSERT INTO `tb_user_collected_question` VALUES ('zhangsan', '20', '2022-07-01 15:58:18');
INSERT INTO `tb_user_collected_question` VALUES ('zhangsan', '25', '2022-07-01 15:58:21');
INSERT INTO `tb_user_collected_question` VALUES ('zhangsan', '26', '2022-07-01 15:58:24');
INSERT INTO `tb_user_collected_question` VALUES ('zhangsan', '27', '2022-07-01 15:58:29');
INSERT INTO `tb_user_collected_question` VALUES ('zhangsan', '32', '2022-07-04 07:54:56');
INSERT INTO `tb_user_collected_question` VALUES ('zhaoda', '14', '2022-07-01 15:58:32');

-- ----------------------------
-- Table structure for `tb_user_liked_comment`
-- ----------------------------
DROP TABLE IF EXISTS `tb_user_liked_comment`;
CREATE TABLE `tb_user_liked_comment` (
  `username` varchar(128) NOT NULL COMMENT '用户',
  `comment_id` int(11) NOT NULL COMMENT '评论id',
  PRIMARY KEY (`username`,`comment_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COMMENT='用户点赞评论表';

-- ----------------------------
-- Records of tb_user_liked_comment
-- ----------------------------
INSERT INTO `tb_user_liked_comment` VALUES ('zhangsan', '1');

-- ----------------------------
-- Table structure for `tb_user_liked_question`
-- ----------------------------
DROP TABLE IF EXISTS `tb_user_liked_question`;
CREATE TABLE `tb_user_liked_question` (
  `username` varchar(128) NOT NULL COMMENT '用户',
  `question_id` varchar(128) NOT NULL COMMENT '问题id',
  PRIMARY KEY (`username`,`question_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COMMENT='用户点赞问题表';

-- ----------------------------
-- Records of tb_user_liked_question
-- ----------------------------
INSERT INTO `tb_user_liked_question` VALUES ('zhangsan', '14');

-- ----------------------------
-- Table structure for `tb_user_visited_question`
-- ----------------------------
DROP TABLE IF EXISTS `tb_user_visited_question`;
CREATE TABLE `tb_user_visited_question` (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT 'ID',
  `username` varchar(128) NOT NULL COMMENT '用户',
  `question_id` varchar(128) NOT NULL COMMENT '问题ID',
  `create_time` datetime DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `username_index` (`username`) USING BTREE,
  KEY `question_index` (`question_id`) USING BTREE
) ENGINE=InnoDB AUTO_INCREMENT=1401 DEFAULT CHARSET=utf8mb4 COMMENT='用户浏览问题记录表';

-- ----------------------------
-- Records of tb_user_visited_question
-- ----------------------------
INSERT INTO `tb_user_visited_question` VALUES ('59', 'wanger', '14', '2022-06-06 07:17:57');
INSERT INTO `tb_user_visited_question` VALUES ('196', 'admin', '14', '2022-06-10 07:12:33');
INSERT INTO `tb_user_visited_question` VALUES ('197', 'admin', '14', '2022-06-10 07:12:33');
INSERT INTO `tb_user_visited_question` VALUES ('201', 'admin', '14', '2022-06-10 07:20:02');
INSERT INTO `tb_user_visited_question` VALUES ('202', 'admin', '14', '2022-06-10 07:20:02');
INSERT INTO `tb_user_visited_question` VALUES ('457', 'zhaoda', '14', '2022-06-20 06:40:24');
INSERT INTO `tb_user_visited_question` VALUES ('458', 'zhaoda', '14', '2022-06-20 06:40:55');
INSERT INTO `tb_user_visited_question` VALUES ('459', 'zhaoda', '14', '2022-06-20 06:40:56');
INSERT INTO `tb_user_visited_question` VALUES ('460', 'zhaoda', '14', '2022-06-20 06:41:34');
INSERT INTO `tb_user_visited_question` VALUES ('461', 'zhaoda', '14', '2022-06-20 06:41:34');
INSERT INTO `tb_user_visited_question` VALUES ('462', 'zhaoda', '14', '2022-06-20 06:42:42');
INSERT INTO `tb_user_visited_question` VALUES ('463', 'zhaoda', '14', '2022-06-20 06:42:43');
INSERT INTO `tb_user_visited_question` VALUES ('464', 'zhaoda', '14', '2022-06-20 06:44:44');
INSERT INTO `tb_user_visited_question` VALUES ('465', 'zhaoda', '14', '2022-06-20 06:44:45');
INSERT INTO `tb_user_visited_question` VALUES ('466', 'zhaoda', '14', '2022-06-20 06:45:38');
INSERT INTO `tb_user_visited_question` VALUES ('467', 'zhaoda', '14', '2022-06-20 06:45:38');
INSERT INTO `tb_user_visited_question` VALUES ('468', 'zhaoda', '14', '2022-06-20 06:47:27');
INSERT INTO `tb_user_visited_question` VALUES ('469', 'zhaoda', '14', '2022-06-20 06:47:28');
INSERT INTO `tb_user_visited_question` VALUES ('470', 'zhaoda', '14', '2022-06-20 06:56:47');
INSERT INTO `tb_user_visited_question` VALUES ('471', 'zhaoda', '14', '2022-06-20 06:56:47');
INSERT INTO `tb_user_visited_question` VALUES ('472', 'zhaoda', '14', '2022-06-20 07:04:55');
INSERT INTO `tb_user_visited_question` VALUES ('473', 'zhaoda', '14', '2022-06-20 07:04:55');
INSERT INTO `tb_user_visited_question` VALUES ('474', 'zhaoda', '14', '2022-06-20 07:14:52');
INSERT INTO `tb_user_visited_question` VALUES ('475', 'zhaoda', '14', '2022-06-20 07:14:52');
INSERT INTO `tb_user_visited_question` VALUES ('476', 'zhaoda', '14', '2022-06-20 07:18:09');
INSERT INTO `tb_user_visited_question` VALUES ('477', 'zhaoda', '14', '2022-06-20 07:18:10');
INSERT INTO `tb_user_visited_question` VALUES ('478', 'zhaoda', '14', '2022-06-20 07:18:18');
INSERT INTO `tb_user_visited_question` VALUES ('479', 'zhaoda', '14', '2022-06-20 07:18:18');
INSERT INTO `tb_user_visited_question` VALUES ('480', 'zhaoda', '14', '2022-06-20 07:36:36');
INSERT INTO `tb_user_visited_question` VALUES ('481', 'zhaoda', '14', '2022-06-20 07:36:36');
INSERT INTO `tb_user_visited_question` VALUES ('482', 'zhaoda', '14', '2022-06-20 07:39:52');
INSERT INTO `tb_user_visited_question` VALUES ('483', 'zhaoda', '14', '2022-06-20 07:39:53');
INSERT INTO `tb_user_visited_question` VALUES ('484', 'zhaoda', '14', '2022-06-20 07:41:06');
INSERT INTO `tb_user_visited_question` VALUES ('485', 'zhaoda', '14', '2022-06-20 07:41:06');
INSERT INTO `tb_user_visited_question` VALUES ('486', 'zhaoda', '14', '2022-06-20 07:42:17');
INSERT INTO `tb_user_visited_question` VALUES ('487', 'zhaoda', '14', '2022-06-20 07:42:17');
INSERT INTO `tb_user_visited_question` VALUES ('488', 'zhaoda', '14', '2022-06-20 07:43:14');
INSERT INTO `tb_user_visited_question` VALUES ('489', 'zhaoda', '14', '2022-06-20 07:43:14');
INSERT INTO `tb_user_visited_question` VALUES ('490', 'zhaoda', '14', '2022-06-20 07:47:54');
INSERT INTO `tb_user_visited_question` VALUES ('491', 'zhaoda', '14', '2022-06-20 07:47:54');
INSERT INTO `tb_user_visited_question` VALUES ('492', 'zhaoda', '14', '2022-06-20 07:48:21');
INSERT INTO `tb_user_visited_question` VALUES ('493', 'zhaoda', '14', '2022-06-20 07:48:21');
INSERT INTO `tb_user_visited_question` VALUES ('494', 'zhaoda', '14', '2022-06-20 07:48:50');
INSERT INTO `tb_user_visited_question` VALUES ('495', 'zhaoda', '14', '2022-06-20 07:48:51');
INSERT INTO `tb_user_visited_question` VALUES ('496', 'zhaoda', '14', '2022-06-20 08:08:00');
INSERT INTO `tb_user_visited_question` VALUES ('497', 'zhaoda', '14', '2022-06-20 08:08:00');
INSERT INTO `tb_user_visited_question` VALUES ('498', 'zhaoda', '14', '2022-06-20 08:09:15');
INSERT INTO `tb_user_visited_question` VALUES ('499', 'zhaoda', '14', '2022-06-20 08:09:16');
INSERT INTO `tb_user_visited_question` VALUES ('500', 'zhaoda', '14', '2022-06-20 08:36:22');
INSERT INTO `tb_user_visited_question` VALUES ('501', 'zhaoda', '14', '2022-06-20 08:36:23');
INSERT INTO `tb_user_visited_question` VALUES ('502', 'zhaoda', '14', '2022-06-20 08:38:51');
INSERT INTO `tb_user_visited_question` VALUES ('503', 'zhaoda', '14', '2022-06-20 08:38:51');
INSERT INTO `tb_user_visited_question` VALUES ('504', 'zhaoda', '14', '2022-06-20 08:40:34');
INSERT INTO `tb_user_visited_question` VALUES ('505', 'zhaoda', '14', '2022-06-20 08:40:34');
INSERT INTO `tb_user_visited_question` VALUES ('506', 'zhaoda', '14', '2022-06-20 08:45:21');
INSERT INTO `tb_user_visited_question` VALUES ('507', 'zhaoda', '14', '2022-06-20 08:45:21');
INSERT INTO `tb_user_visited_question` VALUES ('508', 'zhaoda', '14', '2022-06-20 08:45:57');
INSERT INTO `tb_user_visited_question` VALUES ('509', 'zhaoda', '14', '2022-06-20 08:45:57');
INSERT INTO `tb_user_visited_question` VALUES ('510', 'zhaoda', '14', '2022-06-20 08:46:40');
INSERT INTO `tb_user_visited_question` VALUES ('511', 'zhaoda', '14', '2022-06-20 08:46:40');
INSERT INTO `tb_user_visited_question` VALUES ('512', 'zhaoda', '14', '2022-06-20 08:46:46');
INSERT INTO `tb_user_visited_question` VALUES ('513', 'zhaoda', '14', '2022-06-20 08:46:46');
INSERT INTO `tb_user_visited_question` VALUES ('514', 'zhaoda', '14', '2022-06-20 08:48:30');
INSERT INTO `tb_user_visited_question` VALUES ('515', 'zhaoda', '14', '2022-06-20 08:48:30');
INSERT INTO `tb_user_visited_question` VALUES ('516', 'zhaoda', '14', '2022-06-20 08:50:10');
INSERT INTO `tb_user_visited_question` VALUES ('517', 'zhaoda', '14', '2022-06-20 08:50:12');
INSERT INTO `tb_user_visited_question` VALUES ('518', 'zhaoda', '14', '2022-06-20 08:50:25');
INSERT INTO `tb_user_visited_question` VALUES ('519', 'zhaoda', '14', '2022-06-20 08:50:26');
INSERT INTO `tb_user_visited_question` VALUES ('520', 'zhaoda', '14', '2022-06-20 08:51:58');
INSERT INTO `tb_user_visited_question` VALUES ('521', 'zhaoda', '14', '2022-06-20 08:51:58');
INSERT INTO `tb_user_visited_question` VALUES ('522', 'zhaoda', '14', '2022-06-20 08:53:19');
INSERT INTO `tb_user_visited_question` VALUES ('523', 'zhaoda', '14', '2022-06-20 08:53:19');
INSERT INTO `tb_user_visited_question` VALUES ('524', 'zhaoda', '14', '2022-06-20 08:53:33');
INSERT INTO `tb_user_visited_question` VALUES ('525', 'zhaoda', '14', '2022-06-20 08:53:33');
INSERT INTO `tb_user_visited_question` VALUES ('526', 'zhaoda', '14', '2022-06-20 08:54:36');
INSERT INTO `tb_user_visited_question` VALUES ('527', 'zhaoda', '14', '2022-06-20 08:54:37');
INSERT INTO `tb_user_visited_question` VALUES ('528', 'zhaoda', '14', '2022-06-20 08:54:52');
INSERT INTO `tb_user_visited_question` VALUES ('529', 'zhaoda', '14', '2022-06-20 08:54:53');
INSERT INTO `tb_user_visited_question` VALUES ('530', 'zhaoda', '14', '2022-06-20 08:55:39');
INSERT INTO `tb_user_visited_question` VALUES ('531', 'zhaoda', '14', '2022-06-20 08:55:40');
INSERT INTO `tb_user_visited_question` VALUES ('532', 'zhaoda', '14', '2022-06-20 08:57:27');
INSERT INTO `tb_user_visited_question` VALUES ('533', 'zhaoda', '14', '2022-06-20 08:57:28');
INSERT INTO `tb_user_visited_question` VALUES ('534', 'zhaoda', '14', '2022-06-20 08:59:54');
INSERT INTO `tb_user_visited_question` VALUES ('535', 'zhaoda', '14', '2022-06-20 08:59:54');
INSERT INTO `tb_user_visited_question` VALUES ('536', 'zhaoda', '14', '2022-06-20 09:01:21');
INSERT INTO `tb_user_visited_question` VALUES ('537', 'zhaoda', '14', '2022-06-20 09:01:21');
INSERT INTO `tb_user_visited_question` VALUES ('566', 'zhaoda', '14', '2022-06-22 04:57:56');
INSERT INTO `tb_user_visited_question` VALUES ('567', 'zhaoda', '14', '2022-06-22 04:57:56');
INSERT INTO `tb_user_visited_question` VALUES ('568', 'zhaoda', '14', '2022-06-22 04:58:14');
INSERT INTO `tb_user_visited_question` VALUES ('569', 'zhaoda', '14', '2022-06-22 04:58:14');
INSERT INTO `tb_user_visited_question` VALUES ('570', 'zhaoda', '14', '2022-06-22 04:59:05');
INSERT INTO `tb_user_visited_question` VALUES ('571', 'zhaoda', '14', '2022-06-22 04:59:05');
INSERT INTO `tb_user_visited_question` VALUES ('572', 'zhaoda', '14', '2022-06-22 04:59:15');
INSERT INTO `tb_user_visited_question` VALUES ('573', 'zhaoda', '14', '2022-06-22 04:59:15');
INSERT INTO `tb_user_visited_question` VALUES ('574', 'zhaoda', '14', '2022-06-22 04:59:49');
INSERT INTO `tb_user_visited_question` VALUES ('575', 'zhaoda', '14', '2022-06-22 04:59:49');
INSERT INTO `tb_user_visited_question` VALUES ('576', 'zhaoda', '14', '2022-06-22 05:03:14');
INSERT INTO `tb_user_visited_question` VALUES ('577', 'zhaoda', '14', '2022-06-22 05:03:15');
INSERT INTO `tb_user_visited_question` VALUES ('578', 'zhaoda', '14', '2022-06-22 05:03:25');
INSERT INTO `tb_user_visited_question` VALUES ('579', 'zhaoda', '14', '2022-06-22 05:03:25');
INSERT INTO `tb_user_visited_question` VALUES ('580', 'zhaoda', '14', '2022-06-22 05:04:07');
INSERT INTO `tb_user_visited_question` VALUES ('581', 'zhaoda', '14', '2022-06-22 05:04:08');
INSERT INTO `tb_user_visited_question` VALUES ('582', 'zhaoda', '14', '2022-06-22 05:04:19');
INSERT INTO `tb_user_visited_question` VALUES ('583', 'zhaoda', '14', '2022-06-22 05:04:19');
INSERT INTO `tb_user_visited_question` VALUES ('584', 'zhaoda', '14', '2022-06-22 05:04:57');
INSERT INTO `tb_user_visited_question` VALUES ('585', 'zhaoda', '14', '2022-06-22 05:04:57');
INSERT INTO `tb_user_visited_question` VALUES ('586', 'zhaoda', '14', '2022-06-22 05:05:48');
INSERT INTO `tb_user_visited_question` VALUES ('587', 'zhaoda', '14', '2022-06-22 05:05:48');
INSERT INTO `tb_user_visited_question` VALUES ('596', 'zhangsan', '14', '2022-06-22 05:33:34');
INSERT INTO `tb_user_visited_question` VALUES ('597', 'zhangsan', '14', '2022-06-22 05:33:35');
INSERT INTO `tb_user_visited_question` VALUES ('659', 'zhangsan', '14', '2022-06-22 07:06:35');
INSERT INTO `tb_user_visited_question` VALUES ('660', 'zhangsan', '14', '2022-06-22 07:06:35');
INSERT INTO `tb_user_visited_question` VALUES ('673', 'zhangsan', '14', '2022-06-22 09:12:15');
INSERT INTO `tb_user_visited_question` VALUES ('674', 'zhangsan', '14', '2022-06-22 09:12:15');
INSERT INTO `tb_user_visited_question` VALUES ('907', 'zhangsan', '14', '2022-07-01 07:53:03');
INSERT INTO `tb_user_visited_question` VALUES ('908', 'zhangsan', '14', '2022-07-01 07:53:03');
INSERT INTO `tb_user_visited_question` VALUES ('957', 'zhaoda', '14', '2022-07-04 09:00:56');
INSERT INTO `tb_user_visited_question` VALUES ('958', 'zhaoda', '14', '2022-07-04 09:00:56');
INSERT INTO `tb_user_visited_question` VALUES ('959', 'zhaoda', '14', '2022-07-04 09:01:18');
INSERT INTO `tb_user_visited_question` VALUES ('960', 'zhaoda', '14', '2022-07-04 09:01:18');
INSERT INTO `tb_user_visited_question` VALUES ('961', 'zhaoda', '14', '2022-07-04 09:01:29');
INSERT INTO `tb_user_visited_question` VALUES ('962', 'zhaoda', '14', '2022-07-04 09:01:30');
INSERT INTO `tb_user_visited_question` VALUES ('974', 'zhaoda', '14', '2022-07-04 09:05:35');
INSERT INTO `tb_user_visited_question` VALUES ('975', 'zhaoda', '14', '2022-07-04 09:05:35');
INSERT INTO `tb_user_visited_question` VALUES ('1133', 'zhangsan', '14', '2022-07-08 07:57:41');
INSERT INTO `tb_user_visited_question` VALUES ('1187', 'zhangsan', '14', '2022-07-12 03:00:58');
INSERT INTO `tb_user_visited_question` VALUES ('1188', 'zhangsan', '14', '2022-07-12 03:01:19');
INSERT INTO `tb_user_visited_question` VALUES ('1338', 'zhangsan', '14', '2022-07-18 06:14:21');
INSERT INTO `tb_user_visited_question` VALUES ('1341', 'zhangsan', '14', '2022-07-18 06:52:25');
INSERT INTO `tb_user_visited_question` VALUES ('1342', 'zhangsan', '14', '2022-07-18 06:52:56');
INSERT INTO `tb_user_visited_question` VALUES ('1345', 'zhangsan', '14', '2022-07-18 07:05:27');
INSERT INTO `tb_user_visited_question` VALUES ('1372', 'zhangsan', '14', '2022-07-19 04:59:15');
INSERT INTO `tb_user_visited_question` VALUES ('1390', 'zhangsan', '14', '2022-07-19 09:15:24');
INSERT INTO `tb_user_visited_question` VALUES ('1393', 'zhangsan', '14', '2022-07-19 12:26:48');
INSERT INTO `tb_user_visited_question` VALUES ('1394', 'zhangsan', '14', '2022-07-19 13:32:00');
INSERT INTO `tb_user_visited_question` VALUES ('1395', 'zhangsan', '14', '2022-07-19 13:37:19');
INSERT INTO `tb_user_visited_question` VALUES ('1396', 'zhangsan', '14', '2022-07-19 13:37:37');
INSERT INTO `tb_user_visited_question` VALUES ('1397', 'zhangsan', '14', '2022-07-19 13:39:58');
INSERT INTO `tb_user_visited_question` VALUES ('1398', 'zhangsan', '14', '2022-07-19 13:43:03');
INSERT INTO `tb_user_visited_question` VALUES ('1399', 'duanyousen025664', '14', '2022-07-19 13:52:25');
INSERT INTO `tb_user_visited_question` VALUES ('1400', 'duanyousen025664', '14', '2022-07-19 14:15:31');
