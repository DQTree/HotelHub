<script lang="ts">
	import { Button, Input, Label } from 'flowbite-svelte';
	import { login } from '../../hooks/auth';

	let username: string = "";
	let password: string = "";

	async function handleLogin(username: string, password: string) {
		await login(username, password)
	}
</script>

<div class="flex h-fit shrink-0 items-center justify-center p-8 m-4 rounded-xl align-middle bg-slate-800">
	<form on:submit|preventDefault={() => handleLogin(username, password)} method="post">
		<div class="mb-6">
			<Label for="username" class="mb-2 block text-slate-400">Username</Label>
			<Input id="username" placeholder="JohnDoe" bind:value={username}></Input>
		</div>
		<div class="mb-6">
			<Label for="password" class="mb-2 block text-slate-400">Password</Label>
			<Input type="password" id="password" placeholder="Password123" bind:value={password}></Input>
		</div>
		<Button type="submit">Login</Button>
	</form>
</div>
