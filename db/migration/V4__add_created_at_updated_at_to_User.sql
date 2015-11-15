ALTER TABLE `phm`.`User`
ADD COLUMN `created_at` DATETIME NOT NULL AFTER `hire_date`,
ADD COLUMN `updated_at` DATETIME NOT NULL AFTER `created_at`;