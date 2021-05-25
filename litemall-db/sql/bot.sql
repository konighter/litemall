# ************************************************************
# Sequel Pro SQL dump
# Version 4541
#
# http://www.sequelpro.com/
# https://github.com/sequelpro/sequelpro
#
# Host: 127.0.0.1 (MySQL 5.7.30)
# Database: report_db
# Generation Time: 2021-05-12 09:01:11 +0000
# ************************************************************


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;


# Dump of table bot_customer_detail
# ------------------------------------------------------------

DROP TABLE IF EXISTS `bot_customer_detail`;

CREATE TABLE `bot_customer_detail` (
  `id` int(11) unsigned NOT NULL AUTO_INCREMENT,
  `bind_id` varchar(512) DEFAULT NULL,
  `bot_type` int(11) NOT NULL COMMENT 'wx-0,dd-2,lark-3,wa-4',
  `name` varchar(128) NOT NULL DEFAULT '',
  `contact_id` varchar(128) DEFAULT NULL,
  `contact_type` int(11) DEFAULT NULL COMMENT '1-user; 2-group',
  `contack_org_type` int(11) DEFAULT NULL COMMENT '1-个人; 2- 组织',
  `nick_name` varchar(128) DEFAULT NULL,
  `tel_num` varchar(128) DEFAULT '',
  `contack_ext` varchar(512) DEFAULT NULL COMMENT '标签/年龄/备注等信息',
  `sync_time` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '信息同步时间',
  `create_time` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `update_time` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;



# Dump of table bot_detail
# ------------------------------------------------------------

DROP TABLE IF EXISTS `bot_detail`;

CREATE TABLE `bot_detail` (
  `id` int(11) unsigned NOT NULL AUTO_INCREMENT,
  `staff_id` bigint(11) NOT NULL,
  `customer_id` bigint(11) NOT NULL,
  `bot_token` varchar(128) NOT NULL DEFAULT '',
  `bot_type` int(11) NOT NULL COMMENT 'wx-0,dd-2,lark-3,wa-4',
  `bind_id` varchar(512) NOT NULL DEFAULT '',
  `online_conf` int(11) NOT NULL DEFAULT '0' COMMENT 'defaualt-0, always-1',
  `tiket_id` int(11) DEFAULT NULL COMMENT 'online状态下必填',
  `status` int(11) NOT NULL COMMENT 'uk-0,active-1,ina-2,del-3',
  `create_time` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `update_time` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;



# Dump of table bot_task
# ------------------------------------------------------------

DROP TABLE IF EXISTS `bot_task`;

CREATE TABLE `bot_task` (
  `id` int(11) unsigned NOT NULL AUTO_INCREMENT,
  `bind_id` bigint(11) DEFAULT NULL,
  `bot_type` int(11) DEFAULT NULL,
  `task_type` int(11) DEFAULT NULL COMMENT '1-批量消息;2-批量群消息; 3-批量进群; 4-批量加好友',
  `conf` text,
  `run_status` int(11) DEFAULT NULL COMMENT '运行状态',
  `processing` int(11) DEFAULT NULL COMMENT '进度',
  `procession_time` bigint(20) DEFAULT NULL COMMENT '进度时间',
  `schedule_type` int(11) DEFAULT NULL,
  `schedule_conf` text,
  `status` int(11) DEFAULT NULL COMMENT '状态时间',
  `create_time` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `update_time` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;



# Dump of table bot_ticket
# ------------------------------------------------------------

DROP TABLE IF EXISTS `bot_ticket`;

CREATE TABLE `bot_ticket` (
  `id` int(11) unsigned NOT NULL AUTO_INCREMENT,
  `charge_token` varchar(128) NOT NULL DEFAULT '',
  `exp_time` date NOT NULL,
  `bind_status` int(11) NOT NULL DEFAULT '0' COMMENT '绑定状态, 0-未绑定;1-以绑定',
  `status` int(11) DEFAULT NULL COMMENT 'active-1,del-2',
  `create_time` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `update_time` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;



# Dump of table bot_ticket_charge_history
# ------------------------------------------------------------

DROP TABLE IF EXISTS `bot_ticket_charge_history`;

CREATE TABLE `bot_ticket_charge_history` (
  `id` bigint(11) unsigned NOT NULL AUTO_INCREMENT,
  `ticket_id` bigint(11) NOT NULL,
  `recharge` int(11) NOT NULL COMMENT '续费金额',
  `duration` varchar(11) NOT NULL DEFAULT '' COMMENT '续期时间, dura +<空格>+ <日期单位>',
  `fisrt_purchase` int(11) NOT NULL DEFAULT '0' COMMENT '是否首次购买, 0-否, 1-是',
  `merchant_order` int(11) DEFAULT '0' COMMENT '商家订单号',
  `pay_status` int(11) NOT NULL COMMENT '0-未支付; 1-已支付; 9-支付超时',
  `status_time` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
  `pay_order_id` varchar(512) DEFAULT '0' COMMENT '支付订单号',
  `update_time` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
  `create_time` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;



# Dump of table customer_info
# ------------------------------------------------------------

DROP TABLE IF EXISTS `customer_info`;

CREATE TABLE `customer_info` (
  `id` int(11) unsigned NOT NULL AUTO_INCREMENT,
  `company_name` varchar(11) DEFAULT NULL,
  `contact` varchar(20) DEFAULT NULL,
  `contact_tel` varchar(32) DEFAULT NULL,
  `contact_phone` int(11) DEFAULT NULL,
  `email` varchar(64) DEFAULT NULL,
  `address` varchar(128) DEFAULT NULL,
  `create_time` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `update_time` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;



# Dump of table staff_info
# ------------------------------------------------------------

DROP TABLE IF EXISTS `staff_info`;

CREATE TABLE `staff_info` (
  `id` int(11) unsigned NOT NULL AUTO_INCREMENT,
  `staff_name` varchar(128) NOT NULL DEFAULT '',
  `avatar` varchar(512) NOT NULL DEFAULT '',
  `customer_id` bigint(11) NOT NULL,
  `tel_num` varchar(64) NOT NULL DEFAULT '',
  `email` varchar(64) DEFAULT NULL,
  `update_time` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
  `create_time` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;




/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;
/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
