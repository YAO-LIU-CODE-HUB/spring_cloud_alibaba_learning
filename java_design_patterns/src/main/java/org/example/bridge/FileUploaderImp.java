package org.example.bridge;

/**
 * FileUploaderImp:
 *
 * @author: 刘瑶
 * @description:
 * @date: 2023/12/17
 * @version: 1.0.0
 */
public class FileUploaderImp implements FileUploader{
    private FileBehavior fileBehavior;

    public FileUploaderImp() {
        this.fileBehavior = new FileBehaviorImp();
    }

    @Override
    public void upload(String file) {
        fileBehavior.upload(file);

    }

    @Override
    public void preCheck(String file) {
        fileBehavior.preCheck(file);
    }
}
