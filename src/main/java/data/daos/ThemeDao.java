package data.daos;

import org.springframework.data.jpa.repository.JpaRepository;

import data.entities.Theme;

public interface ThemeDao extends JpaRepository<Theme, Integer>, ThemeExtended{
	Theme findById(int id);
}
