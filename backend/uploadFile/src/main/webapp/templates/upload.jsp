<div class="row row-content">
	<span id="infoInputFile">*Please, select a file and click next
		to upload.</span>
	<div class="col-xs-12">
		<form enctype="multipart/form-data">
			<div class="form-group">
				<label class="control-label col-sm-2" for="title">Title:</label>
				<div class="col-sm-10">
					<input ng-model="title" type="text" class="form-control" id="title"
						placeholder="Change the file name if you want">
				</div>
			</div>
			<div class="form-group">
				<label class="control-label col-sm-2" for="description">Description:</label>
				<div class="col-sm-10">
					<input ng-model="description" type="text" class="form-control"
						id="description"
						placeholder="Type a brief description of this file">
				</div>
			</div>

			<div class="form-group">				
				<div class="col-sm-10">
					<input id="file" style="display:none;" type="file" file-upload file="file">
					<!--  <button ng-click="uploadFile()">upload file</button>-->
					<div class="dropzone" droppable-item="" ng-click="openUploadWindow()">
						<span><u>Click to browse</u> for a file</span>
					</div>
				</div>
			</div>
		</form>
	</div>
</div>
<div class="btn-footer">
	<button type="button" id="" class="btn-next" style="">VIEW ALL</button>
	<a href="list">TEST3</a>
</div> 