package com.voluntariado.Services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.voluntariado.Models.Board;
import com.voluntariado.Models.BoardColumn;
import com.voluntariado.Repository.BoardColumnRepository;
import com.voluntariado.Repository.BoardRepository;

@Service
public class BoardService {

    @Autowired
    private BoardRepository boardRepository;

    @Autowired
    private BoardColumnRepository boardColumnRepository;

    // Método para buscar o board pelo ID
    public Board getBoardDetails(Long id) {
        Optional<Board> board = boardRepository.findById(id);
        if (board.isPresent()) {
            return board.get();
        }
        // Lançar uma exceção genérica caso o board não seja encontrado
        throw new RuntimeException("Board não encontrado");
    }

    // Método para adicionar uma coluna a um board
    public BoardColumn addColumnToBoard(Long boardId, BoardColumn column) {
        // Buscar o board
        Board board = getBoardDetails(boardId);
        // Atribuir o board à coluna
        column.setBoard(board);
        // Salvar a coluna
        return boardColumnRepository.save(column);
    }

    // Método para buscar as colunas de um board
    public List<BoardColumn> getBoardColumns(Long boardId) {
        // Buscar todas as colunas associadas ao board pelo ID
        return boardColumnRepository.findByBoardId(boardId);
    }

    public Board createBoard(Board board) {
        return boardRepository.save(board);
    }
}