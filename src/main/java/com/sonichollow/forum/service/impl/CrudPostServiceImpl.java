package com.sonichollow.forum.service.impl;
import com.sonichollow.forum.entity.Post;
import com.sonichollow.forum.mapper.PostMapper;
import com.sonichollow.forum.service.CrudPostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CrudPostServiceImpl implements CrudPostService {
    @Autowired
    PostMapper postMapper;

    @Override
    public Post getAccp(int pid) {
        return postMapper.selectByPid(pid);
    }

    @Override
    public void deletepostById(int pid) {
        postMapper.deletePost(pid);
    }

    @Override
    public List<Post> listAllAccp() {
        return postMapper.selectAllp();
    }
}
