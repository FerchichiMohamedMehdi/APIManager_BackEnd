package com.example.apimanagerrebuild.services;

import com.example.apimanagerrebuild.models.Tag;
import com.example.apimanagerrebuild.repositories.TagRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class TagService {

    @Autowired
    TagRepository tagRepository;

    public List<Tag> getAllTag(){
        List<Tag> tags = new ArrayList<>();
        tags= tagRepository.findAll();

        return tags;

    }

    public HashMap<String, Integer> occurence(){

        return null;
    }
    public void addTag(Tag tagToAdd){
        tagRepository.save(tagToAdd);
    }

    public int getOccurence(String name) {
        List<Tag> tags = this.getAllTag();
        int i = 0;
        for (Tag t : tags) {
            if (t.getNameTag().equalsIgnoreCase(name)) {
                i++;
            }
        }
        return i;
    }
    public Map<String , Integer> getTagOccurence(){
        Map<String , Integer> tagsOccurence = new HashMap<>();
        List<Tag> tags = this.getAllTag();
        for(Tag t:tags){
            String s =t.getNameTag();
            int i = this.getOccurence(t.getNameTag());
            tagsOccurence.put(s,i);
        }
        return tagsOccurence;
    }



}
