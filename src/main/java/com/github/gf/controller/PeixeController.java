package com.github.gf.controller;

import com.github.gf.controller.dto.FormPeixe;
import com.github.gf.model.Peixe;
import com.github.gf.repository.PeixeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("peixes")
public class PeixeController {

    @Autowired
    private PeixeRepository peixeRepository;

    @GetMapping()
    public String list(Model model) {
        List<Peixe> peixes =
                peixeRepository.findAll(Sort.by(Sort.Direction.ASC, "nome"));
        model.addAttribute("peixes", peixes);
        return "peixe/list";
    }

    @GetMapping("add")
    public String create(Model model) {
        model.addAttribute("peixe", new FormPeixe());
        return "peixe/form";
    }

    @PostMapping("save")
    public String save(@ModelAttribute FormPeixe peixe) {
        Peixe entity = peixe.toModel();

        peixeRepository.save(entity);
        return "redirect:/peixes";
    }

    @GetMapping("update/{id}")
    public String update(@PathVariable Long id, Model model) {
        Peixe entity = peixeRepository.findById(id).orElse(new Peixe());

        FormPeixe peixe = new FormPeixe().toForm(entity);

        model.addAttribute("peixe", peixe);
        return "peixe/form";
    }

    @GetMapping("delete/{id}")
    public String delete(@PathVariable Long id) {
        peixeRepository.deleteById(id);
        return "redirect:/peixes";
    }
}