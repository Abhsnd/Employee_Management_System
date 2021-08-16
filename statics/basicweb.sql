DROP TABLE IF EXISTS `employee`;
SET character_set_client = utf8mb4 ;
CREATE TABLE `employee` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `name` varchar(255) NOT NULL,
  `email` varchar(255) NOT NULL,
  `gender` tinyint(4) NOT NULL,
  `deptno` bigint(20) NOT NULL,
  PRIMARY KEY (`id`)
);

DROP TABLE IF EXISTS `department`;
SET character_set_client = utf8mb4 ;
CREATE TABLE `department` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `dname` varchar(255) NOT NULL,
  PRIMARY KEY (`id`)
);

INSERT INTO `springboot_demo`.`employee` (`id`, `name`, `email`, `gender`, `deptno`)
VALUES (1001, "AA", "ABC123456@qq.com", 0, 101),
(1002, "BB", "ABC123456@qq.com", 1, 102),
(1003, "CC", "ABC123456@qq.com", 1, 105),
(1004, "DD", "ABC123456@qq.com", 0, 103),
(1005, "EE", "ABC123456@qq.com", 1, 104);

INSERT INTO `springboot_demo`.`department` (`id`, `dname`)
VALUES (101, '教学部'),
(102, '市场部'),
(103, '教研部'),
(104, '运营部'),
(105, '后勤部');