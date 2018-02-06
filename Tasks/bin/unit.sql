

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET NAMES utf8 */;
/*!50503 SET NAMES utf8mb4 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;

DROP DATABASE IF EXISTS  `mybase`;
-- Dumping database structure for mybase
CREATE DATABASE IF NOT EXISTS `mybase` /*!40100 DEFAULT CHARACTER SET utf8 */;
USE `mybase`;

-- Dumping structure for table mybase.persons
CREATE TABLE IF NOT EXISTS `persons` (
  `person_id` int(11) NOT NULL AUTO_INCREMENT,
  `person_name` varchar(50) DEFAULT NULL,
  `unit_id` int(11) DEFAULT NULL,
  PRIMARY KEY (`person_id`),
  KEY `FK_persons_units` (`unit_id`),
  CONSTRAINT `FK_persons_units` FOREIGN KEY (`unit_id`) REFERENCES `units` (`unit_id`)
) ENGINE=InnoDB AUTO_INCREMENT=10 DEFAULT CHARSET=utf8;

-- Dumping data for table mybase.persons: ~9 rows (approximately)
/*!40000 ALTER TABLE `persons` DISABLE KEYS */;
INSERT INTO `persons` (`person_id`, `person_name`, `unit_id`) VALUES
	(1, 'sveta', 1),
	(2, 'blinov', 2),
	(3, 'kulikov', 3),
	(4, 'max', 1),
	(5, 'sasha', 1),
	(6, 'eduard', 3),
	(7, 'katya', 2),
	(8, 'gleb', 3),
	(9, 'egor', 1);
/*!40000 ALTER TABLE `persons` ENABLE KEYS */;

-- Dumping structure for table mybase.units
CREATE TABLE IF NOT EXISTS `units` (
  `unit_id` int(11) NOT NULL AUTO_INCREMENT,
  `unit_name` varchar(50) DEFAULT NULL,
  `manager_id` int(11) DEFAULT NULL,
  PRIMARY KEY (`unit_id`),
  KEY `FK_units_persons` (`manager_id`),
  CONSTRAINT `FK_units_persons` FOREIGN KEY (`manager_id`) REFERENCES `persons` (`person_id`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8;

-- Dumping data for table mybase.units: ~3 rows (approximately)
/*!40000 ALTER TABLE `units` DISABLE KEYS */;
INSERT INTO `units` (`unit_id`, `unit_name`, `manager_id`) VALUES
	(1, 'dev', 1),
	(2, 'test', 2),
	(3, 'ba', 3);
/*!40000 ALTER TABLE `units` ENABLE KEYS */;

/*!40101 SET SQL_MODE=IFNULL(@OLD_SQL_MODE, '') */;
/*!40014 SET FOREIGN_KEY_CHECKS=IF(@OLD_FOREIGN_KEY_CHECKS IS NULL, 1, @OLD_FOREIGN_KEY_CHECKS) */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
SELECT mybase.units.unit_name, person_name AS manager_name,
 (select count(mybase.persons.person_id) from mybase.persons where persons.unit_id = units.unit_id) AS employee_number 
 FROM mybase.persons, mybase.units
WHERE person_id = manager_id AND units.unit_id = persons.unit_id;


SELECT u1.unit_name, p1.person_name AS manager_name, count(p2.person_name) AS employee_count FROM units u1 
JOIN persons p1 ON u1.manager_id=p1.person_id
JOIN persons p2 ON u1.unit_id=p2.unit_id
GROUP BY u1.unit_name;

SELECT u1.unit_name, p1.person_name AS manager_name, count(p2.person_name) AS employee_count FROM units u1 
JOIN persons p1 ON u1.manager_id=p1.person_id
JOIN units u2 ON p1.unit_id=u2.unit_id
JOIN persons p2 ON u2.unit_id = p2.unit_id
GROUP BY u1.unit_name;