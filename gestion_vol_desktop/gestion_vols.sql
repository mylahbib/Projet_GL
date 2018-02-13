-- phpMyAdmin SQL Dump
-- version 4.1.14
-- http://www.phpmyadmin.net
--
-- Client :  127.0.0.1
-- Généré le :  Mar 13 Février 2018 à 19:45
-- Version du serveur :  5.6.17
-- Version de PHP :  5.5.12

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;

--
-- Base de données :  `gestion_vols`
--

-- --------------------------------------------------------

--
-- Structure de la table `admin`
--

CREATE TABLE IF NOT EXISTS `admin` (
  `id` int(10) NOT NULL AUTO_INCREMENT,
  `login` varchar(10) NOT NULL,
  `password` varchar(10) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=2 ;

--
-- Contenu de la table `admin`
--

INSERT INTO `admin` (`id`, `login`, `password`) VALUES
(1, 'admin', 'admin');

-- --------------------------------------------------------

--
-- Structure de la table `aeroport`
--

CREATE TABLE IF NOT EXISTS `aeroport` (
  `id` int(10) NOT NULL AUTO_INCREMENT,
  `nom_aeroport` varchar(10) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=6 ;

--
-- Contenu de la table `aeroport`
--

INSERT INTO `aeroport` (`id`, `nom_aeroport`) VALUES
(1, 'Med5'),
(2, 'rabatAero'),
(3, 'aerofes'),
(4, 'AeroParis'),
(5, 'aeroAgadir');

-- --------------------------------------------------------

--
-- Structure de la table `client`
--

CREATE TABLE IF NOT EXISTS `client` (
  `cin` varchar(10) NOT NULL,
  `nom` varchar(10) NOT NULL,
  `prenom` varchar(10) NOT NULL,
  `tel` int(10) NOT NULL,
  PRIMARY KEY (`cin`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Contenu de la table `client`
--

INSERT INTO `client` (`cin`, `nom`, `prenom`, `tel`) VALUES
('bf54578787', 'ismail', 'bourhlimi', 686949497),
('bfd1455', 'aa', 'bg', 457757),
('bj440791', 'ayoub', 'boublil', 5989656),
('jk56565', 'yassir', 'alami', 658787512);

-- --------------------------------------------------------

--
-- Structure de la table `passager`
--

CREATE TABLE IF NOT EXISTS `passager` (
  `id` int(10) NOT NULL AUTO_INCREMENT,
  `nom` varchar(10) NOT NULL,
  `prenom` varchar(10) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=5 ;

--
-- Contenu de la table `passager`
--

INSERT INTO `passager` (`id`, `nom`, `prenom`) VALUES
(1, 'ayoub', 'boublil'),
(2, 'ismail', 'bourhlimi'),
(3, 'med', 'boublil'),
(4, 'med', 'med');

-- --------------------------------------------------------

--
-- Structure de la table `reservations`
--

CREATE TABLE IF NOT EXISTS `reservations` (
  `Id_res` int(10) NOT NULL AUTO_INCREMENT,
  `aeroport_depart` varchar(10) NOT NULL,
  `aeroport_arrive` varchar(10) NOT NULL,
  `date_depart` date NOT NULL,
  `date_arrive` date NOT NULL,
  `heure_depart` varchar(10) NOT NULL,
  `heure_arrive` varchar(10) NOT NULL,
  `nbr_place` int(10) NOT NULL,
  `cin` varchar(10) NOT NULL,
  PRIMARY KEY (`Id_res`),
  KEY `cin` (`cin`)
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=2 ;

--
-- Contenu de la table `reservations`
--

INSERT INTO `reservations` (`Id_res`, `aeroport_depart`, `aeroport_arrive`, `date_depart`, `date_arrive`, `heure_depart`, `heure_arrive`, `nbr_place`, `cin`) VALUES
(1, 'Med5', 'aerofes', '2018-02-04', '2018-02-17', '18:00', '18:30', 1, 'bj440791');

-- --------------------------------------------------------

--
-- Structure de la table `ville`
--

CREATE TABLE IF NOT EXISTS `ville` (
  `id` int(10) NOT NULL AUTO_INCREMENT,
  `nom_ville` varchar(10) NOT NULL,
  `code_postal` varchar(10) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=5 ;

--
-- Contenu de la table `ville`
--

INSERT INTO `ville` (`id`, `nom_ville`, `code_postal`) VALUES
(1, 'Casa', '27500'),
(2, 'Rabat', '60000'),
(3, 'fes', '100000'),
(4, 'agadir', '900000');

--
-- Contraintes pour les tables exportées
--

--
-- Contraintes pour la table `reservations`
--
ALTER TABLE `reservations`
  ADD CONSTRAINT `reservations_ibfk_1` FOREIGN KEY (`cin`) REFERENCES `client` (`cin`);

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
