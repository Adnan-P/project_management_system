package com.adnan.projectmanagementsystem.controller;

import com.adnan.projectmanagementsystem.modal.Chat;
import com.adnan.projectmanagementsystem.modal.Message;
import com.adnan.projectmanagementsystem.modal.User;
import com.adnan.projectmanagementsystem.request.CreateCommentRequest;
import com.adnan.projectmanagementsystem.request.CreateMessageRequest;
import com.adnan.projectmanagementsystem.service.MessageService;
import com.adnan.projectmanagementsystem.service.ProjectService;
import com.adnan.projectmanagementsystem.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/message")
public class MessageController {
    @Autowired
    private MessageService messageService;
    @Autowired
    private UserService userService;
    @Autowired
    private ProjectService projectService;

    @PostMapping("/send")
    public ResponseEntity<Message> sendMessage(@RequestBody CreateMessageRequest request)
        throws Exception{

        User user = userService.findUserById(request.getSenderId());

        Chat chats = projectService.getProjectById(request.getProjectId()).getChat();

        if (chats == null) throw new Exception("chats not found");

        Message sentMessage = messageService.sendMessage(request.getSenderId(),
                request.getProjectId(), request.getContent());
        return ResponseEntity.ok(sentMessage);
    }

    @GetMapping("/chat/{projectId}")
    public ResponseEntity<List<Message>> getMessagesByChatId(@PathVariable Long projectId)
        throws Exception {
        List<Message> messages = messageService.getMessageByProjectId(projectId);
        return ResponseEntity.ok(messages);
    }


}
