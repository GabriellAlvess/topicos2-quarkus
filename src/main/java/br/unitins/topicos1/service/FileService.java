package br.unitins.topicos1.service;

import java.io.File;
import java.io.IOException;

public interface FileService {

    void salvar(Long id, String nomeImagem, byte[] imagem);

    File download(String nomeArquivo);

}