-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 21-07-2024 a las 23:55:35
-- Versión del servidor: 10.4.28-MariaDB
-- Versión de PHP: 8.2.12

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de datos: `historiaclinica2`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `login`
--

CREATE TABLE `login` (
  `idusuario` int(8) UNSIGNED ZEROFILL NOT NULL DEFAULT 00000000,
  `logintime` datetime NOT NULL,
  `action` enum('INGRESO','SALIDA') NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `login`
--

INSERT INTO `login` (`idusuario`, `logintime`, `action`) VALUES
(00000001, '2024-07-20 19:41:40', 'INGRESO'),
(00000001, '2024-07-20 19:42:11', 'INGRESO'),
(00000001, '2024-07-20 19:42:46', 'INGRESO'),
(00000001, '2024-07-20 19:45:36', 'INGRESO'),
(00000001, '2024-07-20 19:47:33', 'INGRESO'),
(00000001, '2024-07-20 19:48:22', 'INGRESO'),
(00000001, '2024-07-20 19:49:11', 'INGRESO'),
(00000001, '2024-07-20 19:49:53', 'INGRESO'),
(00000001, '2024-07-20 19:58:42', 'INGRESO'),
(00000001, '2024-07-20 20:29:33', 'INGRESO'),
(00000001, '2024-07-21 00:04:09', 'INGRESO'),
(00000001, '2024-07-21 00:06:20', 'INGRESO'),
(00000001, '2024-07-21 00:16:50', 'INGRESO'),
(00000001, '2024-07-21 00:21:31', 'INGRESO'),
(00000001, '2024-07-21 00:23:56', 'INGRESO'),
(00000001, '2024-07-21 00:56:42', 'INGRESO'),
(00000001, '2024-07-21 08:55:42', 'INGRESO'),
(00000001, '2024-07-21 08:56:57', 'INGRESO'),
(00000001, '2024-07-21 09:00:52', 'INGRESO'),
(00000001, '2024-07-21 09:12:25', 'INGRESO'),
(00000001, '2024-07-21 09:16:49', 'INGRESO'),
(00000001, '2024-07-21 09:23:59', 'INGRESO'),
(00000001, '2024-07-21 09:28:53', 'INGRESO'),
(00000001, '2024-07-21 09:30:21', 'INGRESO'),
(00000001, '2024-07-21 09:31:46', 'INGRESO'),
(00000001, '2024-07-21 09:34:13', 'INGRESO'),
(00000001, '2024-07-21 09:36:04', 'INGRESO'),
(00000001, '2024-07-21 12:57:52', 'INGRESO'),
(00000001, '2024-07-21 14:14:51', 'INGRESO'),
(00000001, '2024-07-21 14:25:18', 'INGRESO'),
(00000001, '2024-07-21 14:29:22', 'INGRESO'),
(00000001, '2024-07-21 14:31:20', 'INGRESO'),
(00000001, '2024-07-21 14:34:02', 'INGRESO'),
(00000001, '2024-07-21 15:10:50', 'INGRESO'),
(00000001, '2024-07-21 16:54:33', 'INGRESO');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `personas`
--

CREATE TABLE `personas` (
  `dni` varchar(8) DEFAULT NULL,
  `nombres` varchar(50) DEFAULT NULL,
  `apellidopa` varchar(50) DEFAULT NULL,
  `apellidoma` varchar(50) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `usuarios`
--

CREATE TABLE `usuarios` (
  `id` int(11) NOT NULL,
  `usuario` varchar(50) DEFAULT NULL,
  `contraseña` varchar(255) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `usuarios`
--

INSERT INTO `usuarios` (`id`, `usuario`, `contraseña`) VALUES
(1, 'admin', 'adpexzg3FUZAk');

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `usuarios`
--
ALTER TABLE `usuarios`
  ADD PRIMARY KEY (`id`);

--
-- AUTO_INCREMENT de las tablas volcadas
--

--
-- AUTO_INCREMENT de la tabla `usuarios`
--
ALTER TABLE `usuarios`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
