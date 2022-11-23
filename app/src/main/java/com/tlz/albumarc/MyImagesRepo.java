package com.tlz.albumarc;

import android.app.Application;
import android.os.AsyncTask;

import androidx.lifecycle.LiveData;
import androidx.room.Update;

import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class MyImagesRepo {

    private MyImagesDAO myImagesDAO;
    private LiveData<List<MyImages>> imagesList;

    ExecutorService executorService = Executors.newSingleThreadExecutor();

    public MyImagesRepo(Application application) {
        MyImagesDB database = MyImagesDB.getInstance(application);
        myImagesDAO = database.myImagesDAO();
        imagesList = myImagesDAO.getAllImages();
    }

    public void insert(MyImages myImages) {
//        new InsertImageAsyncTask(myImagesDAO).execute(myImages); << DEPRECATED

        executorService.execute(new Runnable() {
            @Override
            public void run() {
                myImagesDAO.insert(myImages);
            }
        });
    }

    public void delete(MyImages myImages) {
//        new DeleteImageAsyncTask(myImagesDAO).execute(myImages); << DEPRECATED

        executorService.execute(new Runnable() {
            @Override
            public void run() {
                myImagesDAO.delete(myImages);
            }
        });
    }

    public void update(MyImages myImages) {
//        new UpdateImageAsyncTask(myImagesDAO).execute(myImages); << DEPRECATED

        executorService.execute(new Runnable() {
            @Override
            public void run() {
                myImagesDAO.update(myImages);
            }
        });
    }

    public LiveData<List<MyImages>> getAllImages() {
        return imagesList;
    }

    /* << DEPRECATED
    private static class InsertImageAsyncTask extends AsyncTask<MyImages, Void, Void> {

        MyImagesDAO imagesDAO;

        public InsertImageAsyncTask(MyImagesDAO imagesDAO) {
            this.imagesDAO = imagesDAO;
        }

        @Override
        protected Void doInBackground(MyImages... myImages) {

            imagesDAO.insert(myImages[0]);

            return null;
        }
    }

    private static class UpdateImageAsyncTask extends AsyncTask<MyImages, Void, Void> {

        MyImagesDAO imagesDAO;

        public UpdateImageAsyncTask(MyImagesDAO imagesDAO) {
            this.imagesDAO = imagesDAO;
        }

        @Override
        protected Void doInBackground(MyImages... myImages) {

            imagesDAO.update(myImages[0]);

            return null;
        }
    }

    private static class DeleteImageAsyncTask extends AsyncTask<MyImages, Void, Void> {

        MyImagesDAO imagesDAO;

        public DeleteImageAsyncTask(MyImagesDAO imagesDAO) {
            this.imagesDAO = imagesDAO;
        }

        @Override
        protected Void doInBackground(MyImages... myImages) {

            imagesDAO.delete(myImages[0]);

            return null;
        }
    }
*/
}
