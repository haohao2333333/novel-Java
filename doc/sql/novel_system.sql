/*
Navicat MySQL Data Transfer

Source Server         : MySQL
Source Server Version : 80031
Source Host           : localhost:3306
Source Database       : novel_system

Target Server Type    : MYSQL
Target Server Version : 80031
File Encoding         : 65001

Date: 2022-11-18 17:43:30
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for audio
-- ----------------------------
DROP TABLE IF EXISTS `audio`;
CREATE TABLE `audio` (
  `id` int NOT NULL,
  `name` varchar(30) DEFAULT NULL,
  `url` varchar(255) DEFAULT NULL,
  `label` varchar(10) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

-- ----------------------------
-- Records of audio
-- ----------------------------

-- ----------------------------
-- Table structure for novel
-- ----------------------------
DROP TABLE IF EXISTS `novel`;
CREATE TABLE `novel` (
  `id` bigint unsigned NOT NULL AUTO_INCREMENT COMMENT '主键',
  `novel_name` varchar(30) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci DEFAULT '' COMMENT '小说名',
  `novel_desc` varchar(2000) DEFAULT NULL COMMENT '小说描述',
  `author_id` bigint unsigned DEFAULT NULL,
  `author_name` varchar(30) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci DEFAULT NULL COMMENT '作者名',
  `img` varchar(233) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci DEFAULT '' COMMENT '小说图片',
  `category_id` bigint unsigned DEFAULT NULL COMMENT '列别ID',
  `category_name` varchar(30) DEFAULT NULL COMMENT '类别名字',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=17 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

-- ----------------------------
-- Records of novel
-- ----------------------------
INSERT INTO `novel` VALUES ('1', '开局奖励满级神功', null, null, '落魄的小', 'https://bookcover.yuewen.com/qdbimg/349573/1032569010/150', null, '武侠');
INSERT INTO `novel` VALUES ('2', '不科学御兽', null, null, '轻泉流响', 'https://bookcover.yuewen.com/qdbimg/349573/1029006481/180', null, '玄幻');
INSERT INTO `novel` VALUES ('3', '\r\n光阴之外\r\n', null, null, '耳根', 'https://bookcover.yuewen.com/qdbimg/349573/1031777108/150', null, '仙侠');
INSERT INTO `novel` VALUES ('4', '高天之上', null, null, '阴天神隐', 'https://bookcover.yuewen.com/qdbimg/349573/1032977639/150', null, '奇幻');
INSERT INTO `novel` VALUES ('5', '深空彼岸', null, null, '辰东', 'https://bookcover.yuewen.com/qdbimg/349573/1027339371/150', null, '都市');
INSERT INTO `novel` VALUES ('6', '我的姐夫是太子', null, null, '上山打老', 'https://bookcover.yuewen.com/qdbimg/349573/1034269304/150', null, '历史');
INSERT INTO `novel` VALUES ('7', 'LOL：这个男人太强了！', null, null, '一片苏叶', 'https://bookcover.yuewen.com/qdbimg/349573/1031260171/150', null, '游戏');
INSERT INTO `novel` VALUES ('8', '噩梦惊袭', null, null, '温柔劝睡', 'https://bookcover.yuewen.com/qdbimg/349573/1025543103/150', null, '悬疑');
INSERT INTO `novel` VALUES ('11', '射雕英雄传', '', null, '金庸', '', null, '武侠');
INSERT INTO `novel` VALUES ('16', '神雕侠侣', '', null, '金庸', '', null, '武侠');

-- ----------------------------
-- Table structure for novel_category
-- ----------------------------
DROP TABLE IF EXISTS `novel_category`;
CREATE TABLE `novel_category` (
  `id` bigint unsigned NOT NULL AUTO_INCREMENT,
  `work_direction` tinyint unsigned NOT NULL COMMENT '作品方向;0-男频 1-女频',
  `name` varchar(20) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL COMMENT '类别名',
  `sort` tinyint unsigned NOT NULL DEFAULT '10' COMMENT '排序',
  `create_time` datetime DEFAULT NULL COMMENT '创建时间',
  `update_time` datetime DEFAULT NULL COMMENT '更新时间',
  PRIMARY KEY (`id`) USING BTREE,
  UNIQUE KEY `pk_id` (`id`) USING BTREE
) ENGINE=InnoDB AUTO_INCREMENT=9 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci COMMENT='小说类别';

-- ----------------------------
-- Records of novel_category
-- ----------------------------
INSERT INTO `novel_category` VALUES ('1', '0', '武侠', '10', null, null);
INSERT INTO `novel_category` VALUES ('2', '0', '玄幻', '11', null, null);
INSERT INTO `novel_category` VALUES ('3', '0', '仙侠', '12', null, null);
INSERT INTO `novel_category` VALUES ('4', '0', '奇幻', '13', null, null);
INSERT INTO `novel_category` VALUES ('5', '0', '都市', '14', null, null);
INSERT INTO `novel_category` VALUES ('6', '0', '历史', '15', null, null);
INSERT INTO `novel_category` VALUES ('7', '1', '游戏', '16', null, null);
INSERT INTO `novel_category` VALUES ('8', '0', '悬疑', '17', null, null);

-- ----------------------------
-- Table structure for novel_chapter
-- ----------------------------
DROP TABLE IF EXISTS `novel_chapter`;
CREATE TABLE `novel_chapter` (
  `id` bigint unsigned NOT NULL AUTO_INCREMENT,
  `novel_id` bigint unsigned NOT NULL COMMENT '小说ID',
  `chapter_num` smallint unsigned NOT NULL COMMENT '章节号',
  `chapter_name` varchar(100) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL COMMENT '章节名',
  `create_time` datetime DEFAULT NULL,
  `update_time` datetime DEFAULT NULL,
  PRIMARY KEY (`id`) USING BTREE,
  UNIQUE KEY `uk_bookId_chapterNum` (`novel_id`,`chapter_num`) USING BTREE,
  UNIQUE KEY `pk_id` (`id`) USING BTREE,
  KEY `idx_bookId` (`novel_id`) USING BTREE,
  CONSTRAINT `nid` FOREIGN KEY (`novel_id`) REFERENCES `novel` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=1445988184596992005 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci COMMENT='小说章节';

-- ----------------------------
-- Records of novel_chapter
-- ----------------------------
INSERT INTO `novel_chapter` VALUES ('1', '1', '1', '龙象般若功大圆满！', null, null);
INSERT INTO `novel_chapter` VALUES ('2', '1', '2', '买卖上门？', null, null);
INSERT INTO `novel_chapter` VALUES ('3', '2', '1', '歪日', null, null);
INSERT INTO `novel_chapter` VALUES ('4', '1', '3', '接取任务', null, null);
INSERT INTO `novel_chapter` VALUES ('5', '1', '4', '夜遇', null, null);
INSERT INTO `novel_chapter` VALUES ('6', '1', '5', '一言不合', null, null);
INSERT INTO `novel_chapter` VALUES ('7', '1', '6', '邀请', null, null);
INSERT INTO `novel_chapter` VALUES ('8', '1', '7', '哈哈哈哈', null, null);

-- ----------------------------
-- Table structure for novel_content
-- ----------------------------
DROP TABLE IF EXISTS `novel_content`;
CREATE TABLE `novel_content` (
  `id` bigint unsigned NOT NULL AUTO_INCREMENT COMMENT '主键',
  `chapter_id` bigint unsigned NOT NULL COMMENT '章节ID',
  `content` mediumtext CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL COMMENT '小说章节内容',
  `create_time` datetime DEFAULT NULL,
  `update_time` datetime DEFAULT NULL,
  PRIMARY KEY (`id`) USING BTREE,
  UNIQUE KEY `uk_chapterId` (`chapter_id`) USING BTREE,
  UNIQUE KEY `pk_id` (`id`) USING BTREE
) ENGINE=InnoDB AUTO_INCREMENT=4256334 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci COMMENT='小说内容';

-- ----------------------------
-- Records of novel_content
-- ----------------------------
INSERT INTO `novel_content` VALUES ('1', '1', '<p>锦阳城！</p><br><p>此时恰逢正午时分，大城人潮汹涌，沿街之间叫买叫卖，讨价还价，的应有尽有，热闹非凡。</p>', '2022-11-10 15:23:36', '2022-11-10 15:23:41');
INSERT INTO `novel_content` VALUES ('2', '2', '&nbsp;&nbsp;&nbsp;&nbsp;阿峰将躺在床上的顾子毅扶起，靠到床头。<br/><br/>&nbsp;&nbsp;&nbsp;&nbsp;顾子毅现在身体的情况很糟糕，全身无法动弹不说疼痛从骨髓里散发出来，他的意识已经开始模糊，他不知道自己还能坚持多久。<br/><br/>&nbsp;&nbsp;&nbsp;&nbsp;阿峰带他来闲庄治疗，也是抱着死马当成活马医的侥幸心态，他不怀疑纤尘，接过纤尘递来的药丸，毫不迟疑，眉头都没皱一下便吞了下去。<br/><br/>&nbsp;&nbsp;&nbsp;&nbsp;解药下肚，片刻之后，一股清凉游走在他的体内，他顿感浑身轻松，中毒后那种万虫噬骨一样的疼痛也渐渐退了下去。<br/><br/>&nbsp;&nbsp;&nbsp;&nbsp;接着纤尘又从天青釉的瓶子里取出一粒药丸，“公子，再把这颗药吃了。”<br/><br/>&nbsp;&nbsp;&nbsp;&nbsp;顾子毅同样毫无迟疑吞下药丸。<br/><br/>&nbsp;&nbsp;&nbsp;&nbsp;吞下这粒药丸后，他感觉这粒药丸很是神奇，身体里仿佛有一股暖流从他的胃里舒展开来，缓缓进入他的七经八脉之间，好像给他的身体带来了能量，“姑娘，我刚刚吃的什么药？”<br/><br/>&nbsp;&nbsp;&nbsp;&nbsp;顾子毅的声音很虚弱，纤尘也柔声耐心回他，“温胃强心丸，由一些温胃的药和强心的药浓缩在一起混合而成的大蜜丸。”接着，纤尘很认真地看向顾子毅“你吃下后有感觉哪里不舒服吗？”<br/><br/>&nbsp;&nbsp;&nbsp;&nbsp;“没有，我只觉得此药仿佛能给我的身体带来能量。”<br/><br/>&nbsp;&nbsp;&nbsp;&nbsp;纤尘莞尔一笑，“哦，那是因为它温胃强心，可提高身体的耐受力，预防过会我给你刮腐时，你体力不支引起的晕厥。”<br/><br/>&nbsp;&nbsp;&nbsp;&nbsp;“哦…！”对医学七窍通了六窍，一窍不通的顾子毅，轻轻地哦了一声，其实他也没太听明白什么是身体的耐受力，只当那就是能给他身体补充能量的药丸。<br/><br/>&nbsp;&nbsp;&nbsp;&nbsp;顾子毅吃下药丸，纤尘便去准备刮腐用的器材和药材。<br/><br/>&nbsp;&nbsp;&nbsp;&nbsp;高浓度的盐水、糖盐水、药丸、刮腐用的小竹片、剪掉腐坏筋膜的小剪刀、麻沸散、用于防护的油纸衣、口罩、猪小肠做的手套……一个都不少，齐齐端进接诊室。<br/><br/>&nbsp;&nbsp;&nbsp;&nbsp;纤尘将一个小木棒递给顾子毅，“这是咬牙棒，刮腐时会很疼，即便我用了麻沸散，刮腐的过程依旧很疼，疼到受不了的时候，你就将这个棒子放进嘴里，避免大叫时咬到自己舌头。”<br/><br/>&nbsp;&nbsp;&nbsp;&nbsp;“我不要。”顾子毅一脸嫌弃，笑话，他堂堂纪国的战神，在沙场上出生入死，受过多少伤，这点痛算什么？他不屑用这个咬牙棒。<br/><br/>&nbsp;&nbsp;&nbsp;&nbsp;纤尘也不多说，将咬牙棒塞到顾子毅手里，“你不用，就拿在手里把玩吧。”<br/><br/>&nbsp;&nbsp;&nbsp;&nbsp;话毕，她转身就将油纸做成的防护服套在了衣服外，又带上油纸做的口罩和猪小肠做的手套。<br/><br/>&nbsp;&nbsp;&nbsp;&nbsp;顾子毅和阿峰第一次来闲城，也是第一次见到纤尘身上套的这身怪异的衣服，两人都惊得张大了嘴，盯着纤尘看了又看。<br/><br/>&nbsp;&nbsp;&nbsp;&nbsp;每个初来闲城的患者都会被自己身上的这衣服惊讶到，纤尘早习以为常。<br/><br/>&nbsp;&nbsp;&nbsp;&nbsp;“你们不用这样看着我，这些都是我师父发明的，师父给这身衣服起了个名字，叫防护服，它是用油纸做的，我手上带的叫手套，是用猪小肠做的，闲城同善医行的大夫给病人做外伤处理时都会穿上这身衣服，主要起到自我保护的作用。”<br/><br/>&nbsp;&nbsp;&nbsp;&nbsp;听完纤尘简单介绍了她这身行头，顾子毅和阿峰是懂非懂，两人非常有默契地点点头，异口同声“哦”了一声。<br/><br/>&nbsp;&nbsp;&nbsp;&nbsp;纤尘也不纠结他们究竟听没听懂，因为这不重要，便吩咐阿峰“扶好他，我要开始了。”<br/><br/>&nbsp;&nbsp;&nbsp;&nbsp;纤尘先将麻沸散抖落在顾子毅的伤口上。<br/><br/>&nbsp;&nbsp;&nbsp;&nbsp;等麻沸散起效的这段时间，纤尘像医生交代病情一样对顾子毅说：“东阴人的腐尸酥骨油之毒非草药之毒，实则是苗疆的一种蛊虫，此虫极小嗜血，见血后开始大量繁殖，繁殖期间产生的排泄物就是致命的毒素，我必须要将你每一寸腐肉都刮干净，刮去你手臂上所有的虫子，这毒才算真正解完，刮腐期间即便有麻沸散辅助依旧会很疼。”纤尘再次强调。<br/><br/>&nbsp;&nbsp;&nbsp;&nbsp;“嗯，我知道了你刮便是。”顾子毅侃然正色挺直了腰板，完全一副不惧疼痛的模样。<br/><br/>&nbsp;&nbsp;&nbsp;&nbsp;当纤尘的小竹片刮在顾子毅的伤口上时，他才真正体会到什么是剥肤切骨之痛，紧咬牙关硬是没用那咬牙棒，纤尘都担心他会将自己的牙都咬碎了。<br/><br/>&nbsp;&nbsp;&nbsp;&nbsp;腐肉一点一点刮完，纤尘又用浓盐水冲洗顾子毅手臂上的伤口，浓盐水淋在顾子毅血淋淋的新肉上，疼得他身子都在颤抖，豆大的汗水像雨水一样从他的额间滴落，阿峰的一心也跟着一阵阵揪着疼。<br/><br/>&nbsp;&nbsp;&nbsp;&nbsp;“腐尸酥骨油里的蛊虫怕火更怕盐水，遇浓盐水即死，所以我用浓盐水给你清洗伤口，只为彻底杀死残留的蛊虫，就快了，你再忍忍。”<br/><br/>&nbsp;&nbsp;&nbsp;&nbsp;纤尘边安抚顾子毅，边小心翼翼剪去他伤口处那些还沾粘着已经腐坏了的筋膜。<br/><br/>&nbsp;&nbsp;&nbsp;&nbsp;一炷香的时间，终于刮完腐，上好药包扎完，汗水已经湿透了顾子毅所有的衣裳，虚脱的他差点就要晕过去。<br/><br/>&nbsp;&nbsp;&nbsp;&nbsp;“他出汗太多，快喂他喝碗盐糖水。”阿峰闻言，赶紧将事先准备好的盐糖水喂给顾子毅。<br/><br/>&nbsp;&nbsp;&nbsp;&nbsp;喝完盐糖水的顾子毅才缓过一点劲来。<br/><br/>&nbsp;&nbsp;&nbsp;&nbsp;许是解了毒，顾子毅一直紧绷的神经终于松了下来，疲惫和困意袭来无法抵挡，倒头便睡了过去。<br/><br/>&nbsp;&nbsp;&nbsp;&nbsp;刮腐之痛，痛不欲生，纤尘见过不少刮腐之人的鬼哭狼嚎，甚至还有宁死也不愿再接受刮腐之人，顾子毅硬是咬着牙一声都没吭挺了过来，纤尘暗自佩服顾子毅的铮铮男儿铁骨，禁不住细看了一眼睡下的顾子毅。<br/><br/>&nbsp;&nbsp;&nbsp;&nbsp;这一眼，纤尘才发现顾子毅的美，他轮廓分明，皮肤如麦，脸上虽是一脸的病容，却依旧无法掩饰那沙场上铺天盖地的男儿气息，高挺的鼻和绝美的唇形，无一不在彰显着他的高贵与不凡，剑眉紧锁仿佛还有什么揪心的事藏在心里，让人忍不住想要去探索，想要去帮他抚平那皱着的眉心。<br/><br/>&nbsp;&nbsp;&nbsp;&nbsp;哎呀，自己都在胡思乱想什么？纤尘收回心神对阿峰说：“我给他包扎时上了麻沸散，可缓解他手臂的疼痛，估计他能睡上一会，你也可以休息一下。”<br/><br/>&nbsp;&nbsp;&nbsp;&nbsp;纤尘出了接诊室，苏妈妈进来收拾，阿峰是个有心的人，主动帮苏妈妈做事，当上了苏妈妈的帮手，他边帮苏妈妈清理废物边和苏妈妈攀谈。<br/><br/>&nbsp;&nbsp;&nbsp;&nbsp;麻沸散的药效过了没多会，顾子毅便从疼痛中醒来，他用那只未受伤的手，强撑起自己虚弱的身子靠到了床头，透过接诊室的小窗，正好可以看到窗外的好风景。<br/><br/>&nbsp;&nbsp;&nbsp;&nbsp;窗外桃花、杏花竞相开放，一阵风吹来，暗香相送，红白花雨随风飘落，坐在小亭里的纤尘，手捧着书，枕在石桌上看得很是专注，身处在花雨之中，她秀发微动，裙摆摇曳就像是位画中仙，看得顾子毅心里生出丝丝眷恋来，一时竟忘了疼痛。<br/><br/>&nbsp;&nbsp;&nbsp;&nbsp;“主子，您醒啦！”&nbsp;阿峰的突然进入，打断了顾子毅看风景。<br/><br/>&nbsp;&nbsp;&nbsp;&nbsp;“嘶……”手臂上的痛再次袭来，顾子毅一扫脸上的眷恋，恢复了一如既往的冷峻的神色，“你都了解到些什么？”。<br/><br/>&nbsp;&nbsp;&nbsp;&nbsp;“主子，那位小姐是闲庄庄主唯一的弟子，在闲城大家都管她叫少庄主，不过奇怪的是，她是我们纪国人，这次出远门就是要回京都省亲。”<br/><br/>&nbsp;&nbsp;&nbsp;&nbsp;阿峰将他在苏妈妈那里打听到的信息，一五一十说给了顾子毅听。<br/><br/>&nbsp;&nbsp;&nbsp;&nbsp;“嗖”的一下，顾子毅挺直了背，他也感到匪夷所思，闲城一直不待见纪国，拒收纪国医者前去学医，那女子怎么可能是他们纪国人？<br/><br/>&nbsp;&nbsp;&nbsp;&nbsp;他竖起耳朵继续追问：“你说，她是闲庄庄主唯一的徒弟，还是我们纪国人，你确定？”<br/><br/>&nbsp;&nbsp;&nbsp;&nbsp;“嗯。”阿峰确定地点点头，“我去问过他们赶马的车夫，那车夫也说姑娘来自纪国。”<br/><br/>&nbsp;&nbsp;&nbsp;&nbsp;……<br/><br/>&nbsp;&nbsp;&nbsp;&nbsp;顾子毅沉默。<br/><br/>&nbsp;&nbsp;&nbsp;&nbsp;闲城医术甲天下，闲城不仅是大周十国人人敬仰的医学圣地，还控制着大周十国各国百分之八十的药材共计，闲城对大周十国各国都很友好，唯独对纪国，既不收纪国的学者也不同纪国往来，就连药材共计都是先满足其他国家，最后才轮到纪国。<br/><br/>&nbsp;&nbsp;&nbsp;&nbsp;闲庄医术甲闲城，大周十国，各国无人不知无人不晓，闲城的主人其实就是闲庄的庄主，若闲庄少主真是纪国人，那为何纪国在闲城地位还会如此低下？<br/><br/>&nbsp;&nbsp;&nbsp;&nbsp;直觉告诉顾子毅，闲庄定有不少故事，他又继续追问阿峰“你还探出了些什么？”<br/><br/>&nbsp;&nbsp;&nbsp;&nbsp;阿峰摇摇头“没了，主子，那苏妈妈警惕性很强，属下只打探到这些。”<br/><br/>&nbsp;&nbsp;&nbsp;&nbsp;顾子毅本想吩咐阿峰去查，转而，他又想，还是先处理了盘踞在交州的东阴人再说。<br/><br/>&nbsp;&nbsp;&nbsp;&nbsp;一说到东阴人，还得从一个月前纪国的朝廷说起，一天早朝有人禀报，京中四品官员文侍郎，全家老小和仆从一百多人号人全部被杀，一个活口都没有。<br/><br/>&nbsp;&nbsp;&nbsp;&nbsp;杀人者，还明目张胆在墙上留下血书——“小示惩戒，东阴人留。”<br/><br/>&nbsp;&nbsp;&nbsp;&nbsp;东阴人的猖狂与凶残顿时让朝堂之上，人心惶惶。<br/><br/>&nbsp;&nbsp;&nbsp;&nbsp;纪武帝早有剿灭东阴人之心，无奈前几次围剿都以失败告终。<br/><br/>&nbsp;&nbsp;&nbsp;&nbsp;那远在交州的东阴人，仿佛有千里眼，顺风耳，每次纪国皇庭派遣军队对他们进行围剿，他们都能提前知晓，最后还能打纪国士兵个措手不及，导致每次围剿都损失惨重。', '2022-11-10 15:23:51', '2022-11-10 15:23:55');
INSERT INTO `novel_content` VALUES ('4256332', '4', '<p>哈哈哈</p>', null, null);
INSERT INTO `novel_content` VALUES ('4256333', '3', '<p>哈哈哈哈哈哈哈哈哈</p>', null, null);

-- ----------------------------
-- Table structure for user
-- ----------------------------
DROP TABLE IF EXISTS `user`;
CREATE TABLE `user` (
  `user_id` bigint NOT NULL AUTO_INCREMENT,
  `username` varchar(15) DEFAULT NULL,
  `password` varchar(30) DEFAULT NULL,
  `user_role` varchar(8) DEFAULT NULL,
  `name` varchar(20) DEFAULT NULL,
  `email` varchar(40) DEFAULT NULL,
  `state` tinyint(1) unsigned zerofill DEFAULT NULL,
  PRIMARY KEY (`user_id`),
  UNIQUE KEY `id_username` (`username`) USING BTREE
) ENGINE=InnoDB AUTO_INCREMENT=58 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

-- ----------------------------
-- Records of user
-- ----------------------------
INSERT INTO `user` VALUES ('1', '13419892283', '123321', null, 'haohaoa', '962910144@qq.com', '1');
INSERT INTO `user` VALUES ('53', 'admin', 'admin123456', null, 'admin', 'admin@admin.cn', '0');
INSERT INTO `user` VALUES ('57', 'hoho', 'admin', null, null, null, '1');

-- ----------------------------
-- Table structure for video
-- ----------------------------
DROP TABLE IF EXISTS `video`;
CREATE TABLE `video` (
  `id` int NOT NULL,
  `name` varchar(255) DEFAULT NULL,
  `movie` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

-- ----------------------------
-- Records of video
-- ----------------------------
