/* setting up DB */ 
DROP DATABASE cocon;
CREATE DATABASE cocon;
USE cocon;

/* table users */
CREATE TABLE `users`(
`user_id` INT NOT NULL AUTO_INCREMENT PRIMARY KEY,
`login` VARCHAR(100) NOT NULL UNIQUE,
`password` VARCHAR(100) NOT NULL
);

/* table client */
CREATE TABLE `client`(
`client_id` INT NOT NULL AUTO_INCREMENT PRIMARY KEY,
`nom` VARCHAR(100) NOT NULL,
`prenom` VARCHAR(100) NOT NULL,
`telephone` INT
);

/* table promo */
CREATE TABLE `promo`(
`promo_id` INT NOT NULL AUTO_INCREMENT PRIMARY KEY,
`type_promo` VARCHAR(20),
`montant_promo` DECIMAL(10,2)
);

/* table prestation */
CREATE TABLE `prestation`(
`prestation_id` INT NOT NULL AUTO_INCREMENT PRIMARY KEY,
`categorie` VARCHAR(100) NOT NULL,
`prestation` VARCHAR(100) NOT NULL,
`client_id` INT NOT NULL,
`date_prestation` DATE NOT NULL,
`tarif_prestation` DECIMAL(10,2) NOT NULL,
`promo_id` INT NOT NULL,
`type_paiement` VARCHAR(20) NOT NULL,
FOREIGN KEY (`client_id`) REFERENCES `client`(`client_id`),
FOREIGN KEY (`promo_id`) REFERENCES `promo`(`promo_id`)
);

/* table vente */
CREATE TABLE `vente`(
`vente_id` INT NOT NULL AUTO_INCREMENT PRIMARY KEY,
`categorie` VARCHAR(100) NOT NULL,
`nom_produit` VARCHAR(100) NOT NULL,
`client_id` INT NOT NULL,
`date_vente` DATE NOT NULL,
`tarif_vente` DECIMAL(10,2) NOT NULL,
`promo_id` INT NOT NULL,
`type_paiement` VARCHAR(20) NOT NULL,
FOREIGN KEY (`client_id`) REFERENCES `client`(`client_id`),
FOREIGN KEY (`promo_id`) REFERENCES `promo`(`promo_id`)
);

/* table achat */
CREATE TABLE `achat`(
`achat_id` INT NOT NULL AUTO_INCREMENT PRIMARY KEY,
`categorie` VARCHAR(100) NOT NULL,
`fournisseur` VARCHAR(100) NOT NULL,
`description` VARCHAR(250),
`date_achat` DATE NOT NULL,
`prix_achat` DECIMAL(10,2)
);


