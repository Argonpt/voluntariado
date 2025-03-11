package com.voluntariado.Controllers;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.voluntariado.Models.Board;
import com.voluntariado.Models.BoardColumn;
import com.voluntariado.Services.BoardService;

@RestController
@RequestMapping("/api/boards")
public class BoardController {

    @Autowired
    private BoardService boardService;

    @PostMapping
    public Board createBoard(@RequestBody Board board) {
        return boardService.createBoard(board);
    }

    @GetMapping("/{id}")
    public Board getBoardDetails(@PathVariable Long id) {
        return boardService.getBoardDetails(id);
    }

    @PostMapping("/{boardId}/columns")
    public BoardColumn addColumnToBoard(@PathVariable Long boardId, @RequestBody BoardColumn column) {
        return boardService.addColumnToBoard(boardId, column);
    }

    @GetMapping("/{boardId}/columns")
    public List<BoardColumn> getBoardColumns(@PathVariable Long boardId) {
        return boardService.getBoardColumns(boardId);
    }
}