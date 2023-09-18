package com.example.apimanagerrebuild.controller;

import com.example.apimanagerrebuild.models.Tag;
import com.example.apimanagerrebuild.services.TagService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

@RequestMapping("tag")
@RestController
public class ContollerTag {

    @Autowired
    TagService tagService;

    @GetMapping("List")
    public List<Tag> getAllTags() {
        return tagService.getAllTag();
    }
    @PostMapping("add")
    public void addSingleTag(@RequestBody Tag tag){
        tagService.addSingleTag(tag);
    }




}
