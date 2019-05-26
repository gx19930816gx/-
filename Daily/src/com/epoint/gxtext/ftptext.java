package com.epoint.gxtext;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.UnsupportedEncodingException;
import java.net.SocketException;

import org.apache.commons.net.ftp.FTPClient;
import org.apache.commons.net.ftp.FTPReply;

public class ftptext
{
    public static void main(String[] args) throws FileNotFoundException, UnsupportedEncodingException {
        // TODO Auto-generated method stub
        //FTPClient client = getFTPClient("10.10.112.110", "whchem2019", "user_ftp", 21);
        File file = new File("F://测试文档.txt");
        FileInputStream in = new FileInputStream(file);
        boolean ret = uploadFile("10.10.112.110", "user_ftp", "whchem2019", 21, "标段编号xxxx", "测试一下.txt", in);
        System.out.println(ret);
    }

    public static FTPClient getFTPClient(String ftpHost, String ftpUserName, String ftpPassword, int ftpPort) {
        FTPClient ftpClient = new FTPClient();
        try {
            ftpClient = new FTPClient();
            ftpClient.connect(ftpHost, ftpPort);// 连接FTP服务器
            ftpClient.login(ftpUserName, ftpPassword);// 登陆FTP服务器
            if (!FTPReply.isPositiveCompletion(ftpClient.getReplyCode())) {
                System.out.println("未连接到FTP，用户名或密码错误。");
                ftpClient.disconnect();
            }
            else {
                System.out.println("FTP连接成功。");
            }
        }
        catch (SocketException e) {
            e.printStackTrace();
            System.out.println("FTP的IP地址可能错误，请正确配置。");
        }
        catch (IOException e) {
            e.printStackTrace();
            System.out.println("FTP的端口错误,请正确配置。");
        }
        return ftpClient;
    }
    
    /**
     * Description: 向FTP服务器上传文件
     * @param ftpHost FTP服务器hostname
     * @param ftpUserName 账号
     * @param ftpPassword 密码
     * @param ftpPort 端口
     * @param ftpPath  FTP服务器中文件所在路径 格式： ftptest/aa
     * @param fileName ftp文件名称
     * @param input 文件流
     * @return 成功返回true，否则返回false
     * @throws UnsupportedEncodingException 
     */
    public static boolean uploadFile(String ftpHost, String ftpUserName,
                                     String ftpPassword, int ftpPort, String ftpPath,
                                     String fileName,InputStream input) throws UnsupportedEncodingException {
        boolean success = false;
        FTPClient ftpClient = null;
        //文件名跟目录转一下码
        ftpPath = new String(ftpPath.getBytes(),"iso-8859-1");
        fileName = new String(fileName.getBytes(),"iso-8859-1");
        try {
            int reply;
            ftpClient = getFTPClient(ftpHost, ftpUserName, ftpPassword, ftpPort);
            reply = ftpClient.getReplyCode();
            if (!FTPReply.isPositiveCompletion(reply)) {
                ftpClient.disconnect();
                return success;
            }
            ftpClient.setControlEncoding("UTF-8"); // 中文支持
            ftpClient.setFileType(FTPClient.BINARY_FILE_TYPE);
            ftpClient.enterLocalPassiveMode();
            //这边修改一下，如果目录不存在，需要手动创建 by gx
            boolean isExist = ftpClient.changeWorkingDirectory(ftpPath);
            if(!isExist){
                ftpClient.makeDirectory(ftpPath);
            }
            ftpClient.changeWorkingDirectory(ftpPath);
            ftpClient.storeFile(fileName, input);
            input.close();
            ftpClient.logout();
            success = true;
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (ftpClient.isConnected()) {
                try {
                    ftpClient.disconnect();
                } catch (IOException ioe) {
                }
            }
        }
        return success;
    }

}
