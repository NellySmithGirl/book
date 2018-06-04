CREATE TABLE `terminal` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `terminal_mac` char(18) DEFAULT NULL COMMENT '终端唯一标识',
  `is_control` tinyint(2) DEFAULT NULL COMMENT '控制状态0 关闭  1控制  2等待',
  `socket_on` char(10) DEFAULT NULL COMMENT 'webSocet编号',
  `user_id` int(11) DEFAULT NULL COMMENT '控制终端用户',
  `create_date` datetime DEFAULT NULL ON UPDATE CURRENT_TIMESTAMP,
  `update_date` datetime DEFAULT NULL ON UPDATE CURRENT_TIMESTAMP,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='终端';