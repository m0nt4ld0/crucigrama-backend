-- Crosswords Puzzle Generator - SQL
-- Version 1.0
-- https://www.github.com/m0nt4ld0
--
-- Generation date: 02-02-2025 a las 14:07:41

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";

-- Database: `crosswords-puzzle`
--

-- --------------------------------------------------------

--
-- Table structure for `crosswords`
--

CREATE TABLE `crosswords` (
  `ID_word` int NOT NULL DEFAULT '0',
  `sequence_number` int NOT NULL,
  `ID_crossword` int NOT NULL,
  `is_vword` int DEFAULT NULL,
  `word_id` int NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

--
-- Data dump for `crosswords`
--

INSERT INTO `crosswords` (`ID_word`, `sequence_number`, `ID_crossword`, `is_vword`, `word_id`) VALUES
(1, 1, 1, 0, 1),
(2, 2, 1, 0, 2),
(3, 3, 1, 0, 3),
(4, 4, 1, 0, 4),
(5, 5, 1, 0, 5),
(6, 0, 1, 1, 6);

-- --------------------------------------------------------

--
-- Table structure for `words`
--

CREATE TABLE `words` (
  `ID` int NOT NULL,
  `word` varchar(255) NOT NULL,
  `description` varchar(255) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

--
-- Data dump for `words`
--

INSERT INTO `words` (`ID`, `word`, `description`) VALUES
(1, 'Frenología', 'Antigua teoría pseudocientífica, hoy sin validez, que afirmaba poder determinar rasgos del cáracter y de la personalidad basándose en la forma del cráneo y las facciones.'),
(2, 'Resistencia', 'Fuerza que durante el análisis «se defiende por todos los medios contra la curación y a toda costa quiere aferrarse a la enfermedad y el padecimiento»'),
(3, 'Edipo', 'Complejo de...'),
(4, 'Pulsión', 'Fuente de estímulos en constante fluir, procedente de una excitación interna (a diferencia del estímulo que es externo) y está ligada a un objeto, el cual es transitorio. Su satisfacción es parcial.'),
(5, 'Defensa', 'Proyección, introyección, identificación proyectiva, todos estos son mecanismos de...'),
(6, 'Freud', 'Una de las principales figuras intelectuales del siglo XX mejor conocido por ser el padre del Psicoanalisis');

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `crosswords`
--
ALTER TABLE `crosswords`
  ADD PRIMARY KEY (`ID_word`,`ID_crossword`),
  ADD KEY `FKnj154tsy7cidofiw1jdyj3l3y` (`word_id`);

--
-- Indices de la tabla `words`
--
ALTER TABLE `words`
  ADD PRIMARY KEY (`ID`);

--
-- AUTO_INCREMENT de las tablas volcadas
--

--
-- AUTO_INCREMENT de la tabla `words`
--
ALTER TABLE `words`
  MODIFY `ID` int NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=7;

--
-- Restricciones para tablas volcadas
--

--
-- Filtros para la tabla `crosswords`
--
ALTER TABLE `crosswords`
  ADD CONSTRAINT `fk_crosswords_words` FOREIGN KEY (`ID_word`) REFERENCES `words` (`ID`),
  ADD CONSTRAINT `FKnj154tsy7cidofiw1jdyj3l3y` FOREIGN KEY (`word_id`) REFERENCES `words` (`ID`);
COMMIT;

