# 角色表
DROP TABLE IF EXISTS `test`;
CREATE TABLE `test` (
  `id` int unsigned NOT NULL AUTO_INCREMENT comment '角色id',
  `description` varchar(64) not null DEFAULT '' comment '对于该角色的描述',
  `name` varchar(64) not null unique comment '角色名',
  PRIMARY KEY (`id`)
) ENGINE = InnoDB CHARSET = utf8mb4;