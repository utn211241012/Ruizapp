package com.Ferreira.Huerta.Luis.Angel.org.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {
	
	@Autowired
	private IntVacantes VacantesServceImp;
	@Autowired
	private IntCategorias CategoriasServceImp;
	
	@GetMapping("/")
	public String mostrarHome(Model model) {
		List<Vacante> lista = VacantesServceImp.obtenerTodas();
		List<Categoria> catego = CategoriasServceImp.ObtenerTodas();
		model.addAttribute("vacantes", lista);
		model.addAttribute("categorias", catego);
		return "home";
	}
}
