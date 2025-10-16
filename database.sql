/*
SQLyog - Free MySQL GUI v5.17
Host - 5.1.53-community-log : Database - med_diagnose
*********************************************************************
Server version : 5.1.53-community-log
*/

SET NAMES utf8;

SET SQL_MODE='';

create database if not exists `med_diagnose`;

USE `med_diagnose`;

SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0;
SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO';

/*Table structure for table `appointment_master` */

DROP TABLE IF EXISTS `appointment_master`;

CREATE TABLE `appointment_master` (
  `appointment_Id` varchar(10) NOT NULL DEFAULT '',
  `Patient_Id` varchar(10) DEFAULT NULL,
  `Disease` varchar(30) DEFAULT NULL,
  `Level` int(10) DEFAULT NULL,
  `suit_date` varchar(300) DEFAULT NULL,
  `token_no` bigint(20) DEFAULT NULL,
  `Status` varchar(30) DEFAULT NULL,
  PRIMARY KEY (`appointment_Id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `appointment_master` */

insert into `appointment_master` (`appointment_Id`,`Patient_Id`,`Disease`,`Level`,`suit_date`,`token_no`,`Status`) values ('221','3','Diabetes',3,'2018',31,'pending');
insert into `appointment_master` (`appointment_Id`,`Patient_Id`,`Disease`,`Level`,`suit_date`,`token_no`,`Status`) values ('421','3','Diabetes',4,'208',3,'pending');
insert into `appointment_master` (`appointment_Id`,`Patient_Id`,`Disease`,`Level`,`suit_date`,`token_no`,`Status`) values ('431','3','Diabetes',2,'2018',61,'pending');
insert into `appointment_master` (`appointment_Id`,`Patient_Id`,`Disease`,`Level`,`suit_date`,`token_no`,`Status`) values ('502','3','Diabetes',1,'2018',90,'pending');
insert into `appointment_master` (`appointment_Id`,`Patient_Id`,`Disease`,`Level`,`suit_date`,`token_no`,`Status`) values ('506','3','Diabetes',1,'2018',91,'pending');
insert into `appointment_master` (`appointment_Id`,`Patient_Id`,`Disease`,`Level`,`suit_date`,`token_no`,`Status`) values ('56','3','Diabetes',4,'2018',1,'processed');
insert into `appointment_master` (`appointment_Id`,`Patient_Id`,`Disease`,`Level`,`suit_date`,`token_no`,`Status`) values ('77','3','ww',4,'44',2,'processed');
insert into `appointment_master` (`appointment_Id`,`Patient_Id`,`Disease`,`Level`,`suit_date`,`token_no`,`Status`) values ('782','3','ww',3,'44',30,'pending');
insert into `appointment_master` (`appointment_Id`,`Patient_Id`,`Disease`,`Level`,`suit_date`,`token_no`,`Status`) values ('787','3','ww',2,'44',60,'pending');
insert into `appointment_master` (`appointment_Id`,`Patient_Id`,`Disease`,`Level`,`suit_date`,`token_no`,`Status`) values ('788','3','Acne',4,'12/06/2014',4,'pending');
insert into `appointment_master` (`appointment_Id`,`Patient_Id`,`Disease`,`Level`,`suit_date`,`token_no`,`Status`) values ('789','3','Acne',4,'12/06/2014',5,'pending');
insert into `appointment_master` (`appointment_Id`,`Patient_Id`,`Disease`,`Level`,`suit_date`,`token_no`,`Status`) values ('790','5','Alzheimer',4,'20/06/2014',6,'pending');

/*Table structure for table `disease_master` */

DROP TABLE IF EXISTS `disease_master`;

CREATE TABLE `disease_master` (
  `Disease_Id` varchar(10) NOT NULL,
  `Disease_Name` varchar(50) DEFAULT NULL,
  `Disease_known_Name` varchar(30) DEFAULT NULL,
  `Description` varchar(500) DEFAULT NULL,
  `Lower_age_Limit` varchar(10) DEFAULT NULL,
  `Upper_age_Limit` varchar(10) DEFAULT NULL,
  `Symptoms` varchar(500) DEFAULT NULL,
  `Test_Recommended` varchar(500) DEFAULT NULL,
  PRIMARY KEY (`Disease_Id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `disease_master` */

insert into `disease_master` (`Disease_Id`,`Disease_Name`,`Disease_known_Name`,`Description`,`Lower_age_Limit`,`Upper_age_Limit`,`Symptoms`,`Test_Recommended`) values ('1','Acne','Acne','Acne is a common skin condition. It is caused by inflammation of the hair follicles and oil-producing (sebaceous) glands of the skin.','10','30','Blackheads and whiteheads (comedones),Pimples (pustules), Nodules and cysts ','Acne can be treated with:\r\nSalicylic acid washes, Benzoyl peroxide gels,  Tretinoin (Retin-A) ');
insert into `disease_master` (`Disease_Id`,`Disease_Name`,`Disease_known_Name`,`Description`,`Lower_age_Limit`,`Upper_age_Limit`,`Symptoms`,`Test_Recommended`) values ('10','Type 2 Diabetes','Type 2 Diabetes','Type 2 diabetes is a lifelong (chronic) disease in which there is a high level of sugar (glucose) in the blood. Type 2 diabetes is the most common form of diabetes.','40','80','Bladder, kidney, skin, or other infections that are more frequent or heal slowly ,Fatigue , Hunger , Increased thirst \r\n','Have your blood pressure checked at least every year (blood pressure goals should be 140/80 mm/Hg or lower). , Have your A1C test (hemoglobin A1C) every 6 months if your diabetes is well controlled; otherwise every 3 months, Have your cholesterol and triglyceride levels checked yearly (aim for LDL levels below 70-100 mg/dL).\r\n');
insert into `disease_master` (`Disease_Id`,`Disease_Name`,`Disease_known_Name`,`Description`,`Lower_age_Limit`,`Upper_age_Limit`,`Symptoms`,`Test_Recommended`) values ('11','Heart Disease','Heart Disease','Heart disease is any disorder that affects the heart\'s ability to function normally.','8','70','Shortness of breath, especially during exertion,Fatigue,Difficulty breathing while lying down,Leg swelling,Palpitations,Chest pain \r\n \r\n','Medications that prolong life in people with dilated cardiomyopathy');
insert into `disease_master` (`Disease_Id`,`Disease_Name`,`Disease_known_Name`,`Description`,`Lower_age_Limit`,`Upper_age_Limit`,`Symptoms`,`Test_Recommended`) values ('12','Migraine','Migraine','A migraine is a common type of headache that may occur with symptoms such as nausea, vomiting, or sensitivity to light. In many people, a throbbing pain is felt only on one side of the head.','30','60','A temporary blind spot , Blurred vision , Eye pain , Seeing stars or zigzag lines ,Tunnel vision \r\n','An EEG may be needed to rule out seizures. A lumbar puncture (spinal tap) might be done.');
insert into `disease_master` (`Disease_Id`,`Disease_Name`,`Disease_known_Name`,`Description`,`Lower_age_Limit`,`Upper_age_Limit`,`Symptoms`,`Test_Recommended`) values ('2','Gystro Problem','Gystro','Gas trouble','10','90','stomach ache','Eno  , Aldectone');
insert into `disease_master` (`Disease_Id`,`Disease_Name`,`Disease_known_Name`,`Description`,`Lower_age_Limit`,`Upper_age_Limit`,`Symptoms`,`Test_Recommended`) values ('3','Attention deficit hyperactivity disorder','ADHD','Attention deficit hyperactivity disorder (ADHD) is a problem of not being able to focus, being overactive, not being able control behavior, or a combination of these.','4','35','Not being able to focus (inattentiveness) , Being extremely active (hyperactivity) , Not being able to control behavior (impulsivity) \r\n','Start medicine and/or talk therapy, \r\nFollow-up regularly with the doctor to check on goals, results, and any side effects of medicines. ');
insert into `disease_master` (`Disease_Id`,`Disease_Name`,`Disease_known_Name`,`Description`,`Lower_age_Limit`,`Upper_age_Limit`,`Symptoms`,`Test_Recommended`) values ('4','AIDS','HIV/AIDS','The human immunodeficiency virus (HIV) weakens the body\'s immune defenses by destroying CD4 (T-cell) lymphocytes','20','60','fever, sore throat, rash, nausea and vomiting, diarrhea, fatigue, swollen lymph nodes, muscle aches, headaches, and joint pain','doctor will choose a combination of drugs called antiretrovirals to fight your HIV infection');
insert into `disease_master` (`Disease_Id`,`Disease_Name`,`Disease_known_Name`,`Description`,`Lower_age_Limit`,`Upper_age_Limit`,`Symptoms`,`Test_Recommended`) values ('5','Allergy','Allergy','Allergies are an immune system reaction to a substance called an allergen. Your immune system sees the allergen as harmful and attacks it.','2','80','Severe itching, hives, or rash,Rapid heartbeat and breathing,\r\nWheezing,Nausea, vomiting, or diarrhea,Dizziness or fainting.\r\n','You may be given medicine to put directly on your skin to help decrease itching or swelling. Cold cloths or ice may also help your skin feel better. You also may be given nasal sprays or eye drops.');
insert into `disease_master` (`Disease_Id`,`Disease_Name`,`Disease_known_Name`,`Description`,`Lower_age_Limit`,`Upper_age_Limit`,`Symptoms`,`Test_Recommended`) values ('6','Alzheimer','Alzheimer','Alzheimer\'s disease (AD) is a loss of brain functions that worsens over time. It is a form of dementia.','10','89','Older or more distant memories are gradually lost','A class of drugs called cholinesterase inhibitors helps to restore communication between brain cells. These drugs may slow intellectual decline in some people with mild to moderate AD. They work by increasing the brain\'s levels of acetylcholine.');
insert into `disease_master` (`Disease_Id`,`Disease_Name`,`Disease_known_Name`,`Description`,`Lower_age_Limit`,`Upper_age_Limit`,`Symptoms`,`Test_Recommended`) values ('7','Anxiety','Anxiety','Stress can come from any event or thought that makes you feel frustrated, angry, or nervous.\r\nAnxiety is a feeling of fear, unease, and worry.','20','50','Loose stools , Frequent need to pee , Dry mouth , Problems swallowing \r\n','Eat a well-balanced, healthy diet as well as getting enough sleep and exercise, Also, limit caffeine and alcohol intake and don\'t use nicotine, cocaine, or other street drugs.');
insert into `disease_master` (`Disease_Id`,`Disease_Name`,`Disease_known_Name`,`Description`,`Lower_age_Limit`,`Upper_age_Limit`,`Symptoms`,`Test_Recommended`) values ('8','Cholesterol','Cholesterol','Cholesterol is a fatty substance that occurs naturally in the body. It performs several vital functions.','10','80','Heart-related chest pain (angina) or other symptoms of coronary artery disease, as well as symptoms of decreased blood supply to the brain (transient ischemic attacks or stroke). ','Avoid All trans Fats,cholesterol-lowering medications');
insert into `disease_master` (`Disease_Id`,`Disease_Name`,`Disease_known_Name`,`Description`,`Lower_age_Limit`,`Upper_age_Limit`,`Symptoms`,`Test_Recommended`) values ('9','Type 1 Diabetes','Type 1 Diabetes','Type 1 diabetes is a lifelong (chronic) disease in which there is a high level of sugar (glucose) in the blood.','5','80','Being very thirsty , Feeling hungry ,Feeling tired all the time ,Having blurry eyesight , Feeling numbness or feeling tingling in your feet , Losing weight without trying \r\n','Insulin,Diet And Exercise.');

/*Table structure for table `doctor_master` */

DROP TABLE IF EXISTS `doctor_master`;

CREATE TABLE `doctor_master` (
  `Doctor_Id` varchar(10) NOT NULL,
  `Doctor_Name` varchar(50) DEFAULT NULL,
  `Spacialization` varchar(30) DEFAULT NULL,
  `Department_Id` varchar(10) DEFAULT NULL,
  `Doctor_Address` varchar(200) DEFAULT NULL,
  `Doctor_contact_no` varchar(15) DEFAULT NULL,
  `Doctor_Email_Id` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`Doctor_Id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `doctor_master` */

insert into `doctor_master` (`Doctor_Id`,`Doctor_Name`,`Spacialization`,`Department_Id`,`Doctor_Address`,`Doctor_contact_no`,`Doctor_Email_Id`) values ('12','Pushpinder Sokhal','Laboratory and Blood Bank Work','8','#7/8 Civil Colony Ludhiana, Punjab, India','9856458945','pushpinder.sokhal@yahoo.com');
insert into `doctor_master` (`Doctor_Id`,`Doctor_Name`,`Spacialization`,`Department_Id`,`Doctor_Address`,`Doctor_contact_no`,`Doctor_Email_Id`) values ('13','Nishant Khosla','Emergency Services','7','#87/6 adalat Bajar, Patiala, Punjab , India','7895784214','nishu@gmail.com');
insert into `doctor_master` (`Doctor_Id`,`Doctor_Name`,`Spacialization`,`Department_Id`,`Doctor_Address`,`Doctor_contact_no`,`Doctor_Email_Id`) values ('14','Ashok Kumar','Dentist','5','#4/8 garden enclave Morinda, Punjab, India','5487898745','ashok@gmail.com');
insert into `doctor_master` (`Doctor_Id`,`Doctor_Name`,`Spacialization`,`Department_Id`,`Doctor_Address`,`Doctor_contact_no`,`Doctor_Email_Id`) values ('15','Manjeet Kaur','Anesthisia Specialist','6','#123/7 Main Market Morinda,Punjab,India','7695841245','mkaur@gmail.com');
insert into `doctor_master` (`Doctor_Id`,`Doctor_Name`,`Spacialization`,`Department_Id`,`Doctor_Address`,`Doctor_contact_no`,`Doctor_Email_Id`) values ('16','Neelam','gynocologist','3','#54/7 Barnala Punjab,India','7412584578','n@gmail.com');
insert into `doctor_master` (`Doctor_Id`,`Doctor_Name`,`Spacialization`,`Department_Id`,`Doctor_Address`,`Doctor_contact_no`,`Doctor_Email_Id`) values ('2','Prinky Dhiman','Diabetic Diseases','1','#42/7 andheri east , Mumbai, Maharashtra, India','9856245781','prinky12@gmail.com');
insert into `doctor_master` (`Doctor_Id`,`Doctor_Name`,`Spacialization`,`Department_Id`,`Doctor_Address`,`Doctor_contact_no`,`Doctor_Email_Id`) values ('4','Nidhi Jain','Brain and Neurology Surgeon','2','#223 sec-45 Morinda,\r\nPunjab, India','7869547845','nidhi1092@gmail.com');
insert into `doctor_master` (`Doctor_Id`,`Doctor_Name`,`Spacialization`,`Department_Id`,`Doctor_Address`,`Doctor_contact_no`,`Doctor_Email_Id`) values ('6','Ramandeep Kaur','X-Ray','9','#55 sec-7 Gobindgarh, Punjab, India','7894585412','raman@gmail.com');

/*Table structure for table `login` */

DROP TABLE IF EXISTS `login`;

CREATE TABLE `login` (
  `u_id` int(30) NOT NULL AUTO_INCREMENT,
  `username` varchar(30) DEFAULT NULL,
  `password` varchar(30) DEFAULT NULL,
  `type` varchar(30) DEFAULT NULL,
  `fullname` varchar(30) DEFAULT NULL,
  `dob` varchar(30) DEFAULT NULL,
  `email` varchar(50) DEFAULT NULL,
  `s_ques` varchar(50) DEFAULT NULL,
  `s_ans` varchar(30) DEFAULT NULL,
  `address` varchar(50) DEFAULT NULL,
  `country` varchar(30) DEFAULT NULL,
  `city` varchar(30) DEFAULT NULL,
  `state` varchar(30) DEFAULT NULL,
  PRIMARY KEY (`u_id`)
) ENGINE=InnoDB AUTO_INCREMENT=19 DEFAULT CHARSET=latin1;

/*Data for the table `login` */

insert into `login` (`u_id`,`username`,`password`,`type`,`fullname`,`dob`,`email`,`s_ques`,`s_ans`,`address`,`country`,`city`,`state`) values (1,'admin','admin','admin','administrator','12-12-89','admin@gmail.com','Which is your favourite color?','blue','# 125 sec 45 chd','India','Patiala','Punjab');
insert into `login` (`u_id`,`username`,`password`,`type`,`fullname`,`dob`,`email`,`s_ques`,`s_ans`,`address`,`country`,`city`,`state`) values (2,'doctor','doctor','doctor','Prinky','09-09-89','pinku12@gmail.com','Which is your favourite color?','red','#42/7 andheri east','India','Mumbai','Maharashtra');
insert into `login` (`u_id`,`username`,`password`,`type`,`fullname`,`dob`,`email`,`s_ques`,`s_ans`,`address`,`country`,`city`,`state`) values (3,'patient','pat','patient','Richa','01 July, 2013','dupinder.pahwa@gmail.com','What is your favourite color','blue','# 123 sec 33','India','Delhi','Delhi');
insert into `login` (`u_id`,`username`,`password`,`type`,`fullname`,`dob`,`email`,`s_ques`,`s_ans`,`address`,`country`,`city`,`state`) values (4,'nidhi','ankur','doctor','Nidhi Jain','10 October, 1992','nidhi1092@gmail.com','What is your nick name','nidhz','#223 sec-45','India','Morinda','punjab');
insert into `login` (`u_id`,`username`,`password`,`type`,`fullname`,`dob`,`email`,`s_ques`,`s_ans`,`address`,`country`,`city`,`state`) values (5,'richa','richa','patient','Arpita sharma','01-02-1998','arpita12@gmail.com','Which is your favourite color?','red','65 model town','Uk','London','London');
insert into `login` (`u_id`,`username`,`password`,`type`,`fullname`,`dob`,`email`,`s_ques`,`s_ans`,`address`,`country`,`city`,`state`) values (6,'raman','raman','doctor','ramandeep kaur','10 feb 1993','raman@gmail.com','What is your lucky number','7','#55 sec-7 ','india','gobindgarh','punjab');
insert into `login` (`u_id`,`username`,`password`,`type`,`fullname`,`dob`,`email`,`s_ques`,`s_ans`,`address`,`country`,`city`,`state`) values (7,'ankur','ankur','patient','ankur','01-09-1989','ak@yhoo.com','What is your favourite color','black','#45/3 Main Market','india','Amloh','punjab');
insert into `login` (`u_id`,`username`,`password`,`type`,`fullname`,`dob`,`email`,`s_ques`,`s_ans`,`address`,`country`,`city`,`state`) values (8,'gagan','gagan','patient','gagandeep kaur','1-4-1889','a@gmail.com','What is your nick name','g','#200 sec 8 ','india','rohtak','haryana');
insert into `login` (`u_id`,`username`,`password`,`type`,`fullname`,`dob`,`email`,`s_ques`,`s_ans`,`address`,`country`,`city`,`state`) values (9,'hunny','hunny','patient','himanshu','01-4-1889','h@gmail.com','What is your favourite color','blue','#80 Mota singh Nagar','India','Patiala','Punjab');
insert into `login` (`u_id`,`username`,`password`,`type`,`fullname`,`dob`,`email`,`s_ques`,`s_ans`,`address`,`country`,`city`,`state`) values (10,'taran','taran','patient','taran','01-01-1999','a@gmail.com','What is your favourite color','black','gg','india','sarhand','punjab');
insert into `login` (`u_id`,`username`,`password`,`type`,`fullname`,`dob`,`email`,`s_ques`,`s_ans`,`address`,`country`,`city`,`state`) values (11,'avneet','avneet','patient','Avneet Sahni','31-12-1990','avneet@yahoo.com','What is your lucky number','blue','hig 334','india','ldh','punjab');
insert into `login` (`u_id`,`username`,`password`,`type`,`fullname`,`dob`,`email`,`s_ques`,`s_ans`,`address`,`country`,`city`,`state`) values (12,'pushi','pushi','doctor','pushpinder','28-11-1991','pushpinder.sokhal@yahoo.com','What is your favourite color','black','#7/8 Civil Colony ','india','ldh','punjab');
insert into `login` (`u_id`,`username`,`password`,`type`,`fullname`,`dob`,`email`,`s_ques`,`s_ans`,`address`,`country`,`city`,`state`) values (13,'nishant','nishant','doctor','Nishant khosla','01-01-1992','nishu@gmail.com','What is your favourite color','white','#87/6 adalat Bajar','india','patiala','punjab');
insert into `login` (`u_id`,`username`,`password`,`type`,`fullname`,`dob`,`email`,`s_ques`,`s_ans`,`address`,`country`,`city`,`state`) values (14,'ashok','ashok','doctor','ashok kumar','01-01-1954','askok@gmail.com','What is your favourite color','blue','#6/8 Garden Enclave','india','morinda','punjab');
insert into `login` (`u_id`,`username`,`password`,`type`,`fullname`,`dob`,`email`,`s_ques`,`s_ans`,`address`,`country`,`city`,`state`) values (15,'manjeet','456','doctor','manjeet kaur','01-01-1954','mkaur@gmail.com','What is your favourite color','blue','#123/7 Main Market','india','morinda','punjab');
insert into `login` (`u_id`,`username`,`password`,`type`,`fullname`,`dob`,`email`,`s_ques`,`s_ans`,`address`,`country`,`city`,`state`) values (16,'neelam','neelam','doctor','Neelam','11-10-1964','n@gmail.com','What is your favourite color','red','#54/7','india','Barnala','punjab');
insert into `login` (`u_id`,`username`,`password`,`type`,`fullname`,`dob`,`email`,`s_ques`,`s_ans`,`address`,`country`,`city`,`state`) values (18,'harsh','harsh','patient','Harsh Singla','10/10/1993','harsh@gmail.com','What is your favourite color','red','#47/5','India','Ambala','Haryana');

/*Table structure for table `patient_master` */

DROP TABLE IF EXISTS `patient_master`;

CREATE TABLE `patient_master` (
  `Patient_Id` varchar(10) NOT NULL,
  `Patient_Name` varchar(50) DEFAULT NULL,
  `Patient_Age` varchar(30) DEFAULT NULL,
  `Patient_Sex` varchar(10) DEFAULT NULL,
  `Patient_Address` varchar(200) DEFAULT NULL,
  `Patient_Country` varchar(30) DEFAULT NULL,
  `Patient_City` varchar(30) DEFAULT NULL,
  `Patient_State` varchar(30) DEFAULT NULL,
  `Patient_contact_no` char(15) DEFAULT NULL,
  `Patient_Registration_Date` varchar(30) DEFAULT NULL,
  `Patient_Email_Id` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`Patient_Id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `patient_master` */

insert into `patient_master` (`Patient_Id`,`Patient_Name`,`Patient_Age`,`Patient_Sex`,`Patient_Address`,`Patient_Country`,`Patient_City`,`Patient_State`,`Patient_contact_no`,`Patient_Registration_Date`,`Patient_Email_Id`) values ('18','Harish','20','Male','#47/5','India','Ambala','Haryana','9874585412','14/8/2014','harish@gmail.com');
insert into `patient_master` (`Patient_Id`,`Patient_Name`,`Patient_Age`,`Patient_Sex`,`Patient_Address`,`Patient_Country`,`Patient_City`,`Patient_State`,`Patient_contact_no`,`Patient_Registration_Date`,`Patient_Email_Id`) values ('3','Richa','11','Female','#123 sec 33 ','India','Delhi','Delhi','8956485789','01/05/2014','dupinder.phawa@gmail.com');
insert into `patient_master` (`Patient_Id`,`Patient_Name`,`Patient_Age`,`Patient_Sex`,`Patient_Address`,`Patient_Country`,`Patient_City`,`Patient_State`,`Patient_contact_no`,`Patient_Registration_Date`,`Patient_Email_Id`) values ('5','Arpita Sharma','16','Female','65 Model Town','UK','London','London','8745892564','02/04/2014','arpita12@gmail.com');
insert into `patient_master` (`Patient_Id`,`Patient_Name`,`Patient_Age`,`Patient_Sex`,`Patient_Address`,`Patient_Country`,`Patient_City`,`Patient_State`,`Patient_contact_no`,`Patient_Registration_Date`,`Patient_Email_Id`) values ('7','Ankur Jain','24','Male','#45/3 Main Market','India','Amloh','Punjab','9547821547','05/07/2012','ak@yahoo.com');
insert into `patient_master` (`Patient_Id`,`Patient_Name`,`Patient_Age`,`Patient_Sex`,`Patient_Address`,`Patient_Country`,`Patient_City`,`Patient_State`,`Patient_contact_no`,`Patient_Registration_Date`,`Patient_Email_Id`) values ('8','Gagandeep Kaur','24','Female','#200 sec 8','India','Rohtak','Haryana','7121564252','12/08/2013','h@gmail.com');
insert into `patient_master` (`Patient_Id`,`Patient_Name`,`Patient_Age`,`Patient_Sex`,`Patient_Address`,`Patient_Country`,`Patient_City`,`Patient_State`,`Patient_contact_no`,`Patient_Registration_Date`,`Patient_Email_Id`) values ('9','Himanshu Gumbar','24','Male','#80 Mota singh nagar','India','Patiala','Punjab','7854545689','30/12/2013','h@gmail.com');

/*Table structure for table `patient_medicine_disease` */

DROP TABLE IF EXISTS `patient_medicine_disease`;

CREATE TABLE `patient_medicine_disease` (
  `Patient_Id` varchar(10) DEFAULT NULL,
  `Disease` varchar(15) DEFAULT NULL,
  `Medicine` varchar(50) DEFAULT NULL,
  `emergency_level` varchar(25) DEFAULT NULL,
  `suit_date` varchar(25) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `patient_medicine_disease` */

insert into `patient_medicine_disease` (`Patient_Id`,`Disease`,`Medicine`,`emergency_level`,`suit_date`) values ('5','Alzheimer','Hydergine','Prinky Dhiman','20/06/2020');
insert into `patient_medicine_disease` (`Patient_Id`,`Disease`,`Medicine`,`emergency_level`,`suit_date`) values ('7','Migrain','Maxalt','Ramandeep Kaur','21/06/2020');
insert into `patient_medicine_disease` (`Patient_Id`,`Disease`,`Medicine`,`emergency_level`,`suit_date`) values ('8','Allergy','Ru-Hist D','Neelam','08/07/2020');
insert into `patient_medicine_disease` (`Patient_Id`,`Disease`,`Medicine`,`emergency_level`,`suit_date`) values ('9','Anxiety','Atarax ','Nishant Khosla','15/06/2020');
insert into `patient_medicine_disease` (`Patient_Id`,`Disease`,`Medicine`,`emergency_level`,`suit_date`) values ('18','Malaria','acutane','Nidhi Jain','16/06/2020');

SET SQL_MODE=@OLD_SQL_MODE;
SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS;
