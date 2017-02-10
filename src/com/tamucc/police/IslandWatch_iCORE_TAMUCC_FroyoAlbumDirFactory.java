package com.tamucc.police;

import java.io.File;

import android.os.Environment;

public final class IslandWatch_iCORE_TAMUCC_FroyoAlbumDirFactory extends IslandWatch_iCORE_TAMUCC_AlbumStorageDirFactory {

	@Override
	public File getAlbumStorageDir(String albumName) {
		// TODO Auto-generated method stub
		return new File(
		  Environment.getExternalStoragePublicDirectory(
		    Environment.DIRECTORY_PICTURES
		  ), 
		  albumName
		);
	}
}
